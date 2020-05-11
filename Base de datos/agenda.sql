-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-05-2020 a las 23:30:25
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `agenda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignatura`
--

CREATE TABLE `asignatura` (
  `NRC_ASIGNATURA` int(11) NOT NULL,
  `ID_DOCENTE` int(11) DEFAULT NULL,
  `ID_ESTUDIANTE` int(11) DEFAULT NULL,
  `NOMBRE_ASIGNATURA` varchar(50) NOT NULL,
  `AULA_ASIGNATURA` varchar(50) NOT NULL,
  `DIAS_ASIGNATURA` text NOT NULL,
  `CALIFICACION_ASIGNATURA` double DEFAULT NULL,
  `HORAENTRADA_ASIGNATURA` time NOT NULL,
  `HORASALIDA_ASIGNATURA` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `asignatura`
--

INSERT INTO `asignatura` (`NRC_ASIGNATURA`, `ID_DOCENTE`, `ID_ESTUDIANTE`, `NOMBRE_ASIGNATURA`, `AULA_ASIGNATURA`, `DIAS_ASIGNATURA`, `CALIFICACION_ASIGNATURA`, `HORAENTRADA_ASIGNATURA`, `HORASALIDA_ASIGNATURA`) VALUES
(1, 2, NULL, 'Desarrollo Web', 'Lab1', 'Martes', NULL, '12:00:00', '14:15:00'),
(2, 3, NULL, 'Base de Datos ', 'Aula1', 'Miércoles', NULL, '14:00:00', '16:15:00'),
(3, 1, NULL, 'Internetworking', 'Laboratorio 4', 'Viernes', NULL, '17:00:00', '20:00:00'),
(6, 4, NULL, 'Lectura ', 'Aula 7', 'Jueves', NULL, '14:00:00', '16:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docente`
--

CREATE TABLE `docente` (
  `ID_DOCENTE` int(11) NOT NULL,
  `CEDULA_DOCENTE` varchar(10) DEFAULT NULL,
  `NOMBRE_DOCENTE` varchar(50) DEFAULT NULL,
  `APELLIDO_DOCENTE` varchar(50) DEFAULT NULL,
  `CORREO_DOCENTE` varchar(100) DEFAULT NULL,
  `TELEFONO_DOCENTE` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `docente`
--

INSERT INTO `docente` (`ID_DOCENTE`, `CEDULA_DOCENTE`, `NOMBRE_DOCENTE`, `APELLIDO_DOCENTE`, `CORREO_DOCENTE`, `TELEFONO_DOCENTE`) VALUES
(1, '2300665522', 'Daniel ', 'Nuñez', 'adnunez@espe.edu.ec', '0979755355'),
(2, '2366112255', 'Luis ', 'Castillo', 'lcastillo@espe.edu.ec', '0984563322'),
(3, '1822665522', 'Henrry', 'Chanatasig', 'hchanatasig@espe.edu.ec', '0985553322'),
(4, '092358695', 'luis', 'lopez', 'luis@espe.edu.ec', '097235367'),
(5, '1231231230', 'Rolando ', 'Armas', 'rolandoarmas@espe.edu.ec', '0980980980');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `ID_ESTUDIANTE` int(11) NOT NULL,
  `CEDULA_ESTUDIANTE` varchar(10) NOT NULL,
  `NOMBRE_ESTUDIANTE` varchar(50) NOT NULL,
  `APELLIDO_ESTUDIANTE` varchar(50) NOT NULL,
  `NIVEL_ESTUDIANTE` int(11) NOT NULL,
  `login` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `USUARIO_ESTUDIANTE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`ID_ESTUDIANTE`, `CEDULA_ESTUDIANTE`, `NOMBRE_ESTUDIANTE`, `APELLIDO_ESTUDIANTE`, `NIVEL_ESTUDIANTE`, `login`, `password`, `USUARIO_ESTUDIANTE`) VALUES
(1, '2300552102', 'Joshi', 'Ramirez', 6, 'Joshi', '123', NULL),
(2, '1313602920', 'Gema', 'Castillo', 6, 'gemy', '1234', NULL),
(3, '0923698598', 'joshua', 'ramirez', 6, 'jos', '123', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `ID` int(11) NOT NULL,
  `login` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tareas`
--

CREATE TABLE `tareas` (
  `ID_TAREA` int(11) NOT NULL,
  `NRC_ASIGNATURA` int(11) DEFAULT NULL,
  `FECHA_ENTREGA` date NOT NULL,
  `ESTADO_TAREA` varchar(50) DEFAULT NULL,
  `PRIORIDAD_TAREA` varchar(50) DEFAULT NULL,
  `CALIFICACIONES_TAREA` double DEFAULT NULL,
  `DESCRIPCION_TAREA` varchar(255) NOT NULL,
  `ID_ESTUDIANTE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tareas`
--

INSERT INTO `tareas` (`ID_TAREA`, `NRC_ASIGNATURA`, `FECHA_ENTREGA`, `ESTADO_TAREA`, `PRIORIDAD_TAREA`, `CALIFICACIONES_TAREA`, `DESCRIPCION_TAREA`, `ID_ESTUDIANTE`) VALUES
(1, 1, '2020-01-28', 'Tarea en proceso', 'Alta', 10, 'Proyecto Web', NULL),
(2, 2, '2020-01-29', 'Tarea por entregar', 'Alta', 10, 'Informe', NULL),
(3, 3, '2020-01-30', 'Tarea terminada', 'Media', 10, 'Talleres', NULL),
(4, 3, '2020-02-26', 'Tarea por entregar', 'Baja', 10, 'Laboratorios Cisco', NULL),
(5, 2, '2020-02-22', 'Tarea por entregar', 'Alta', 10, 'Crud SQL', NULL),
(6, 1, '2020-02-22', 'Tarea por entregar', 'Media', 10, 'Pagin Web', NULL),
(7, 3, '2020-01-10', 'Tarea terminada', 'Alta', 8, 'Proyecto Unidad', NULL),
(9, 3, '2020-01-30', 'Tarea por entregar', 'Alta', 10, 'Consulta', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asignatura`
--
ALTER TABLE `asignatura`
  ADD PRIMARY KEY (`NRC_ASIGNATURA`),
  ADD KEY `FK_UN_DOCENTE_IMAPARTE_VARIAS_ASIGNATURAS` (`ID_DOCENTE`),
  ADD KEY `FK_UN_ESTUDIANTE_TIENE_ASIGNATURAS` (`ID_ESTUDIANTE`);

--
-- Indices de la tabla `docente`
--
ALTER TABLE `docente`
  ADD PRIMARY KEY (`ID_DOCENTE`);

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`ID_ESTUDIANTE`);

--
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `tareas`
--
ALTER TABLE `tareas`
  ADD PRIMARY KEY (`ID_TAREA`),
  ADD KEY `FK_UNA_ASIGNATURA_TIENE_TAREAS` (`NRC_ASIGNATURA`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asignatura`
--
ALTER TABLE `asignatura`
  MODIFY `NRC_ASIGNATURA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `docente`
--
ALTER TABLE `docente`
  MODIFY `ID_DOCENTE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  MODIFY `ID_ESTUDIANTE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tareas`
--
ALTER TABLE `tareas`
  MODIFY `ID_TAREA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asignatura`
--
ALTER TABLE `asignatura`
  ADD CONSTRAINT `FK_UN_DOCENTE_IMAPARTE_VARIAS_ASIGNATURAS` FOREIGN KEY (`ID_DOCENTE`) REFERENCES `docente` (`ID_DOCENTE`),
  ADD CONSTRAINT `FK_UN_ESTUDIANTE_TIENE_ASIGNATURAS` FOREIGN KEY (`ID_ESTUDIANTE`) REFERENCES `estudiante` (`ID_ESTUDIANTE`);

--
-- Filtros para la tabla `tareas`
--
ALTER TABLE `tareas`
  ADD CONSTRAINT `FK_UNA_ASIGNATURA_TIENE_TAREAS` FOREIGN KEY (`NRC_ASIGNATURA`) REFERENCES `asignatura` (`NRC_ASIGNATURA`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
