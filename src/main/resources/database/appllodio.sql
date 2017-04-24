-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-04-2017 a las 21:17:16
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

--
-- Volcado de datos para la tabla `fiesta`
--

INSERT INTO `fiesta` (`codigo`, `nombre`, `descripcion`, `fecha`) VALUES
(1, 'Feria de San Blas', 'Sábado anterior o coincidente con el 3 de febrero. Importante Feria que gira en torno al caserío especialmente relacionada con la matanza del cerdo. Exposición de productos del caserío y de artesanía. Concurso gastronómico de patas de cerdo.', '2017-02-03'),
(2, 'Viernes de Dolores', 'De gran tradición para los llodianos, se realiza el viernes anterior al inicio de la Semana Santa. Importante Feria Exposición de ganado vacuno, equino y ovino. Importante prueba de arrastre de piedra con bueyes. Se puede considerar una de las fiestas más importantes de la comarca.', '2017-03-23'),
(3, 'Santa Agueda', 'Se celebra el segundo día de Pascua Resurrección en la ermita de María Magdalena en Larraño, al pie de Luja.', '2017-04-18'),
(4, 'San Prudencio', 'Patrono de Alava, el día 28 de abril. Tamborrada y Concurso de Caracoles.', '2017-04-28'),
(5, 'Santa Cruz', '3 de mayo en el barrio de Gardea', '2017-05-03'),
(6, 'Santa Lucía', 'El segundo día de Pascua de Pentecostés o siete semanas después de Resurrección. Importante romería que se celebra en la campa existente junto a la ermita en el entorno de Santa María del Yermo.', '2017-06-03'),
(7, 'San Antonio', 'El 13 de junio. Su ermita está dedicada también a la advocación de Santa Apolonia.', '2017-06-13'),
(8, 'San Juan', 'El 24 de junio en el barrio de Larrazabal.', '2017-06-24'),
(9, 'Santa Ana', 'El 26 de julio, en el barrio de Areta.', '2017-07-26'),
(10, 'San Ignacio', 'El 31 de julio, en el barrio de Ugarte', '2017-07-31'),
(11, 'San Roke', 'Patrono del Valle de Llodio. Las fiestas en su honor comienzan el 15 de agosto, la Asunción, y se extienden hasta el último domingo del mes, día en el que se celebra, desde 1599, la comida de hermandad de los cofrades de San Roke. La víspera se celebra la popular fiesta llamada “Día de las morcillas”.', '2017-08-15'),
(12, 'San Bartolomé', 'En la ermita del santo en Larra, el 24 de agosto.', '2017-08-24'),
(13, 'Latiorroko Jaiak', 'Fiestas de este populoso barrio de Llodio, a mediados de septiembre.', '2017-09-14');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `fiesta`
--
ALTER TABLE `fiesta`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `fiesta`
--
ALTER TABLE `fiesta`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
