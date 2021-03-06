-- MySQL Script generated by MySQL Workbench
-- Wed May 18 23:01:00 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`follow`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`follow` ;

CREATE TABLE IF NOT EXISTS `mydb`.`follow` (
  `from` VARCHAR(45) NOT NULL,
  `to` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`from`, `to`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`user` ;

CREATE TABLE IF NOT EXISTS `mydb`.`user` (
  `id` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NULL,
  `nickname` VARCHAR(45) NULL,
  `introduce` VARCHAR(2000) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`review`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`review` ;

CREATE TABLE IF NOT EXISTS `mydb`.`review` (
  `no` INT NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(45) NOT NULL,
  `title` VARCHAR(100) NULL,
  `content` VARCHAR(2000) NULL,
  `date` TIMESTAMP NULL,
  PRIMARY KEY (`no`, `user_id`),
  INDEX `FK_review_user_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `FK_review_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `mydb`.`user` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`comment`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`comment` ;

CREATE TABLE IF NOT EXISTS `mydb`.`comment` (
  `no` INT NOT NULL AUTO_INCREMENT,
  `review_no` INT NOT NULL,
  `content` VARCHAR(1000) NULL,
  PRIMARY KEY (`no`, `review_no`),
  INDEX `FK_comment_review_idx` (`review_no` ASC) VISIBLE,
  CONSTRAINT `FK_comment_review`
    FOREIGN KEY (`review_no`)
    REFERENCES `mydb`.`review` (`no`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`video`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`video` ;

CREATE TABLE IF NOT EXISTS `mydb`.`video` (
  `no` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NULL,
  `part_no` INT NULL,
  `channel_name` VARCHAR(45) NULL,
  `url` VARCHAR(200) NULL,
  `spot_no` INT NULL,
  PRIMARY KEY (`no`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`routine`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`routine` ;

CREATE TABLE IF NOT EXISTS `mydb`.`routine` (
  `review_no` INT NOT NULL,
  `video_no` INT NOT NULL,
  `difficulty` INT NULL,
  PRIMARY KEY (`review_no`, `video_no`),
  INDEX `FK_routine_video_idx` (`video_no` ASC) VISIBLE,
  CONSTRAINT `FK_routine_review`
    FOREIGN KEY (`review_no`)
    REFERENCES `mydb`.`review` (`no`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_routine_video`
    FOREIGN KEY (`video_no`)
    REFERENCES `mydb`.`video` (`no`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`part`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`part` ;

CREATE TABLE IF NOT EXISTS `mydb`.`part` (
  `no` INT NULL,
  `part` VARCHAR(45) NULL)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`favorite`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`favorite` ;

CREATE TABLE IF NOT EXISTS `mydb`.`favorite` (
  `user_id` VARCHAR(45) NOT NULL,
  `review_no` INT NOT NULL,
  PRIMARY KEY (`user_id`, `review_no`),
  INDEX `FK_favorite_review_idx` (`review_no` ASC) VISIBLE,
  CONSTRAINT `FK_favorite_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `mydb`.`user` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_favorite_review`
    FOREIGN KEY (`review_no`)
    REFERENCES `mydb`.`review` (`no`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`favorite`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`favorite` ;

CREATE TABLE IF NOT EXISTS `mydb`.`favorite` (
  `user_id` VARCHAR(45) NOT NULL,
  `review_no` INT NOT NULL,
  PRIMARY KEY (`user_id`, `review_no`),
  INDEX `FK_favorite_review_idx` (`review_no` ASC) VISIBLE,
  CONSTRAINT `FK_favorite_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `mydb`.`user` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_favorite_review`
    FOREIGN KEY (`review_no`)
    REFERENCES `mydb`.`review` (`no`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`spot`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`spot` ;

CREATE TABLE IF NOT EXISTS `mydb`.`spot` (
  `no` INT NULL,
  `spot` VARCHAR(45) NULL)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;