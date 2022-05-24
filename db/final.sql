-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`user` ;

CREATE TABLE IF NOT EXISTS `mydb`.`user` (
  `id` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NULL DEFAULT NULL,
  `nickname` VARCHAR(45) NULL DEFAULT NULL,
  `introduce` VARCHAR(2000) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`review`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`review` ;

CREATE TABLE IF NOT EXISTS `mydb`.`review` (
  `no` INT NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(45) NOT NULL,
  `title` VARCHAR(100) NULL DEFAULT NULL,
  `content` VARCHAR(2000) NULL DEFAULT NULL,
  `date` TIMESTAMP NULL DEFAULT NULL,
  PRIMARY KEY (`no`, `user_id`),
  INDEX `FK_review_user_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `FK_review_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `mydb`.`user` (`id`)
    ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`comment`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`comment` ;

CREATE TABLE IF NOT EXISTS `mydb`.`comment` (
  `no` INT NOT NULL AUTO_INCREMENT,
  `review_no` INT NOT NULL,
  `user_id` VARCHAR(45) NOT NULL,
  `comment` VARCHAR(100) NOT NULL,
  `date` TIMESTAMP NOT NULL,
  PRIMARY KEY (`no`),
  INDEX `review_no` (`review_no` ASC) VISIBLE,
  CONSTRAINT `comment_ibfk_1`
    FOREIGN KEY (`review_no`)
    REFERENCES `mydb`.`review` (`no`)
    ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`favorite`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`favorite` ;

CREATE TABLE IF NOT EXISTS `mydb`.`favorite` (
  `user_id` VARCHAR(45) NOT NULL,
  `review_no` INT NOT NULL,
  PRIMARY KEY (`user_id`, `review_no`),
  INDEX `FK_favorite_review_idx` (`review_no` ASC) VISIBLE,
  CONSTRAINT `FK_favorite_review`
    FOREIGN KEY (`review_no`)
    REFERENCES `mydb`.`review` (`no`)
    ON DELETE CASCADE,
  CONSTRAINT `FK_favorite_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `mydb`.`user` (`id`)
    ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`follow`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`follow` ;

CREATE TABLE IF NOT EXISTS `mydb`.`follow` (
  `from` VARCHAR(45) NOT NULL,
  `to` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`from`, `to`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`part`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`part` ;

CREATE TABLE IF NOT EXISTS `mydb`.`part` (
  `no` INT NULL DEFAULT NULL,
  `part` VARCHAR(45) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`plan`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`plan` ;

CREATE TABLE IF NOT EXISTS `mydb`.`plan` (
  `user_id` VARCHAR(45) NOT NULL,
  `video_no` INT NOT NULL,
  `date` TIMESTAMP NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`video`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`video` ;

CREATE TABLE IF NOT EXISTS `mydb`.`video` (
  `no` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NULL DEFAULT NULL,
  `part_no` INT NULL DEFAULT NULL,
  `channel_name` VARCHAR(45) NULL DEFAULT NULL,
  `url` VARCHAR(200) NULL DEFAULT NULL,
  `spot_no` INT NULL DEFAULT NULL,
  PRIMARY KEY (`no`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`routine`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`routine` ;

CREATE TABLE IF NOT EXISTS `mydb`.`routine` (
  `review_no` INT NOT NULL,
  `video_no` INT NOT NULL,
  `difficulty` INT NULL DEFAULT NULL,
  PRIMARY KEY (`review_no`, `video_no`),
  INDEX `FK_routine_video_idx` (`video_no` ASC) VISIBLE,
  CONSTRAINT `FK_routine_review`
    FOREIGN KEY (`review_no`)
    REFERENCES `mydb`.`review` (`no`)
    ON DELETE CASCADE,
  CONSTRAINT `FK_routine_video`
    FOREIGN KEY (`video_no`)
    REFERENCES `mydb`.`video` (`no`)
    ON DELETE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`spot`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`spot` ;

CREATE TABLE IF NOT EXISTS `mydb`.`spot` (
  `no` INT NULL DEFAULT NULL,
  `spot` VARCHAR(45) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `mydb`.`together`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`together` ;

drop table together;

CREATE TABLE IF NOT EXISTS `mydb`.`together` (
  `no` INT NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(45) NOT NULL,
  `lat` DOUBLE NOT NULL,
  `lng` DOUBLE NOT NULL,
  `content` VARCHAR(100) NOT NULL,
  `date` TIMESTAMP NOT NULL,
  PRIMARY KEY (`no`),
  INDEX `FK_together_user_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `FK_together_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `mydb`.`user` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


insert into part
values
(1, '전신'),
(2, '상체'),
(3, '하체'),
(4, '복부');

insert into spot
values
(1, '집'),
(2, '헬스장'),
(3, '실외');

insert into video (title, part_no, channel_name, url, spot_no)
values
('전신 다이어트 최고의 운동 [칼소폭 찐 핵핵매운맛]', 1, 'ThankyouBUBU','https://www.youtube.com/embed/gMaB-fG4u4g',1),
('하루 15분! 전신 칼로리 불태우는 다이어트 운동', 1 , 'ThankyouBUBU', 'https://www.youtube.com/embed/swRNeYw1JkY',1),
('상체 다이어트 최고의 운동 BEST [팔뚝살/겨드랑이살/등살/가슴어깨라인]', 2, 'ThankyouBUBU', 'https://www.youtube.com/embed/54tTYO-vU2E',1),
('상체비만 다이어트 최고의 운동 [상체 핵매운맛]', 2, 'ThankyouBUBU', 'https://www.youtube.com/embed/QqqZH3j_vH0',1),
('하체운동이 중요한 이유? 이것만 보고 따라하자 ! [하체운동 교과서]', 3, '김강민', 'https://www.youtube.com/embed/tzN6ypk6Sps',2),
('저는 하체 식주의자 입니다', 3, '김종국 GYM JONG KOOK', 'https://www.youtube.com/embed/u5OgcZdNbMo',2),
('11자복근 복부 최고의 운동 [복근 핵매운맛]', 4, 'ThankyouBUBU', 'https://www.youtube.com/embed/PjGcOP-TQPE',1),
('(Sub)누워서하는 5분 복부운동!! 효과보장! (매일 2주만 해보세요!)', 4, 'SomiFit', 'https://www.youtube.com/embed/7TLk7pscICk',1),
('어깨후면.. 저는 이렇게 합니다..',2,'김종국 GYM JONG KOOK','https://www.youtube.com/embed/HCnDDAMDKps',2),
("건장한 상체가 여리+슬림+탄탄해지는 '상체올킬루틴' (7일효과: 팔뚝살,등살,뱃살 완전빠짐&탄력up!!!)",2,'이지은 다이어트 Jiny diet','https://www.youtube.com/embed/XjEfUcZLbG4',1),
('헬스장이 처음이라면 이대로만 따라하세요! 헬스 초보자용 가슴+어깨 상체운동 루틴', 2, '핏블리 FITVELY','https://www.youtube.com/embed/Cb0yy0yHRUg/', 2),
('등, 가슴, 팔, 어깨 탄탄하게 만들기 - 덤벨 상체 운동 홈트 루틴',2,'빅씨스','https://www.youtube.com/embed/xoWKLNwNva0/',1),
('NO 층간소음 - 20분 상체운동 루틴 + 스트레칭',2,'빅씨스','https://www.youtube.com/embed/e1DHt9wfQOA/',1),
('집에서 할 수 있는 상체운동 루틴 | 다이어트+근육증가 버전!! 이대로만 하세요', 2 ,'핏블리 FITVELY', 'https://www.youtube.com/embed/GZtB7W9Uafk/', 1),
('상체 덤벨 홈트레이닝 운동루틴 사이드밴드/덤벨로우/백익스텐션/체스트스퀴즈 [웨이홈트]',2,'핏블리 FITVELY','https://www.youtube.com/embed/voxhcy_oDGA/',1),
('(층간소음X, 설명O) 진짜 힘듦주의.. 초강력 힙으뜸 하체운동 2주 챌린지',3,'힙으뜸','https://www.youtube.com/embed/js8z5wIZ0wg/',1),
('“선생님 하체 너무 맛있어요” PT회원님이 인정한 하체운동루틴 [런지/스쿼트/스티프데드리프트/레그프레스]',3,'핏블리 FITVELY','https://www.youtube.com/embed/ARc1KXjagTY/',2),
('이것만 알면 당신의 하체는 달라집니다.',3,'건담포스 김건우','https://www.youtube.com/embed/m0Y7kvirvCY/',2),
('NO 층간소음 올인원 운동 - 40분 유산소운동 홈트 - 관절에 무리없이 체지방 태우기',1,'빅씨스','https://www.youtube.com/embed/myNjmnvI6x0/',1),
('(층간소음X) 설명 다 퍼주는 심으뜸 올인원 전신운동 50분루틴',1,'힙으뜸','https://www.youtube.com/embed/lPtENEtGDYU/',1),
('NO 층간소음 - 고민없이 하나로 끝내는 전신운동 근력 유산소 - 운동 못한 날 죄책감 씻어줄 30분 홈트',1,'빅씨스','https://www.youtube.com/embed/4kZHHPH6heY/',1),
('[층간소음X] 다음날 전신근육통 보장! WHOLE BODY TABATA WORKOUT',1,'핏블리 FITVELY','https://www.youtube.com/embed/_I7MrmBreOc/',1),
('힙으뜸 기초체력 홈트 15분루틴 (ft.땀폭발 전신순환운동, 코어운동)',1,'힙으뜸','https://www.youtube.com/embed/rSBOuArsz1k/',1),
('[전신 운동] 근육은 늘리고 살은 빼는 홈트 (초급자 추천)',1,'Hbro 길환TV','https://www.youtube.com/embed/nz5qsvRgK24/',1),
('헬스장 전신운동 올인원 루틴, 홈트로 활용 가능!! feat. 땀터짐 주의, 근력운동 여자',1,'힙으뜸','https://www.youtube.com/embed/6jTDXo9E59Y/',2),
('살 빠지는 전신운동 루틴 with 피지컬갤러리',1,'힙으뜸','https://www.youtube.com/embed/s14NQ6Cz4QE/',1),
('맙소사. 이번 4분 전신 타바타 꼭 하세요 | MUST DO TOTAL BODY 4MIN TABATA',1,'Allblanc TV','https://www.youtube.com/embed/4dH528sDhGA/',2),
('복부운동 짧고 굵게! 운동효율 갑! [6 MINS ABS WORKOUT]',4,'소미핏 SomiFit','https://www.youtube.com/embed/sVQqBDBZhmI/',1),
('2주만에 효과보장 복부운동 10분 #매일 #하복부 #초보',4,'제이제이살롱드핏','https://www.youtube.com/embed/rS5aH95job8/',1),
('[누워서하는] 복부 파괴 핵마라맛 11분 복부운동 (ABS WORKOUT 10 MIN)',4,'제이제이살롱드핏','https://www.youtube.com/embed/EojxzBZbo4o/',1),
('뱃살 없애는 최고의 홈트 루틴 허리라인은 덤! NO 층간 소음 [웨이홈트]',4,'핏블리 FITVELY','https://www.youtube.com/embed/DmbC-TyGIIM/',1),
('9분! 초간단 누워서하는 11자 복근운동',4,'Thankyou BUBU','https://www.youtube.com/embed/zcQ16cfJN9Q/',1),
('다이어트용 헬스장 기구운동 순서와 횟수! 루틴표 공개 [초보자용]',1,'핏블리 FITVELY','https://www.youtube.com/embed/Iazno8QPDOg/',2),
('반드시보세요!! 헬스장이 처음 이신 분들을 위한 완벽 루틴 정리(헬린이와 운동초보자분들을 위해)',1,'고러쉬','https://www.youtube.com/embed/zjfGs_iIIE8/',2),
('운동 다시 시작하시게요? 헬스 초,중급 상체 루틴 가이드',2,'김강민_Kim Kang min','https://www.youtube.com/embed/7NPwSCjqka0/',2),
("어깨 운동만 '한' 남자",2,'김종국 GYM JONG KOOK','https://www.youtube.com/embed/8thMw9JyxBE/',2);

insert into user
values
('dlfwns', 'dlfwns', 'smilejun', 'im iljun'),
('xodl', 'xodl', 'smileehoi', 'im ehoi'),
('wjdgus', 'wjdgus', 'smilehyun', 'im hyun');

insert into review
values
(1, 'wjdgus','first', 'first', now());

insert into routine
values
(1, 1, 1),
(1, 2, 2),
(1, 3, 3),
(1, 4, 4),
(1, 5, 5),
(1, 6, 1),
(1, 7, 2),
(1, 8, 3),
(1, 9, 4),
(1, 10, 5),
(1, 11, 1),
(1, 12, 2),
(1, 13, 3),
(1, 14, 4),
(1, 15, 5),
(1, 16, 1),
(1, 17, 2),
(1, 18, 3),
(1, 19, 4),
(1, 20, 5),
(1, 21, 1),
(1, 22, 2),
(1, 23, 3),
(1, 24, 4),
(1, 25, 5),
(1, 26, 1),
(1, 27, 2),
(1, 28, 3),
(1, 29, 4),
(1, 30, 5),
(1, 31, 1),
(1, 32, 2),
(1, 33, 3),
(1, 34, 4),
(1, 35, 5),
(1, 36, 1);

insert into together (no, user_id, lat, lng, date)
values
(0, 'dlfwns', 36.3574142, 127.3093141, now());

select *
from together;
