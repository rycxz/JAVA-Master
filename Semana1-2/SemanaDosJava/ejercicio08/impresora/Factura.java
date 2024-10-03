package impresora;

public class Factura   implements Imprimible{
	
	private int nFactura;
	private int codigoCliente;
	public int getnFactura() {
		return nFactura;
	}
	public void setnFactura(int nFactura) {
		this.nFactura = nFactura;
	}
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	@Override
	public void informeLargo() {
		System.out.println("Informe Largo:el nuemro de la factura es " +nFactura + 
				" y el numero de cliente es " + codigoCliente);
		
	}
	@Override
	public void informeCorto() {
		System.out.println("Informe Corto : el numero de la factura es " + nFactura);
		
	}
	@Override
	public String toString() {
		return "Factura [nFactura=" + nFactura + ", codigoCliente=" + codigoCliente + "]";
	}
	public Factura(int nFactura, int codigoCliente) {
		super();
		this.nFactura = nFactura;
		this.codigoCliente = codigoCliente;
	}
	
	

}
