package py.uaa.edu.ejericiopooj;

public class Medico {
	public int salarioBase;
	public int cantidadHoras;
	public String especialidad;
	public int cantidadPacientes;
	public int salario;
	public int salarioDiario;
	public int vacaciones;
	public int diasVacaciones;

	
	public int getDiasVacaciones() {
		return diasVacaciones;
	}
	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}
	public double getSalario() {
		return salario;
	}
	public int getSalarioDiario() {
		return salarioDiario;
	}
	public void setSalarioDiario(int salarioDiario) {
		this.salarioDiario = salarioDiario;
	}
	public int getVacaciones() {
		return vacaciones;
	}
	public void setVacaciones(int vacaciones) {
		this.vacaciones = vacaciones;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}
	public int getCantidadHoras() {
		return cantidadHoras;
	}
	public void setCantidadHoras(int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public int getCantidadPacientes() {
		return cantidadPacientes;
	}
	public void setCantidadPacientes(int cantidadPacientes) {
		this.cantidadPacientes = cantidadPacientes;
	}
	
	public double calcularSalario(){
		salario = (int) (salarioBase * 0.9 * cantidadHoras + salarioBase);
		return salario;
	}
	
	public int calcularSalarioBaseDiario(){
		salarioDiario = salarioBase / 30;
		return salarioDiario;
	}
	
	public int pagarVacaciones() {
		vacaciones = (int) (salarioDiario * diasVacaciones + 0.3 * cantidadPacientes);
		return vacaciones;
	}
	
	
	public static void main(String[] args) {
//		Medico c = new Medico();
//		c.setCantidadHoras(2);
//		c.setSalarioBase(5000);
//		c.calcularSalario();
//		c.setCantidadPacientes(2);
//		c.setDiasVacaciones(2);
//		c.calcularSalarioBaseDiario();
//		c.pagarVacaciones();
//		
//		System.out.println("El sueldo es:" + " "  + c.getSalario());
//		System.out.println("Vacaciones" + " " + c.getVacaciones());
//		
	}
	
}
