	
	package com.curso.model;
	import jakarta.persistence.Column;
import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.NamedQueries;
	import jakarta.persistence.NamedQuery;
	import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula")
@NamedQueries({
	@NamedQuery(name="mostrarPelicula", query="Select p from Pelicula p"),
	@NamedQuery(name="directorCosme", query="Select p from Pelicula p where director = :director"),
	@NamedQuery(name="buscarPorDirectorM", query="Select p from Pelicula p where director = :director "),
	@NamedQuery(name="buscarPorDirector", query="Select p from Pelicula p where director = "
			+ ":director or director = :director1 "),
	@NamedQuery(name="directoresPeliculas", query="Select director from Pelicula p"),
	@NamedQuery(name="precioPelicula", query="Select p from Pelicula p where precio_alquiler > :precio_alquiler and "
			+ "precio_alquiler < :precio_alquiler1  "),
	@NamedQuery(name="peliculasAlquiler", query="Select precio_alquiler ,count(precio_alquiler) from Pelicula p group by precio_alquiler")
		//aunque tabien se podria hacer de forma resumida usando una consulta para mas de una pero
	//de cara a que el codigo sea mas enetdible me parece mas correcto separarlo aunque sea mas codigo
})
/**
 * 
 * @author Ricardo Sorin Almajan
 * 
 * clase pelicula que servira para las namedquerys
 *
 */
public class Pelicula {
				@Id 
		private int  Código;
		private String  titulo;
		private String  director;
		@Column(name = "precio_alquiler")
		private double  precioAlquiler;
		public int getCódigo() {
			return Código;
		}
		public void setCódigo(int código) {
			Código = código;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		public double getPrecioAlquiler() {
			return precioAlquiler;
		}
		public void setPrecioAlquiler(double precioAlquiler) {
			this.precioAlquiler = precioAlquiler;
		}
		public Pelicula(int código, String titulo, String director, double precioAlquiler) {
			super();
			Código = código;
			this.titulo = titulo;
			this.director = director;
			this.precioAlquiler = precioAlquiler;
		}
		@Override
		public String toString() {
			return "Pelicua [Código=" + Código + ", titulo=" + titulo + ", director=" + director + ", precio_alquiler="
					+ precioAlquiler + "]";
		}
}
