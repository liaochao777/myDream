create database test;

use test;

begin transaction;

-- ----------------------------
-- Table structure for test_batch
-- ----------------------------
DROP TABLE IF EXISTS `test_batch`;
CREATE TABLE `test_batch` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_batch
-- ----------------------------
INSERT INTO `test_batch` VALUES ('admin', 'testpass');
INSERT INTO `test_batch` VALUES ('admin', 'testpass');
INSERT INTO `test_batch` VALUES ('admin', 'testpass');
INSERT INTO `test_batch` VALUES ('admin', 'testpass');
INSERT INTO `test_batch` VALUES ('admin', 'testpass');
INSERT INTO `test_batch` VALUES ('admin', 'testpass');
INSERT INTO `test_batch` VALUES ('admin', 'testpass');
INSERT INTO `test_batch` VALUES ('admin', 'testpass');
INSERT INTO `test_batch` VALUES ('admin', 'testpass');
INSERT INTO `test_batch` VALUES ('admin', 'testpass');
INSERT INTO `test_batch` VALUES ('admin', 'testpass');
INSERT INTO `test_batch` VALUES ('admin', 'testpass');
INSERT INTO `test_batch` VALUES ('admin', 'testpass');
INSERT INTO `test_batch` VALUES ('admin', 'testpass');


commit;
