drop table if exists books;
create table books(
    name varchar(10),
    author varchar(30),
    price decimal(4,1),
    category varchar(10)
);
insert into books values('Java核心技术','Cay S. Horstman',56.43,'计算机技术');
update books set price = 61 where name = 'Java核心技术';