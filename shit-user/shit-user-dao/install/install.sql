-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(40) NOT NULL,
  `password` varchar(255) NOT NULL,
  `age` int(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', '698d51a19d8a121ce581499d7b701668', '24');
INSERT INTO `t_user` VALUES ('2', 'test', '698d51a19d8a121ce581499d7b701668', '16');
INSERT INTO `t_user` VALUES ('3', 'long', '698d51a19d8a121ce581499d7b701668', '12');