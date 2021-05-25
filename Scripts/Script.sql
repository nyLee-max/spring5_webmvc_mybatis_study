select * from member;

select id, email, password, name, regdate from member;

insert 
  into member(email, password, name)
values ('test16@test.co.kr', '1111', '테스트');

delete 
  from member
 where email = 'test16@test.co.kr';
 
update member
   set name = 'test', password = '1234'
 where email = 'test16@test.co.kr';
 
select count(*) from member;

select *
  from member
 where regdate between '2021-05-17 00' and '2021-05-21 00' 
 order by regdate desc;