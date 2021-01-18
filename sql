use o2o;
CREATE TABLE `tb_area`(
	`area_id` int(2) NOT NULL AUTO_INCREMENT,
	`area_name` VARCHAR(200) NOT NULL,
	`priority` int(2) NOT NULL DEFAULT'0',
	`create_time` datetime DEFAULT NULL,
	`last_edit_time` datetime DEFAULT NULL,
	PRIMARY KEY(`area_id`),
	UNIQUE KEY`UK_AREA`(`area_name`)
	)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

use o2o;
CREATE TABLE `tb_person_info`(
	`user_id` int(10) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(32) DEFAULT NULL,
	`profile_img` VARCHAR(1024) DEFAULT NULL,
	`email` VARCHAR(1024) DEFAULT NULL,
	`gender` VARCHAR(2) DEFAULT NULL,
	`enable_status` int(2) NOT NULL DEFAULT'0' COMMENT'0:禁止使用，1:允许使用',
	`user_type` int(2) NOT NULL DEFAULT'1' COMMENT'1顾客2店家3超级管理员',
	`create_time` datetime DEFAULT NULL,
	`last_edit_time` datetime DEFAULT NULL,
	PRIMARY KEY(`user_id`)
	)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

use o2o;
CREATE TABLE `tb_wechat_auth`(
	`wechat_auth_id` int(10) NOT NULL AUTO_INCREMENT,
	`user_id` int(10) NOT NULL,
	`open_id` VARCHAR(1024) NOT NULL,
	`create_time` datetime DEFAULT NULL,
	PRIMARY KEY(`wechat_auth_id`),
	CONSTRAINT `fk_wechatauth_profile` FOREIGN KEY(`user_id`) REFERENCES `tb_person_info`(`user_id`)
	)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
CREATE TABLE `tb_local_auth`(
	`local_auth_id` int(10) NOT NULL AUTO_INCREMENT,
	`user_id` int(10) NOT NULL,
	`username` VARCHAR(128) not NULL,
	`password` VARCHAR(128) NOT NULL,
	`create_time` datetime DEFAULT NULL,
	`last_edit_time` datetime DEFAULT NULL,
	PRIMARY KEY(`local_auth_id`),
	UNIQUE KEY `uk_local_profile`(`username`),
	CONSTRAINT `fk_localauth_profile` FOREIGN KEY(`user_id`) REFERENCES `tb_person_info`(`user_id`)
	)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

创建唯一索引
alter TABLE tb_wechat_auth add unique index(open_id);

use o2o;

CREATE TABLE `tb_head_line`(
	`line_id` int(100) NOT NULL AUTO_INCREMENT,
	`line_name` VARCHAR(1000) DEFAULT NULL,
	`line_link` VARCHAR(2000) NOT NULL,
	`line_img` VARCHAR(2000) NOT NULL,
	`priority` int(2) DEFAULT NULL,
	`enable_status` int(2) NOT NULL DEFAULT'0',
	`create_time` datetime DEFAULT NULL,
	`last_edit_time` datetime DEFAULT NULL,
	PRIMARY KEY(`line_id`)
	)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE `tb_shop_category`(
	`shop_category_id` int(11) NOT NULL AUTO_INCREMENT,
	`shop_category_name` VARCHAR(100) NOT NULL DEFAULT '',
	`shop_category_desc` VARCHAR(1000) DEFAULT '',
	`shop_category_img` VARCHAR(2000) DEFAULT NULL,
	`priority` int(2) NOT NULL DEFAULT '0',
	`create_time` datetime DEFAULT NULL,
	`last_edit_time` datetime DEFAULT NULL,
	`parent_id` int(11) DEFAULT NULL,
	PRIMARY KEY(`shop_category_id`),
	CONSTRAINT `fk_shop_category_self` FOREIGN KEY(`parent_id`) REFERENCES `tb_shop_category`(`shop_category_id`)
	)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;



