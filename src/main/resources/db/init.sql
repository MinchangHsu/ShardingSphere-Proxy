create schema if not exists demo_ds_0;
create schema if not exists demo_ds_1;


-- MySQL version
DROP TABLE IF EXISTS `t_order`;
DROP TABLE IF EXISTS `t_order_item`;
CREATE TABLE `t_order`
(
    `order_id` bigint(20) NOT NULL,
    `user_id`  int(11)    NOT NULL,
    `status`   varchar(50) COLLATE utf8_bin DEFAULT NULL,
    PRIMARY KEY (`order_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_bin;


CREATE TABLE `t_order_item`
(
    `order_item_id` bigint(20) NOT NULL,
    `order_id`      bigint(20) NOT NULL,
    `user_id`       int(11)    NOT NULL,
    `content`       varchar(255) COLLATE utf8_bin DEFAULT NULL,
    `status`        varchar(50) COLLATE utf8_bin  DEFAULT NULL,
    PRIMARY KEY (`order_item_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_bin;



--Postgresql version
DROP table t_order;
create table t_order
(
    order_id integer,
    user_id integer,
    status varchar(10)
);