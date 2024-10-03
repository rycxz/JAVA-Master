package figurasAbstarct;

public class TrianguloEquilatero extends FigurasGeometricas   {
		private double lado;
		private double altura;
		private double base;
 
	@Override
		public String toString() {
			return "TrianguloEquilateroInter [lado=" + lado + ", altura=" + altura + ", base=" + base + "]";
		}

	public TrianguloEquilatero(double lado, double altura, double base) {
			super();
			this.lado = lado;
			this.altura = altura;
			this.base = base;
		}

	public double getLado() {
			return lado;
		}

		public void setLado(double lado) {
			this.lado = lado;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}

		public double getBase() {
			return base;
		}

		public void setBase(double base) {
			this.base = base;
		}

	@Override
	public double calcuarPerimetro() {
		// TODO Auto-generated method stub
		return (lado+lado+base);
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return ((base*altura)/2);
	}

}
