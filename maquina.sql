-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: maquina
-- ------------------------------------------------------
-- Server version	5.7.20-log

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
  `id_cafe` int(3) NOT NULL,
  `stock` int(20) NOT NULL,
  PRIMARY KEY (`id_cafe`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cafe`
--

LOCK TABLES `cafe` WRITE;
/*!40000 ALTER TABLE `cafe` DISABLE KEYS */;
/*!40000 ALTER TABLE `cafe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endulzante`
--

DROP TABLE IF EXISTS `endulzante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `endulzante` (
  `id_endulzante` int(3) NOT NULL,
  `stevia` varchar(10) DEFAULT NULL,
  `a_rubia` varchar(10) DEFAULT NULL,
  `a_blanca` varchar(10) DEFAULT NULL,
  `stock` varchar(45) NOT NULL,
  PRIMARY KEY (`id_endulzante`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endulzante`
--

LOCK TABLES `endulzante` WRITE;
/*!40000 ALTER TABLE `endulzante` DISABLE KEYS */;
/*!40000 ALTER TABLE `endulzante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leche`
--

DROP TABLE IF EXISTS `leche`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `leche` (
  `id_leche` int(3) NOT NULL,
  `soya` varchar(10) DEFAULT NULL,
  `descremada` varchar(10) DEFAULT NULL,
  `entera` varchar(10) DEFAULT NULL,
  `almendra` varchar(10) DEFAULT NULL,
  `stock` int(20) NOT NULL,
  PRIMARY KEY (`id_leche`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leche`
--

LOCK TABLES `leche` WRITE;
/*!40000 ALTER TABLE `leche` DISABLE KEYS */;
/*!40000 ALTER TABLE `leche` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_cafe`
--

DROP TABLE IF EXISTS `tipo_cafe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_cafe` (
  `id_tipocafe` int(3) NOT NULL,
  `americano` varchar(10) DEFAULT NULL,
  `espresso` varchar(10) DEFAULT NULL,
  `capuccino` varchar(10) DEFAULT NULL,
  `cortado` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_tipocafe`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_cafe`
--

LOCK TABLES `tipo_cafe` WRITE;
/*!40000 ALTER TABLE `tipo_cafe` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_cafe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vaso`
--

DROP TABLE IF EXISTS `vaso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vaso` (
  `id_vaso` int(3) NOT NULL,
  `grande` varchar(10) DEFAULT NULL,
  `mediano` varchar(10) DEFAULT NULL,
  `chico` varchar(10) DEFAULT NULL,
  `precio` int(5) NOT NULL,
  `stock` int(20) NOT NULL,
  PRIMARY KEY (`id_vaso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vaso`
--

LOCK TABLES `vaso` WRITE;
/*!40000 ALTER TABLE `vaso` DISABLE KEYS */;
/*!40000 ALTER TABLE `vaso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venta` (
  `id_venta` int(6) NOT NULL,
  `tipo_cafe` int(3) DEFAULT NULL,
  `leche` int(3) DEFAULT NULL,
  `endulzante` int(3) DEFAULT NULL,
  `tamaño` int(3) DEFAULT NULL,
  `precio` int(5) DEFAULT NULL,
  PRIMARY KEY (`id_venta`),
  KEY `id_leche_idx` (`leche`),
  KEY `tamaño_idx` (`tamaño`),
  KEY `endulzante_idx` (`endulzante`),
  KEY `tipo_cafe_idx` (`tipo_cafe`),
  CONSTRAINT `endulzante` FOREIGN KEY (`endulzante`) REFERENCES `endulzante` (`id_endulzante`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `leche` FOREIGN KEY (`leche`) REFERENCES `leche` (`id_leche`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `tamaño` FOREIGN KEY (`tamaño`) REFERENCES `vaso` (`id_vaso`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `tipo_cafe` FOREIGN KEY (`tipo_cafe`) REFERENCES `tipo_cafe` (`id_tipocafe`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
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

-- Dump completed on 2017-12-14 22:58:03
