drop table if exists goods;
create table goods(
    name varchar(30),
    price decimal(6,2),
    storage int,
    description varchar(50)
);