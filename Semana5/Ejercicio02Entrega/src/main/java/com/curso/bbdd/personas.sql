-- Crear la base de datos
CREATE DATABASE personas;


USE personas;
drop TABLE persona;
CREATE TABLE persona (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido_uno VARCHAR(100) NOT NULL,
        apellido_dos VARCHAR(100) NOT NULL,
    telefono VARCHAR(15) NOT NULL UNIQUE
);

INSERT INTO persona (nombre, apellido_uno, apellido_dos, telefono) VALUES
('Juan', 'Pérez', 'García', '123456789'),
('Ana', 'López', 'Martínez', '987654321'),
('Luis', 'Rodríguez', 'Fernández', '456123789'),
('María', 'Gómez', 'Sánchez', '321654987'),
('Carlos', 'Hernández', 'Ruiz', '789123456'),
('Elena', 'Jiménez', 'Ortiz', '654789321'),
('Miguel', 'Díaz', 'González', '159753486'),
('Sofía', 'Castro', 'Torres', '753159486'),
('José', 'Martínez', 'Ríos', '951753842'),
('Lucía', 'Romero', 'Castillo', '357951486');


 

