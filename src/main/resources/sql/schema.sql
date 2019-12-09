-- ----------------------------
-- Table structure for ad
-- ----------------------------
DROP TABLE IF EXISTS `ad`;
CREATE TABLE `ad` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `link` varchar(255) DEFAULT NULL,
  `name` varchar(31) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `pic_url` varchar(255) DEFAULT NULL,
  `is_default` tinyint(1) unsigned DEFAULT '0',
  `is_enabled` tinyint(1) unsigned DEFAULT '0',
  `start_time` datetime(2) DEFAULT NULL,
  `end_time` datetime(2) DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  `county_id` bigint(11) unsigned DEFAULT NULL,
  `province_id` bigint(11) unsigned DEFAULT NULL,
  `city_id` bigint(11) unsigned DEFAULT NULL,
  `address_detail` varchar(255) DEFAULT NULL,
  `postal_code` varchar(15) DEFAULT NULL,
  `consignee` varchar(63) DEFAULT NULL,
  `mobile` varchar(31) DEFAULT NULL,
  `is_default` tinyint(1) unsigned DEFAULT '0',
  `user_id` bigint(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `username` varchar(31) DEFAULT NULL,
  `password` varchar(31) DEFAULT NULL,
  `role_id` bigint(11) unsigned DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(63) NOT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for privilege
-- ----------------------------
DROP TABLE IF EXISTS `privilege`;
CREATE TABLE `privilege` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `role_id` bigint(11) unsigned DEFAULT NULL,
  `name` varchar(63) NOT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for aftersales_service
-- ----------------------------
DROP TABLE IF EXISTS `aftersales_service`;
CREATE TABLE `aftersales_service` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) unsigned DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  `goods_type` int(8) DEFAULT NULL,
  `apply_time` datetime(2) DEFAULT NULL,
  `apply_reason` varchar(255) DEFAULT NULL,
  `end_time` datetime(2) DEFAULT NULL,
  `type` int(8) DEFAULT NULL,
  `is_applied` tinyint(1) unsigned DEFAULT '0',
  `status` tinyint(2) unsigned DEFAULT '0',
  `number` int(8) unsigned DEFAULT '1',
  `order_item_id` bigint(11) unsigned DEFAULT NULL,
  `product_id` bigint(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for be_shared_item
-- ----------------------------
DROP TABLE IF EXISTS `be_shared_item`;
CREATE TABLE `be_shared_item` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `goods_id` bigint(11) unsigned DEFAULT NULL,
  `sharer_id` bigint(11) unsigned DEFAULT NULL,
  `status` tinyint(2) DEFAULT NULL,
  `birthtime` datetime DEFAULT NULL,
  `be_shared_user_id` bigint(11) unsigned DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for brand
-- ----------------------------
DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(31) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `pic_url` varchar(255) DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for cart_item
-- ----------------------------
DROP TABLE IF EXISTS `cart_item`;
CREATE TABLE `cart_item` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) unsigned DEFAULT NULL,
  `product_id` bigint(11) unsigned DEFAULT NULL,
  `is_check` tinyint(1) unsigned DEFAULT '0',
  `number` smallint(5) unsigned DEFAULT NULL, 
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for collect_item
-- ----------------------------
DROP TABLE IF EXISTS `collect_item`;
CREATE TABLE `collect_item` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `goods_id` bigint(11) unsigned DEFAULT NULL,
  `user_id` bigint(11) unsigned DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) unsigned DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `status` tinyint(2) DEFAULT NULL,
  `type` tinyint(1) unsigned DEFAULT NULL,
  `star` tinyint(1) unsigned DEFAULT NULL,
  `product_id` bigint(11) unsigned DEFAULT NULL,
  `topic_id` bigint(11) unsigned DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for coupon
-- ----------------------------
DROP TABLE IF EXISTS `coupon`;
CREATE TABLE `coupon` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) unsigned DEFAULT NULL,
  `coupon_rule_id` bigint(11) unsigned DEFAULT NULL,
  `coupon_sn` varchar(63) DEFAULT NULL,
  `begin_time` datetime(2) DEFAULT NULL,
  `end_time` datetime(2) DEFAULT NULL,
  `used_time` datetime(2) DEFAULT NULL,
  `name` varchar(31) DEFAULT NULL,
  `pic_url` varchar(255) DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  `status` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for coupon_rule
-- ----------------------------
DROP TABLE IF EXISTS `coupon_rule`;
CREATE TABLE `coupon_rule` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(31) DEFAULT NULL,
  `brief` varchar(63) DEFAULT NULL,
  `begin_time` datetime(2) DEFAULT NULL,
  `end_time` datetime(2) DEFAULT NULL,
  `pic_url` varchar(255) DEFAULT NULL,
  `valid_period` int(4) unsigned DEFAULT NULL,
  `strategy` varchar(5000) DEFAULT NULL,
  `total` int(5) unsigned DEFAULT NULL,
  `goods_list1` varchar(5000) DEFAULT NULL,
  `goods_list2` varchar(5000) DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for default_freight
-- ----------------------------
DROP TABLE IF EXISTS `default_freight`;
CREATE TABLE `default_freight` (
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
);

-- ----------------------------
-- Table structure for default_piece_freight
-- ----------------------------
DROP TABLE IF EXISTS `default_piece_freight`;
CREATE TABLE `default_piece_freight` (
  `id` bigint(11) unsigned NOT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `require_days` varchar(255) DEFAULT NULL,
  `unit_rate` decimal(10,2) DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for footprint_item
-- ----------------------------
DROP TABLE IF EXISTS `footprint_item`;
CREATE TABLE `footprint_item` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime(2) DEFAULT NULL,
  `birth_time` datetime(2) DEFAULT NULL,
  `user_id` bigint(11) unsigned DEFAULT NULL,
  `goods_id` bigint(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `name` varchar(31) DEFAULT NULL,
  `goods_sn` varchar(63) DEFAULT NULL,
  `short_name` varchar(31) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `brief` varchar(63) DEFAULT NULL,
  `pic_url` varchar(255) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  `status` tinyint(2) unsigned DEFAULT NULL,
  `share_url` varchar(255) DEFAULT NULL,
  `gallery` varchar(5000) DEFAULT NULL,
  `goods_category_id` bigint(11) unsigned DEFAULT NULL,
  `brand_id` bigint(11) unsigned DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  `weight` decimal(10,2) DEFAULT NULL,
  `volume` varchar(255) DEFAULT NULL,
  `special_freight_id` bigint(11) unsigned DEFAULT NULL,
  `is_special` tinyint(1) unsigned DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for goods_category
-- ----------------------------
DROP TABLE IF EXISTS `goods_category`;
CREATE TABLE `goods_category` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `pid` bigint(11) unsigned DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '1',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for groupon_rule
-- ----------------------------
DROP TABLE IF EXISTS `groupon_rule`;
CREATE TABLE `groupon_rule` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  `start_time` datetime(2) DEFAULT NULL,
  `end_time` datetime(2) DEFAULT NULL,
  `status` tinyint(2) unsigned DEFAULT NULL,
  `groupon_level_strategy` varchar(255) DEFAULT NULL,
  `goods_id` bigint(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `admin_id` bigint(11) unsigned DEFAULT NULL,
  `ip` varchar(31) DEFAULT NULL,
  `type` tinyint(4) unsigned DEFAULT NULL,
  `action` varchar(63) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `action_id` bigint(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) unsigned DEFAULT NULL,
  `be_shared_item_ids` varchar(255) DEFAULT NULL,
  `order_sn` varchar(63) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `consignee` varchar(63) DEFAULT NULL,
  `mobile` varchar(31) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `goods_price` decimal(10,2) DEFAULT NULL,
  `freight_price` decimal(10,2) DEFAULT NULL,
  `coupon_price` decimal(10,2) DEFAULT NULL,
  `rebate_price` decimal(10,2) DEFAULT NULL,
  `integral_price` decimal(10,2) DEFAULT NULL,
  `ship_sn` varchar(63) DEFAULT NULL,
  `ship_channel` varchar(63) DEFAULT NULL,
  `ship_time` datetime(2) DEFAULT NULL,
  `confirm_time` datetime(2) DEFAULT NULL,
  `end_time` datetime(2) DEFAULT NULL,
  `pay_time` datetime(2) DEFAULT NULL,
  `parent_id` bigint(11) unsigned DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for order_item
-- ----------------------------
DROP TABLE IF EXISTS `order_item`;
CREATE TABLE `order_item` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `order_id` bigint(11) unsigned DEFAULT NULL,
  `item_type` varchar(255) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `number` int(11) unsigned DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `deal_price` decimal(10,2) DEFAULT NULL,
  `product_id` bigint(11) unsigned DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  `goods_id` bigint(11) unsigned DEFAULT NULL,
  `name_with_specifications` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for payment
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `actual_price` decimal(10,2) unsigned DEFAULT NULL,
  `pay_channel` tinyint(3) unsigned DEFAULT NULL,
  `is_successful` tinyint(1) unsigned DEFAULT '0',
  `pay_time` datetime(2) DEFAULT NULL,
  `pay_sn` varchar(63) DEFAULT NULL,
  `begin_time` datetime(2) DEFAULT NULL,
  `end_time` datetime(2) DEFAULT NULL,
  `order_id` bigint(11) unsigned DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `product_ids` varchar(255) DEFAULT NULL,
  `pic_url` varchar(255) DEFAULT NULL,
  `specifications` varchar(1000) DEFAULT NULL,
  `goods_id` bigint(11) unsigned DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `safety_stock` int(11) unsigned DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for region
-- ----------------------------
DROP TABLE IF EXISTS `region`;
CREATE TABLE `region` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `pid` bigint(11) unsigned NOT NULL,
  `name` varchar(120) DEFAULT '',
  `type` tinyint(3) DEFAULT '0',
  `postal_code` varchar(11) DEFAULT '0',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for share_item
-- ----------------------------
DROP TABLE IF EXISTS `share_item`;
CREATE TABLE `share_item` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) unsigned DEFAULT NULL,
  `goods_id` bigint(11) unsigned DEFAULT NULL,
  `status` tinyint(2) unsigned DEFAULT NULL,
  `success_num` smallint(5) unsigned DEFAULT '0', 
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for share_rule
-- ----------------------------
DROP TABLE IF EXISTS `share_rule`;
CREATE TABLE `share_rule` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `begin_time` datetime(2) DEFAULT NULL,
  `end_time` datetime(2) DEFAULT NULL,
  `share_level_strategy` varchar(255) DEFAULT NULL,
  `goods_id` bigint(11) unsigned DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  `gmt_create` datetime(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for special_freight
-- ----------------------------
DROP TABLE IF EXISTS `special_freight`;
CREATE TABLE `special_freight` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `first_num_piece` smallint(5) unsigned DEFAULT NULL,
  `first_num_piece_price` decimal(10,2) DEFAULT NULL,
  `continue_num_piece` smallint(5) unsigned DEFAULT NULL,
  `continue_num_piece_price` decimal(10,2) DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for topic
-- ----------------------------
DROP TABLE IF EXISTS `topic`;
CREATE TABLE `topic` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  `pic_url_list` varchar(5000) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(31) DEFAULT NULL,
  `gender` tinyint(1) unsigned DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `nickname` varchar(31) DEFAULT NULL,
  `rebate` smallint(5) unsigned DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL,
  `last_login_ip` varchar(255) DEFAULT NULL,
  `user_level` int(3) unsigned DEFAULT NULL,
  `wx_open_id` varchar(127) DEFAULT NULL,
  `session_key` varchar(127) DEFAULT NULL,
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for presale_rule
-- ----------------------------
DROP TABLE IF EXISTS `presale_rule`;
CREATE TABLE `presale_rule` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `strategy` varchar(5000) DEFAULT NULL,
  `product_id` bigint(11) unsigned NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `status` tinyint(1) unsigned DEFAULT '0',
  `gmt_create` datetime(2) DEFAULT NULL,
  `gmt_modified` datetime(2) DEFAULT NULL,
  `is_deleted` tinyint(1) unsigned DEFAULT '0',
  `deposit` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
);