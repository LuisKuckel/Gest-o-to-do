CREATE DATABASE banco_de_usuarios;

USE banco_de_usuarios;

DROP TABLE IF EXISTS `atividades`;
CREATE TABLE `atividades` (
  `idatividade` int NOT NULL AUTO_INCREMENT,
  `idmateria` int NOT NULL,
  `nome_atividade` varchar(45) NOT NULL,
  PRIMARY KEY (`idatividade`),
  UNIQUE KEY `idmateria_UNIQUE` (`idmateria`)
);

DROP TABLE IF EXISTS `materias`;
CREATE TABLE `materias` (
  `idmaterias` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  PRIMARY KEY (`idmaterias`)
);

DROP TABLE IF EXISTS `notas`;
CREATE TABLE `notas` (
  `idnotas` int NOT NULL AUTO_INCREMENT,
  `idusuario` int NOT NULL,
  `idmateria` int NOT NULL,
  `notal` decimal(45,0) NOT NULL,
  PRIMARY KEY (`idnotas`),
  UNIQUE KEY `idusuario_UNIQUE` (`idusuario`),
  UNIQUE KEY `idmateria_UNIQUE` (`idmateria`)
);

DROP TABLE IF EXISTS `notas_atividades`;
CREATE TABLE `notas_atividades` (
  `idnotas_atividades` int NOT NULL AUTO_INCREMENT,
  `idusuario` int NOT NULL,
  `idatividade` int NOT NULL,
  `nota` varchar(45) NOT NULL,
  PRIMARY KEY (`idnotas_atividades`),
  UNIQUE KEY `idusuario_UNIQUE` (`idusuario`),
  UNIQUE KEY `idatividade_UNIQUE` (`idatividade`)
);

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `idusuario` int NOT NULL AUTO_INCREMENT,
  `email` varchar(100) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  PRIMARY KEY (`idusuario`)
);