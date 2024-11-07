create database banco_de_usuarios;

use banco_de_usuarios;

DROP TABLE IF EXISTS `notas_atividades`;
DROP TABLE IF EXISTS `atividades`;
DROP TABLE IF EXISTS `notas`;
DROP TABLE IF EXISTS `materias`;
DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `idusuario` int NOT NULL AUTO_INCREMENT,
  `email` varchar(100) NOT NULL UNIQUE,
  `senha` varchar(45) NOT NULL,
  `nome` varchar(100) NOT NULL,
  PRIMARY KEY (`idusuario`)
);

CREATE TABLE `materias` (
  `idmaterias` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL UNIQUE,
  PRIMARY KEY (`idmaterias`)
);

CREATE TABLE `atividades` (
  `idatividade` int NOT NULL AUTO_INCREMENT,
  `idmateria` int NOT NULL,
  `nome_atividade` varchar(45) NOT NULL,
  PRIMARY KEY (`idatividade`),
  FOREIGN KEY (`idmateria`) REFERENCES `materias`(`idmaterias`)
);

CREATE TABLE `notas` (
  `idnotas` int NOT NULL AUTO_INCREMENT,
  `idusuario` int NOT NULL,
  `idmateria` int NOT NULL,
  `nota` decimal(4,2) NOT NULL,
  PRIMARY KEY (`idnotas`),
  FOREIGN KEY (`idusuario`) REFERENCES `usuario`(`idusuario`),
  FOREIGN KEY (`idmateria`) REFERENCES `materias`(`idmaterias`)
) ;


CREATE TABLE `notas_atividades` (
  `idnotas_atividades` int NOT NULL AUTO_INCREMENT,
  `idusuario` int NOT NULL,
  `idatividade` int NOT NULL,
  `nota` decimal(4,2) NOT NULL,
  PRIMARY KEY (`idnotas_atividades`),
  FOREIGN KEY (`idusuario`) REFERENCES `usuario`(`idusuario`),
  FOREIGN KEY (`idatividade`) REFERENCES `atividades`(`idatividade`)
);