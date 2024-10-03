package impresora;

public class Pagina implements Imprimible{

	
	private int nPagina;
	private int nLineas;
	@Override
	public void informeLargo() {
		System.out.println("Informe Largo: La pagina es " + nPagina + " y tiene " 
				+ nLineas + " lineas.");
		
	}

	@Override
	public void informeCorto() {
		System.out.println("Informe Corto: La pagina es " + nPagina);
		
	}

	public int getnPagina() {
		return nPagina;
	}

	public void setnPagina(int nPagina) {
		this.nPagina = nPagina;
	}

	public int getnLineas() {
		return nLineas;
	}

	public void setnLineas(int nLineas) {
		this.nLineas = nLineas;
	}

	@Override
	public String toString() {
		return "Pagina [nPagina=" + nPagina + ", nLineas=" + nLineas + "]";
	}

	public Pagina(int nPagina, int nLineas) {
		super();
		this.nPagina = nPagina;
		this.nLineas = nLineas;
	}
	
	
	
}
