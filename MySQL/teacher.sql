drop table if exists teacher;
create table teacher(
    name varchar(10),
    age int,
    height double(4,1),
    weight double(4,1),
    gender varchar(6),
    education varchar(10),
    birthday datetime,
    id_card varchar(20)
);