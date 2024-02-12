drop table if exists emp;
create table emp(
    Id int primary key auto_increment,
    Salary int
);

insert into emp(Salary) values(100),(200),(300);
select * from emp;

select Salary as SecondHighestSalary from emp order by Salary desc limit 1,1;

select ifnull((select Salary from emp order by Salary desc limit 1,1),null) as SecondHighestSalary;