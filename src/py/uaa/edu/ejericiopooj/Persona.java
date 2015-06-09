package py.uaa.edu.ejericiopooj;

public abstract class Persona {

	public int nroCI;
	public String nombre;
	public String direccion;
	public int edad;
	
	
	public int getNroCI() {
		return nroCI;
	}
	public void setNroCI(int nroCI) {
		this.nroCI = nroCI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
