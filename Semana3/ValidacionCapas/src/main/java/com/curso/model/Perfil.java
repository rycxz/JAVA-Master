package com.curso.model;

public class Perfil {
		private String usuario;
		private String pwd;
		private String correo;
		private int edad;
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getCorreo() {
			return correo;
		}
		public void setCorreo(String correo) {
			this.correo = correo;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public Perfil(String usuario, String pwd, String correo, int edad) {
			super();
			this.usuario = usuario;
			this.pwd = pwd;
			this.correo = correo;
			this.edad = edad;
		}
		@Override
		public String toString() {
			return "Perfil [usuario=" + usuario + ", pwd=" + pwd + ", correo=" + correo + ", edad=" + edad + "]";
		}
		
}
