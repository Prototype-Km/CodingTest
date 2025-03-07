-- 코드를 입력하세요
select name
from ANIMAL_INS
where DATETIME = (select MIN(DATETIME) from ANIMAL_INS);


-- 가장먼저 -> dateTime이 가장 ㄴ낮은거 