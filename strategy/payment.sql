/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : payment

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2020-04-30 16:11:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goodId` int(11) NOT NULL,
  `goodName` varchar(50) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `productionDate` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`goodId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', 'Dell笔记本', '5999', null, '2020-01-03 16:04:35');
INSERT INTO `goods` VALUES ('2', 'iPhoneX', '8999', null, '2020-01-03 16:04:35');
INSERT INTO `goods` VALUES ('3', 'GTX1070显卡', '1000', null, '2020-01-03 16:04:35');
INSERT INTO `goods` VALUES ('4', 'MacBook', '6999', null, '2020-01-03 16:04:35');
INSERT INTO `goods` VALUES ('6', '深入Jvm', '48.9', null, '2020-01-03 16:04:35');

-- ----------------------------
-- Table structure for payway
-- ----------------------------
DROP TABLE IF EXISTS `payway`;
CREATE TABLE `payway` (
  `payId` int(11) NOT NULL,
  `payName` varchar(50) DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `type` int(11) DEFAULT '0',
  PRIMARY KEY (`payId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of payway
-- ----------------------------
INSERT INTO `payway` VALUES ('1', 'ICBC', '0.95', '1');
INSERT INTO `payway` VALUES ('2', 'AliPay', '0.9', '2');
INSERT INTO `payway` VALUES ('3', 'WechatPay', '1', '3');
