package clase_37;

import wallet.*;

public class EjecicioCoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaBancaria cuenta= new CuentaBancaria(100,50000.0);
		Cliente cliente = new Cliente(1,"Jaime",cuenta);
		cliente.consultarDatos();
		System.out.println("-----------------------");
		
		CuentaBancaria cuentaJaimeAntesCasino=cliente.getCuenta();
		cuentaJaimeAntesCasino.depositar(1000000);
		System.out.println("Antes de Casino");
		
		cliente.consultarDatos();
		
		System.out.println("-----------------------");
		
		CuentaBancaria cuentaJaimeDespuesCasino=cliente.getCuenta();
		cuentaJaimeDespuesCasino.retirar(1000000);
		System.out.println("Despues de Casino");
		
		cliente.consultarDatos();

	}

}
