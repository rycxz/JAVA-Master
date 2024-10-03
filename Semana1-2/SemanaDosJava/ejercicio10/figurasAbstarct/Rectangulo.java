package figurasAbstarct;

public class Rectangulo extends FigurasGeometricas {
		private double base;
		private double altura;
		private final static int NUMERO_LADOS_REPETIDOS_RECTANGULO=2;
		@Override
		public double calcuarPerimetro() {
			// TODO Auto-generated method stub
			return NUMERO_LADOS_REPETIDOS_RECTANGULO*(this.base*this.altura);
		}
		@Override
		public double calcularArea() {
			// TODO Auto-generated method stub
			return this.base*this.altura;
		}
		public double getBase() {
			return base;
		}
		public void setBase(double base) {
			this.base = base;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		@Override
		public String toString() {
			return "Rectangulo [base=" + base + ", altura=" + altura + "]";
		}
		public Rectangulo(double base, double altura) {
			super();
			this.base = base;
			this.altura = altura;
		}
		
		
		
}
