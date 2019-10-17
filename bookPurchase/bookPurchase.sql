/*
Navicat MySQL Data Transfer

Source Server         : bookPurchase
Source Server Version : 50719
Source Host           : 120.79.84.251:3306
Source Database       : bookPurchase

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2019-10-08 21:05:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book_admin
-- ----------------------------
DROP TABLE IF EXISTS `book_admin`;
CREATE TABLE `book_admin` (
  `adminID` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`adminID`)
) ENGINE=InnoDB AUTO_INCREMENT=183 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_admin
-- ----------------------------
INSERT INTO `book_admin` VALUES ('1', '小懒虫', '123');
INSERT INTO `book_admin` VALUES ('2', 'Joe', 'joe');
INSERT INTO `book_admin` VALUES ('3', 'Sam', '123456');
INSERT INTO `book_admin` VALUES ('4', 'Sam', '111111');
INSERT INTO `book_admin` VALUES ('6', 'Amy', '123123');
INSERT INTO `book_admin` VALUES ('7', 'Jane', '123123');
INSERT INTO `book_admin` VALUES ('28', 'Amny', '123123');
INSERT INTO `book_admin` VALUES ('29', 'Liguo', '123123');
INSERT INTO `book_admin` VALUES ('30', 'Liguo', '123123');
INSERT INTO `book_admin` VALUES ('120', 'XiaoTang', '111111');
INSERT INTO `book_admin` VALUES ('121', 'Donib', '123123');
INSERT INTO `book_admin` VALUES ('122', 'Donib', '123123');
INSERT INTO `book_admin` VALUES ('123', 'PPP', '123');
INSERT INTO `book_admin` VALUES ('124', 'PPP', '123');
INSERT INTO `book_admin` VALUES ('131', 'LiLE', 'lile');
INSERT INTO `book_admin` VALUES ('133', 'LileAAA', '143');
INSERT INTO `book_admin` VALUES ('149', '111', '2');
INSERT INTO `book_admin` VALUES ('156', 'Lile', '222222');
INSERT INTO `book_admin` VALUES ('178', 'xiaotang', '123');
INSERT INTO `book_admin` VALUES ('179', 'xiaotang2', '123');
INSERT INTO `book_admin` VALUES ('182', 'ssf', 'ssf');

-- ----------------------------
-- Table structure for book_buycar
-- ----------------------------
DROP TABLE IF EXISTS `book_buycar`;
CREATE TABLE `book_buycar` (
  `buycar_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `book_detail_id` int(11) DEFAULT NULL,
  `order_quantity` varchar(255) DEFAULT NULL COMMENT '购买的数量',
  `total_price` varchar(255) DEFAULT NULL COMMENT '总价',
  `create_date` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `updata_date` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `status` varchar(255) DEFAULT NULL COMMENT '1购物车，2订单',
  PRIMARY KEY (`buycar_id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_buycar
-- ----------------------------
INSERT INTO `book_buycar` VALUES ('1', '29', '18', '12', '252.45001', '2019-07-02 16:07:56', null, null, '2');
INSERT INTO `book_buycar` VALUES ('15', '29', '20', '3', '26.88', '2019-07-02 19:17:29', null, null, '2');
INSERT INTO `book_buycar` VALUES ('16', '29', '21', '2', '55.44', '2019-07-02 21:56:49', null, null, '2');
INSERT INTO `book_buycar` VALUES ('18', '29', '22', '1', '14.8', '2019-07-02 22:11:32', null, null, '2');
INSERT INTO `book_buycar` VALUES ('22', '1', '22', '1', '14.8', '2019-07-02 22:47:33', null, null, '2');
INSERT INTO `book_buycar` VALUES ('23', '1', '26', '1', '25.1', '2019-07-02 23:12:03', null, null, '1');
INSERT INTO `book_buycar` VALUES ('24', '1', '24', '1', '17.4', '2019-07-03 00:06:01', null, null, '2');
INSERT INTO `book_buycar` VALUES ('25', '29', '18', '2', '22.95', '2019-07-03 01:16:34', null, null, '2');
INSERT INTO `book_buycar` VALUES ('26', '1', '18', '1', '22.95', '2019-07-03 01:17:45', null, null, '2');
INSERT INTO `book_buycar` VALUES ('27', '1', '18', '1', '22.95', '2019-07-03 01:20:33', null, null, '2');
INSERT INTO `book_buycar` VALUES ('28', '1', '19', '1', '13.44', '2019-07-03 01:20:36', null, null, '2');
INSERT INTO `book_buycar` VALUES ('29', '1', '20', '1', '13.44', '2019-07-03 01:20:39', null, null, '2');
INSERT INTO `book_buycar` VALUES ('30', '29', '19', '1', '13.44', '2019-07-03 02:25:22', null, null, '2');
INSERT INTO `book_buycar` VALUES ('31', '1', '22', '1', '14.8', '2019-07-03 09:41:48', null, null, '2');
INSERT INTO `book_buycar` VALUES ('32', '1', '20', '1', '13.44', '2019-07-03 09:41:51', null, null, '2');
INSERT INTO `book_buycar` VALUES ('33', '1', '21', '1', '55.44', '2019-07-03 09:41:54', null, null, '2');
INSERT INTO `book_buycar` VALUES ('34', '1', '19', '1', '13.44', '2019-07-03 09:43:33', null, null, '2');
INSERT INTO `book_buycar` VALUES ('36', '36', '21', '1', '55.44', '2019-07-03 09:56:54', null, null, '2');
INSERT INTO `book_buycar` VALUES ('37', '36', '22', '1', '14.8', '2019-07-03 09:56:57', null, null, '2');
INSERT INTO `book_buycar` VALUES ('38', '36', '20', '1', '13.44', '2019-07-03 09:57:00', null, null, '2');
INSERT INTO `book_buycar` VALUES ('39', '38', '18', '1', '22.95', '2019-07-03 11:09:46', null, null, '2');
INSERT INTO `book_buycar` VALUES ('40', '38', '19', '1', '13.44', '2019-07-03 11:09:48', null, null, '2');
INSERT INTO `book_buycar` VALUES ('41', '1', '20', '3', '26.88', '2019-07-25 17:36:04', null, null, '2');
INSERT INTO `book_buycar` VALUES ('42', '1', '21', '1', '55.44', '2019-07-25 18:02:03', null, null, '2');
INSERT INTO `book_buycar` VALUES ('43', '1', '18', '1', '22.95', '2019-10-08 20:25:54', null, null, '1');

-- ----------------------------
-- Table structure for book_detail
-- ----------------------------
DROP TABLE IF EXISTS `book_detail`;
CREATE TABLE `book_detail` (
  `bookID` int(11) NOT NULL AUTO_INCREMENT COMMENT '书ID',
  `bookName` varchar(255) DEFAULT NULL COMMENT '书名',
  `author` varchar(255) DEFAULT NULL COMMENT '作者',
  `content` varchar(255) DEFAULT NULL COMMENT '内容',
  `price` varchar(255) DEFAULT NULL COMMENT '单价',
  `discount` varchar(255) DEFAULT NULL COMMENT '总页数',
  `bookTypeID` varchar(255) DEFAULT NULL COMMENT '书的类型',
  `book_upload_id` varchar(25) DEFAULT NULL COMMENT '图片id',
  PRIMARY KEY (`bookID`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_detail
-- ----------------------------
INSERT INTO `book_detail` VALUES ('18', '子夜典藏版', '茅盾', '《子夜》，原名《夕阳》，中国现代长篇小说，约30万字。茅盾于1931年10月开始创作，至1932年12月5日完稿，共十九章。有些章节分别在《小说月报》和《文学月报》上发表过。半个多世纪以来，《子夜》不仅在中国拥有广泛的读者，且被译成英、德、俄、日等十几种文字，产生了广泛的国际影响。', '22.95', '234', '25', '24');
INSERT INTO `book_detail` VALUES ('19', '骆驼祥子', '老舍', '《骆驼祥子》 [1]  是老舍的代表作之一，以现实主义的笔法与悲天悯人的情怀，塑造了祥子、虎妞等一批令人难忘的艺术形象，在中国现代文学历史上拥有重要地位。', '13.44', '327', '25', '25');
INSERT INTO `book_detail` VALUES ('20', '城南旧事', '林海音', '《城南旧事》是台湾女作家林海音的代表作。该作品通过英子童稚的双眼对童年往事的回忆，讲述了一段关于英子童年时的故事，反映了作者对童年的怀念和对北京城南的思念。', '13.44', '221', '25', '26');
INSERT INTO `book_detail` VALUES ('21', '吉尔伽美什', '佚名', '《吉尔伽美什史诗》 [1]  （又称基尔麦什史诗）（The Epic of Gilgamesh）是目前已知世界最古老的英雄史诗。 [1]  早在四千多年前就已在苏美尔人（Sumerian）中流传，经过千百年的加工提炼，终于在古巴比伦王国时期（公元前19世纪-前16世纪）用文字形式流传下来', '55.44', '652', '25', '27');
INSERT INTO `book_detail` VALUES ('22', '斗破苍穹', '土豆', '该剧讲述了少年萧炎在创造了家族修炼纪录后却接受了种种打击，在经过药老的悉心教导后，联手萧薰儿共同战胜强敌的故事。', '14.8', '1034', '1', '28');
INSERT INTO `book_detail` VALUES ('23', '斗罗大陆', '唐三', '《斗罗大陆》是唐家三少创作的一部穿越玄幻类型的网络小说，小说首发连载于起点中文网，2008年12月14日首发，2009年12月13日完结。 [1]  实体书首版于2009年5月 [2]  ，讲述的是穿越到斗罗大陆的唐三如何一步步修炼武魂，由人修炼为神，最终铲除了斗罗大陆上的邪恶力量，报了杀母之仇，成为斗罗大陆最强者的故事 [3]  。主要角色有唐三、小舞、戴沐白等。', '22.6', '973', '2', '29');
INSERT INTO `book_detail` VALUES ('24', '星辰变', '西红柿', '游戏剧本改编自起点小说《星辰变》，游戏中的剧情主线按照小说剧情发展，设计有蓝央、炎魔、赤阳、血魔、清虚、阴月六大职业，玩家可以在游戏中创建属于自己的角色，通过完成剧情主线任务来强化自己的角色。', '17.4', '3562', '2', '30');

-- ----------------------------
-- Table structure for book_order
-- ----------------------------
DROP TABLE IF EXISTS `book_order`;
CREATE TABLE `book_order` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `book_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL COMMENT '顾客ID',
  `price` varchar(255) DEFAULT NULL COMMENT '单价',
  `order_quantity` varchar(255) DEFAULT NULL COMMENT '购买数量',
  `total_price` varchar(11) DEFAULT NULL COMMENT '总价',
  `create_date` varchar(255) DEFAULT NULL COMMENT '下单时间,创建时间',
  `update_date` varchar(255) DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_order
-- ----------------------------
INSERT INTO `book_order` VALUES ('24', '22', '29', '14.8', '1', '14.8', '2019-07-03 01:11:20', null, null);
INSERT INTO `book_order` VALUES ('25', '22', '1', '14.8', '1', '14.8', '2019-07-03 01:18:45', null, null);
INSERT INTO `book_order` VALUES ('26', '18', '1', '22.95', '2', '45.9', '2019-07-03 01:18:45', null, null);
INSERT INTO `book_order` VALUES ('27', '24', '1', '17.4', '1', '17.4', '2019-07-03 01:18:45', null, null);
INSERT INTO `book_order` VALUES ('28', '19', '1', '13.44', '1', '13.44', '2019-07-03 01:20:56', null, null);
INSERT INTO `book_order` VALUES ('29', '20', '1', '13.44', '2', '26.88', '2019-07-03 01:20:56', null, null);
INSERT INTO `book_order` VALUES ('30', '18', '1', '22.95', '2', '45.9', '2019-07-03 01:20:56', null, null);
INSERT INTO `book_order` VALUES ('31', '18', '29', '22.95', '2', '45.9', '2019-07-03 02:25:59', null, null);
INSERT INTO `book_order` VALUES ('32', '19', '29', '13.44', '2', '26.88', '2019-07-03 02:25:59', null, null);
INSERT INTO `book_order` VALUES ('34', '21', '1', '55.44', '1', '55.44', '2019-07-03 09:42:00', null, null);
INSERT INTO `book_order` VALUES ('35', '22', '1', '14.8', '1', '14.8', '2019-07-03 09:42:00', null, null);
INSERT INTO `book_order` VALUES ('36', '21', '1', '55.44', '1', '55.44', '2019-07-03 09:42:06', null, null);
INSERT INTO `book_order` VALUES ('37', '22', '1', '14.8', '1', '14.8', '2019-07-03 09:42:06', null, null);
INSERT INTO `book_order` VALUES ('38', '19', '1', '13.44', '2', '26.88', '2019-07-03 09:44:30', null, null);
INSERT INTO `book_order` VALUES ('39', '20', '36', '13.44', '3', '40.32', '2019-07-03 09:57:17', null, null);
INSERT INTO `book_order` VALUES ('40', '22', '36', '14.8', '1', '14.8', '2019-07-03 09:57:17', null, null);
INSERT INTO `book_order` VALUES ('41', '21', '36', '55.44', '1', '55.44', '2019-07-03 09:57:17', null, null);
INSERT INTO `book_order` VALUES ('42', '19', '38', '13.44', '1', '13.44', '2019-07-03 11:10:39', null, null);
INSERT INTO `book_order` VALUES ('43', '18', '38', '22.95', '4', '91.8', '2019-07-03 11:10:39', null, null);
INSERT INTO `book_order` VALUES ('44', null, '1', '55.44', '1', '55.44', '2019-07-25 18:11:41', null, null);
INSERT INTO `book_order` VALUES ('45', null, '1', '13.44', '3', '26.88', '2019-07-25 18:11:41', null, null);

-- ----------------------------
-- Table structure for book_orderDetail
-- ----------------------------
DROP TABLE IF EXISTS `book_orderDetail`;
CREATE TABLE `book_orderDetail` (
  `order_detail_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单详情ID',
  `order_quantity` int(11) DEFAULT NULL COMMENT '订单商品个数',
  `send_status` varchar(255) DEFAULT NULL COMMENT '订单邮寄状态',
  `order_id` int(11) DEFAULT NULL COMMENT '订单ID',
  `create_data` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `update_data` varchar(255) DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`order_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_orderDetail
-- ----------------------------

-- ----------------------------
-- Table structure for book_type
-- ----------------------------
DROP TABLE IF EXISTS `book_type`;
CREATE TABLE `book_type` (
  `typeID` int(10) NOT NULL AUTO_INCREMENT,
  `typeName` varchar(250) DEFAULT NULL COMMENT '类型名称',
  `create_data` varchar(250) DEFAULT NULL COMMENT '创建时间',
  `updata_data` varchar(250) DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(250) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`typeID`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_type
-- ----------------------------
INSERT INTO `book_type` VALUES ('1', '玄幻', '2019-06-20 16:12:49', null, null);
INSERT INTO `book_type` VALUES ('2', '修真', '2019-06-20 20:26:47', '2019-06-26 15:08:38', null);
INSERT INTO `book_type` VALUES ('3', '都市', '2019-06-20 21:13:30', null, null);
INSERT INTO `book_type` VALUES ('25', '文艺', '2019-06-30 17:04:42', null, null);

-- ----------------------------
-- Table structure for book_upload
-- ----------------------------
DROP TABLE IF EXISTS `book_upload`;
CREATE TABLE `book_upload` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `original_filename` varchar(255) DEFAULT NULL COMMENT '文件名和后缀名',
  `original_name` varchar(255) DEFAULT NULL COMMENT '原文件名',
  `prefix` varchar(255) DEFAULT NULL COMMENT '文件后缀名',
  `rename_filename` varchar(255) DEFAULT NULL COMMENT '重命名文件名和后缀',
  `rename_name` varchar(255) DEFAULT NULL COMMENT '重命名文件名',
  `file_path` varchar(255) DEFAULT NULL COMMENT '上传的路径',
  `create_data` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `update_data` varchar(255) DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `relative_path` varchar(255) DEFAULT NULL COMMENT '相对路径，前台显示',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_upload
-- ----------------------------
INSERT INTO `book_upload` VALUES ('1', 'u=736475875,3767464021&fm=15&gp=0.jpg', null, 'jpg', '20190626102436.jpg', '20190626102436', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-26 10:24:36', null, null, null);
INSERT INTO `book_upload` VALUES ('2', 'u=736475875,3767464021&fm=15&gp=0.jpg', null, 'jpg', '20190626102919.jpg', '20190626102919', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-26 10:29:19', null, null, null);
INSERT INTO `book_upload` VALUES ('3', 'u=736475875,3767464021&fm=15&gp=0.jpg', null, 'jpg', '20190626102951.jpg', '20190626102951', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-26 10:29:51', null, null, null);
INSERT INTO `book_upload` VALUES ('4', 'u=736475875,3767464021&fm=15&gp=0.jpg', null, 'jpg', '20190626103201.jpg', '20190626103201', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-26 10:32:01', null, null, null);
INSERT INTO `book_upload` VALUES ('5', 'u=736475875,3767464021&fm=15&gp=0.jpg', null, 'jpg', '20190626103253.jpg', '20190626103253', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-26 10:32:53', null, null, null);
INSERT INTO `book_upload` VALUES ('6', 'u=736475875,3767464021&fm=15&gp=0.jpg', null, 'jpg', '20190626104239.jpg', '20190626104239', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-26 10:42:39', null, null, null);
INSERT INTO `book_upload` VALUES ('7', 'u=736475875,3767464021&fm=15&gp=0.jpg', null, 'jpg', '20190626105031.jpg', '20190626105031', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-26 10:50:31', null, null, null);
INSERT INTO `book_upload` VALUES ('8', 'book.jpg', null, 'jpg', '20190630170428.jpg', '20190630170428', 'E:\\Idea_workspace\\book_purchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-30 17:04:28', null, null, null);
INSERT INTO `book_upload` VALUES ('9', 'hulan.jpg', null, 'jpg', '20190630171438.jpg', '20190630171438', 'E:\\Idea_workspace\\book_purchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-30 17:14:38', null, null, null);
INSERT INTO `book_upload` VALUES ('10', 'luotuo.jpg', null, 'jpg', '20190630171623.jpg', '20190630171623', 'E:\\Idea_workspace\\book_purchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-30 17:16:23', null, null, null);
INSERT INTO `book_upload` VALUES ('11', 'yimeng.jpg', null, 'jpg', '20190630171814.jpg', '20190630171814', 'E:\\Idea_workspace\\book_purchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-30 17:18:14', null, null, null);
INSERT INTO `book_upload` VALUES ('12', '12.jpg', null, 'jpg', '20190630172523.jpg', '20190630172523', 'E:\\Idea_workspace\\book_purchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-30 17:25:23', null, null, null);
INSERT INTO `book_upload` VALUES ('13', '10.jpg', null, 'jpg', '20190630172724.jpg', '20190630172724', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-30 17:27:24', null, null, null);
INSERT INTO `book_upload` VALUES ('14', '1.jpg', null, 'jpg', '20190630172934.jpg', '20190630172934', 'E:\\Idea_workspace\\book_purchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-30 17:29:34', null, null, null);
INSERT INTO `book_upload` VALUES ('15', '6.jpg', null, 'jpg', '20190630173205.jpg', '20190630173205', 'E:\\Idea_workspace\\book_purchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-30 17:31:55', null, null, null);
INSERT INTO `book_upload` VALUES ('16', '7.jpg', null, 'jpg', '20190630173340.jpg', '20190630173340', 'E:\\Idea_workspace\\book_purchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-30 17:33:09', null, null, null);
INSERT INTO `book_upload` VALUES ('17', '10.jpg', null, 'jpg', '20190630175156.jpg', '20190630175156', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-06-30 17:51:56', null, null, null);
INSERT INTO `book_upload` VALUES ('18', 'yimeng.jpg', null, 'jpg', '20190701001759.jpg', '20190701001759', 'E:\\ideaWorkspace\\bookPurchase\\book_purchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-01 00:17:58', null, null, null);
INSERT INTO `book_upload` VALUES ('19', '10.jpg', null, 'jpg', '20190701001923.jpg', '20190701001923', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-01 00:19:23', null, null, null);
INSERT INTO `book_upload` VALUES ('20', 'luotuo.jpg', null, 'jpg', '20190701002153.jpg', '20190701002153', 'E:\\ideaWorkspace\\bookPurchase\\book_purchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-01 00:21:53', null, null, null);
INSERT INTO `book_upload` VALUES ('21', 'hulan.jpg', null, 'jpg', '20190701002505.jpg', '20190701002505', 'E:\\ideaWorkspace\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-01 00:25:05', null, null, null);
INSERT INTO `book_upload` VALUES ('22', '10.jpg', null, 'jpg', '20190701191613.jpg', '20190701191613', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-01 19:16:13', null, null, null);
INSERT INTO `book_upload` VALUES ('23', '10.jpg', null, 'jpg', '20190701195252.jpg', '20190701195252', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-01 19:52:52', null, null, 'upload/imgs/20190701195252.jpg');
INSERT INTO `book_upload` VALUES ('24', 'ziye.jpg', null, 'jpg', '20190701204311.jpg', '20190701204311', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-01 20:43:11', null, null, 'upload/imgs/20190701204311.jpg');
INSERT INTO `book_upload` VALUES ('25', 'luotuo.jpg', null, 'jpg', '20190701204540.jpg', '20190701204540', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-01 20:45:40', null, null, 'upload/imgs/20190701204540.jpg');
INSERT INTO `book_upload` VALUES ('26', 'chengnan.jpg', null, 'jpg', '20190701204730.jpg', '20190701204730', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-01 20:47:30', null, null, 'upload/imgs/20190701204730.jpg');
INSERT INTO `book_upload` VALUES ('27', 'jier.jpg', null, 'jpg', '20190701204933.jpg', '20190701204933', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-01 20:49:33', null, null, 'upload/imgs/20190701204933.jpg');
INSERT INTO `book_upload` VALUES ('28', 'doupo.jpg', null, 'jpg', '20190701205224.jpg', '20190701205224', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-01 20:52:24', null, null, 'upload/imgs/20190701205224.jpg');
INSERT INTO `book_upload` VALUES ('29', 'dalu.jpg', null, 'jpg', '20190701205341.jpg', '20190701205341', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-01 20:53:41', null, null, 'upload/imgs/20190701205341.jpg');
INSERT INTO `book_upload` VALUES ('30', 'xingchengbian.jpg', null, 'jpg', '20190701205741.jpg', '20190701205741', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-01 20:57:41', null, null, 'upload/imgs/20190701205741.jpg');
INSERT INTO `book_upload` VALUES ('31', 'jianglai.jpg', null, 'jpg', '20190701210000.jpg', '20190701210000', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-01 21:00:00', null, null, 'upload/imgs/20190701210000.jpg');
INSERT INTO `book_upload` VALUES ('32', 'renxin.jpg', null, 'jpg', '20190701210130.jpg', '20190701210130', 'C:\\java\\project\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-01 21:01:30', null, null, 'upload/imgs/20190701210130.jpg');
INSERT INTO `book_upload` VALUES ('33', 'weicheng.jpg', null, 'jpg', '20190702165621.jpg', '20190702165621', 'E:\\ideaWorkspace\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-02 16:56:21', null, null, 'upload/imgs/20190702165621.jpg');
INSERT INTO `book_upload` VALUES ('34', 'daomeng.jpg', null, 'jpg', '20190702224223.jpg', '20190702224223', 'E:\\ideaWorkspace\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-02 22:42:23', null, null, 'upload/imgs/20190702224223.jpg');
INSERT INTO `book_upload` VALUES ('35', '3.jpg', null, 'jpg', '20190702232318.jpg', '20190702232318', 'E:\\ideaWorkspace\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-02 23:23:18', null, null, 'upload/imgs/20190702232318.jpg');
INSERT INTO `book_upload` VALUES ('36', 'weicheng.jpg', null, 'jpg', '20190702232441.jpg', '20190702232441', 'E:\\ideaWorkspace\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-02 23:24:41', null, null, 'upload/imgs/20190702232441.jpg');
INSERT INTO `book_upload` VALUES ('37', 'weicheng.jpg', null, 'jpg', '20190702232604.jpg', '20190702232604', 'E:\\ideaWorkspace\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-02 23:26:04', null, null, 'upload/imgs/20190702232604.jpg');
INSERT INTO `book_upload` VALUES ('38', 'hulan.jpg', null, 'jpg', '20190702232906.jpg', '20190702232906', 'E:\\ideaWorkspace\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-02 23:29:06', null, null, 'upload/imgs/20190702232906.jpg');
INSERT INTO `book_upload` VALUES ('39', 'hulan.jpg', null, 'jpg', '20190703001324.jpg', '20190703001324', 'E:\\ideaWorkspace\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-03 00:13:24', null, null, 'upload/imgs/20190703001324.jpg');
INSERT INTO `book_upload` VALUES ('40', 'weicheng.jpg', null, 'jpg', '20190703100104.jpg', '20190703100104', 'E:\\ideaWorkspace\\bookPurchase\\bookPurchase\\src\\main\\resources\\static\\upload\\imgs', '2019-07-03 10:01:04', null, null, 'upload/imgs/20190703100104.jpg');

-- ----------------------------
-- Table structure for book_user
-- ----------------------------
DROP TABLE IF EXISTS `book_user`;
CREATE TABLE `book_user` (
  `consumerid` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `truename` varchar(255) DEFAULT NULL COMMENT '真实名',
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `birthday` varchar(255) DEFAULT NULL COMMENT '生日',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(255) DEFAULT NULL COMMENT '电话',
  PRIMARY KEY (`consumerid`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_user
-- ----------------------------
INSERT INTO `book_user` VALUES ('1', '李乐', 'joe', 'joe', '男', '1997-11-06', '四川眉山市', '531348946@qq.com', '15397706511');
INSERT INTO `book_user` VALUES ('2', '李乐乐', 'JOEE', 'JOEE', '男', '1997-11-06', '四川成都市', '132321312@qq.com', '123423442');
INSERT INTO `book_user` VALUES ('3', 'Amy', '123', '123123', '男', '2019-06-08', 'US', '78346423@qq.cpm', '12322222233');
INSERT INTO `book_user` VALUES ('10', 'admin', '2222', '123123', '男', '2019-06-22', '四川眉山市', '34737478@qq.com', '12312312312');
INSERT INTO `book_user` VALUES ('26', 'oooo22', 'oooo', 'ooooo22', '女', '2019-06-03', '2222', '2934749@qq.com', '12322324443');
INSERT INTO `book_user` VALUES ('29', 'xlc', 'xlc', '123', '男', '2019-06-03', '8888', '21312@qq.com', '12323551131');
INSERT INTO `book_user` VALUES ('33', '山姆', 'Sam', 'sam', '男', null, null, 'Sam@qq.com', null);
INSERT INTO `book_user` VALUES ('34', '宋树峰', 'ssf', 'ssf', '男', null, null, '2444@qq.com', null);
INSERT INTO `book_user` VALUES ('35', '阿三', '2232', '12321', '男', '2019-07-20', '231231', '2212@qq.com', '13442232216');
INSERT INTO `book_user` VALUES ('38', '宋树峰1', 'ssf2', 'ssf', '男', null, null, '601937316@qq.com', null);
