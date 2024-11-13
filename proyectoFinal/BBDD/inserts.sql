use agenciaViajes;

INSERT INTO hoteles (nombre, categoria, precio, disponible) VALUES
('Hotel Playa Dorada', '5 estrellas', 200.00, TRUE),
('Hotel Sol y Mar', '4 estrellas', 150.00, TRUE),
('Hotel Montaña Azul', '3 estrellas', 120.00, TRUE),
('Hotel Costa Blanca', '4 estrellas', 170.00, FALSE),
('Hotel Villa Serena', '5 estrellas', 250.00, TRUE),
('Hotel Las Palmas', '3 estrellas', 100.00, TRUE),
('Hotel Del Mar', '4 estrellas', 180.00, TRUE),
('Hotel Oasis Tropical', '3 estrellas', 110.00, TRUE),
('Hotel Luna de Miel', '5 estrellas', 220.00, TRUE),
('Hotel Gran Bahía', '4 estrellas', 160.00, TRUE);

INSERT INTO hoteles (nombre, categoria, precio, disponible) VALUES
('Hotel', '4 estrellas', 160.00, TRUE);
INSERT INTO vuelos (compañia, fechaVuelo, precio, plazas) VALUES
('Aerolíneas XYZ', '2024-12-01 08:00:00', 350.00, 120),
('Aerolíneas ABC', '2024-12-02 14:00:00', 300.00, 150),
('Vuelos del Sol', '2024-12-05 09:30:00', 200.00, 200),
('Global Airways', '2024-12-10 12:00:00', 400.00, 100),
('Sky Flights', '2024-12-15 16:30:00', 250.00, 180),
('Aerojet', '2024-12-20 10:15:00', 320.00, 130),
('Aerolíneas Internacionales', '2024-12-25 13:45:00', 500.00, 90),
('Vuelo Rápido', '2024-12-30 11:00:00', 270.00, 160),
('JetSet Airways', '2024-12-01 18:30:00', 450.00, 110),
('BlueSky Airlines', '2024-12-08 07:00:00', 350.00, 140);
INSERT INTO reservas (nombre_cliente, dni, cantidad_personas, id_hoteles, id_vuelos) VALUES
('Juan Pérez', '12345678A', 2, 1, 1),
('Ana González', '87654321B', 4, 2, 2),
('Carlos López', '11223344C', 1, 3, 3),
('María Sánchez', '55667788D', 3, 4, 4),
('Luis Fernández', '99887766E', 2, 5, 5),
('Patricia García', '66778899F', 5, 6, 6),
('Javier Rodríguez', '12345678G', 2, 7, 7),
('Elena Martínez', '87654321H', 4, 8, 8),
('Fernando Díaz', '22334455I', 1, 9, 9),
('Laura Romero', '44556677J', 3, 10, 10);
