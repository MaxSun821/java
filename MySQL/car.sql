drop table if exists user;
drop table if exists car;
drop table if exists info;

create table user(
    userId int primary key,
    userName varchar(20)
);
create table car(
    carId int primary key,
    carName varchar(20),
    userId int,
    foreign key (userId) references user(userId)
);
create table info(
    infoId int primary key,
    carId int,
    userId int,
    infoTime datetime
    foreign key (carId) references car(carId),
    foreign key (userId) references user(userId)
);