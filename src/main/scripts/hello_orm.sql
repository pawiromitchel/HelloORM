create database hello_orm;
use hello_orm;

CREATE TABLE student (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  firstname varchar(50) not null,
  lastname varchar(50) not null,
  date_of_birth date not null,
  number varchar(20) not null unique
);

desc student;
insert into student values (1,'Maarten', 'Narain', '2000-12-17', 'SE/3000/001');
update student set date_of_birth = '3000-12-17' where id = 1;
select * from student;

