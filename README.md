# druidtest

## 为了正确连接数据库，mysql端口/用户名/密码需配置如下

port:3306
user:root
password:root

## mysql数据库结构初始化

1. create database test;

2. CREATE TABLE `users` (   `id` bigint(7) NOT NULL,   `name` varchar(10) NOT NULL,   `age` int(7) NOT NULL,   PRIMARY KEY (`id`) ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

3. insert  into `users`(`id`,`name`,`age`) values (1,'test-1',17),(2,'test-2',25);