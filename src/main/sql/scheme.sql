-- 数据库初始化脚本

-- 创建数据库
CREATE DATABASE seckill;

use seckill;

-- 创建秒杀库存表
CREATE TABLE seckill(
seckill_id bigint NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
name varchar(120) NOT NULL COMMENT '商品名称',
number int NOT NULL COMMENT '库存数量',
create_time TIMESTAMP NOT NULL DEFAULT  CURRENT_TIMESTAMP  COMMENT '创建时间',
start_time  DATETIME NOT NULL COMMENT '秒杀开始时间',
end_time DATETIME NOT NULL COMMENT '秒杀结束时间',
PRIMARY KEY (seckill_id),
key idx_create_time(create_time),
key idx_start_time(start_time),
key idx_end_time(end_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';

-- 初始化数据
INSERT into
   seckill (name , number , start_time , end_time)
VALUES
   ('100元秒杀ipad' , 100 , '2015-11-01 00:00:00' , '2015-11-02 00:00:00'),
   ('200元秒杀小米5' , 100 , '2015-11-01 00:00:00' , '2015-11-02 00:00:00'),
   ('300元秒杀iphone6s' , 100 , '2015-11-01 00:00:00' , '2015-11-02 00:00:00');

-- 秒杀成功明细
-- 用户登录认证信息
create table success_seckilled(
seckill_id bigint NOT NULL  COMMENT '商品库存id',
user_phone varchar(11) NOT NULL COMMENT '用户电话',
state tinyint NOT NULL DEFAULT  0 COMMENT '状态标识：-1：无效 0：成功 1：已付款 2：已发货',
create_time TIMESTAMP  NOT NULL COMMENT '创建时间',
PRIMARY KEY (seckill_id , user_phone) , /*联合主键*/
key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细';