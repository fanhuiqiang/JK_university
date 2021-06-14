CREATE DATABASE `e_commerce` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `commodity_table` (
  `CommodityCode` varchar(20) NOT NULL,
  `CommodityName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CommodityCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `order_table` (
  `OrderCode` varchar(30) NOT NULL,
  `OrderName` varchar(100) DEFAULT NULL,
  `UserCode` varchar(10) DEFAULT NULL,
  `CommodityCode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`OrderCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `user_table` (
  `UserCode` varchar(10) NOT NULL,
  `UserName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`UserCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci