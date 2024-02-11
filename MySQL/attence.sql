drop table if exists emp;
drop table if exists attence;

create table emp(
    empId int primary key,
    empName varchar(20) not null
);

create table attence(
    attenceId int primary key,
    empId int,
    attenceTime datetime,
    foreign key (empId) references emp(empId)
);

insert into emp values(1, '张三'),
(2,'李四'),(3,'王五'),(4,'赵六'),(5,'田七');

select * from emp;

select 
    empName, attenceTime
from
    emp e
join
    attence a
on 
    e.empId = a.empId;