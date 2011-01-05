
/* Generating data for Database: eventmanager  */


/* Generating data for table evaluation... */

INSERT INTO `evaluation`(`evaluation_id`,`comment`) 
VALUES(1,'independent.');
INSERT INTO `evaluation`(`evaluation_id`,`comment`) 
VALUES(2,'punctual.');
INSERT INTO `evaluation`(`evaluation_id`,`comment`) 
VALUES(3,'gd usher.');
INSERT INTO `evaluation`(`evaluation_id`,`comment`) 
VALUES(4,'very bad.');
INSERT INTO `evaluation`(`evaluation_id`,`comment`) 
VALUES(5,'this should be his last time to work.');
INSERT INTO `evaluation`(`evaluation_id`,`comment`) 
VALUES(6,'asshole.');
INSERT INTO `evaluation`(`evaluation_id`,`comment`) 
VALUES(7,'do his tasks very accurate.');
INSERT INTO `evaluation`(`evaluation_id`,`comment`) 
VALUES(8,'hard worker.');
INSERT INTO `evaluation`(`evaluation_id`,`comment`) 
VALUES(9,'representable.');
INSERT INTO `evaluation`(`evaluation_id`,`comment`) 
VALUES(10,'the best.');
COMMIT;

/* Generating data for table messages... */

INSERT INTO `messages`(`message_id`,`title`,`type`,`text`,`voice`) 
VALUES(1,'title 1',1,'voting started, u can vote now','file path 4');
INSERT INTO `messages`(`message_id`,`title`,`type`,`text`,`voice`) 
VALUES(2,'title 1',1,'please we need 4 ushers in front of the main gates','file path 3');
INSERT INTO `messages`(`message_id`,`title`,`type`,`text`,`voice`) 
VALUES(3,'title 4',2,'please do it very quick','file path 1');
INSERT INTO `messages`(`message_id`,`title`,`type`,`text`,`voice`) 
VALUES(4,'title 2',1,'HEY DO U HEAR ME ???','file path 2');
INSERT INTO `messages`(`message_id`,`title`,`type`,`text`,`voice`) 
VALUES(5,'title 1',2,'oooooh finally we are done man ;)','file path 1');
INSERT INTO `messages`(`message_id`,`title`,`type`,`text`,`voice`) 
VALUES(6,'title 3',1,'please do ur task as fast as u can','file path 2');
INSERT INTO `messages`(`message_id`,`title`,`type`,`text`,`voice`) 
VALUES(7,'title 2',1,'wish u all the best','file path 3');
INSERT INTO `messages`(`message_id`,`title`,`type`,`text`,`voice`) 
VALUES(8,'title 2',1,'if u recieve this message, plz send us ur email','file path 1');
INSERT INTO `messages`(`message_id`,`title`,`type`,`text`,`voice`) 
VALUES(9,'title 4',2,'gd luck in ur work','file path 4');
INSERT INTO `messages`(`message_id`,`title`,`type`,`text`,`voice`) 
VALUES(10,'title 3',1,'you are the best team','file path 2');
COMMIT;

/* Generating data for table task... */

INSERT INTO `task`(`task_id`,`title`,`priority`,`description`,`notes`,`deadline`,`status`) 
VALUES(1,'Task2',2,'b\"F}MWKCCv<s^X]GV(I&','&~SBYc+[&ZFJ','2010-12-25 03:16:38',39);
INSERT INTO `task`(`task_id`,`title`,`priority`,`description`,`notes`,`deadline`,`status`) 
VALUES(2,'Secure the gates no.1',0,'Prn\n\rMhjQ)CRB]qLJWUPLF*9','dGh.[3!MXSk8','2011-02-02 01:55:33',51);
INSERT INTO `task`(`task_id`,`title`,`priority`,`description`,`notes`,`deadline`,`status`) 
VALUES(3,'Task1',3,'zWXTU.G]Cv.HI`*E',NULL,'2011-01-02 05:09:05',2);
INSERT INTO `task`(`task_id`,`title`,`priority`,`description`,`notes`,`deadline`,`status`) 
VALUES(4,'Task4',0,'hgI4-e','\'uw','2010-12-23 03:18:13',NULL);
INSERT INTO `task`(`task_id`,`title`,`priority`,`description`,`notes`,`deadline`,`status`) 
VALUES(5,'Secure the gates no.3',1,'mC>bL','T5BdNw','2011-01-26 06:27:21',41);
INSERT INTO `task`(`task_id`,`title`,`priority`,`description`,`notes`,`deadline`,`status`) 
VALUES(6,'Print time tables',3,'-@JZglaL\\e!7P8q|EeZ','!kfV*@m{$H.W) zZ>e1<\'KA7O','2011-01-16 04:29:11',62);
INSERT INTO `task`(`task_id`,`title`,`priority`,`description`,`notes`,`deadline`,`status`) 
VALUES(7,'Secure the gates no.2',0,')JHj6$',NULL,'2011-01-09 00:44:38',1);
INSERT INTO `task`(`task_id`,`title`,`priority`,`description`,`notes`,`deadline`,`status`) 
VALUES(8,'Task3',3,']c~<VdO56f(iRBV`5i','rp:6','2011-01-22 01:56:58',NULL);
INSERT INTO `task`(`task_id`,`title`,`priority`,`description`,`notes`,`deadline`,`status`) 
VALUES(9,'bring new mics',1,'*1hn\'c+!D&','3|c>- qG\n\rMf0cD','2010-12-21 00:19:26',93);
INSERT INTO `task`(`task_id`,`title`,`priority`,`description`,`notes`,`deadline`,`status`) 
VALUES(10,'Secure the gates no.4',5,'~)Cgj',' Njy[>)u','2011-01-30 20:51:10',19);
COMMIT;

/* Generating data for table team... */

INSERT INTO `team`(`team_id`,`name`) 
VALUES(1,'node2 ushers');
INSERT INTO `team`(`team_id`,`name`) 
VALUES(2,'node1 ushers');
INSERT INTO `team`(`team_id`,`name`) 
VALUES(3,'team3');
INSERT INTO `team`(`team_id`,`name`) 
VALUES(4,'team2');
INSERT INTO `team`(`team_id`,`name`) 
VALUES(5,'team1');
INSERT INTO `team`(`team_id`,`name`) 
VALUES(6,'main gate ushers');
INSERT INTO `team`(`team_id`,`name`) 
VALUES(7,'sec.2');
INSERT INTO `team`(`team_id`,`name`) 
VALUES(8,'sec.1');
INSERT INTO `team`(`team_id`,`name`) 
VALUES(9,'backup teams');
INSERT INTO `team`(`team_id`,`name`) 
VALUES(10,'graduates ushers');
COMMIT;

/* Generating data for table type... */

INSERT INTO `type`(`type_id`,`name`,`description`) 
VALUES(1,'Security','jhu+\\iqr}?^W');
INSERT INTO `type`(`type_id`,`name`,`description`) 
VALUES(2,'Leader','<K.%!~OtF@.9q(X!uw|');
INSERT INTO `type`(`type_id`,`name`,`description`) 
VALUES(3,'Guest','usDFW8`|oeAZ%hDl\\CCR');
INSERT INTO `type`(`type_id`,`name`,`description`) 
VALUES(4,'Sub. Leader','wLZ_w3>');
INSERT INTO `type`(`type_id`,`name`,`description`) 
VALUES(5,'Security','?[aFg');
INSERT INTO `type`(`type_id`,`name`,`description`) 
VALUES(6,'Usher','4');
INSERT INTO `type`(`type_id`,`name`,`description`) 
VALUES(7,'Usher','3@T[2k&AlE}A6R');
INSERT INTO `type`(`type_id`,`name`,`description`) 
VALUES(8,'Sub. Leader','\"Z9w*grj.[k_hQ5');
INSERT INTO `type`(`type_id`,`name`,`description`) 
VALUES(9,'Leader',' RZxj:lq[%jlKe,l$^ IcG`');
INSERT INTO `type`(`type_id`,`name`,`description`) 
VALUES(10,'Guest','gN$');
COMMIT;

/* Generating data for table vote... */

INSERT INTO `vote`(`vote_id`,`title`) 
VALUES(1,'Favourite place');
INSERT INTO `vote`(`vote_id`,`title`) 
VALUES(2,'Best Song');
INSERT INTO `vote`(`vote_id`,`title`) 
VALUES(3,'Favourite performance');
INSERT INTO `vote`(`vote_id`,`title`) 
VALUES(4,'Vote1');
INSERT INTO `vote`(`vote_id`,`title`) 
VALUES(5,'Favourite place');
INSERT INTO `vote`(`vote_id`,`title`) 
VALUES(6,'Best performer');
INSERT INTO `vote`(`vote_id`,`title`) 
VALUES(7,'Favourite performance');
INSERT INTO `vote`(`vote_id`,`title`) 
VALUES(8,'Best Song');
INSERT INTO `vote`(`vote_id`,`title`) 
VALUES(9,'Vote1');
INSERT INTO `vote`(`vote_id`,`title`) 
VALUES(10,'Best performer');
COMMIT;

/* Generating data for table user... */

INSERT INTO `user`(`username`,`password`,`name`,`rating`,`type_id`,`evaluation_id`,`team_id`) 
VALUES('ashry','ashry','Moahmed ashry',4,3,4,1);
INSERT INTO `user`(`username`,`password`,`name`,`rating`,`type_id`,`evaluation_id`,`team_id`) 
VALUES('zaher','zaher','Moustafa zaher',3,1,2,1);
INSERT INTO `user`(`username`,`password`,`name`,`rating`,`type_id`,`evaluation_id`,`team_id`) 
VALUES('moustafa','moustafa','moustafa ashraf',6,2,5,1);
INSERT INTO `user`(`username`,`password`,`name`,`rating`,`type_id`,`evaluation_id`,`team_id`) 
VALUES('success','success','Ahmed najah',9,4,1,3);
INSERT INTO `user`(`username`,`password`,`name`,`rating`,`type_id`,`evaluation_id`,`team_id`) 
VALUES('ali','ali','ali ibrahim',3,5,3,4);
COMMIT;

/* Generating data for table user_task... */

INSERT INTO `user_task`(`username`,`task_id`) 
VALUES('moustafa',2);
INSERT INTO `user_task`(`username`,`task_id`) 
VALUES('zaher',7);
INSERT INTO `user_task`(`username`,`task_id`) 
VALUES('success',9);
INSERT INTO `user_task`(`username`,`task_id`) 
VALUES('ashry',6);
INSERT INTO `user_task`(`username`,`task_id`) 
VALUES('ali',4);
INSERT INTO `user_task`(`username`,`task_id`) 
VALUES('zaher',10);
INSERT INTO `user_task`(`username`,`task_id`) 
VALUES('success',5);
INSERT INTO `user_task`(`username`,`task_id`) 
VALUES('ashry',8);
INSERT INTO `user_task`(`username`,`task_id`) 
VALUES('ali',1);
INSERT INTO `user_task`(`username`,`task_id`) 
VALUES('moustafa',3);
INSERT INTO `user_task`(`username`,`task_id`) 
VALUES('success',2);
INSERT INTO `user_task`(`username`,`task_id`) 
VALUES('ashry',7);
COMMIT;

/* Generating data for table messages_from_to... */

INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(9,'ashry','success');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(5,'moustafa','zaher');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(4,'success','ali');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(8,'zaher','ashry');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(2,'ali','moustafa');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(3,'moustafa','zaher');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(6,'success','ali');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(7,'zaher','ashry');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(1,'ali','moustafa');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(10,'ashry','success');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(9,'success','ali');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(5,'zaher','ashry');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(4,'ali','moustafa');
COMMIT;
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(8,'ashry','success');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(2,'moustafa','zaher');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(3,'zaher','ashry');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(6,'ali','moustafa');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(7,'ashry','success');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(1,'moustafa','zaher');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(10,'success','ali');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(9,'ali','moustafa');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(5,'ashry','success');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(4,'moustafa','zaher');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(8,'success','ali');
INSERT INTO `messages_from_to`(`message_id`,`from`,`to`) 
VALUES(2,'zaher','ashry');
COMMIT;

/* Generating data for table comment... */

INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('success',3,'Finish it as fast as u can.','2010-12-31 19:05:01');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('zaher',1,'guys we count on you.','2010-12-31 03:11:21');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('moustafa',9,'You have to perform this task as fast as u can.','2010-12-16 21:47:02');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('ali',10,'Test message 1.','2010-12-08 21:03:25');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('ashry',4,'Test message 1.','2010-12-15 05:13:05');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('zaher',8,'You have to perform this task as fast as u can.','2011-01-21 16:16:54');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('moustafa',2,'Test message 2.','2011-01-25 11:39:36');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('ali',5,'Test message 2.','2011-01-08 01:39:13');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('ashry',7,'What\'s next ?','2010-12-23 19:51:28');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('success',6,'good performance.','2011-01-30 15:13:49');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('moustafa',3,'You have to perform this task as fast as u can.','2011-01-16 19:16:42');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('ali',1,'What\'s next ?','2010-12-20 11:33:34');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('ashry',9,'wish u all the best.','2011-01-11 07:18:59');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('success',10,'please be fast.','2011-01-03 03:11:15');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('zaher',4,'please be fast.','2011-01-01 00:07:14');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('ali',8,'good performance.','2011-01-30 09:51:27');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('ashry',2,'Test message 1.','2011-02-01 00:43:24');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('success',5,'guys we count on you.','2011-01-29 08:42:56');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('zaher',7,'CAN YOU HEAR ME ????','2011-01-16 15:22:13');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('moustafa',6,'Test message 2.','2011-01-25 00:13:30');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('ashry',3,'Finish it as fast as u can.','2011-01-02 03:50:02');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('success',1,'wish u all the best.','2010-12-23 10:47:21');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('zaher',9,'What\'s next ?','2011-01-01 17:35:51');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('moustafa',10,'CAN YOU HEAR ME ????','2011-01-19 23:49:03');
INSERT INTO `comment`(`username`,`task_id`,`comment`,`time`) 
VALUES('ali',4,'CAN YOU HEAR ME ????','2011-01-29 18:33:15');
COMMIT;

/* Generating data for table vote_options... */

INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(1,'Option test 1',7);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(2,'Option test 2',6);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(3,'Option test 4',4);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(4,'Option test 3',1);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(5,'Option test 4',7);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(6,'Option test 2',9);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(7,'Option test 1',9);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(8,'Option test 2',1);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(9,'Option test 2',3);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(10,'Option test 4',6);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(11,'Option test 4',5);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(12,'Option test 1',6);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(13,'Option test 4',1);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(14,'Option test 1',8);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(15,'Option test 3',3);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(16,'Option test 3',5);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(17,'Option test 2',2);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(18,'Option test 1',6);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(19,'Option test 4',10);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(20,'Option test 3',7);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(21,'Option test 3',4);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(22,'Option test 3',10);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(23,'Option test 1',10);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(24,'Option test 1',9);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(25,'Option test 3',4);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(26,'Option test 3',10);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(27,'Option test 4',8);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(28,'Option test 4',3);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(29,'Option test 4',2);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(30,'Option test 2',8);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(31,'Option test 2',2);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(32,'Option test 1',8);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(33,'Option test 3',5);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(34,'Option test 1',1);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(35,'Option test 2',3);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(36,'Option test 1',2);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(37,'Option test 3',5);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(38,'Option test 4',7);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(39,'Option test 2',4);
INSERT INTO `vote_options`(`option_id`,`name`,`vote_id`) 
VALUES(40,'Option test 2',9);
COMMIT;

/* Generating data for table user_voting... */

INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('success',34);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('zaher',18);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('ali',36);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('ashry',31);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('moustafa',4);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('zaher',25);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('ali',2);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('ashry',32);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('moustafa',37);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('success',11);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('ali',30);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('ashry',40);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('moustafa',23);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('success',33);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('zaher',26);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('ashry',5);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('moustafa',22);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('success',24);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('zaher',13);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('ali',19);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('moustafa',20);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('success',9);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('zaher',3);
COMMIT;
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('ali',6);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('ashry',38);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('success',29);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('zaher',39);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('ali',8);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('ashry',7);
INSERT INTO `user_voting`(`username`,`option_id`) 
VALUES('moustafa',17);
COMMIT;
COMMIT;
