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
-- Table structure for table `gebruikers`
--

DROP TABLE IF EXISTS `gebruikers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gebruikers` (
  `gebruikersId` int(11) NOT NULL,
  `voornaam` varchar(45) NOT NULL,
  `achternaam` varchar(45) NOT NULL,
  `adres` varchar(45) NOT NULL,
  `telefoonnummer` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `werklocatie` varchar(45) NOT NULL,
  `gebruikersnaam` varchar(45) NOT NULL,
  `wachtwoord` varchar(72) NOT NULL,
  `rechten` int(11) NOT NULL,
  PRIMARY KEY (`gebruikersId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gebruikers`
--

LOCK TABLES `gebruikers` WRITE;
/*!40000 ALTER TABLE `gebruikers` DISABLE KEYS */;
INSERT INTO `gebruikers` VALUES (1,'Jan','Laan','Koenlaan 25','+31612345678','jan.laan@corendon.nl','Amsterdam','Jann','$2a$12$GBVrjPR6N02AXnJ3hmxNVepttCMhdifmfhKCZx99IQ/wX5DJMIZj.',0),(2,'Kees','Jansen','Appelfles 22','+31687654321','kees.jansen@corendon.nl','Alicante','Keess','$2a$12$lZs701qcxV1DfSyqBj4Q5ODYZV2NIhXYlJ62ae.ISKE8tgCaYpca6',2),(3,'Manon','de Jong','Baskade 44','+31656789123','manon.de.jong@corendon.nl','Turkeystan','Manonn','$2a$12$TGJipsX0wFwFL1DgLuJ7QOx42nPsIWWNxT8FmdfH60aWkez6uZtti',1);
/*!40000 ALTER TABLE `gebruikers` ENABLE KEYS */;
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
