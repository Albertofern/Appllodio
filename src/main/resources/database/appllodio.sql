-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: appllodio
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.13-MariaDB

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
-- Table structure for table `barrio`
--

DROP TABLE IF EXISTS `barrio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `barrio` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `barrio`
--

LOCK TABLES `barrio` WRITE;
/*!40000 ALTER TABLE `barrio` DISABLE KEYS */;
INSERT INTO `barrio` VALUES (1,'ugarte'),(2,'areta'),(3,'latiorro'),(4,'landaluce'),(5,'gardea'),(6,'larraño'),(7,'zona centro');
/*!40000 ALTER TABLE `barrio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contacto`
--

DROP TABLE IF EXISTS `contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contacto` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `ambito` varchar(50) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contacto`
--

LOCK TABLES `contacto` WRITE;
/*!40000 ALTER TABLE `contacto` DISABLE KEYS */;
INSERT INTO `contacto` VALUES (1,'Ertzaintza','Emergencias','944063860'),(2,'Policía municipal','Emergencias','944034888'),(3,'Bomberos de Ayala','Emergencias','946726565'),(4,'Consultorio médico','Servicios médicos','946007480'),(5,'Cruz Roja','Servicios médicos','946726458'),(6,'Hospital de Santiago Apóstol','Servicios médicos','945007600'),(7,'Hospital de Txagorritxu','Servicios médicos','945007000'),(8,'Hospital de Leza','Servicios médicos','945006900'),(9,'Hospital Psiquiátrico de Álava','Servicios médicos','945006555'),(10,'Clínica Álava','Servicios médicos','945142100'),(11,'Policlínico San José','Servicios médicos','945140900'),(12,'DYA','Servicios médicos','945281020'),(13,'Urgencias médicas','Servicios médicos','945244444'),(14,'Asociación de Donantes de Sangre','Servicios médicos','945260977'),(15,'Banco de Sangre de Araba','Servicios médicos','945007627'),(16,'Acogida a la Vida','Servicios de apoyo social','945271619'),(17,'Alcohólicos Anónimos','Servicios de apoyo social','945250417'),(18,'Cáritas','Servicios de apoyo social','946721797'),(19,'Denuncias publicidad sexista','Servicios de apoyo social','900191010'),(20,'Drogodependencias','Servicios de apoyo social','902471818'),(21,'Información sobre el SIDA','Servicios de apoyo social','945257766'),(22,'Madres y padres separados','Servicios de apoyo social','945259831'),(23,'Maltrato infantil','Servicios de apoyo social','900202010'),(24,'Mujeres maltratadas','Servicios de apoyo social','945134444'),(25,'Prevención de la ludopatía','Servicios de apoyo social','945140468'),(26,'Proyecto Hombre','Servicios de apoyo social','945143720'),(27,'Sartu','Servicios de apoyo social','946727773'),(28,'Teléfono de la Esperanza','Servicios de apoyo social','945147014'),(29,'Teléfono Dorado','Servicios de apoyo social','900222223'),(30,'Aeropuerto de Foronda','Transportes','945163518'),(31,'Aeropuerto de Loiu','Transportes','944869301'),(32,'Renfe','Transportes','902240202'),(33,'Bizkaibus','Transportes','944484080'),(34,'Ayuntamiento de Laudio/Llodio','Administraciones públicas','944034800'),(35,'Diputación Foral de Álava','Administraciones públicas','945181818'),(36,'Diputación Foral de Bizkaia','Administraciones públicas','944208000'),(37,'Delegación de Hacienda','Administraciones públicas','946725483'),(38,'Gobierno Vasco','Administraciones públicas','945018000'),(39,'CEP Lamuza','Centros educativos','946720226'),(40,'CEP Latiorro','Centros educativos','946721874'),(41,'CEP Fabian Legorburu','Centros educativos','946722001'),(42,'Colegio La Milagrosa','Centros educativos','946720701'),(43,'Laudio Ikastola','Centros educativos','946726737'),(44,'Laudio Institutua Behekoa','Centros educativos','946720086'),(45,'Laudio Institutua Goikoa','Centros educativos','946721870'),(46,'Centro Municipal de Formación Profesional','Centros educativos','946720505'),(47,'CEPA Laudio','Centros educativos','946721734'),(48,'Haurreskola Matxintxu','Centros educativos','944049543'),(49,'Casa de Cultura','Otros','944034920'),(50,'Gazteleku','Otros','94 038583'),(51,'Oficina de Turismo','Otros','944034930'),(52,'Servicio de Aguas - Aqualia','Otros','911779121'),(53,'Archivo municipal','Otros','946726051'),(54,'Correos y Telégrafos','Otros','946720041'),(55,'Tanatorio Alto Nervión','Otros','946727750'),(56,'INEM','Otros','646720047'),(57,'Langai','Otros','901222901'),(58,'KZGunea','Otros','946728397');
/*!40000 ALTER TABLE `contacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fiesta`
--

DROP TABLE IF EXISTS `fiesta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fiesta` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `descripcion` text NOT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fiesta`
--

LOCK TABLES `fiesta` WRITE;
/*!40000 ALTER TABLE `fiesta` DISABLE KEYS */;
INSERT INTO `fiesta` VALUES (1,'Feria de San Blas','Sábado anterior o coincidente con el 3 de febrero. Importante Feria que gira en torno al caserío especialmente relacionada con la matanza del cerdo. Exposición de productos del caserío y de artesanía. Concurso gastronómico de patas de cerdo.','2017-02-03'),(2,'Viernes de Dolores','De gran tradición para los llodianos, se realiza el viernes anterior al inicio de la Semana Santa. Importante Feria Exposición de ganado vacuno, equino y ovino. Importante prueba de arrastre de piedra con bueyes. Se puede considerar una de las fiestas más importantes de la comarca.','2017-03-23'),(3,'Santa Agueda','Se celebra el segundo día de Pascua Resurrección en la ermita de María Magdalena en Larraño, al pie de Luja.','2017-04-18'),(4,'San Prudencio','Patrono de Alava, el día 28 de abril. Tamborrada y Concurso de Caracoles.','2017-04-28'),(5,'Santa Cruz','3 de mayo en el barrio de Gardea','2017-05-03'),(6,'Santa Lucía','El segundo día de Pascua de Pentecostés o siete semanas después de Resurrección. Importante romería que se celebra en la campa existente junto a la ermita en el entorno de Santa María del Yermo.','2017-06-03'),(7,'San Antonio','El 13 de junio. Su ermita está dedicada también a la advocación de Santa Apolonia.','2017-06-13'),(8,'San Juan','El 24 de junio en el barrio de Larrazabal.','2017-06-24'),(9,'Santa Ana','El 26 de julio, en el barrio de Areta.','2017-07-26'),(10,'San Ignacio','El 31 de julio, en el barrio de Ugarte','2017-07-31'),(11,'San Roke','Patrono del Valle de Llodio. Las fiestas en su honor comienzan el 15 de agosto, la Asunción, y se extienden hasta el último domingo del mes, día en el que se celebra, desde 1599, la comida de hermandad de los cofrades de San Roke. La víspera se celebra la popular fiesta llamada “Día de las morcillas”.','2017-08-15'),(12,'San Bartolomé','En la ermita del santo en Larra, el 24 de agosto.','2017-08-24'),(13,'Latiorroko Jaiak','Fiestas de este populoso barrio de Llodio, a mediados de septiembre.','2017-09-14');
/*!40000 ALTER TABLE `fiesta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `restaurante`
--

DROP TABLE IF EXISTS `restaurante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `restaurante` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `numero` varchar(3) DEFAULT 'S/N',
  `telefono` varchar(9) NOT NULL,
  `documento` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurante`
--

LOCK TABLES `restaurante` WRITE;
/*!40000 ALTER TABLE `restaurante` DISABLE KEYS */;
INSERT INTO `restaurante` VALUES (0,'carnavales','dr. fleming','3','688810557',''),(1,'balintxareketa','malkuartu bidea','1','946724350',''),(2,'palacio anuncibai','vitoria','','946726188',''),(3,'telepizza','zumalacarregui','15','944030456',''),(4,'Karrika','poligono industrialdea','4','946728207',''),(5,'batzoki llodio','plaza alberto acero','12','946034000',''),(6,'paraiso chino','virgen del carmen','31','946726517',''),(7,'capucci katua','zubiko kurajo','7','946559953',''),(8,'el tunel','vitoria','5','946720558',''),(9,'tolo','virgen del carmen','9','672235065',''),(10,'txanxiku','zubiaur','3','946722774',''),(11,'utzine','lamuza','23','946721232',''),(12,'centro gallego','ruperto urquijo','1','946726009',''),(13,'txakoli beldui','caserio beldio','S/N','685757648',''),(14,'andoniren','tres cruces','25','946721495',''),(15,'biribil','zumalakarregi ','39','946728000',''),(16,'dorrea','ugarte','16','944048878',''),(17,'larrea','doctor fleming','3','946725013',''),(18,'ugarte','ugarte','11','946725699',''),(19,'mu lian','tres cruces','5','946728424',''),(20,'laurak','tres cruces','17','946722725','');
/*!40000 ALTER TABLE `restaurante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'appllodio'
--
/*!50003 DROP PROCEDURE IF EXISTS `barrioCreate` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `barrioCreate`(IN `pnombre` VARCHAR(50), OUT `pcodigo` INT)
BEGIN

INSERT	INTO barrio(nombre)
VALUES(LOWER(pnombre));
SET pcodigo = LAST_INSERT_ID();

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `barrioDelete` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `barrioDelete`(IN `pcodigo` INT)
    NO SQL
BEGIN

DELETE FROM barrio WHERE codigo = pcodigo;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `barriogetAll` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `barriogetAll`()
BEGIN

SELECT b.codigo, b.nombre  FROM barrio as b;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `barriogetById` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `barriogetById`(IN `pcodigo` INT)
    NO SQL
BEGIN

	SELECT b.codigo, b.nombre
	FROM barrio as b 
	WHERE codigo = pcodigo;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `barriogetByNombre` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `barriogetByNombre`(IN `pnombre` VARCHAR(50))
    NO SQL
BEGIN

    SELECT `codigo`, `nombre`
    FROM `barrio`
    WHERE nombre = pnombre;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `barrioUpdate` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `barrioUpdate`(IN `pcodigo` INT, IN `pnombre` VARCHAR(50))
BEGIN

UPDATE barrio 
SET nombre = LOWER(pnombre)
WHERE codigo = pcodigo;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `contactoCreate` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `contactoCreate`(IN `pnombre` VARCHAR(50), IN `pambito` VARCHAR(50), IN `ptelefono` VARCHAR(9), OUT `pcodigo` INT)
BEGIN

INSERT	INTO contacto(nombre,ambito,telefono)
VALUES(LOWER(pnombre),LOWER(pambito),ptelefono);
SET pcodigo = LAST_INSERT_ID();

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `contactoDelete` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `contactoDelete`(IN `pcodigo` INT)
    NO SQL
BEGIN

DELETE FROM contacto WHERE codigo = pcodigo;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `contactogetAll` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `contactogetAll`()
    NO SQL
BEGIN

	SELECT `codigo`, `nombre`, `ambito`, `telefono`, `activo`
	FROM `contacto`;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `contactogetById` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `contactogetById`(IN `pcodigo` INT)
    NO SQL
BEGIN

    SELECT `codigo` as codigo, `nombre`,  `ambito`, `telefono`, `activo` 
    FROM `contacto`
	WHERE codigo = pcodigo;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `contactoUpdate` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `contactoUpdate`(IN `pcodigo` INT, IN `pnombre` VARCHAR(50), IN `pambito` VARCHAR(50), IN `ptelefono` VARCHAR(50))
    NO SQL
BEGIN

UPDATE contacto 
SET nombre = LOWER(pnombre),ambito=LOWER(pambito),telefono=ptelefono
WHERE codigo = pcodigo;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `fiestaCreate` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `fiestaCreate`(IN `pnombre` VARCHAR(50), IN `pdescripcion` TEXT, IN `pfecha` DATE, OUT `pcodigo` INT)
BEGIN

INSERT	INTO fiesta(nombre,descripcion,fecha)
VALUES(LOWER(pnombre),LOWER(pdescripcion),pfecha);
SET pcodigo = LAST_INSERT_ID();

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `fiestaDelete` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `fiestaDelete`(IN `pcodigo` INT)
    NO SQL
BEGIN

DELETE FROM fiesta WHERE codigo = pcodigo;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `fiestagetAll` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `fiestagetAll`()
BEGIN

SELECT f.codigo, f.nombre, f.descripcion, f.fecha
FROM fiesta as f;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `fiestagetByid` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `fiestagetByid`(IN `pcodigo` INT)
BEGIN

SELECT f.codigo, f.nombre, f.descripcion, f.fecha
FROM fiesta as f 
WHERE codigo = pcodigo;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `fiestaUpdate` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `fiestaUpdate`(IN `pcodigo` INT, IN `pnombre` VARCHAR(50), IN `pdescripcion` TEXT, IN `pfecha` DATE)
BEGIN

UPDATE fiesta 
SET nombre = LOWER(pnombre),descripcion=LOWER(pdescripcion),fecha=pfecha
WHERE codigo = pcodigo;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `restauranteCreate` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `restauranteCreate`(IN `pnombre` VARCHAR(50), IN `pdireccion` VARCHAR(50), IN `pnumero` VARCHAR(3), IN `ptelefono` VARCHAR(9), IN `pdocumento` VARCHAR(500), OUT `pcodigo` INT)
BEGIN

INSERT	INTO restaurante(nombre,direccion,numero,telefono,documento)
VALUES(LOWER(pnombre),LOWER(pdireccion),pnumero,ptelefono,LOWER(pdocumento));
SET pcodigo = LAST_INSERT_ID();

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `restauranteDelete` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `restauranteDelete`(IN `pcodigo` INT)
    NO SQL
BEGIN

DELETE FROM restaurante WHERE codigo = pcodigo;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `restaurantegetAll` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `restaurantegetAll`()
BEGIN

SELECT r.codigo, r.nombre, r.direccion, r.numero, r.telefono, r.documento 
FROM restaurante as r ;
 

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `restaurantegetById` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `restaurantegetById`(IN `pcodigo` INT)
BEGIN



SELECT r.codigo, r.nombre, r.direccion, r.numero,r.telefono, r.documento 
FROM restaurante as r
WHERE r.codigo = pcodigo;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `restaurantegetByNombre` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `restaurantegetByNombre`(IN `pnombre` VARCHAR(50))
BEGIN



SELECT codigo as codigo, nombre, direccion, numero, telefono, documento
FROM restaurante  
WHERE nombre = pnombre;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `restauranteUpdate` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `restauranteUpdate`(IN `pcodigo` INT, IN `pnombre` VARCHAR(50), IN `pdireccion` VARCHAR(50), IN `pnumero` VARCHAR(3), IN `ptelefono` VARCHAR(9), IN `pdocumento` TEXT)
BEGIN

UPDATE restaurante 
SET nombre = LOWER(pnombre),direccion=LOWER(pdireccion),numero=LOWER(pnumero),telefono=ptelefono,documento=LOWER(pdocumento)
WHERE codigo = pcodigo;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-15 15:56:14
