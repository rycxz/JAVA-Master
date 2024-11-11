create database if not exists envios;
use envios;
drop table producto;
CREATE TABLE IF NOT EXISTS producto (
    codigoProducto int  unsigned PRIMARY KEY AUTO_INCREMENT  ,
    producto TEXT NOT NULL,
    precioUnitario float unsigned,
    stock int unsigned
);
drop table pedidos;
CREATE TABLE IF NOT EXISTS pedidos (
    id int  unsigned PRIMARY KEY AUTO_INCREMENT,
    codigoProducto INTEGER  unsigned,
    unidades int unsigned,
    total int unsigned,
    fechaPedido date
);
INSERT INTO producto (codigoProducto, producto, precioUnitario, stock) VALUES
(1, 'Laptop', 800.00, 20),
(2, 'Smartphone', 500.00, 50),
(3, 'Tablet', 300.00, 30),
(4, 'Monitor', 150.00, 25),
(5, 'Teclado', 25.00, 100);
INSERT INTO pedidos (id, codigoProducto, unidades, total, fechaPedido) VALUES
(1, 1, 2, 1600, '2024-11-01'),
(2, 2, 3, 1500, '2024-11-02'),
(3, 3, 1, 300, '2024-11-03'),
(4, 4, 5, 750, '2024-11-04'),
(5, 5, 10, 250, '2024-11-05');
