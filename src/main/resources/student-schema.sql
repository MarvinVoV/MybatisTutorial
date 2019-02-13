# drop table if exists student;
create table if not exists student (
  id int not null primary key auto_increment,
  name varchar(20),
  branch varchar(20),
  percentage int(2),
  phone varchar(30),
  email varchar(30)
);