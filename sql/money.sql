DROP TABLE IF EXISTS `money`;
CREATE TABLE `money`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT 'users 表 id',
  `money` decimal(10, 2) NULL DEFAULT 0.00 COMMENT 'money',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of money
-- ----------------------------
INSERT INTO `money` VALUES (1, 1, 100.00);
INSERT INTO `money` VALUES (2, 2, 100.00);

