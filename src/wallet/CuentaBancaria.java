package wallet;

public class CuentaBancaria {

	public CuentaBancaria(int numeroDeCuenta,double saldoActual) {
		this.numeroDeCuenta=numeroDeCuenta;
		this.saldoActual=saldoActual;
	}
	
	private int numeroDeCuenta;
	private double saldoActual;
	
	
	public void depositar(double monto) {
		this.saldoActual+=monto;
	}
	
	public void retirar(double monto) {
		
		this.saldoActual-=monto;
	}
		

	public int getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(int numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}
	
	
	
}
