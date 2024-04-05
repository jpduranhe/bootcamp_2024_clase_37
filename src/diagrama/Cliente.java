package diagrama;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;

	
	
	public void actualizarDatos(ClienteVO cliente) {
		
		this.nombre=cliente.getNombre();
		this.apellido= cliente.getApellido();
		this.direccion = cliente.getDireccion();
		this.dni= cliente.getDni();
		
	}
}
