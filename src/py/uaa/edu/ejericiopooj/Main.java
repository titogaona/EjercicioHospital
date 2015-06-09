package py.uaa.edu.ejericiopooj;
import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int d;
//       String grupoSanguineo;
//       System.out.print("Introduzca el nro de Historia Clinica");
//       
//       for (d = 1; d <= 100; d ++); {
//    	   if (sc = );
//       }
// Intentamos implementar el scanner para poder ingresar ahi el nro de Historia Clinica,
//		pero no pudimos encontrar una solucion.
  
		
		
		
		Medico c = new Medico();
		c.setCantidadHoras(3);
		c.setSalarioBase(8000);
		c.calcularSalario();
		c.setCantidadPacientes(8);
		c.setDiasVacaciones(15);
		c.calcularSalarioBaseDiario();
		c.pagarVacaciones();
		
		Empleado m = new Empleado();
		m.setCantidadHoras(15);
		m.setDiasVacaciones(20);
		m.setSalarioBase(200000);
		m.calcularSalario();
		m.calcularSalarioBaseDiario();
		m.pagarVacaciones();
		
		
		System.out.println("El salario es del Empleado M:" + " " + m.getSalario());
		System.out.println("Total de vacaciones pagadas del Empleado M =" + " " +  m.getVacaciones());
		
		System.out.println("El sueldo del Medico C es:" + " "  + c.getSalario());
		System.out.println("Vacaciones del Medico C" + " " + c.getVacaciones());
	}
}
