drop schema if exists cab_booking_db;


create schema cab_booking_db;
use cab_booking_db;


create table cab(
cab_no int primary key,
model_name varchar(10) not null,
driver_phone_no bigint not null,
availability varchar(4) not null
);

create table booking(
booking_id int auto_increment primary key,
customer_name varchar(20) not null,
phone_no bigint not null,
booking_type varchar(20) not null,
cab_no int unique references cab(cab_no) 
);

insert into cab values(451678,'Honda',9823478234,'No');
insert into cab values(567897,'Mahindra',9643345654,'No');
insert into cab values(234987,'Toyota',9643675654,'No');
insert into cab values(456783,'Toyota',9947835654,'Yes');
insert into cab values(159723,'Maruti',8744435654,'Yes');


insert into booking values(1001,'Michel',9867542341,'Shared',451678);
insert into booking values(1002,'Robert',8745316754,'Personal',567897);
insert into booking values(1003,'Peter',9645336766,'Shared',234987);

--commit;

select * from booking;
select * from cab;
