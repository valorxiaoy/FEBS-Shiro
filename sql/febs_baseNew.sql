/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.22-log : Database - febs_base
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`febs_base` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `febs_base`;

/*Table structure for table `t_data_permission_test` */

DROP TABLE IF EXISTS `t_data_permission_test`;

CREATE TABLE `t_data_permission_test` (
  `FIELD1` varchar(20) NOT NULL,
  `FIELD2` varchar(20) NOT NULL,
  `FIELD3` varchar(20) NOT NULL,
  `FIELD4` varchar(20) NOT NULL,
  `DEPT_ID` int(11) NOT NULL,
  `CREATE_TIME` datetime NOT NULL,
  `ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户权限测试';

/*Data for the table `t_data_permission_test` */

insert  into `t_data_permission_test`(`FIELD1`,`FIELD2`,`FIELD3`,`FIELD4`,`DEPT_ID`,`CREATE_TIME`,`ID`) values ('小米','小米10Pro','4999','珍珠白',1,'2020-04-14 15:00:38',1),('腾讯','黑鲨游戏手机3','3799','铠甲灰',2,'2020-04-14 15:01:36',2),('华为','华为P30','3299','天空之境',1,'2020-04-14 15:03:11',3),('华为','华为P40Pro','6488','亮黑色',3,'2020-04-14 15:04:31',4),('vivo','Vivo iQOO 3','3998','拉力橙',4,'2020-04-14 15:05:55',5),('一加','一加7T','3199','冰际蓝',5,'2020-04-14 15:06:53',6),('三星','三星Galaxy S10','4098','浩玉白',6,'2020-04-14 15:08:25',7),('苹果','iPhone 11 pro max','9198','暗夜绿',4,'2020-04-14 15:09:20',8);

/*Table structure for table `t_dept` */

DROP TABLE IF EXISTS `t_dept`;

CREATE TABLE `t_dept` (
  `DEPT_ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '部门ID',
  `PARENT_ID` bigint(20) NOT NULL COMMENT '上级部门ID',
  `DEPT_NAME` varchar(100) NOT NULL COMMENT '部门名称',
  `ORDER_NUM` bigint(20) DEFAULT NULL COMMENT '排序',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`DEPT_ID`) USING BTREE,
  KEY `t_dept_parent_id` (`PARENT_ID`),
  KEY `t_dept_dept_name` (`DEPT_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='部门表';

/*Data for the table `t_dept` */

insert  into `t_dept`(`DEPT_ID`,`PARENT_ID`,`DEPT_NAME`,`ORDER_NUM`,`CREATE_TIME`,`MODIFY_TIME`) values (1,0,'开发部',1,'2019-06-14 20:56:41',NULL),(2,1,'开发一部',1,'2019-06-14 20:58:46',NULL),(3,1,'开发二部',2,'2019-06-14 20:58:56',NULL),(4,0,'采购部',2,'2019-06-14 20:59:56',NULL),(5,0,'财务部',3,'2019-06-14 21:00:08',NULL),(6,0,'销售部',4,'2019-06-14 21:00:15',NULL),(7,0,'工程部',5,'2019-06-14 21:00:42',NULL),(8,0,'行政部',6,'2019-06-14 21:00:49',NULL),(9,0,'人力资源部',8,'2019-06-14 21:01:14','2019-06-14 21:01:34'),(10,0,'系统部',7,'2019-06-14 21:01:31',NULL);

/*Table structure for table `t_dictionaries` */

DROP TABLE IF EXISTS `t_dictionaries`;

CREATE TABLE `t_dictionaries` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `superior_id` varchar(50) DEFAULT NULL,
  `superior_type` varchar(50) DEFAULT NULL,
  `data_name` varchar(50) DEFAULT NULL,
  `data_value` varchar(50) DEFAULT NULL,
  `sort` int(20) DEFAULT NULL,
  `start_using` int(3) DEFAULT NULL,
  `fixation` int(3) DEFAULT NULL,
  `data_description` varchar(200) DEFAULT NULL,
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_uid` int(20) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='字典信息';

/*Data for the table `t_dictionaries` */

/*Table structure for table `t_eximport` */

DROP TABLE IF EXISTS `t_eximport`;

CREATE TABLE `t_eximport` (
  `FIELD1` varchar(20) NOT NULL COMMENT '字段1',
  `FIELD2` int(11) NOT NULL COMMENT '字段2',
  `FIELD3` varchar(100) NOT NULL COMMENT '字段3',
  `CREATE_TIME` datetime NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='Excel导入导出测试';

/*Data for the table `t_eximport` */

insert  into `t_eximport`(`FIELD1`,`FIELD2`,`FIELD3`,`CREATE_TIME`) values ('字段1',1,'mrbird0@gmail.com','2019-06-13 03:14:06'),('字段1',2,'mrbird1@gmail.com','2019-06-13 03:14:06'),('字段1',3,'mrbird2@gmail.com','2019-06-13 03:14:06'),('字段1',4,'mrbird3@gmail.com','2019-06-13 03:14:06'),('字段1',5,'mrbird4@gmail.com','2019-06-13 03:14:06'),('字段1',6,'mrbird5@gmail.com','2019-06-13 03:14:06'),('字段1',7,'mrbird6@gmail.com','2019-06-13 03:14:06'),('字段1',8,'mrbird7@gmail.com','2019-06-13 03:14:06'),('字段1',9,'mrbird8@gmail.com','2019-06-13 03:14:06'),('字段1',10,'mrbird9@gmail.com','2019-06-13 03:14:06'),('字段1',11,'mrbird10@gmail.com','2019-06-13 03:14:06'),('字段1',12,'mrbird11@gmail.com','2019-06-13 03:14:06'),('字段1',13,'mrbird12@gmail.com','2019-06-13 03:14:06'),('字段1',14,'mrbird13@gmail.com','2019-06-13 03:14:06'),('字段1',15,'mrbird14@gmail.com','2019-06-13 03:14:06'),('字段1',16,'mrbird15@gmail.com','2019-06-13 03:14:06'),('字段1',17,'mrbird16@gmail.com','2019-06-13 03:14:06'),('字段1',18,'mrbird17@gmail.com','2019-06-13 03:14:06'),('字段1',19,'mrbird18@gmail.com','2019-06-13 03:14:06'),('字段1',20,'mrbird19@gmail.com','2019-06-13 03:14:06');

/*Table structure for table `t_generator_config` */

DROP TABLE IF EXISTS `t_generator_config`;

CREATE TABLE `t_generator_config` (
  `id` int(11) NOT NULL COMMENT '主键',
  `author` varchar(20) NOT NULL COMMENT '作者',
  `base_package` varchar(50) NOT NULL COMMENT '基础包名',
  `entity_package` varchar(20) NOT NULL COMMENT 'entity文件存放路径',
  `mapper_package` varchar(20) NOT NULL COMMENT 'mapper文件存放路径',
  `mapper_xml_package` varchar(20) NOT NULL COMMENT 'mapper xml文件存放路径',
  `service_package` varchar(20) NOT NULL COMMENT 'servcie文件存放路径',
  `service_impl_package` varchar(20) NOT NULL COMMENT 'serviceImpl文件存放路径',
  `controller_package` varchar(20) NOT NULL COMMENT 'controller文件存放路径',
  `is_trim` char(1) NOT NULL COMMENT '是否去除前缀 1是 0否',
  `trim_value` varchar(10) DEFAULT NULL COMMENT '前缀内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='代码生成配置表';

/*Data for the table `t_generator_config` */

insert  into `t_generator_config`(`id`,`author`,`base_package`,`entity_package`,`mapper_package`,`mapper_xml_package`,`service_package`,`service_impl_package`,`controller_package`,`is_trim`,`trim_value`) values (1,'MrBird','cc.mrbird.febs.gen','entity','mapper','mapper','service','service.impl','controller','1','t_');

/*Table structure for table `t_guardian` */

DROP TABLE IF EXISTS `t_guardian`;

CREATE TABLE `t_guardian` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `region` varchar(100) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `gender` int(1) DEFAULT NULL COMMENT '性别 0女，1男',
  `phone` int(20) DEFAULT NULL,
  `site` varchar(100) DEFAULT NULL,
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_uid` int(20) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remark` varchar(100) DEFAULT NULL,
  `face_recognition` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='监护人信息';

/*Data for the table `t_guardian` */

insert  into `t_guardian`(`id`,`region`,`name`,`gender`,`phone`,`site`,`create_uid`,`create_time`,`update_uid`,`update_time`,`remark`,`face_recognition`) values (1,'是是是','小胡',0,0,'string',0,'2020-08-07 23:05:59',0,'2020-08-07 23:05:59','无','string'),(2,'string','string',0,12233,'西安',0,'2020-08-07 23:31:21',0,'2020-08-07 23:06:15','无','string');

/*Table structure for table `t_guardian_login` */

DROP TABLE IF EXISTS `t_guardian_login`;

CREATE TABLE `t_guardian_login` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `login_user` varchar(100) DEFAULT NULL,
  `login_pwd` varchar(100) DEFAULT NULL,
  `way` varchar(20) DEFAULT NULL,
  `staff_message_id` int(20) DEFAULT NULL,
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_uid` int(20) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='监护人登录账户信息';

/*Data for the table `t_guardian_login` */

/*Table structure for table `t_guardian_login_log` */

DROP TABLE IF EXISTS `t_guardian_login_log`;

CREATE TABLE `t_guardian_login_log` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(20) DEFAULT NULL,
  `login_ip` varchar(100) DEFAULT NULL,
  `login_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_uid` int(20) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='监护人登录日志信息';

/*Data for the table `t_guardian_login_log` */

/*Table structure for table `t_guardianh_patient` */

DROP TABLE IF EXISTS `t_guardianh_patient`;

CREATE TABLE `t_guardianh_patient` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `patient_id` int(20) DEFAULT NULL,
  `guardian_id` int(20) DEFAULT NULL,
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_uid` int(20) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='患者与监护人关系';

/*Data for the table `t_guardianh_patient` */

/*Table structure for table `t_job` */

DROP TABLE IF EXISTS `t_job`;

CREATE TABLE `t_job` (
  `JOB_ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '任务id',
  `BEAN_NAME` varchar(50) NOT NULL COMMENT 'spring bean名称',
  `METHOD_NAME` varchar(50) NOT NULL COMMENT '方法名',
  `PARAMS` varchar(50) DEFAULT NULL COMMENT '参数',
  `CRON_EXPRESSION` varchar(20) NOT NULL COMMENT 'cron表达式',
  `STATUS` char(2) NOT NULL COMMENT '任务状态  0：正常  1：暂停',
  `REMARK` varchar(50) DEFAULT NULL COMMENT '备注',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`JOB_ID`) USING BTREE,
  KEY `t_job_create_time` (`CREATE_TIME`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='定时任务表';

/*Data for the table `t_job` */

insert  into `t_job`(`JOB_ID`,`BEAN_NAME`,`METHOD_NAME`,`PARAMS`,`CRON_EXPRESSION`,`STATUS`,`REMARK`,`CREATE_TIME`) values (1,'testTask','test','mrbird','0/1 * * * * ?','1','有参任务调度测试~~','2018-02-24 16:26:14'),(2,'testTask','test1',NULL,'0/10 * * * * ?','1','无参任务调度测试','2018-02-24 17:06:23'),(3,'testTask','test','hello world','0/1 * * * * ?','1','有参任务调度测试,每隔一秒触发','2018-02-26 09:28:26'),(11,'testTask','test2',NULL,'0/5 * * * * ?','1','测试异常','2018-02-26 11:15:30');

/*Table structure for table `t_job_log` */

DROP TABLE IF EXISTS `t_job_log`;

CREATE TABLE `t_job_log` (
  `LOG_ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '任务日志id',
  `JOB_ID` bigint(20) NOT NULL COMMENT '任务id',
  `BEAN_NAME` varchar(100) NOT NULL COMMENT 'spring bean名称',
  `METHOD_NAME` varchar(100) NOT NULL COMMENT '方法名',
  `PARAMS` varchar(200) DEFAULT NULL COMMENT '参数',
  `STATUS` char(2) NOT NULL COMMENT '任务状态    0：成功    1：失败',
  `ERROR` text COMMENT '失败信息',
  `TIMES` decimal(11,0) DEFAULT NULL COMMENT '耗时(单位：毫秒)',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`LOG_ID`) USING BTREE,
  KEY `t_job_log_create_time` (`CREATE_TIME`)
) ENGINE=MyISAM AUTO_INCREMENT=2562 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='调度日志表';

/*Data for the table `t_job_log` */

/*Table structure for table `t_log` */

DROP TABLE IF EXISTS `t_log`;

CREATE TABLE `t_log` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '日志ID',
  `USERNAME` varchar(50) DEFAULT NULL COMMENT '操作用户',
  `OPERATION` text COMMENT '操作内容',
  `TIME` decimal(11,0) DEFAULT NULL COMMENT '耗时',
  `METHOD` text COMMENT '操作方法',
  `PARAMS` text COMMENT '方法参数',
  `IP` varchar(64) DEFAULT NULL COMMENT '操作者IP',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `location` varchar(50) DEFAULT NULL COMMENT '操作地点',
  PRIMARY KEY (`ID`) USING BTREE,
  KEY `t_log_create_time` (`CREATE_TIME`)
) ENGINE=MyISAM AUTO_INCREMENT=1011 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='操作日志表';

/*Data for the table `t_log` */

/*Table structure for table `t_login_log` */

DROP TABLE IF EXISTS `t_login_log`;

CREATE TABLE `t_login_log` (
  `ID` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `USERNAME` varchar(50) NOT NULL COMMENT '用户名',
  `LOGIN_TIME` datetime NOT NULL COMMENT '登录时间',
  `LOCATION` varchar(50) DEFAULT NULL COMMENT '登录地点',
  `IP` varchar(50) DEFAULT NULL COMMENT 'IP地址',
  `SYSTEM` varchar(50) DEFAULT NULL COMMENT '操作系统',
  `BROWSER` varchar(50) DEFAULT NULL COMMENT '浏览器',
  PRIMARY KEY (`ID`) USING BTREE,
  KEY `t_login_log_login_time` (`LOGIN_TIME`)
) ENGINE=MyISAM AUTO_INCREMENT=83 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='登录日志表';

/*Data for the table `t_login_log` */

insert  into `t_login_log`(`ID`,`USERNAME`,`LOGIN_TIME`,`LOCATION`,`IP`,`SYSTEM`,`BROWSER`) values (70,'kks','2020-08-05 14:45:10','内网IP|0|0|内网IP|内网IP','192.168.216.1','Windows 10','Chrome 84'),(71,'kks','2020-08-05 16:05:12','内网IP|0|0|内网IP|内网IP','192.168.216.1','Windows 10','Chrome 84'),(72,'kks','2020-08-05 16:38:15','内网IP|0|0|内网IP|内网IP','192.168.216.1','Windows 10','Chrome 84'),(73,'kks','2020-08-06 10:21:46','内网IP|0|0|内网IP|内网IP','192.168.216.1','Windows 10','Chrome 84'),(74,'kks','2020-08-06 14:22:39','内网IP|0|0|内网IP|内网IP','192.168.216.1','Windows 10','Chrome 84'),(75,'kks','2020-08-06 16:00:24','内网IP|0|0|内网IP|内网IP','192.168.216.1','Windows 10','Chrome 84'),(76,'fry','2020-08-06 16:53:20','内网IP|0|0|内网IP|内网IP','192.168.31.55','Windows 10','Chrome 83'),(77,'kks','2020-08-06 17:31:05','内网IP|0|0|内网IP|内网IP','192.168.216.1','Windows 10','Chrome 84'),(78,'kks','2020-08-07 09:19:49','内网IP|0|0|内网IP|内网IP','192.168.216.1','Windows 10','Chrome 84'),(79,'kks','2020-08-07 13:04:06','内网IP|0|0|内网IP|内网IP','192.168.216.1','Windows 10','Chrome 84'),(80,'kks','2020-08-07 15:01:49','内网IP|0|0|内网IP|内网IP','192.168.216.1','Windows 10','Chrome 84'),(81,'kks','2020-08-07 23:01:00','内网IP|0|0|内网IP|内网IP','172.20.10.3','Windows 10','Chrome 84'),(82,'kks','2020-08-08 01:19:51','内网IP|0|0|内网IP|内网IP','172.20.10.3','Windows 10','Chrome 84');

/*Table structure for table `t_menu` */

DROP TABLE IF EXISTS `t_menu`;

CREATE TABLE `t_menu` (
  `MENU_ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单/按钮ID',
  `PARENT_ID` bigint(20) NOT NULL COMMENT '上级菜单ID',
  `MENU_NAME` varchar(50) NOT NULL COMMENT '菜单/按钮名称',
  `URL` varchar(50) DEFAULT NULL COMMENT '菜单URL',
  `PERMS` text COMMENT '权限标识',
  `ICON` varchar(50) DEFAULT NULL COMMENT '图标',
  `TYPE` char(2) NOT NULL COMMENT '类型 0菜单 1按钮',
  `ORDER_NUM` bigint(20) DEFAULT NULL COMMENT '排序',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`MENU_ID`) USING BTREE,
  KEY `t_menu_parent_id` (`PARENT_ID`),
  KEY `t_menu_menu_id` (`MENU_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=179 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='菜单表';

/*Data for the table `t_menu` */

insert  into `t_menu`(`MENU_ID`,`PARENT_ID`,`MENU_NAME`,`URL`,`PERMS`,`ICON`,`TYPE`,`ORDER_NUM`,`CREATE_TIME`,`MODIFY_TIME`) values (1,0,'系统管理',NULL,NULL,'layui-icon-setting','0',1,'2017-12-27 16:39:07',NULL),(2,0,'系统监控','','','layui-icon-alert','0',2,'2017-12-27 16:45:51','2019-06-13 11:20:40'),(3,1,'用户管理','/system/user','user:view','','0',1,'2017-12-27 16:47:13','2019-12-04 16:46:50'),(4,1,'角色管理','/system/role','role:view','','0',2,'2017-12-27 16:48:09','2019-06-13 08:57:19'),(5,1,'菜单管理','/system/menu','menu:view','','0',3,'2017-12-27 16:48:57','2019-06-13 08:57:34'),(6,1,'部门管理','/system/dept','dept:view','','0',4,'2017-12-27 16:57:33','2019-06-14 19:56:00'),(8,2,'在线用户','/monitor/online','online:view','','0',1,'2017-12-27 16:59:33','2019-06-13 14:30:31'),(10,2,'系统日志','/monitor/log','log:view','','0',2,'2017-12-27 17:00:50','2019-06-13 14:30:37'),(11,3,'新增用户',NULL,'user:add',NULL,'1',NULL,'2017-12-27 17:02:58',NULL),(12,3,'修改用户',NULL,'user:update',NULL,'1',NULL,'2017-12-27 17:04:07',NULL),(13,3,'删除用户',NULL,'user:delete',NULL,'1',NULL,'2017-12-27 17:04:58',NULL),(14,4,'新增角色',NULL,'role:add',NULL,'1',NULL,'2017-12-27 17:06:38',NULL),(15,4,'修改角色',NULL,'role:update',NULL,'1',NULL,'2017-12-27 17:06:38',NULL),(16,4,'删除角色',NULL,'role:delete',NULL,'1',NULL,'2017-12-27 17:06:38',NULL),(17,5,'新增菜单',NULL,'menu:add',NULL,'1',NULL,'2017-12-27 17:08:02',NULL),(18,5,'修改菜单',NULL,'menu:update',NULL,'1',NULL,'2017-12-27 17:08:02',NULL),(19,5,'删除菜单',NULL,'menu:delete',NULL,'1',NULL,'2017-12-27 17:08:02',NULL),(20,6,'新增部门',NULL,'dept:add',NULL,'1',NULL,'2017-12-27 17:09:24',NULL),(21,6,'修改部门',NULL,'dept:update',NULL,'1',NULL,'2017-12-27 17:09:24',NULL),(22,6,'删除部门',NULL,'dept:delete',NULL,'1',NULL,'2017-12-27 17:09:24',NULL),(23,8,'踢出用户',NULL,'user:kickout',NULL,'1',NULL,'2017-12-27 17:11:13',NULL),(24,10,'删除日志',NULL,'log:delete',NULL,'1',NULL,'2017-12-27 17:11:45','2019-06-06 05:56:40'),(101,0,'任务调度',NULL,NULL,'layui-icon-time-circle','0',3,'2018-02-24 15:52:57',NULL),(102,101,'定时任务','/job/job','job:view','','0',1,'2018-02-24 15:53:53','2018-04-25 09:05:12'),(103,102,'新增任务',NULL,'job:add',NULL,'1',NULL,'2018-02-24 15:55:10',NULL),(104,102,'修改任务',NULL,'job:update',NULL,'1',NULL,'2018-02-24 15:55:53',NULL),(105,102,'删除任务',NULL,'job:delete',NULL,'1',NULL,'2018-02-24 15:56:18',NULL),(106,102,'暂停任务',NULL,'job:pause',NULL,'1',NULL,'2018-02-24 15:57:08',NULL),(107,102,'恢复任务',NULL,'job:resume',NULL,'1',NULL,'2018-02-24 15:58:21',NULL),(108,102,'立即执行任务',NULL,'job:run',NULL,'1',NULL,'2018-02-24 15:59:45',NULL),(109,101,'调度日志','/job/log','job:log:view','','0',2,'2018-02-24 16:00:45','2019-06-09 02:48:19'),(110,109,'删除日志',NULL,'job:log:delete',NULL,'1',NULL,'2018-02-24 16:01:21',NULL),(115,0,'其他模块',NULL,NULL,'layui-icon-gift','0',5,'2019-05-27 10:18:07',NULL),(116,115,'Apex图表','','',NULL,'0',2,'2019-05-27 10:21:35',NULL),(117,116,'线性图表','/others/apex/line','apex:line:view',NULL,'0',1,'2019-05-27 10:24:49',NULL),(118,115,'高德地图','/others/map','map:view','','0',3,'2019-05-27 17:13:12','2019-06-12 15:33:00'),(119,116,'面积图表','/others/apex/area','apex:area:view',NULL,'0',2,'2019-05-27 18:49:22',NULL),(120,116,'柱形图表','/others/apex/column','apex:column:view',NULL,'0',3,'2019-05-27 18:51:33',NULL),(121,116,'雷达图表','/others/apex/radar','apex:radar:view',NULL,'0',4,'2019-05-27 18:56:05',NULL),(122,116,'条形图表','/others/apex/bar','apex:bar:view',NULL,'0',5,'2019-05-27 18:57:02',NULL),(123,116,'混合图表','/others/apex/mix','apex:mix:view','','0',6,'2019-05-27 18:58:04','2019-06-06 02:55:23'),(125,115,'导入导出','/others/eximport','others:eximport:view','','0',4,'2019-05-27 19:01:57','2019-06-13 01:20:14'),(126,132,'系统图标','/others/febs/icon','febs:icons:view','','0',4,'2019-05-27 19:03:18','2019-06-06 03:05:26'),(127,2,'请求追踪','/monitor/httptrace','httptrace:view','','0',6,'2019-05-27 19:06:38','2019-06-13 14:36:43'),(128,2,'系统信息',NULL,NULL,NULL,'0',7,'2019-05-27 19:08:23',NULL),(129,128,'JVM信息','/monitor/jvm','jvm:view','','0',1,'2019-05-27 19:08:50','2019-06-13 14:36:51'),(131,128,'服务器信息','/monitor/server','server:view','','0',3,'2019-05-27 19:10:07','2019-06-13 14:37:04'),(132,115,'FEBS组件','','',NULL,'0',1,'2019-05-27 19:13:54',NULL),(133,132,'表单组件','/others/febs/form','febs:form:view',NULL,'0',1,'2019-05-27 19:14:45',NULL),(134,132,'FEBS工具','/others/febs/tools','febs:tools:view','','0',3,'2019-05-29 10:11:22','2019-06-12 13:21:27'),(135,132,'表单组合','/others/febs/form/group','febs:formgroup:view',NULL,'0',2,'2019-05-29 10:16:19',NULL),(136,2,'登录日志','/monitor/loginlog','loginlog:view','','0',3,'2019-05-29 15:56:15','2019-06-13 14:35:56'),(137,0,'代码生成','',NULL,'layui-icon-verticalright','0',4,'2019-06-03 15:35:58',NULL),(138,137,'生成配置','/generator/configure','generator:configure:view',NULL,'0',1,'2019-06-03 15:38:36',NULL),(139,137,'代码生成','/generator/generator','generator:view','','0',2,'2019-06-03 15:39:15','2019-06-13 14:31:38'),(159,132,'其他组件','/others/febs/others','others:febs:others','','0',5,'2019-06-12 07:51:08','2019-06-12 07:51:40'),(160,3,'密码重置',NULL,'user:password:reset',NULL,'1',NULL,'2019-06-13 08:40:13',NULL),(161,3,'导出Excel',NULL,'user:export',NULL,'1',NULL,'2019-06-13 08:40:34',NULL),(162,4,'导出Excel',NULL,'role:export',NULL,'1',NULL,'2019-06-13 14:29:00','2019-06-13 14:29:11'),(163,5,'导出Excel',NULL,'menu:export',NULL,'1',NULL,'2019-06-13 14:29:32',NULL),(164,6,'导出Excel',NULL,'dept:export',NULL,'1',NULL,'2019-06-13 14:29:59',NULL),(165,138,'修改配置',NULL,'generator:configure:update',NULL,'1',NULL,'2019-06-13 14:32:09','2019-06-13 14:32:20'),(166,139,'生成代码',NULL,'generator:generate',NULL,'1',NULL,'2019-06-13 14:32:51',NULL),(167,125,'模板下载',NULL,'eximport:template',NULL,'1',NULL,'2019-06-13 14:33:37',NULL),(168,125,'导出Excel',NULL,'eximport:export',NULL,'1',NULL,'2019-06-13 14:33:57',NULL),(169,125,'导入Excel',NULL,'eximport:import',NULL,'1',NULL,'2019-06-13 14:34:19',NULL),(170,10,'导出Excel',NULL,'log:export',NULL,'1',NULL,'2019-06-13 14:34:55',NULL),(171,136,'删除日志',NULL,'loginlog:delete',NULL,'1',NULL,'2019-06-13 14:35:27','2019-06-13 14:36:08'),(172,136,'导出Excel',NULL,'loginlog:export',NULL,'1',NULL,'2019-06-13 14:36:26',NULL),(173,102,'导出Excel',NULL,'job:export',NULL,'1',NULL,'2019-06-13 14:37:25',NULL),(174,109,'导出Excel',NULL,'job:log:export',NULL,'1',NULL,'2019-06-13 14:37:46','2019-06-13 14:38:02'),(175,2,'Swagger文档','/monitor/swagger','swagger:view','','0',8,'2019-08-18 17:25:36','2019-08-18 17:25:59'),(178,115,'数据权限','/others/datapermission','others:datapermission','','0',5,'2020-04-29 09:34:25',NULL);

/*Table structure for table `t_organization` */

DROP TABLE IF EXISTS `t_organization`;

CREATE TABLE `t_organization` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `region` varchar(100) DEFAULT NULL,
  `organization` varchar(100) DEFAULT NULL,
  `abbreviation` varchar(100) DEFAULT NULL,
  `synopsis` varchar(100) DEFAULT NULL,
  `site` varchar(100) DEFAULT NULL,
  `website` varchar(100) DEFAULT NULL,
  `phone` int(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `certification_status` int(5) DEFAULT NULL,
  `business_license` varchar(100) DEFAULT NULL,
  `status` int(5) DEFAULT NULL,
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_uid` int(20) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构信息表';

/*Data for the table `t_organization` */

/*Table structure for table `t_organization_role` */

DROP TABLE IF EXISTS `t_organization_role`;

CREATE TABLE `t_organization_role` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `organization_id` varchar(100) DEFAULT NULL,
  `role_id` varchar(100) DEFAULT NULL,
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_uid` int(20) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构与角色关系';

/*Data for the table `t_organization_role` */

/*Table structure for table `t_patient` */

DROP TABLE IF EXISTS `t_patient`;

CREATE TABLE `t_patient` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `region` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `classify` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `name` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `gender` int(1) DEFAULT NULL,
  `age` int(4) DEFAULT NULL,
  `phone` int(20) DEFAULT NULL,
  `site` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `diagnosis` varchar(200) CHARACTER SET latin1 DEFAULT NULL,
  `affiliated_hospital` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_uid` int(20) DEFAULT NULL,
  `remark` varchar(100) CHARACTER SET latin1 DEFAULT NULL,
  `area_code` varchar(50) CHARACTER SET latin1 DEFAULT NULL COMMENT '地区编码',
  `face_reco` varchar(100) CHARACTER SET latin1 DEFAULT NULL COMMENT '人脸识别',
  `entrust_the_way` varchar(100) CHARACTER SET latin1 DEFAULT NULL COMMENT '委托方式',
  `guardian_id` int(20) DEFAULT NULL COMMENT '监护人id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='锟斤拷锟斤拷锟斤拷息';

/*Data for the table `t_patient` */

insert  into `t_patient`(`id`,`region`,`classify`,`name`,`gender`,`age`,`phone`,`site`,`diagnosis`,`affiliated_hospital`,`create_uid`,`create_time`,`update_time`,`update_uid`,`remark`,`area_code`,`face_reco`,`entrust_the_way`,`guardian_id`) values (1,'string','string','sds',0,56,122321,'string','string','string',0,'2020-08-07 15:21:11','2020-08-07 15:21:11',0,'string','string','string','string',0);

/*Table structure for table `t_patient_login` */

DROP TABLE IF EXISTS `t_patient_login`;

CREATE TABLE `t_patient_login` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `login_user` varchar(100) DEFAULT NULL,
  `login_pwd` varchar(100) DEFAULT NULL,
  `way` varchar(20) DEFAULT NULL,
  `staff_message_id` int(20) DEFAULT NULL,
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_uid` int(20) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='患者登录账户信息';

/*Data for the table `t_patient_login` */

/*Table structure for table `t_patient_login_log` */

DROP TABLE IF EXISTS `t_patient_login_log`;

CREATE TABLE `t_patient_login_log` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) DEFAULT NULL,
  `login_ip` varchar(100) DEFAULT NULL,
  `login_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_uid` int(20) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='患者登录日志信息';

/*Data for the table `t_patient_login_log` */

/*Table structure for table `t_role` */

DROP TABLE IF EXISTS `t_role`;

CREATE TABLE `t_role` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) DEFAULT NULL COMMENT '职位',
  `status` int(1) DEFAULT '0' COMMENT '账号状态',
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_uid` int(20) DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `remark` varchar(100) DEFAULT NULL,
  `role_id` int(20) NOT NULL COMMENT '角色id',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `gender` int(1) DEFAULT NULL COMMENT '性别 0:女 1：男',
  `phone` int(20) DEFAULT NULL,
  `site` varchar(100) DEFAULT NULL COMMENT '地址',
  `qualification` varchar(100) DEFAULT NULL COMMENT '资格',
  `username` varchar(100) DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='角色信息';

/*Data for the table `t_role` */

insert  into `t_role`(`id`,`role_name`,`status`,`create_uid`,`create_time`,`update_uid`,`update_time`,`remark`,`role_id`,`name`,`gender`,`phone`,`site`,`qualification`,`username`) values (1,'string',1,0,'2020-08-06 14:29:57',0,NULL,'string',22,'xiaom',0,0,'string','string','sss'),(2,'xiaod',0,0,'2020-08-06 16:01:20',0,'2020-08-06 16:01:20','string',12,'string',0,0,'string','string','string'),(4,'',0,0,'2020-08-06 16:58:15',0,'2020-08-06 16:58:15','string',55,'string',0,0,'string','','string'),(5,'string',0,0,'2020-08-07 21:39:14',0,'2020-08-07 21:39:14','string',63,'小米',0,0,'string','string','string');

/*Table structure for table `t_role_menu` */

DROP TABLE IF EXISTS `t_role_menu`;

CREATE TABLE `t_role_menu` (
  `ROLE_ID` bigint(20) NOT NULL COMMENT '角色ID',
  `MENU_ID` bigint(20) NOT NULL COMMENT '菜单/按钮ID',
  KEY `t_role_menu_menu_id` (`MENU_ID`),
  KEY `t_role_menu_role_id` (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='角色菜单关联表';

/*Data for the table `t_role_menu` */

insert  into `t_role_menu`(`ROLE_ID`,`MENU_ID`) values (77,2),(78,2),(78,8),(78,23),(78,10),(78,24),(78,170),(78,136),(78,171),(78,172),(78,127),(78,128),(78,129),(78,131),(79,101),(79,102),(79,103),(79,104),(79,105),(79,106),(79,107),(79,108),(79,173),(79,109),(79,110),(79,174),(80,137),(80,138),(80,165),(80,139),(80,166),(1,1),(1,3),(1,11),(1,12),(1,13),(1,160),(1,161),(1,4),(1,14),(1,15),(1,16),(1,162),(1,5),(1,17),(1,18),(1,19),(1,163),(1,6),(1,20),(1,21),(1,22),(1,164),(1,2),(1,8),(1,23),(1,10),(1,24),(1,170),(1,136),(1,171),(1,172),(1,127),(1,128),(1,129),(1,131),(1,175),(1,101),(1,102),(1,103),(1,104),(1,105),(1,106),(1,107),(1,108),(1,173),(1,109),(1,110),(1,174),(1,137),(1,138),(1,165),(1,139),(1,166),(1,115),(1,132),(1,133),(1,135),(1,134),(1,126),(1,159),(1,116),(1,117),(1,119),(1,120),(1,121),(1,122),(1,123),(1,118),(1,125),(1,167),(1,168),(1,169),(1,178),(2,1),(2,3),(2,161),(2,4),(2,14),(2,162),(2,5),(2,17),(2,163),(2,6),(2,20),(2,164),(2,2),(2,8),(2,10),(2,170),(2,136),(2,172),(2,127),(2,128),(2,129),(2,131),(2,175),(2,101),(2,102),(2,173),(2,109),(2,174),(2,137),(2,138),(2,139),(2,115),(2,132),(2,133),(2,135),(2,134),(2,126),(2,159),(2,116),(2,117),(2,119),(2,120),(2,121),(2,122),(2,123),(2,118),(2,125),(2,167),(2,168),(2,169),(2,178);

/*Table structure for table `t_staff_audit` */

DROP TABLE IF EXISTS `t_staff_audit`;

CREATE TABLE `t_staff_audit` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `staff_if` int(20) DEFAULT NULL,
  `certification_status` int(20) DEFAULT NULL,
  `auditor` int(20) DEFAULT NULL,
  `audit_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_uid` int(20) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remark` varchar(200) DEFAULT NULL,
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_staff_audit` */

/*Table structure for table `t_staff_certification` */

DROP TABLE IF EXISTS `t_staff_certification`;

CREATE TABLE `t_staff_certification` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `staff_id` int(20) DEFAULT NULL,
  `Certification_status` int(20) DEFAULT NULL,
  `auditor` int(20) DEFAULT NULL,
  `audit_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_uid` int(20) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remark` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='存储职工认证信息';

/*Data for the table `t_staff_certification` */

/*Table structure for table `t_staff_login_log` */

DROP TABLE IF EXISTS `t_staff_login_log`;

CREATE TABLE `t_staff_login_log` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(20) DEFAULT NULL,
  `login_ip` varchar(200) DEFAULT NULL,
  `login_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_uid` int(20) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remark` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='职工登录日志信息';

/*Data for the table `t_staff_login_log` */

/*Table structure for table `t_staff_login_user` */

DROP TABLE IF EXISTS `t_staff_login_user`;

CREATE TABLE `t_staff_login_user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(200) DEFAULT NULL,
  `pwd` varchar(200) DEFAULT NULL,
  `way` varchar(100) DEFAULT NULL,
  `staff_message_id` int(20) DEFAULT NULL,
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `update_uid` int(20) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remark` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='职工登录账户信息';

/*Data for the table `t_staff_login_user` */

/*Table structure for table `t_staff_organization_table` */

DROP TABLE IF EXISTS `t_staff_organization_table`;

CREATE TABLE `t_staff_organization_table` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `organization_id` varchar(100) DEFAULT NULL,
  `staff_id` int(20) DEFAULT NULL,
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_uid` int(20) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='职工与机构关系';

/*Data for the table `t_staff_organization_table` */

/*Table structure for table `t_staff_sign_table` */

DROP TABLE IF EXISTS `t_staff_sign_table`;

CREATE TABLE `t_staff_sign_table` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `sign_desk` varchar(200) DEFAULT NULL,
  `sign_person` int(20) DEFAULT NULL,
  `create_uid` int(20) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_uid` int(20) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remark` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='职工签到';

/*Data for the table `t_staff_sign_table` */

/*Table structure for table `t_staff_table` */

DROP TABLE IF EXISTS `t_staff_table`;

CREATE TABLE `t_staff_table` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `region` varchar(100) DEFAULT NULL COMMENT '地区',
  `staff_name` varchar(100) DEFAULT NULL COMMENT '职工姓名',
  `gender` int(1) DEFAULT NULL COMMENT '性别 0女，1男',
  `qualification` varchar(100) DEFAULT NULL COMMENT '资格',
  `post` varchar(100) DEFAULT NULL COMMENT '职位',
  `phone` int(20) DEFAULT NULL COMMENT '电话',
  `site` varchar(100) DEFAULT NULL COMMENT '地址',
  `certification_status` int(20) DEFAULT NULL COMMENT '认证状态',
  `subsidiary_organ` varchar(200) DEFAULT NULL COMMENT '所属机构',
  `identity_card_front` varchar(200) DEFAULT NULL COMMENT '身份证正面',
  `identity_card_contrary` varchar(200) DEFAULT NULL COMMENT '身份证反面',
  `job_status_front` varchar(200) DEFAULT NULL COMMENT '从业资格证正面',
  `job_status_contrary` varchar(200) DEFAULT NULL COMMENT '从业资格证反面',
  `create_uid` int(20) DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_uid` int(20) DEFAULT NULL COMMENT '更新人',
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `birthday` timestamp NULL DEFAULT NULL COMMENT '生日',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='职工信息';

/*Data for the table `t_staff_table` */

insert  into `t_staff_table`(`id`,`region`,`staff_name`,`gender`,`qualification`,`post`,`phone`,`site`,`certification_status`,`subsidiary_organ`,`identity_card_front`,`identity_card_contrary`,`job_status_front`,`job_status_contrary`,`create_uid`,`create_time`,`update_uid`,`update_time`,`remark`,`age`,`birthday`) values (1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'22',NULL,NULL,NULL,NULL,'2020-08-07 10:27:39',NULL,'2020-08-07 10:27:42',NULL,NULL,NULL),(2,'string','string',0,'string','string',0,'string',0,'string','222','string','string','string',0,'2020-08-08 02:03:42',0,'2020-08-08 02:03:42','string',0,'2020-08-08 00:00:00'),(3,'string','string',0,'string','string',0,'string',0,'string','2122','string','string','string',0,'2020-08-08 02:04:30',0,'2020-08-08 02:04:30','string',0,'2020-08-07 00:00:00'),(4,'string','string',0,'string','string',0,'string',0,'string','21322','string','string','string',0,'2020-08-08 02:05:09',0,'2020-08-08 02:05:09','string',2,'2018-08-07 00:00:00');

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `USER_ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `USERNAME` varchar(50) NOT NULL COMMENT '用户名',
  `PASSWORD` varchar(128) NOT NULL COMMENT '密码',
  `DEPT_ID` bigint(20) DEFAULT NULL COMMENT '部门ID',
  `EMAIL` varchar(128) DEFAULT NULL COMMENT '邮箱',
  `MOBILE` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `STATUS` int(1) NOT NULL COMMENT '状态 0锁定 1有效',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `LAST_LOGIN_TIME` datetime DEFAULT NULL COMMENT '最近访问时间',
  `SSEX` int(1) DEFAULT NULL COMMENT '性别 0男 1女 2保密',
  `IS_TAB` int(1) DEFAULT NULL COMMENT '是否开启tab，0关闭 1开启',
  `THEME` varchar(10) DEFAULT NULL COMMENT '主题',
  `AVATAR` varchar(100) DEFAULT NULL COMMENT '头像',
  `DESCRIPTION` varchar(100) DEFAULT NULL COMMENT '描述',
  `ORGANIZATION_CODING` varchar(100) DEFAULT NULL COMMENT '机构编码',
  `REGION_CODING` varchar(100) DEFAULT NULL COMMENT '地区编码',
  `NAME` varchar(50) DEFAULT NULL COMMENT '姓名',
  `QUALIFICATION` varchar(50) DEFAULT NULL COMMENT '资格',
  `SITE` varchar(100) DEFAULT NULL COMMENT '地址',
  `CERTIFICATION_STATUS` int(1) DEFAULT NULL COMMENT '认证状态:0未，1已',
  `CERTIFICATE` int(1) DEFAULT NULL COMMENT '证书： 1 - 5',
  PRIMARY KEY (`USER_ID`) USING BTREE,
  KEY `t_user_username` (`USERNAME`),
  KEY `t_user_mobile` (`MOBILE`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户表';

/*Data for the table `t_user` */

insert  into `t_user`(`USER_ID`,`USERNAME`,`PASSWORD`,`DEPT_ID`,`EMAIL`,`MOBILE`,`STATUS`,`CREATE_TIME`,`MODIFY_TIME`,`LAST_LOGIN_TIME`,`SSEX`,`IS_TAB`,`THEME`,`AVATAR`,`DESCRIPTION`,`ORGANIZATION_CODING`,`REGION_CODING`,`NAME`,`QUALIFICATION`,`SITE`,`CERTIFICATION_STATUS`,`CERTIFICATE`) values (1,'MrBird','cb62ad1497597283961545d608f80241',1,'mrbird@qq.com','17788888888',1,'2019-06-14 20:39:22','2019-12-04 16:47:11','2019-12-04 16:48:10',0,1,'black','cnrhVkzwxjPwAaCfPbdc.png','我是帅比作者。',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'Scott','1d685729d113cfd03872f154939bee1c',10,'scott@gmail.com','17722222222',1,'2019-06-14 20:55:53','2019-06-14 21:05:43','2019-08-18 17:36:18',0,1,'black','gaOngJwsRYRaVAuXXcmB.png','我是scott。',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'Reina','1461afff857c02afbfb768aa3771503d',4,'Reina@hotmail.com','17711111111',0,'2019-06-14 21:07:38','2019-06-14 21:09:06','2019-06-14 21:08:26',1,1,'black','5997fedcc7bd4cffbd350b40d1b5b987.jpg','由于公款私用，已被封禁。',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,'Micaela','9f2daa2c7bed6870fcbb5b9a51d6300e',10,'Micaela@163.com','17733333333',1,'2019-06-14 21:10:13','2019-06-14 21:11:26','2019-06-14 21:10:37',0,0,'white','20180414165909.jpg','我叫米克拉',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'Jana','176679b77b3c3e352bd3b30ddc81083e',8,'Jana@126.com','17744444444',1,'2019-06-14 21:12:16','2019-06-14 21:12:52','2019-06-14 21:12:32',1,1,'white','20180414165821.jpg','大家好，我叫简娜',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'Georgie','dffc683378cdaa015a0ee9554c532225',3,'Georgie@qq.com','17766666666',0,'2019-06-14 21:15:09','2019-06-14 21:16:25','2019-06-14 21:16:11',2,0,'black','BiazfanxmamNRoxxVxka.png','生产执行rm -rf *，账号封禁T T',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,'Margot','31379841b9f4bfde22b8b40471e9a6ce',9,'Margot@qq.com','13444444444',1,'2019-06-14 21:17:53','2019-06-14 21:18:59','2019-06-14 21:18:07',1,1,'white','20180414165834.jpg','大家好我叫玛戈',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,'kks','5da0943f31a8864104953fe50c4a89b2',NULL,NULL,NULL,1,'2020-08-05 14:42:43',NULL,'2020-08-08 01:19:55',2,1,'black','default.jpg','注册用户',NULL,NULL,NULL,NULL,NULL,0,0),(10,'fry','a69eda468571cfd9ffca19fb2ec2e8b9',NULL,NULL,NULL,1,'2020-08-06 16:53:04',NULL,'2020-08-06 16:55:29',2,1,'black','default.jpg','注册用户',NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `t_user_data_permission` */

DROP TABLE IF EXISTS `t_user_data_permission`;

CREATE TABLE `t_user_data_permission` (
  `USER_ID` bigint(20) NOT NULL,
  `DEPT_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`USER_ID`,`DEPT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户数据权限关联表';

/*Data for the table `t_user_data_permission` */

insert  into `t_user_data_permission`(`USER_ID`,`DEPT_ID`) values (1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(2,1),(2,2),(3,4),(4,5);

/*Table structure for table `t_user_role` */

DROP TABLE IF EXISTS `t_user_role`;

CREATE TABLE `t_user_role` (
  `USER_ID` bigint(20) NOT NULL COMMENT '用户ID',
  `ROLE_ID` bigint(20) NOT NULL COMMENT '角色ID',
  KEY `t_user_role_user_id` (`USER_ID`),
  KEY `t_user_role_role_id` (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户角色关联表';

/*Data for the table `t_user_role` */

insert  into `t_user_role`(`USER_ID`,`ROLE_ID`) values (1,1),(2,2),(3,77),(4,78),(5,79),(6,80),(7,78),(7,79),(7,80),(8,2),(10,2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
