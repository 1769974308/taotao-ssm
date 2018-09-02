/*
Navicat MySQL Data Transfer

Source Server         : 本地Mysql
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : taotao_ssm

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2018-09-02 22:29:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `id` int(11) NOT NULL,
  `userName` varchar(20) NOT NULL COMMENT '用户名',
  `passwd` varchar(20) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', '张三', '123456');
