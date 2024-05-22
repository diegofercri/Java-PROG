-- phpMyAdmin SQL Dump

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inmo`
--
DROP DATABASE IF EXISTS `inmo`;
CREATE DATABASE IF NOT EXISTS `inmo` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `inmo`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inmueble`
--

CREATE TABLE `inmueble` (
  `referencia` int(11) NOT NULL,
  `fechaAlta` date NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `provincia` varchar(20) NOT NULL,
  `superficie` int(11) NOT NULL,
  `precio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `inmueble`
--

INSERT INTO `inmueble` (`referencia`, `fechaAlta`, `tipo`, `provincia`, `superficie`, `precio`) VALUES
(1, '2024-04-02', 'Parking', 'Toledo', 291, 2133900),
(2, '2024-04-02', 'Local', 'Albacete', 199, 1945420),
(3, '2024-04-02', 'Oficina', 'Albacete', 82, 712416),
(4, '2024-04-03', 'Parking', 'Albacete', 285, 1815450),
(5, '2024-04-03', 'Suelo', 'Ciudad Real', 152, 1138020),
(6, '2024-04-05', 'Industrial', 'Albacete', 131, 953156),
(7, '2024-04-05', 'Parking', 'Ciudad Real', 69, 406686),
(8, '2024-04-10', 'Oficina', 'Albacete', 235, 2158480),
(9, '2024-04-10', 'Piso', 'Toledo', 108, 1024380),
(10, '2024-04-10', 'Parking', 'Toledo', 299, 2042770),
(11, '2024-04-10', 'Oficina', 'Albacete', 124, 627068),
(12, '2024-04-10', 'Industrial', 'Albacete', 187, 999328),
(13, '2024-04-10', 'Parking', 'Cuenca', 300, 2937300),
(14, '2024-04-11', 'Local', 'Ciudad Real', 68, 664700),
(15, '2024-04-11', 'Industrial', 'Albacete', 176, 820336),
(16, '2024-04-11', 'Casa', 'Albacete', 179, 937960),
(17, '2024-04-11', 'Casa', 'Ciudad Real', 58, 358846),
(18, '2024-04-11', 'Suelo', 'Cuenca', 283, 1679600),
(19, '2024-04-11', 'Piso', 'Albacete', 55, 472615),
(20, '2024-04-11', 'Oficina', 'Cuenca', 148, 1169500),
(21, '2024-04-11', 'Industrial', 'Cuenca', 228, 2020990),
(22, '2024-04-11', 'Oficina', 'Toledo', 116, 727552),
(23, '2024-04-12', 'Casa', 'Albacete', 183, 1438930),
(24, '2024-04-12', 'Oficina', 'Ciudad Real', 79, 427390),
(25, '2024-04-12', 'Oficina', 'Cuenca', 124, 1170680),
(26, '2024-04-12', 'Local', 'Ciudad Real', 70, 549780),
(27, '2024-04-12', 'Local', 'Ciudad Real', 70, 659330),
(28, '2024-04-13', 'Casa', 'Cuenca', 187, 1660560),
(29, '2024-04-13', 'Casa', 'Ciudad Real', 91, 753571),
(30, '2024-04-13', 'Local', 'Ciudad Real', 201, 939072),
(31, '2024-04-13', 'Industrial', 'Cuenca', 142, 1405370),
(32, '2024-04-14', 'Casa', 'Albacete', 92, 627348),
(33, '2024-04-14', 'Local', 'Cuenca', 181, 1504110),
(34, '2024-04-14', 'Casa', 'Cuenca', 281, 2483200),
(35, '2024-04-14', 'Industrial', 'Ciudad Real', 257, 1799770),
(36, '2024-04-15', 'Industrial', 'Ciudad Real', 140, 1054340),
(37, '2024-04-15', 'Local', 'Albacete', 229, 1160570),
(38, '2024-04-15', 'Suelo', 'Ciudad Real', 300, 1492800),
(39, '2024-04-15', 'Parking', 'Ciudad Real', 215, 1154980),
(40, '2024-04-15', 'Oficina', 'Albacete', 182, 1057780),
(41, '2024-04-15', 'Piso', 'Cuenca', 230, 1421860),
(42, '2024-04-16', 'Oficina', 'Ciudad Real', 168, 1426990),
(43, '2024-04-16', 'Oficina', 'Albacete', 74, 579716),
(44, '2024-04-16', 'Casa', 'Albacete', 278, 1537060),
(45, '2024-04-16', 'Oficina', 'Cuenca', 287, 2851060),
(46, '2024-04-16', 'Oficina', 'Toledo', 224, 1294050),
(47, '2024-04-16', 'Piso', 'Cuenca', 53, 249418),
(48, '2024-04-16', 'Industrial', 'Cuenca', 284, 1457490),
(49, '2024-04-16', 'Local', 'Albacete', 40, 321680),
(50, '2024-04-17', 'Local', 'Ciudad Real', 235, 957625),
(51, '2024-04-17', 'Industrial', 'Toledo', 90, 568620),
(52, '2024-04-17', 'Local', 'Toledo', 206, 1605560),
(53, '2024-04-18', 'Suelo', 'Ciudad Real', 158, 1438750),
(54, '2024-04-18', 'Suelo', 'Cuenca', 71, 686996),
(55, '2024-04-19', 'Local', 'Albacete', 127, 983234),
(56, '2024-04-19', 'Piso', 'Toledo', 54, 239220),
(57, '2024-04-19', 'Oficina', 'Toledo', 54, 512730),
(58, '2024-04-19', 'Local', 'Albacete', 274, 2287630),
(59, '2024-04-20', 'Industrial', 'Ciudad Real', 166, 1373820),
(60, '2024-04-20', 'Oficina', 'Toledo', 270, 1920240);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor`
--

CREATE TABLE `vendedor` (
  `codigo` varchar(3) NOT NULL,
  `nombre` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `vendedor`
--

INSERT INTO `vendedor` (`codigo`, `nombre`) VALUES
('V01', 'Carmen'),
('V02', 'Pedro'),
('V03', 'Joaquin'),
('V04', 'María'),
('V05', 'Jesús'),
('V06', 'Luisa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `referencia` int(11) NOT NULL,
  `fechaVenta` date NOT NULL,
  `vendedor` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`referencia`, `fechaVenta`, `vendedor`) VALUES
(1, '2024-05-03', 'V01'),
(2, '2024-05-03', 'V02'),
(5, '2024-05-03', 'V04'),
(6, '2024-05-04', 'V02'),
(8, '2024-05-04', 'V05'),
(9, '2024-05-04', 'V05'),
(10, '2024-05-05', 'V03'),
(12, '2024-05-05', 'V01'),
(14, '2024-05-05', 'V01'),
(15, '2024-05-06', 'V02'),
(17, '2024-05-06', 'V06'),
(18, '2024-05-06', 'V01'),
(20, '2024-05-07', 'V04'),
(21, '2024-05-07', 'V01'),
(24, '2024-05-07', 'V03'),
(25, '2024-05-10', 'V05'),
(27, '2024-05-10', 'V03'),
(29, '2024-05-10', 'V05'),
(31, '2024-05-10', 'V01'),
(32, '2024-05-10', 'V02'),
(35, '2024-05-11', 'V01'),
(36, '2024-05-11', 'V06'),
(37, '2024-05-11', 'V06'),
(38, '2024-05-11', 'V03'),
(43, '2024-05-12', 'V01'),
(44, '2024-05-12', 'V03'),
(49, '2024-05-12', 'V02'),
(50, '2024-05-13', 'V01'),
(51, '2024-05-13', 'V01'),
(55, '2024-05-13', 'V05'),
(58, '2024-05-13', 'V02');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `inmueble`
--
ALTER TABLE `inmueble`
  ADD PRIMARY KEY (`referencia`);

--
-- Indices de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`referencia`),
  ADD KEY `FK_VENDEDOR` (`vendedor`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `FK_REFERENCIA` FOREIGN KEY (`referencia`) REFERENCES `inmueble` (`referencia`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_VENDEDOR` FOREIGN KEY (`vendedor`) REFERENCES `vendedor` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
