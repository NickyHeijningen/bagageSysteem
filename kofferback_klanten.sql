-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: kofferback
-- ------------------------------------------------------
-- Server version	5.7.16-log

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
-- Table structure for table `klanten`
--

DROP TABLE IF EXISTS `klanten`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `klanten` (
  `klantId` int(11) NOT NULL AUTO_INCREMENT,
  `voornaam` varchar(45) NOT NULL,
  `achternaam` varchar(45) NOT NULL,
  `telefoonnummer` varchar(45) NOT NULL,
  `geboortedatum` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `adres` varchar(45) NOT NULL,
  `woonplaats` varchar(45) NOT NULL,
  `postcode` varchar(45) NOT NULL,
  `land` varchar(45) NOT NULL,
  PRIMARY KEY (`klantId`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `klanten`
--

LOCK TABLES `klanten` WRITE;
/*!40000 ALTER TABLE `klanten` DISABLE KEYS */;
INSERT INTO `klanten` VALUES (1,'Henk','Braas','+31229514869','1995-12-13','henk.braas@hotmail.com','Bouwsteen 1','Hoorn','1624HK','The Netherlands'),(2,'John','Fransen','+29612345678','1976-01-23','john.fransen@gmail.com','Damrak 3','Amsterdam','1522GJ','The Netherlands'),(3,'Julie','Jones','+43698765432','1966-05-17','julie.jones@outlook.com','7th Ave 8','New York, NY','2953','United States of America'),(11,'ggg','gg','gg','gg','ggg','gg','gg','gg','gggg'),(12,'aaaa','aa','aaaa','a','aa','aa','aa','a','aaa'),(13,'sdasds','dsa','dssda','adsad','sds','dasa','dsdsd','d','ddddd'),(14,'a','aa','aa','aa','aaa','a','aa','aa','aa'),(15,'a','aa','aa','aa','aaa','a','aa','aa','aa');
/*!40000 ALTER TABLE `klanten` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-08 16:05:29
