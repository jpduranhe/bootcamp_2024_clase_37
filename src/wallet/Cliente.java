package wallet;

public class Cliente {
	
	private long id;
	private String nombre;
	private CuentaBancaria cuenta;
	
	
	public Cliente (int id,String nombre,CuentaBancaria cuenta) {
		this.id=id;
		this.nombre=nombre;
		this.cuenta=cuenta;
	}
	public Cliente() {}
	
	public long getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public CuentaBancaria getCuenta() {
		return cuenta;
	}
	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}
	
	public void consultarDatos() {
		System.out.println("Id del Cliente:"+this.id);
		System.out.println("Nombre del Cliente:"+this.getNombre());
		System.out.println("Datos de la Cuenta:");
		System.out.println("Nro Cuenta:"+this.getCuenta().getNumeroDeCuenta());
		System.out.println("Saldo Actual:"+this.getCuenta().getSaldoActual());
	}
	
}
