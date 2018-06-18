/*
Navicat MySQL Data Transfer

Source Server         : Saber
Source Server Version : 50544
Source Host           : localhost:3306
Source Database       : window

Target Server Type    : MYSQL
Target Server Version : 50544
File Encoding         : 65001

Date: 2018-06-18 14:41:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for windowdata
-- ----------------------------
DROP TABLE IF EXISTS `windowdata`;
CREATE TABLE `windowdata` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `inputHeight` int(10) unsigned NOT NULL COMMENT '输入高',
  `inputWidth` int(10) unsigned NOT NULL COMMENT '输入宽',
  `inputNumber` int(10) unsigned NOT NULL COMMENT '输入数量',
  `materialsType` varchar(255) NOT NULL COMMENT '材料类型',
  `type` varchar(255) NOT NULL COMMENT '判断后得到的窗户类型',
  `memoryDate` datetime NOT NULL COMMENT '存储日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of windowdata
-- ----------------------------
INSERT INTO `windowdata` VALUES ('1', '1300', '1200', '1', '中财88', 'A1', '2018-06-11 12:23:21');
INSERT INTO `windowdata` VALUES ('2', '1500', '1300', '20', '新中财80', 'A2', '2018-06-10 14:50:07');
INSERT INTO `windowdata` VALUES ('3', '1500', '1600', '3', '中财88', 'A3', '2018-06-11 11:42:22');
INSERT INTO `windowdata` VALUES ('4', '2300', '1300', '4', '中财88', 'A4', '2018-06-10 09:18:44');
INSERT INTO `windowdata` VALUES ('5', '2300', '1700', '5', '中财88', 'A5', '2018-06-11 09:19:12');
INSERT INTO `windowdata` VALUES ('6', '1500', '1350', '3', '中财88', 'A2', '2018-06-11 21:09:08');
INSERT INTO `windowdata` VALUES ('7', '2300', '1350', '4', '中财88', 'A4', '2018-06-11 21:52:02');
INSERT INTO `windowdata` VALUES ('8', '2300', '1800', '5', '中财88', 'A5', '2018-06-11 22:31:04');
INSERT INTO `windowdata` VALUES ('9', '1500', '1340', '2', '中财88', 'A2', '2018-06-11 23:37:35');
INSERT INTO `windowdata` VALUES ('10', '1500', '1600', '4', '中财88', 'A3', '2018-06-11 23:37:50');
INSERT INTO `windowdata` VALUES ('11', '1900', '1500', '1', '中财88', 'A3', '2018-06-11 23:38:07');
INSERT INTO `windowdata` VALUES ('15', '1300', '1500', '2', '中财88', 'A1', '2018-06-12 01:01:28');
INSERT INTO `windowdata` VALUES ('16', '1200', '1200', '3', '中财88', 'A1', '2018-06-13 10:42:27');
INSERT INTO `windowdata` VALUES ('17', '2200', '1200', '4', '中财88', 'A2', '2018-06-13 10:49:29');
INSERT INTO `windowdata` VALUES ('18', '2400', '1300', '4', '中财88', 'A4', '2018-06-13 10:50:11');
INSERT INTO `windowdata` VALUES ('19', '1200', '1300', '4', '中财88', 'A1', '2018-06-13 10:54:59');
INSERT INTO `windowdata` VALUES ('20', '1200', '1600', '5', '中财88', 'A1', '2018-06-13 10:59:11');
INSERT INTO `windowdata` VALUES ('21', '1200', '1700', '6', '中财88', 'A1', '2018-06-13 11:02:53');
INSERT INTO `windowdata` VALUES ('22', '1300', '1100', '3', '中财88', 'A1', '2018-06-13 20:27:28');
INSERT INTO `windowdata` VALUES ('23', '1562', '1212', '2', '中财88', 'A2', '2018-06-13 20:32:18');
INSERT INTO `windowdata` VALUES ('24', '1562', '1213', '2', '中财88', 'A2', '2018-06-13 20:32:29');
INSERT INTO `windowdata` VALUES ('25', '1562', '1400', '2', '中财88', 'A3', '2018-06-13 20:32:35');
INSERT INTO `windowdata` VALUES ('26', '1562', '1500', '2', '中财88', 'A3', '2018-06-13 20:32:39');
INSERT INTO `windowdata` VALUES ('27', '1562', '1200', '2', '中财88', 'A2', '2018-06-13 20:32:43');
INSERT INTO `windowdata` VALUES ('28', '2300', '1200', '2', '中财88', 'A4', '2018-06-13 20:32:48');
INSERT INTO `windowdata` VALUES ('29', '2400', '1200', '2', '中财88', 'A4', '2018-06-13 20:32:51');
INSERT INTO `windowdata` VALUES ('30', '1700', '1200', '2', '中财88', 'A2', '2018-06-13 20:32:56');
INSERT INTO `windowdata` VALUES ('31', '1900', '2010', '2', '中财88', 'A3', '2018-06-13 20:33:05');
INSERT INTO `windowdata` VALUES ('32', '1900', '1900', '2', '中财88', 'A3', '2018-06-13 20:33:12');
INSERT INTO `windowdata` VALUES ('33', '1875', '1900', '2', '中财88', 'A3', '2018-06-13 20:33:24');
INSERT INTO `windowdata` VALUES ('34', '1200', '1300', '1', '中财80', 'A1', '2018-06-13 23:28:44');
INSERT INTO `windowdata` VALUES ('35', '1400', '1200', '3', '新中财80', 'A2', '2018-06-13 23:28:59');
INSERT INTO `windowdata` VALUES ('36', '1500', '1600', '4', '力尔88', 'A3', '2018-06-13 23:29:23');
INSERT INTO `windowdata` VALUES ('37', '2300', '1500', '2', '贝迪88', 'A5', '2018-06-13 23:29:46');
INSERT INTO `windowdata` VALUES ('38', '1200', '1500', '3', '中财80', 'A1', '2018-06-14 02:17:38');
INSERT INTO `windowdata` VALUES ('39', '1600', '1900', '3', '新中财80', 'A3', '2018-06-14 02:18:01');
INSERT INTO `windowdata` VALUES ('40', '2300', '1500', '2', '力尔88', 'A5', '2018-06-14 02:18:36');
INSERT INTO `windowdata` VALUES ('41', '1900', '1600', '4', '德玛斯88', 'A3', '2018-06-14 02:19:10');
INSERT INTO `windowdata` VALUES ('42', '1500', '1300', '3', '中财88', 'A2', '2018-06-14 10:25:45');
INSERT INTO `windowdata` VALUES ('43', '1300', '1300', '3', '中财88', 'A1', '2018-06-14 10:26:43');
INSERT INTO `windowdata` VALUES ('44', '1900', '1600', '2', '力尔88', 'A3', '2018-06-14 10:28:33');
INSERT INTO `windowdata` VALUES ('45', '1600', '1300', '3', '中财88', 'A2', '2018-06-14 10:29:06');
INSERT INTO `windowdata` VALUES ('46', '1300', '1500', '2', '德玛斯88', 'A1', '2018-06-14 23:01:24');
INSERT INTO `windowdata` VALUES ('47', '2301', '1500', '3', '德玛斯88', 'A5', '2018-06-14 23:04:08');
INSERT INTO `windowdata` VALUES ('48', '2300', '1500', '3', '新中财80', 'A5', '2018-06-15 00:10:18');
INSERT INTO `windowdata` VALUES ('49', '2300', '1800', '1', '中财88', 'A5', '2018-06-16 18:29:44');
