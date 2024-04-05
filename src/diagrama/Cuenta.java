package diagrama;

public class Cuenta {
	
	private String alias;
	private String nroCuenta;
	protected double balance;
	private Cliente cliente;
		
		
	
	
	
	public Cuenta(String alias, String nroCuenta, double balance, Cliente cliente) {
		this.alias = alias;
		this.nroCuenta = nroCuenta;
		this.balance = balance;
		this.cliente = cliente;
	}
	public void extraer(double cantidad) {
		
		this.balance-=cantidad;
		
	}
	public void depositar(double cantidad) {
		this.balance+=cantidad;
	}
	public double obtenerBalance() {
		return this.balance;
	}
}
