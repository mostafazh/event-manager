package eg.edu.guc.hci.server.model.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import eg.edu.guc.hci.server.model.Model;
import eg.edu.guc.hci.server.model.ModelFactory;
import eg.edu.guc.hci.server.model.User;
import eg.edu.guc.hci.server.model.UserFactory;

public class ConnectionManager<L extends Model> {

	private Connection con;
	private Statement s;
	private ModelFactory<L> factory;
	private boolean autoConnect;

	/**
	 * 
	 * @param factory
	 *            A factory that creates Objects of type L
	 * @param autoConnect
	 *            true to open and close the DB connection automatically.
	 */
	public ConnectionManager(ModelFactory<L> factory, boolean autoConnect) {
		this.factory = factory;
		this.autoConnect = autoConnect;
	}

	public void openConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql:///eventManager",
					"root", "zaher");

			s = con.createStatement();
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
			try {
				if (con != null)
					con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

	private ResultSet _executeDML(String sql) {
		ResultSet rs = null;

		System.out.println("\nDML:\n" + sql);

		try {
			if (s != null)
				rs = s.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * DML => SELECT
	 * 
	 * Used to get a list of objects as an output of a single SQL query.
	 * 
	 * @param sql
	 *            the SQL query.
	 * @return a list of the matched records.
	 */
	public ArrayList<L> executeDML(String sql) {
		if (autoConnect)
			openConnection();

		ResultSet rs = _executeDML(sql);
		ArrayList<L> result = new ArrayList<L>();
		try {
			while (rs.next()) {
				result.add(factory.newModel(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (autoConnect)
			closeConnection();
		return result;
	}

	private int _executeDDL(String sql) {
		int r = 0;

		System.out.println("\nDDL:\n" + sql);

		try {
			if (s != null)
				r = s.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}

	/**
	 * DML => INSERT, DELETE and UPADTE.
	 * 
	 * @param sql
	 *            the SQL query
	 * @return number of affected rows.
	 */
	public int executeDDL(String sql) {
		if (autoConnect)
			openConnection();
		int r = _executeDDL(sql);
		if (autoConnect)
			closeConnection();
		return r;
	}

	public void setAutoCommit(boolean autoCommit) {
		try {
			con.setAutoCommit(autoCommit);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void commit() {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void rollback() {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeConnection() {
		try {
			if (s != null)
				s.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		ConnectionManager<User> c = new ConnectionManager<User>(
				new UserFactory(), true);
		ArrayList<User> r = c.executeDML("SELECT * FROM user");
		for (User user : r) {
			System.out.println(user.getName());
		}
	}
}