package py.uaa.edu.ejericiopooj;

public class Empleado extends Persona{
	public int salarioBase;
	public int cantidadHoras;
	public int salario;
	public int diasVacaciones;
	public int salarioDiario;
	public int vacaciones;

	
	public int getVacaciones() {
		return vacaciones;
	}
	public void setVacaciones(int vacaciones) {
		this.vacaciones = vacaciones;
	}
	public int getSalarioDiario() {
		return salarioDiario;
	}
	public void setSalarioDiario(int salarioDiario) {
		this.salarioDiario = salarioDiario;
	}
	public int getDiasVacaciones() {
		return diasVacaciones;
	}
	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}
	public int getSalario() {
		return salario;
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
	
	public int calcularSalario(){
		salario = (int) (salarioBase * 0.5 * cantidadHoras + salarioBase);
		return salario;
	}
	
	public int calcularSalarioBaseDiario(){
		salarioDiario = salarioBase / 30;
		return salarioDiario;
	}
	
	public int pagarVacaciones() {
		vacaciones = salarioDiario * diasVacaciones;
		return vacaciones;
	}
	public static void main(String[] args) {
//		Empleado m = new Empleado();
//		m.setCantidadHoras(2);
//		m.setDiasVacaciones(2);
//		m.setSalarioBase(2000000);
//		m.calcularSalario();
//		m.calcularSalarioBaseDiario();
//		m.pagarVacaciones();
//		
//		
//		System.out.println("El salario es:" + " " + m.getSalario());
//		System.out.println("Pagar vacaciones =" + " " +  m.getVacaciones());
	}
}