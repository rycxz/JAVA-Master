/*Código, titulo, nombre del director y precio de alquiler*/
create database videoclub;
create table pelicula(
    codigo INT PRIMARY KEY,
    titulo VARCHAR(100),
    director VARCHAR(100),
    precio_alquiler DECIMAL(5, 2)
);
use videoclub;
INSERT INTO pelicula (codigo, titulo, director, precio_alquiler) VALUES
(1, 'Inception', 'Christopher Nolan', 3.99),
(2, 'Pulp Fiction', 'Quentin Tarantino', 2.99),
(3, 'The Godfather', 'Francis Ford Coppola', 4.50),
(4, 'The Matrix', 'Lana Wachowski, Lilly Wachowski', 3.75),
(5, 'Interstellar', 'Christopher Nolan', 3.99),
(6, 'The Dark Knight', 'Christopher Nolan', 3.50),
(7, 'Fight Club', 'David Fincher', 3.20),
(8, 'Forrest Gump', 'Robert Zemeckis', 2.80),
(9, 'The Shawshank Redemption', 'Frank Darabont', 4.00),
(10, 'The Silence of the Lambs', 'Jonathan Demme', 3.25),
(11, 'The Lord of the Rings: The Fellowship of the Ring', 'Peter Jackson', 4.20),
(12, 'The Lord of the Rings: The Two Towers', 'Peter Jackson', 4.20),
(13, 'The Lord of the Rings: The Return of the King', 'Peter Jackson', 4.20),
(14, 'Gladiator', 'Ridley Scott', 3.50),
(15, 'Braveheart', 'Mel Gibson', 3.00),
(16, 'Avatar', 'James Cameron', 3.99),
(17, 'Titanic', 'James Cameron', 3.80),
(18, 'Goodfellas', 'Martin Scorsese', 3.90),
(19, 'Schindler\'s List', 'Steven Spielberg', 4.50),
(20, 'Jurassic Park', 'Steven Spielberg', 3.75),
(21, 'E.T. the Extra-Terrestrial', 'Steven Spielberg', 3.20),
(22, 'Django Unchained', 'Quentin Tarantino', 3.60),
(23, 'The Hateful Eight', 'Quentin Tarantino', 3.40),
(24, 'Mad Max: Fury Road', 'George Miller', 3.70),
(25, 'The Green Mile', 'Frank Darabont', 3.90),
(26, 'The Departed', 'Martin Scorsese', 3.80),
(27, 'Whiplash', 'Damien Chazelle', 3.20),
(28, 'La La Land', 'Damien Chazelle', 3.25),
(29, 'Joker', 'Todd Phillips', 3.99),
(30, 'Black Swan', 'Darren Aronofsky', 3.50);
