# drop table if exists student;
create table if not exists student
(
  id         int not null primary key auto_increment,
  name       varchar(20),
  branch     varchar(20),
  percentage int(2),
  phone      varchar(30),
  email      varchar(30)
);


create table if not exists author
(
  id       int not null primary key auto_increment,
  username varchar(20),
  password varchar(20),
  bio      varchar(20),
  email    varchar(20)
);


create table if not exists blog
(
  id          int not null primary key auto_increment,
  title       varchar(20),
  body        varchar(200),
  author_id   int not null,
  create_time datetime
);