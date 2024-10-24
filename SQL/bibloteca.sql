
CREATE DATABASE bibloteca;
Use Empresa;

drop table libros;
CREATE TABLE  bibloteca.libros (
     
    isbn varchar(50) primary key,
    titulo varchar(50),
     autor varchar(50),
     precio int
     );
     
     INSERT INTO bibloteca.libros (isbn, titulo, autor, precio) VALUES 
('978-3-16-148410-0', 'Cien años de soledad', 'Gabriel García Márquez', 15),
('978-0-06-112008-4', 'Matar a un ruiseñor', 'Harper Lee', 12),
('978-0-7432-7356-5', 'El alquimista', 'Paulo Coelho', 10),
('978-0-452-28423-4', '1984', 'George Orwell', 13),
('978-1-56619-909-4', 'Orgullo y prejuicio', 'Jane Austen', 11),
('978-0-7432-7357-2', 'El gran Gatsby', 'F. Scott Fitzgerald', 14),
('978-0-452-28424-1', 'Crimen y castigo', 'Fiódor Dostoyevski', 16),
('978-0-671-02735-8', 'El principito', 'Antoine de Saint-Exupéry', 9),
('978-0-141-03435-6', 'El viejo y el mar', 'Ernest Hemingway', 13),
('978-0-06-245773-8', 'La sombra del viento', 'Carlos Ruiz Zafón', 14),
('978-1-4028-9467-8', 'Los juegos del hambre', 'Suzanne Collins', 11),
('978-0-545-01022-1', 'Harry Potter y la piedra filosofal', 'J.K. Rowling', 15),
('978-0-06-249948-3', 'El guardián entre el centeno', 'J.D. Salinger', 11),
('978-0-06-100200-9', 'Cumbres borrascosas', 'Emily Brontë', 12),
('978-0-06-025665-4', 'La casa de los espíritus', 'Isabel Allende', 14),
('978-0-14-200174-5', 'En el camino', 'Jack Kerouac', 13),
('978-0-06-219539-8', 'El médico', 'Noah Gordon', 14),
('978-1-4052-2581-2', 'Las mil y una noches', 'Anónimo', 16),
('978-0-451-52937-7', 'El retrato de Dorian Gray', 'Oscar Wilde', 12),
('978-0-14-303943-3', 'Fahrenheit 451', 'Ray Bradbury', 13);
