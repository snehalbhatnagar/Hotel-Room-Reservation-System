-- MySQL dump 10.13  Distrib 5.1.73, for Win32 (ia32)
--
-- Host: localhost    Database: Hotel_Topsky
-- ------------------------------------------------------
-- Server version	5.1.73-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `double_suite`
--

DROP TABLE IF EXISTS `double_suite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `double_suite` (
  `BOOKING_ID` varchar(6) NOT NULL,
  `GUEST_NAME` varchar(30) NOT NULL,
  `PHONE` varchar(10) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `PAN_NUMBER` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`BOOKING_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `double_suite`
--

LOCK TABLES `double_suite` WRITE;
/*!40000 ALTER TABLE `double_suite` DISABLE KEYS */;
INSERT INTO `double_suite` VALUES ('DS0001','HC VERMA','9641239034','hcverma@gmail.com','FS17535190');
/*!40000 ALTER TABLE `double_suite` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `executive`
--

DROP TABLE IF EXISTS `executive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `executive` (
  `BOOKING_ID` varchar(6) NOT NULL,
  `GUEST_NAME` varchar(30) NOT NULL,
  `PHONE` varchar(10) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `PAN_NUMBER` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`BOOKING_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `executive`
--

LOCK TABLES `executive` WRITE;
/*!40000 ALTER TABLE `executive` DISABLE KEYS */;
INSERT INTO `executive` VALUES ('EX0001','BM SHARMA','9812347645','bmsharma@gmail.com','QN56120945');
/*!40000 ALTER TABLE `executive` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gym`
--

DROP TABLE IF EXISTS `gym`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gym` (
  `Booking_ID` varchar(6) DEFAULT NULL,
  `Guest_Name` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gym`
--

LOCK TABLES `gym` WRITE;
/*!40000 ALTER TABLE `gym` DISABLE KEYS */;
INSERT INTO `gym` VALUES ('null','null');
/*!40000 ALTER TABLE `gym` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ocean_view`
--

DROP TABLE IF EXISTS `ocean_view`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ocean_view` (
  `BOOKING_ID` varchar(6) NOT NULL,
  `GUEST_NAME` varchar(30) NOT NULL,
  `PHONE` varchar(10) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `PAN_NUMBER` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`BOOKING_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ocean_view`
--

LOCK TABLES `ocean_view` WRITE;
/*!40000 ALTER TABLE `ocean_view` DISABLE KEYS */;
INSERT INTO `ocean_view` VALUES ('OV0002','DGFDG','7767545667','GFHJYUTYU','YYYYYYYYYY'),('OV0003','DGFDG','7767545667','GFHJYUTYU','YYYYYYYYYY'),('OV0004','DGFDG','7767545667','GFHJYUTYU','YYYYYYYYYY'),('OV0006','RESHMA PATIL','8809567883','rpatil@yahoo.com','YYYTTRRRRR'),('OV0007','RESHMA PATIL','8809567883','rpatil@yahoo.com','YYYTTRRRRR'),('OV0008','RESHMA PATIL','8809567883','rpatil@yahoo.com','YYYTTRRRRR'),('OV0010','dfhzfr','7768976445','dfgzdrgf','DDDDDDDDDD'),('OV0011','dfhzfr','7768976445','dfgzdrgf','DDDDDDDDDD'),('OV0012','gvre','9989765445','dvgfrf','UUUYYYYYYY'),('OV0013','ugrr','7767589004','gxhntgfh','TTTTRRTRTE'),('OV0014','sdfsdf','7787907665','sfedtgfret','HHHHHHHGGH');
/*!40000 ALTER TABLE `ocean_view` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pool`
--

DROP TABLE IF EXISTS `pool`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pool` (
  `Booking_ID` varchar(6) DEFAULT NULL,
  `Guest_Name` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pool`
--

LOCK TABLES `pool` WRITE;
/*!40000 ALTER TABLE `pool` DISABLE KEYS */;
INSERT INTO `pool` VALUES ('null','null');
/*!40000 ALTER TABLE `pool` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room_type`
--

DROP TABLE IF EXISTS `room_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room_type` (
  `SNO` int(2) DEFAULT NULL,
  `ROOM_TYPE` varchar(30) DEFAULT NULL,
  `PRICE_PER_NIGHT` int(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_type`
--

LOCK TABLES `room_type` WRITE;
/*!40000 ALTER TABLE `room_type` DISABLE KEYS */;
INSERT INTO `room_type` VALUES (1,'OCEAN VIEW',7000),(2,'DOUBLE SUITE',5000),(3,'EXECUTIVE',3000),(4,'SINGLE',2000);
/*!40000 ALTER TABLE `room_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `services`
--

DROP TABLE IF EXISTS `services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `services` (
  `SERVICE` varchar(20) DEFAULT NULL,
  `RATE` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `services`
--

LOCK TABLES `services` WRITE;
/*!40000 ALTER TABLE `services` DISABLE KEYS */;
INSERT INTO `services` VALUES ('SPA',3000),('GYM',1500),('POOL',500);
/*!40000 ALTER TABLE `services` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `single`
--

DROP TABLE IF EXISTS `single`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `single` (
  `BOOKING_ID` varchar(6) NOT NULL,
  `GUEST_NAME` varchar(30) NOT NULL,
  `PHONE` varchar(10) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `PAN_NUMBER` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`BOOKING_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `single`
--

LOCK TABLES `single` WRITE;
/*!40000 ALTER TABLE `single` DISABLE KEYS */;
INSERT INTO `single` VALUES ('SG0001','DC PANDEY','9512309679','dcpandey@gmail.com','PK78231560');
/*!40000 ALTER TABLE `single` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `spa`
--

DROP TABLE IF EXISTS `spa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `spa` (
  `booking_id` varchar(6) NOT NULL,
  `guest_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`booking_id`),
  CONSTRAINT `spa_ibfk_1` FOREIGN KEY (`booking_id`) REFERENCES `ocean_view` (`BOOKING_ID`) ON DELETE CASCADE,
  CONSTRAINT `spa_ibfk_2` FOREIGN KEY (`booking_id`) REFERENCES `ocean_view` (`BOOKING_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `spa`
--

LOCK TABLES `spa` WRITE;
/*!40000 ALTER TABLE `spa` DISABLE KEYS */;
/*!40000 ALTER TABLE `spa` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-17 12:52:41
