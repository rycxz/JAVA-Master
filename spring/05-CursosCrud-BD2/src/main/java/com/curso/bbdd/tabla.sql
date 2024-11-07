create database if not exists escuela;
use escuela;
CREATE TABLE IF NOT EXISTS curso (
    codCurso INTEGER PRIMARY KEY,
    nombre TEXT NOT NULL,
    duración INTEGER,
    precio REAL
);
INSERT INTO curso (codCurso, nombre, duración, precio) VALUES
(1, 'Matemáticas Básicas', 60, 150.0),
(2, 'Introducción a la Física', 45, 120.0),
(3, 'Química General', 50, 130.0),
(4, 'Biología Molecular', 70, 180.0),
(5, 'Historia Universal', 40, 110.0),
(6, 'Geografía Humana', 55, 125.0),
(7, 'Economía Básica', 60, 140.0),
(8, 'Literatura Clásica', 65, 155.0),
(9, 'Filosofía Antigua', 45, 120.0),
(10, 'Cálculo Diferencial', 80, 200.0);

INSERT INTO curso (codCurso, nombre, duración, precio) VALUES
(11, 'Álgebra Lineal', 75, 190.0),
(12, 'Estadística', 60, 160.0),
(13, 'Programación en Java', 90, 250.0),
(14, 'Bases de Datos SQL', 85, 240.0),
(15, 'Desarrollo Web', 100, 300.0),
(16, 'Diseño Gráfico', 70, 220.0),
(17, 'Inteligencia Artificial', 110, 400.0),
(18, 'Machine Learning', 120, 450.0),
(19, 'Redes de Computadoras', 80, 210.0),
(20, 'Ciberseguridad', 95, 280.0);
