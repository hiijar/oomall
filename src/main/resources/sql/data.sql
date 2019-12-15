/*
Navicat MySQL Data Transfer

Source Server         : FF
Source Server Version : 80016
Source Host           : localhost:3306
Source Database       : oomall

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-12-15 20:09:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for oomall_default_freight
-- ----------------------------
DROP TABLE IF EXISTS `oomall_default_freight`;
CREATE TABLE `oomall_default_freight` (
  `id` bigint(11) unsigned NOT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `first_heavy_price` decimal(10,2) DEFAULT NULL,
  `continue_heavy_price` decimal(10,2) DEFAULT NULL,
  `over10_price` decimal(10,2) DEFAULT NULL,
  `over50_price` decimal(10,2) DEFAULT NULL,
  `over100_price` decimal(10,2) DEFAULT NULL,
  `over300_price` decimal(10,2) DEFAULT NULL,
  `require_days` varchar(255) DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of oomall_default_freight
-- ----------------------------
INSERT INTO `oomall_default_freight` VALUES ('1', '{\"dest\":[1]}', '10.00', '5.00', '7.00', '5.00', '4.50', '4.00', '次日', '2019-12-18 20:08:26.00', '2019-12-15 20:08:29.00', '0');
INSERT INTO `oomall_default_freight` VALUES ('2', '{\"dest\":[169,170,173,174,176,177,178,179,180,181,182]}', '15.00', '5.00', '10.00', '5.00', '7.50', '6.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('3', '{\"dest\":[2]}', '15.00', '5.00', '10.00', '5.00', '7.50', '6.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('4', '{\"dest\":[9]}', '20.00', '10.00', '12.00', '10.00', '9.00', '8.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('5', '{\"dest\":[11]}', '20.00', '10.00', '12.00', '10.00', '9.00', '8.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('6', '{\"dest\":[10]}', '20.00', '10.00', '12.00', '10.00', '9.00', '8.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('7', '{\"dest\":[12]}', '20.00', '10.00', '14.00', '10.00', '10.00', '9.00', '2-3天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('8', '{\"dest\":[19]}', '20.00', '10.00', '15.00', '10.00', '12.00', '10.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('9', '{\"dest\":[146,147,150]}', '20.00', '10.00', '15.00', '10.00', '12.00', '10.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('10', '{\"dest\":[148,149,151,152,153,154]}', '20.00', '10.00', '15.00', '10.00', '12.00', '10.00', '2-3天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('11', '{\"dest\":[215]}', '20.00', '10.00', '15.00', '10.00', '12.00', '10.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('12', '{\"dest\":[216,217,218,219,220,221,222,223,224,225,226,227,228]}', '20.00', '10.00', '15.00', '10.00', '12.00', '10.00', '2-3天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('13', '{\"dest\":[201]}', '20.00', '10.00', '12.00', '10.00', '9.00', '8.00', '市内1天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('14', '{\"dest\":[202,203,204,205,206,207,208,209,210,211,212,213,214]}', '20.00', '10.00', '12.00', '10.00', '9.00', '8.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('15', '{\"dest\":[183]}', '20.00', '10.00', '12.00', '10.00', '9.00', '8.00', '市内1天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('16', '{\"dest\":[184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200]}', '20.00', '10.00', '12.00', '10.00', '9.00', '8.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('17', '{\"dest\":[3]}', '15.00', '10.00', '12.00', '10.00', '9.00', '8.00', '次日', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('18', '{\"dest\":[14]}', '20.00', '10.00', '15.00', '10.00', '12.00', '10.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('19', '{\"dest\":[23]}', '20.00', '10.00', '15.00', '10.00', '12.00', '10.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('20', '{\"dest\":[6]}', '20.00', '10.00', '12.00', '10.00', '9.00', '8.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('21', '{\"dest\":[25]}', '20.00', '10.00', '15.00', '10.00', '12.00', '10.00', '2-3天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('22', '{\"dest\":[7]}', '20.00', '10.00', '12.00', '10.00', '9.00', '8.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('23', '{\"dest\":[8]}', '20.00', '10.00', '12.00', '10.00', '9.00', '8.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('24', '{\"dest\":[27]}', '20.00', '10.00', '15.00', '10.00', '12.00', '10.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('25', '{\"dest\":[4]}', '20.00', '10.00', '12.00', '10.00', '9.00', '8.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('26', '{\"dest\":[28]}', '20.00', '10.00', '15.00', '10.00', '12.00', '10.00', '2-3天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('27', '{\"dest\":[29]}', '20.00', '10.00', '15.00', '10.00', '12.00', '10.00', '2-3天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('28', '{\"dest\":[30]}', '20.00', '10.00', '15.00', '10.00', '12.00', '10.00', '2-3天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('29', '{\"dest\":[5]}', '20.00', '10.00', '12.00', '10.00', '9.00', '8.00', '次日', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('30', '{\"dest\":[20]}', '20.00', '10.00', '15.00', '10.00', '12.00', '10.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('31', '{\"dest\":[24]}', '20.00', '10.00', '15.00', '10.00', '12.00', '10.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('32', '{\"dest\":[31]}', '20.00', '15.00', '25.00', '15.00', '15.00', '13.00', '2-3天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('33', '{\"dest\":[22]}', '20.00', '10.00', '15.00', '10.00', '12.00', '10.00', '1-2天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('34', '{\"dest\":[21]}', '20.00', '10.00', '15.00', '10.00', '12.00', '10.00', '2-3天', null, null, '0');
INSERT INTO `oomall_default_freight` VALUES ('35', '{\"dest\":[166,167,168,171,172,175]}', '15.00', '5.00', '10.00', '5.00', '7.50', '6.00', '次日', null, null, '0');




SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for oomall_default_piece_freight
-- ----------------------------
DROP TABLE IF EXISTS `oomall_default_piece_freight`;
CREATE TABLE `oomall_default_piece_freight` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `destination` varchar(255) DEFAULT NULL,
  `unit_rate` decimal(10,2) DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  `require_days` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of oomall_default_piece_freight
-- ----------------------------
INSERT INTO `oomall_default_piece_freight` VALUES ('1', '{\"dest\":[1]}', '1.00', null, null, '0', '次日');
INSERT INTO `oomall_default_piece_freight` VALUES ('2', '{\"dest\":[169,170,173,174,176,177,178,179,180,181,182]}', '1.50', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('3', '{\"dest\":[2]}', '1.50', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('4', '{\"dest\":[9]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('5', '{\"dest\":[11]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('6', '{\"dest\":[10]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('7', '{\"dest\":[12]}', '2.00', null, null, '0', '2-3天');
INSERT INTO `oomall_default_piece_freight` VALUES ('8', '{\"dest\":[19]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('9', '{\"dest\":[146,147,150]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('10', '{\"dest\":[148,149,151,152,153,154]}', '2.00', null, null, '0', '2-3天');
INSERT INTO `oomall_default_piece_freight` VALUES ('11', '{\"dest\":[215]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('12', '{\"dest\":[216,217,218,219,220,221,222,223,224,225,226,227,228]}', '2.00', null, null, '0', '2-3天');
INSERT INTO `oomall_default_piece_freight` VALUES ('13', '{\"dest\":[201]}', '2.00', null, null, '0', '市内1天');
INSERT INTO `oomall_default_piece_freight` VALUES ('14', '{\"dest\":[202,203,204,205,206,207,208,209,210,211,212,213,214]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('15', '{\"dest\":[183]}', '2.00', null, null, '0', '市内1天');
INSERT INTO `oomall_default_piece_freight` VALUES ('16', '{\"dest\":[184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('17', '{\"dest\":[3]}', '1.50', null, null, '0', '次日');
INSERT INTO `oomall_default_piece_freight` VALUES ('18', '{\"dest\":[14]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('19', '{\"dest\":[23]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('20', '{\"dest\":[6]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('21', '{\"dest\":[25]}', '2.00', null, null, '0', '2-3天');
INSERT INTO `oomall_default_piece_freight` VALUES ('22', '{\"dest\":[7]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('23', '{\"dest\":[8]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('24', '{\"dest\":[27]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('25', '{\"dest\":[4]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('26', '{\"dest\":[28]}', '2.00', null, null, '0', '2-3天');
INSERT INTO `oomall_default_piece_freight` VALUES ('27', '{\"dest\":[29]}', '2.00', null, null, '0', '2-3天');
INSERT INTO `oomall_default_piece_freight` VALUES ('28', '{\"dest\":[30]}', '2.00', null, null, '0', '2-3天');
INSERT INTO `oomall_default_piece_freight` VALUES ('29', '{\"dest\":[5]}', '2.00', null, null, '0', '次日');
INSERT INTO `oomall_default_piece_freight` VALUES ('30', '{\"dest\":[20]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('31', '{\"dest\":[24]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('32', '{\"dest\":[31]}', '2.00', null, null, '0', '2-3天');
INSERT INTO `oomall_default_piece_freight` VALUES ('33', '{\"dest\":[22]}', '2.00', null, null, '0', '1-2天');
INSERT INTO `oomall_default_piece_freight` VALUES ('34', '{\"dest\":[21]}', '2.00', null, null, '0', '2-3天');
INSERT INTO `oomall_default_piece_freight` VALUES ('35', '{\"dest\":[166,167,168,171,172,175]}', '1.50', null, null, '0', '次日');




INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/userInfoService/admins/login', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/userInfoService/captcha', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/userInfoService/login', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/userInfoService/reCaptcha', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/userInfoService/register', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/brandService/brands', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/brandService/brands/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/categoryService/categories', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/categoryService/categories/l1', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/categoryService/categories/l1/{id}/l2', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/categoryService/categories/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/commentService/goods/{id}/comments', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/goodsService/categories/{id}/goods', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/goodsService/goods/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/goodsService/goods', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/grouponService/grouponRules/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/topicService/topics', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/topicService/topics/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (0, '/adService/ads', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/adService/admin/ads', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/adService/admin/ads', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/adService/ads/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/adService/ads/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/adService/ads/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/admin/addresses', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/admin', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/admin', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/admin/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/admin/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/admin/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/admins/info', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/admins/login', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/admins/logout', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/brandService/admins/brands', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/brandService/brands', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/brandService/brands/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/brandService/brands/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/brandService/brands/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/categoryService/categories/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/categoryService/categories/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/commentService/admin/comments', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/commentService/admin/comments/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/commentService/comments/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/couponService/couponRules', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/couponService/couponRules', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/couponService/couponRules/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/couponService/couponRules/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/couponService/couponRules/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/footprintService/admin/footprints', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/goodsService/goods/{id}/products', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/goodsService/goods/{id}/products', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/goodsService/products/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/goodsService/products/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/goodsService/products/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/goodsService/admin/goods', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/goodsService/admin/goods', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/goodsService/goods/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/goodsService/goods/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/goodsService/goods/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/grouponService/goods/{id}/grouponRules', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/grouponService/grouponRules', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/grouponService/grouponRules/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/grouponService/grouponRules/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/grouponService/grouponRules/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/logService/logs', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/orderService/admins/orders', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/orderService/orders/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/orderService/admin/orders/{id}/refund', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/orderService/orders/{id}/ship', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/profileService/admins/password', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/roles', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/roles', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/roles/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/roles/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/roles/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/roles/{id}/admins', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/roles/{id}/permission', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/topicService/topics', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/topicService/topics/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/topicService/topics/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/topicService/topics/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/userInfoService/users', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/shareService/goods/{id}/shareRules', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/shareService/shareRules', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/shareService/shareRules/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/shareService/shareRules/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/shareService/beSharedItems', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/freightService/DefaultPieceFreight', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/freightService/DefaultPieceFreight', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/freightService/DefaultPieceFreight/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/freightService/DefaultPieceFreight/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/freightService/defaultFreights', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/freightService/defaultFreights', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/freightService/defaultFreights/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/freightService/defaultFreights/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/freightService/specialFreights', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/freightService/specialFreights', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/freightService/specialFreights/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/freightService/specialFreights/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/afterSaleService/afterSaleServices/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/afterSaleService/admin/afterSaleServices/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/categoryService/​categories', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/categoryService/​categories', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/categoryService/​categories/l1', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/categoryService/​categories/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (1, '/collectionService/admin/collections', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/userInfoService/admins/info', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/userInfoService/admins/login', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/userInfoService/admins/logout', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/brandService/admins/brands', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/brandService/brands', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/brandService/brands/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/brandService/brands/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/brandService/brands/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/categoryService/categories/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/categoryService/categories/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/commentService/admin/comments', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/commentService/admin/comments/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/commentService/comments/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/couponService/couponRules', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/couponService/couponRules', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/couponService/couponRules/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/couponService/couponRules/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/couponService/couponRules/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/goodsService/goods/{id}/products', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/goodsService/goods/{id}/products', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/goodsService/products/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/goodsService/products/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/goodsService/products/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/goodsService/admin/goods', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/goodsService/admin/goods', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/goodsService/goods/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/goodsService/goods/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/goodsService/goods/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/grouponService/goods/{id}/grouponRules', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/grouponService/grouponRules', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/grouponService/grouponRules/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/grouponService/grouponRules/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/grouponService/grouponRules/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/userInfoService/admins/password', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/categoryService/​categories', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/categoryService/​categories', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/categoryService/​categories/l1', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (2, '/categoryService/​categories/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/userInfoService/admins/info', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/userInfoService/admins/login', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/userInfoService/admins/logout', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/adService/admin/ads', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/adService/admin/ads', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/adService/ads/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/adService/ads/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/adService/ads/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/userInfoService/admins/password', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/topicService/topics', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/topicService/topics/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/topicService/topics/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/topicService/topics/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/shareService/goods/{id}/shareRules', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/shareService/shareRules', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/shareService/shareRules/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/shareService/shareRules/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (3, '/shareService/beSharedItems', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/addressService/addresses', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/addressService/addresses', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/addressService/addresses/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/addressService/addresses/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/addressService/addresses/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/userInfoService/captcha', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/userInfoService/login', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/userInfoService/password', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/userInfoService/phone', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/userInfoService/reCaptcha', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/userInfoService/register', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/userInfoService/user', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/brandService/brands', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/brandService/brands/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/cartService/cartItems', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/cartService/cartItems', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/cartService/cartItems/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/cartService/cartItems/{id}', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/cartService/cartItems/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/categoryService/categories', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/categoryService/categories/l1', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/categoryService/categories/l1/{id}/l2', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/categoryService/categories/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/collectionService/collections', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/collectionService/collections', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/commentService/goods/{id}/comments', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/commentService/goods/{id}/comments', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/couponService/coupons', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/couponService/coupons', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/couponService/coupons/availableCoupns', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/footprintService/footprints', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/footprintService/footprints/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/goodsService/categories/{id}/goods', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/goodsService/goods/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/goodsService/goods', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/grouponService/grouponRules/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/orderService/orders', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/orderService/orders', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/orderService/orders/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/orderService/orders/{id}', 'DELETE', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/orderService/orders/{id}/cancel', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/orderService/orders/{id}/confirm', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/orderService/payment', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/orderService/orders/{id}/refund', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/orderService/orders/unevaluated', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/topicService/topics', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/topicService/topics', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/topicService/topics/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/adService/ads', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/afterSaleService/afterSaleServices', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/afterSaleService/afterSaleServices', 'POST', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/afterSaleService/afterSaleServices/{id}', 'GET', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/afterSaleService/afterSaleServices/{id}', 'PUT', sysdate(), sysdate(), 0);
INSERT INTO oomall_privilege (role_id, url, method, gmt_create, gmt_modified, is_deleted) VALUES (4, '/afterSaleService/afterSaleServices/{id}', 'DELETE', sysdate(), sysdate(), 0);

