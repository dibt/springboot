use tmall_ssm;
CREATE TABLE category (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(30),
  PRIMARY KEY (id)
) DEFAULT CHARSET=UTF8;

insert into category values(null,'category 1');
insert into category values(null,'category 2');
insert into category values(null,'category 3');
insert into category values(null,'category 4');