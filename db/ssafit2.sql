
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
('저는 하체 식주의자 입니다', 3, 'GYM종국', 'https://www.youtube.com/embed/u5OgcZdNbMo',2),
('11자복근 복부 최고의 운동 [복근 핵매운맛]', 4, 'ThankyouBUBU', 'https://www.youtube.com/embed/PjGcOP-TQPE',1),
('(Sub)누워서하는 5분 복부운동!! 효과보장! (매일 2주만 해보세요!)', 4, 'SomiFit', 'https://www.youtube.com/embed/7TLk7pscICk',1);

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



