package diagrama;

public class Runner {

	public static void main(String[] args) {
		
		ClienteVO clienteVO= new ClienteVO();
		clienteVO.setNombre("Tomas");
		clienteVO.setApellido("Gonzalez");
		clienteVO.setDireccion("Avda Siempre viva 132");
		clienteVO.setDni(152);
		
		Cliente cliente= new Cliente();
		cliente.actualizarDatos(clienteVO);
		
		Cuenta cuenta= new Cuenta("CTACTE","200-200",0.0,cliente);
		
		cuenta.depositar(200.0);
		cuenta.obtenerBalance();
	}

}
