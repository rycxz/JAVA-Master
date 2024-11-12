create database if not exists agenciaViajes;
use agenciaViajes;
drop database agenciaviajes;


drop table hoteles;
CREATE TABLE IF NOT EXISTS hoteles (
    id int unsigned PRIMARY KEY auto_increment,
    nombre varchar(100) not null,
	categoria varchar(100) NOT NULL,
    precio double unsigned,
    disponible boolean
);
drop table vuelos;
CREATE TABLE IF NOT EXISTS vuelos (
    id  int unsigned PRIMARY KEY auto_increment,
    compañia varchar(100) NOT NULL,
	fechaVuelo datetime,
    precio double ,
    plazas int unsigned
);
drop table reservas;
CREATE TABLE IF NOT EXISTS reservas (
    id int unsigned PRIMARY KEY auto_increment,
    nombre_cliente varchar(100) NOT NULL,
	dni varchar(100) not null,
    cantidad_personas int unsigned,
    id_hoteles int unsigned,
    id_vuelos int unsigned,
      FOREIGN KEY (id_hoteles) REFERENCES hoteles(id) ON DELETE CASCADE,
    FOREIGN KEY (id_vuelos) REFERENCES vuelos(id) ON DELETE CASCADE
);