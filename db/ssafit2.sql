
insert into part
values
(1, '전신'),
(2, '상체'),
(3, '하체'),
(4, '복부');

select *
from part;

insert into spot
values
(1, '집'),
(2, '헬스장'),
(3, '실외');

select *
from spot;

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


select *
from video;

insert into user
values
('dlfwns', 'dlfwns', 'smilejun', 'im iljun'),
('xodl', 'xodl', 'smileehoi', 'im ehoi'),
('wjdgus', 'wjdgus', 'smilehyun', 'im hyun');

select *
from user;

SELECT no, title, part_no partNo, channel_name channelName, url, spot_no spotNo
FROM video;
        
select *
from review;

select *
from routine;

delete from review
where no = 4;

delete from routine
where video_no = 3;


select v.no, v.title, v.part_no partNo, v.channel_name channelName, v.url, v.spot_no spotNo 
from video v
inner join (
			select video_no
			from routine
			group by video_no
			having avg(difficulty) BETWEEN (2-1) AND 2
			) c
on v.no = c.video_no
where v.spot_no = 1
AND v.part_no = 1;


CREATE TABLE IF NOT EXISTS `mydb`.`plan` (
  `user_id` VARCHAR(45) NOT NULL,
  `video_no` INT NOT NULL,
  `date` TIMESTAMP NOT NULL
  )
ENGINE = InnoDB;

select *
from plan;


DELETE FROM plan
WHERE user_id = 'dlfwns'
AND date = '2022-05-19'

