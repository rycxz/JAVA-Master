package com.curso.colegio;

import java.util.Objects;

public class Nota {
		private String asigantura;
		private int valor;
		public String getAsigantura() {
			return asigantura;
		}
		public void setAsigantura(String asigantura) {
			this.asigantura = asigantura;
		}
		public int getValor() {
			return valor;
		}
		public void setValor(int valor) {
			this.valor = valor;
		}
		public Nota(String asigantura, int valor) {
			super();
			this.asigantura = asigantura;
			this.valor = valor;
		}
		@Override
		public String toString() {
			return "Nota [asigantura=" + asigantura + ", valor=" + valor + "]";
		}
		
		
		@Override
		public int hashCode() {
			return Objects.hash(asigantura, valor);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Nota other = (Nota) obj;
			return Objects.equals(asigantura, other.asigantura) && valor == other.valor;
		}
		public boolean esMismaAsigantura(Nota otra) {
			if(asigantura.equalsIgnoreCase(otra.getAsigantura())) {
				return true;
			}
			else {
				return false;
			}
		}
		public boolean esMayorNota(Nota o ) {
			if(this.esMismaAsigantura(o)) {
				if(this.valor>o.getValor()) {
					return true;
				}
				else {
					return false;
				}
				
			}
			else {
				throw new RuntimeException("No son la misma asigantura");
			}
		}
}
