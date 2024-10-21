
CREATE DATABASE Empresa;
Use Empresa;


CREATE TABLE  Empresa.Empleados (
    id int auto_increment primary key,
    nombre varchar(50),
    apellido_uno varchar(50),
     apellido_dos varchar(50),
     fecha_nacimiento date,
     salario int 
     );
     INSERT INTO Empresa.Empleados (nombre, apellido_uno, apellido_dos, fecha_nacimiento, salario) VALUES
('Juan', 'Pérez', 'González', '1990-05-15', 3000),
('Ana', 'García', 'Rodríguez', '1985-07-22', 3500),
('Luis', 'Martínez', 'López', '1992-03-10', 2800),
('María', 'Hernández', 'Sánchez', '1988-11-30', 4000),
('Carlos', 'Fernández', 'Morales', '1995-01-20', 3200),
('Lucía', 'Gómez', 'Torres', '1993-09-18', 3100),
('Pedro', 'Díaz', 'Ortiz', '1987-12-05', 2900),
('Elena', 'Vega', 'Navarro', '1994-06-27', 3400),
('Alberto', 'Jiménez', 'Ramos', '1991-08-14', 3300),
('Rosa', 'Suárez', 'Cruz', '1989-10-09', 3600);

INSERT INTO Empresa.Empleados (nombre, apellido_uno, apellido_dos, fecha_nacimiento, salario) VALUES
('David', 'Cabrera', 'Pineda', '1990-02-25', 3700),
('Laura', 'Soto', 'Romero', '1986-03-17', 3100),
('Miguel', 'León', 'Castillo', '1993-04-22', 2800),
('Sara', 'Iglesias', 'Molina', '1991-05-30', 3400),
('Raúl', 'Gutiérrez', 'Gil', '1988-01-11', 3000),
('Paula', 'Domínguez', 'Reyes', '1995-08-19', 3500),
('Hugo', 'Marín', 'Campos', '1992-12-23', 3300),
('Inés', 'Medina', 'Fuentes', '1990-09-09', 3800),
('Adrián', 'Ruiz', 'Serrano', '1994-07-04', 3100),
('Teresa', 'Núñez', 'Blanco', '1989-11-02', 3200);

