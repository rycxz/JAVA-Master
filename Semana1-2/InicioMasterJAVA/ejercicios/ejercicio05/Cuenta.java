package ejercicio05;

public class Cuenta {
		private String titular;
		private double cantidad;
		public Cuenta(String titular) {
			super();
			this.titular = titular;
		}
		public String getTitular() {
			return titular;
		}
		public void setTitular(String titular) {
			this.titular = titular;
		}
		public double getCantidad() {
			return cantidad;
		}
		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}
		@Override
		public String toString() {
			return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
		}
		/*•ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad 
introducida es negativa, no se hará nada. 

*/
		public void ingresar(double cantidad) {
			if(cantidad >0) {
				this.cantidad=cantidad+this.cantidad;
			}
			else {
				System.out.println("la cantidad deseada a introducir es  invalida!");
			}
		}
		/*
•retirar(double cantidad): se retira una cantidad a la cuenta, si restando la 
cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a 
ser 0. */
		public void retirar(double cantidad) {
			this.cantidad=this.cantidad-cantidad;
			if(this.cantidad<0) {
				this.cantidad=0;
				System.out.println("tu saldo es " + this.cantidad);
			}
			else {
				System.out.println("tu saldo es " + this.cantidad);
			}
		}
}
