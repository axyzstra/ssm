/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50744
 Source Host           : localhost:3306
 Source Schema         : mybatis_db

 Target Server Type    : MySQL
 Target Server Version : 50744
 File Encoding         : 65001

 Date: 01/07/2024 17:21:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'demo', 11, '西安');
INSERT INTO `user` VALUES (2, 'PDD', 25, '上海');
INSERT INTO `user` VALUES (3, 'ABC', 21, '北京');
INSERT INTO `user` VALUES (4, 'HHH', 21, '深圳');
INSERT INTO `user` VALUES (5, '小明', 23, '杭州');
INSERT INTO `user` VALUES (6, 'wang', 23, '北京');
INSERT INTO `user` VALUES (7, 'tao', 23, '杭州');
INSERT INTO `user` VALUES (10, 'test1', 12, 'hhj');
INSERT INTO `user` VALUES (12, 'demo', 11, '西安');

SET FOREIGN_KEY_CHECKS = 1;
