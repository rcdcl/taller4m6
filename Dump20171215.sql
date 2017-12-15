CREATE DATABASE  IF NOT EXISTS `cafe` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `cafe`;
-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: cafe
-- ------------------------------------------------------
-- Server version	5.7.20

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
-- Table structure for table `cafe`
--

DROP TABLE IF EXISTS `cafe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cafe` (
  `id_coffe` int(11) NOT NULL AUTO_INCREMENT,
  `cafe` varchar(45) NOT NULL,
  `stock_c` int(11) NOT NULL,
  PRIMARY KEY (`id_coffe`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cafe`
--

LOCK TABLES `cafe` WRITE;
/*!40000 ALTER TABLE `cafe` DISABLE KEYS */;
INSERT INTO `cafe` VALUES (1,'cafe',0);
/*!40000 ALTER TABLE `cafe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endulzante`
--

DROP TABLE IF EXISTS `endulzante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `endulzante` (
  `id_end` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_end` varchar(45) NOT NULL,
  `stock_end` int(11) NOT NULL,
  PRIMARY KEY (`id_end`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endulzante`
--

LOCK TABLES `endulzante` WRITE;
/*!40000 ALTER TABLE `endulzante` DISABLE KEYS */;
INSERT INTO `endulzante` VALUES (1,'blanca',0),(2,'rubia',0),(3,'stevia',0),(4,'sin_end',0);
/*!40000 ALTER TABLE `endulzante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leche`
--

DROP TABLE IF EXISTS `leche`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `leche` (
  `id_leche` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_leche` varchar(45) NOT NULL,
  `stock_leche` int(11) NOT NULL,
  PRIMARY KEY (`id_leche`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leche`
--

LOCK TABLES `leche` WRITE;
/*!40000 ALTER TABLE `leche` DISABLE KEYS */;
INSERT INTO `leche` VALUES (1,'entera',0),(2,'descremada',0),(3,'soya',0),(4,'almendra',0),(5,'sin_leche',0);
/*!40000 ALTER TABLE `leche` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_cafe`
--

DROP TABLE IF EXISTS `tipo_cafe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_cafe` (
  `id_cafe` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id_cafe`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_cafe`
--

LOCK TABLES `tipo_cafe` WRITE;
/*!40000 ALTER TABLE `tipo_cafe` DISABLE KEYS */;
INSERT INTO `tipo_cafe` VALUES (1,'espresso'),(2,'americano'),(3,'capuccino'),(4,'cortado');
/*!40000 ALTER TABLE `tipo_cafe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vaso`
--

DROP TABLE IF EXISTS `vaso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vaso` (
  `id_vaso` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_vaso` varchar(45) NOT NULL,
  `stock_vaso` int(11) NOT NULL,
  PRIMARY KEY (`id_vaso`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vaso`
--

LOCK TABLES `vaso` WRITE;
/*!40000 ALTER TABLE `vaso` DISABLE KEYS */;
INSERT INTO `vaso` VALUES (1,'chico',0),(2,'mediano',0),(3,'grande',0);
/*!40000 ALTER TABLE `vaso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venta` (
  `id_venta` int(11) NOT NULL AUTO_INCREMENT,
  `ext_end` tinyint(4) NOT NULL,
  `descuento` tinyint(4) NOT NULL,
  `id_cafe` int(11) NOT NULL,
  `id_coffe` int(11) NOT NULL,
  `id_end` int(11) NOT NULL,
  `id_leche` int(11) NOT NULL,
  `id_vaso` int(11) NOT NULL,
  `valor_venta` int(11) NOT NULL,
  PRIMARY KEY (`id_venta`),
  KEY `fk_venta_tipo_cafe_idx` (`id_cafe`),
  KEY `fk_venta_cafe1_idx` (`id_coffe`),
  KEY `fk_venta_endulzante1_idx` (`id_end`),
  KEY `fk_venta_leche1_idx` (`id_leche`),
  KEY `fk_venta_vaso1_idx` (`id_vaso`),
  CONSTRAINT `fk_venta_cafe1` FOREIGN KEY (`id_coffe`) REFERENCES `cafe` (`id_coffe`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_venta_endulzante1` FOREIGN KEY (`id_end`) REFERENCES `endulzante` (`id_end`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_venta_leche1` FOREIGN KEY (`id_leche`) REFERENCES `leche` (`id_leche`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_venta_tipo_cafe` FOREIGN KEY (`id_cafe`) REFERENCES `tipo_cafe` (`id_cafe`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_venta_vaso1` FOREIGN KEY (`id_vaso`) REFERENCES `vaso` (`id_vaso`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES (1,1,1,2,1,2,5,3,2000),(2,0,1,3,1,1,1,2,1500);
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-15 10:33:37
