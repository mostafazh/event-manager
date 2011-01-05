SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

DROP SCHEMA IF EXISTS `eventManager` ;
CREATE SCHEMA IF NOT EXISTS `eventManager` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `eventManager` ;

-- -----------------------------------------------------
-- Table `eventManager`.`type`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `eventManager`.`type` ;

CREATE  TABLE IF NOT EXISTS `eventManager`.`type` (
  `type_id` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(45) NOT NULL ,
  `description` MEDIUMTEXT NULL ,
  PRIMARY KEY (`type_id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eventManager`.`evaluation`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `eventManager`.`evaluation` ;

CREATE  TABLE IF NOT EXISTS `eventManager`.`evaluation` (
  `evaluation_id` INT NOT NULL AUTO_INCREMENT ,
  `comment` MEDIUMTEXT NOT NULL ,
  PRIMARY KEY (`evaluation_id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eventManager`.`team`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `eventManager`.`team` ;

CREATE  TABLE IF NOT EXISTS `eventManager`.`team` (
  `team_id` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`team_id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eventManager`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `eventManager`.`user` ;

CREATE  TABLE IF NOT EXISTS `eventManager`.`user` (
  `username` VARCHAR(25) NOT NULL ,
  `password` VARCHAR(25) NOT NULL ,
  `name` VARCHAR(45) NOT NULL ,
  `rating` INT NULL ,
  `type_id` INT NULL ,
  `evaluation_id` INT NULL ,
  `image` LONGTEXT NULL ,
  `team_id` INT NULL ,
  PRIMARY KEY (`username`) ,
  INDEX `user_type` (`type_id` ASC) ,
  INDEX `user_evaluation` (`evaluation_id` ASC) ,
  INDEX `user_team` (`team_id` ASC) ,
  CONSTRAINT `user_type`
    FOREIGN KEY (`type_id` )
    REFERENCES `eventManager`.`type` (`type_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `user_evaluation`
    FOREIGN KEY (`evaluation_id` )
    REFERENCES `eventManager`.`evaluation` (`evaluation_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `user_team`
    FOREIGN KEY (`team_id` )
    REFERENCES `eventManager`.`team` (`team_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eventManager`.`messages`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `eventManager`.`messages` ;

CREATE  TABLE IF NOT EXISTS `eventManager`.`messages` (
  `message_id` INT NOT NULL AUTO_INCREMENT ,
  `title` VARCHAR(200) NOT NULL ,
  `type` INT NOT NULL ,
  `text` LONGTEXT NULL ,
  `voice` LONGTEXT NULL ,
  PRIMARY KEY (`message_id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eventManager`.`messages_from_to`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `eventManager`.`messages_from_to` ;

CREATE  TABLE IF NOT EXISTS `eventManager`.`messages_from_to` (
  `message_id` INT NOT NULL ,
  `from` VARCHAR(25) NOT NULL ,
  `to` VARCHAR(25) NOT NULL ,
  PRIMARY KEY (`message_id`, `from`, `to`) ,
  INDEX `message_sent` (`message_id` ASC) ,
  INDEX `to` (`to` ASC) ,
  INDEX `from` (`from` ASC) ,
  CONSTRAINT `message_sent`
    FOREIGN KEY (`message_id` )
    REFERENCES `eventManager`.`messages` (`message_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `to`
    FOREIGN KEY (`to` )
    REFERENCES `eventManager`.`user` (`username` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `from`
    FOREIGN KEY (`from` )
    REFERENCES `eventManager`.`user` (`username` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eventManager`.`task`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `eventManager`.`task` ;

CREATE  TABLE IF NOT EXISTS `eventManager`.`task` (
  `task_id` INT NOT NULL AUTO_INCREMENT ,
  `title` VARCHAR(200) NOT NULL ,
  `priority` INT NULL DEFAULT 0 ,
  `description` LONGTEXT NOT NULL ,
  `notes` LONGTEXT NULL ,
  `deadline` DATETIME NOT NULL ,
  `status` INT NULL DEFAULT 0 ,
  PRIMARY KEY (`task_id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eventManager`.`user_task`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `eventManager`.`user_task` ;

CREATE  TABLE IF NOT EXISTS `eventManager`.`user_task` (
  `username` VARCHAR(25) NOT NULL ,
  `task_id` INT NOT NULL ,
  PRIMARY KEY (`username`, `task_id`) ,
  INDEX `assigned_task` (`task_id` ASC) ,
  INDEX `assigned_to_user` (`username` ASC) ,
  CONSTRAINT `assigned_task`
    FOREIGN KEY (`task_id` )
    REFERENCES `eventManager`.`task` (`task_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `assigned_to_user`
    FOREIGN KEY (`username` )
    REFERENCES `eventManager`.`user` (`username` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eventManager`.`comment`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `eventManager`.`comment` ;

CREATE  TABLE IF NOT EXISTS `eventManager`.`comment` (
  `username` VARCHAR(25) NOT NULL ,
  `task_id` INT NOT NULL ,
  `comment` TEXT NULL ,
  `time` DATETIME NOT NULL ,
  PRIMARY KEY (`username`, `task_id`, `time`) ,
  INDEX `commenter` (`username` ASC) ,
  INDEX `on_task` (`task_id` ASC) ,
  CONSTRAINT `commenter`
    FOREIGN KEY (`username` )
    REFERENCES `eventManager`.`user` (`username` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `on_task`
    FOREIGN KEY (`task_id` )
    REFERENCES `eventManager`.`task` (`task_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eventManager`.`vote`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `eventManager`.`vote` ;

CREATE  TABLE IF NOT EXISTS `eventManager`.`vote` (
  `vote_id` INT NOT NULL AUTO_INCREMENT ,
  `title` VARCHAR(200) NOT NULL ,
  PRIMARY KEY (`vote_id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eventManager`.`vote_options`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `eventManager`.`vote_options` ;

CREATE  TABLE IF NOT EXISTS `eventManager`.`vote_options` (
  `option_id` INT NOT NULL AUTO_INCREMENT ,
  `name` TEXT NOT NULL ,
  `vote_id` INT NOT NULL ,
  PRIMARY KEY (`option_id`) ,
  INDEX `option_vote` (`vote_id` ASC) ,
  CONSTRAINT `option_vote`
    FOREIGN KEY (`vote_id` )
    REFERENCES `eventManager`.`vote` (`vote_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eventManager`.`user_voting`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `eventManager`.`user_voting` ;

CREATE  TABLE IF NOT EXISTS `eventManager`.`user_voting` (
  `username` VARCHAR(25) NOT NULL ,
  `option_id` INT NOT NULL ,
  PRIMARY KEY (`username`, `option_id`) ,
  INDEX `user_vote` (`username` ASC) ,
  INDEX `selected_vote` (`option_id` ASC) ,
  CONSTRAINT `user_vote`
    FOREIGN KEY (`username` )
    REFERENCES `eventManager`.`user` (`username` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `selected_vote`
    FOREIGN KEY (`option_id` )
    REFERENCES `eventManager`.`vote_options` (`option_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
