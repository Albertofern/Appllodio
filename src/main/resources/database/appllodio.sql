-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-04-2017 a las 23:04:51
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `appllodio`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `barrioCreate` (IN `pnombre` VARCHAR(50), OUT `pcodigo` INT)  BEGIN



INSERT	INTO barrio(nombre)
VALUES(LOWER(pnombre));
SET pcodigo = LAST_INSERT_ID();



END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `barrioDelete` (IN `pcodigo` INT)  NO SQL
BEGIN

DELETE FROM barrio WHERE codigo = pcodigo;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `barriogetAll` ()  NO SQL
BEGIN

SELECT b.codigo, b.nombre  FROM barrio as b;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `barriogetById` (IN `pcodigo` INT)  NO SQL
BEGIN

	SELECT b.codigo, b.nombre
	FROM barrio as b 
	WHERE codigo = pcodigo;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `barriogetByNombre` (IN `pnombre` VARCHAR(50))  NO SQL
BEGIN

    SELECT `codigo`, `nombre`
    FROM `barrio`
    WHERE nombre = pnombre;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `barrioUpdate` (IN `pcodigo` INT, IN `pnombre` VARCHAR(50))  NO SQL
BEGIN

UPDATE barrio 
SET nombre = LOWER(pnombre)
WHERE codigo = pcodigo;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `contactoCreate` (IN `pnombre` VARCHAR(50), IN `pambito` VARCHAR(50), IN `ptelefono` VARCHAR(9), OUT `pcodigo` INT)  BEGIN

INSERT	INTO contacto(nombre,ambito,telefono)
VALUES(LOWER(pnombre),LOWER(pambito),ptelefono);
SET pcodigo = LAST_INSERT_ID();

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `contactoDelete` (IN `pcodigo` INT)  NO SQL
BEGIN

DELETE FROM contacto WHERE codigo = pcodigo;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `contactogetAll` ()  NO SQL
BEGIN

	SELECT `codigo`, `nombre`, `ambito`, `telefono`, `activo`
	FROM `contacto`;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `contactogetById` (IN `pcodigo` INT)  NO SQL
BEGIN

    SELECT `codigo` as codigo, `nombre`,  `ambito`, `telefono`, `activo` 
    FROM `contacto`
	WHERE codigo = pcodigo;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `contactoUpdate` (IN `pcodigo` INT, IN `pnombre` VARCHAR(50), IN `pambito` VARCHAR(50), IN `ptelefono` VARCHAR(50))  NO SQL
BEGIN

UPDATE contacto 
SET nombre = LOWER(pnombre),ambito=LOWER(pambito),telefono=ptelefono
WHERE codigo = pcodigo;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `fiestaCreate` (IN `pnombre` VARCHAR(50), IN `pdescripcion` TEXT, IN `pfecha` DATE, OUT `pcodigo` INT)  BEGIN

INSERT	INTO fiesta(nombre,descripcion,fecha)
VALUES(LOWER(pnombre),LOWER(pdescripcion),pfecha);
SET pcodigo = LAST_INSERT_ID();

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `fiestaDelete` (IN `pcodigo` INT)  NO SQL
BEGIN

DELETE FROM fiesta WHERE codigo = pcodigo;

END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `barrio`
--

CREATE TABLE `barrio` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(50) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `barrio`
--

INSERT INTO `barrio` (`codigo`, `nombre`) VALUES
(1, 'ugarte'),
(2, 'areta'),
(3, 'latiorro'),
(4, 'landaluce'),
(5, 'gardea'),
(6, 'larraño'),
(7, 'zona centro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fiesta`
--

CREATE TABLE `fiesta` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(50) CHARACTER SET utf8 NOT NULL,
  `descripcion` text CHARACTER SET utf8,
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `restaurante`
--

CREATE TABLE `restaurante` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `numero` varchar(3) DEFAULT 'S/N',
  `telefono` varchar(9) DEFAULT NULL,
  `documento` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `restaurante`
--

INSERT INTO `restaurante` (`codigo`, `nombre`, `direccion`, `numero`, `telefono`, `documento`) VALUES
(1, 'balintxareketa', 'malkuartu bidea', '1', '946724350', ''),
(2, 'palacio anuncibai', 'vitoria', '', '946726188', ''),
(3, 'telepizza', 'zumalacarregui', '15', '944030456', ''),
(4, 'Karrika', 'poligono industrialdea', '4', '946728207', ''),
(5, 'batzoki llodio', 'plaza alberto acero', '12', '946034000', ''),
(6, 'paraiso chino', 'virgen del carmen', '31', '946726517', ''),
(7, 'capucci katua', 'zubiko kurajo', '7', '946559953', ''),
(8, 'el tunel', 'vitoria', '5', '946720558', ''),
(9, 'tolo', 'virgen del carmen', '9', '672235065', ''),
(10, 'txanxiku', 'zubiaur', '3', '946722774', ''),
(11, 'utzine', 'lamuza', '23', '946721232', ''),
(12, 'centro gallego', 'ruperto urquijo', '1', '946726009', ''),
(13, 'txakoli beldui', 'caserio beldio', 'S/N', '685757648', ''),
(14, 'andoniren', 'tres cruces', '25', '946721495', ''),
(15, 'biribil', 'zumalakarregi ', '39', '946728000', ''),
(16, 'dorrea', 'ugarte', '16', '944048878', ''),
(17, 'larrea', 'doctor fleming', '3', '946725013', ''),
(18, 'ugarte', 'ugarte', '11', '946725699', ''),
(19, 'mu lian', 'tres cruces', '5', '946728424', ''),
(20, 'laurak', 'tres cruces', '17', '946722725', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `barrio`
--
ALTER TABLE `barrio`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `fiesta`
--
ALTER TABLE `fiesta`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `barrio`
--
ALTER TABLE `barrio`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `fiesta`
--
ALTER TABLE `fiesta`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
