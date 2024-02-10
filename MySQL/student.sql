drop table if exists student;
create table student(
    name varchar(20),
    age int
);

insert into student values('张三', 23),('李四', 24),('王五', 25),('张翼德', 22),('张飞', 19),('赵六', 26);

select * from student;