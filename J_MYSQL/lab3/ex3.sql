create schema ex3;
create table ex3.Prodacts(id int primary key auto_increment not null, name varchar(50) NOT null, price double not null);
insert into ex3.Prodacts(name,price) values ('Pen',2.5);
insert into ex3.Prodacts(name,price) values ('Pencil',1.2);
insert into ex3.Prodacts(name,price) values ('Notebook',1.2);
select * from ex3.prodacts;
update ex3.prodacts set name = 'Green Pen', price = 2.7 where id = 1prodacts;
select * from ex3.prodacts;
delete from ex3.prodacts where id = 2;
select * from ex3.prodacts;
drop table ex3.prodacts;
drop schema ex3;