drop table if exists goods;
create table goods(
    name varchar(30),
    price decimal(6,2),
    storage int,
    description varchar(50)
);
insert into goods values('学生书包',18.91,101,null);
update goods set price = price + 50 where storage > 30;