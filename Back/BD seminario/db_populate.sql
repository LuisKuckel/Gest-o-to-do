USE banco_de_usuarios;

INSERT INTO `usuario` (`email`, `senha`, `nome`) VALUES
('alice.santos@example.com', 'senha123', 'Alice Santos'),
('bruno.lima@example.com', 'senha456', 'Bruno Lima'),
('carla.oliveira@example.com', 'senha789', 'Carla Oliveira'),
('diego.silva@example.com', 'senha101', 'Diego Silva'),
('elisa.fernandes@example.com', 'senha102', 'Elisa Fernandes'),
('fabio.pereira@example.com', 'senha103', 'Fábio Pereira'),
('giovana.martins@example.com', 'senha104', 'Giovana Martins'),
('henrique.souza@example.com', 'senha105', 'Henrique Souza'),
('isabela.rocha@example.com', 'senha106', 'Isabela Rocha'),
('joao.costa@example.com', 'senha107', 'João Costa');

INSERT INTO `materias` (`nome`) VALUES
('Matemática'),
('Física'),
('Química'),
('Biologia'),
('História'),
('Geografia'),
('Português'),
('Inglês'),
('Artes'),
('Educação Física');

INSERT INTO `atividades` (`idmateria`, `nome_atividade`) VALUES
(1, 'Prova de Álgebra Linear'),
(1, 'Prova de Geometria Analítica'),
(2, 'Prova de Mecânica Clássica'),
(2, 'Prova de Termodinâmica'),
(3, 'Prova de Química Orgânica'),
(3, 'Prova de Química Inorgânica'),
(4, 'Prova de Biologia Celular'),
(4, 'Prova de Genética'),
(5, 'Prova de História do Brasil'),
(5, 'Prova de História Geral');

INSERT INTO `notas` (`idusuario`, `idmateria`, `nota`) VALUES
(1, 1, 8.7),
(2, 2, 7.5),
(3, 3, 9.2),
(4, 4, 6.8),
(5, 5, 8.3),
(6, 6, 7.9),
(7, 7, 6.4),
(8, 8, 9.6),
(9, 9, 8.9),
(10, 10, 7.8);

INSERT INTO `notas_atividades` (`idusuario`, `idatividade`, `nota`) VALUES
(1, 1, 7.8),
(2, 2, 8.1),
(3, 3, 6.9),
(4, 4, 9.2),
(5, 5, 8.5),
(6, 6, 7.4),
(7, 7, 6.7),
(8, 8, 9.8),
(9, 9, 8.4),
(10, 10, 7.5);

select * from usuario;
