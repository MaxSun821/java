drop table if exists hostel_info;
drop table if exists student_info;
drop table if exists check_hostel;

create table hostel_info(
    hostelId int primary key,
    number varchar(20) not null
);
create table student_info(
    studentId int primary key,
    name varchar(20),
    hostelId int,
    foreign key (hostelId) references hostel_info(hostelId)
);
create table check_hostel(
    checkId int primary key,
    hostelId int,
    checkTime datetime,
    foreign key (hostelId) references hostel_info(hostelId)
);