create table users(
	id int(11) not null AUTO_INCREMENT,
	name varchar(20) not null comment '名称',
	primary key(id)
)

create table money(
	id int(11) not null auto_increment,
	user_id int(11) not null comment 'users 表 id',
	money decimal(10, 2) default 0 comment 'money',
	primary key(id)
)