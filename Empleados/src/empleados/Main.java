package empleados;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Empleado> empleados = new ArrayList<>();
		
		
		for(int i=0; i<5; i++){			
			// Crea un empleado Asalariado
			empleados.add(new EmpleadoAsalariado(i*1000));	// SET Salario
			
			Empleado tmpEmp = empleados.get(i); 
			tmpEmp.setNombre(Integer.toString(i));			// SET Nombre
			
			// Introducir y comprobar DNI
			try {
				tmpEmp.setDni("20461325L");		// SET dni
			} catch (Exception e) {				// Si el dni es incorrecto, causa una excepci�n
				e.printStackTrace();
			}
			
			// Titulaciones
			tmpEmp.setTitulaciones("Ingeniero de obras", "Topografo", "Astronomo");
		}
		
		
		
		for(int i=5; i<10; i++){
			// Crea un empleado a contrato por obra (Empleado por horas)
			empleados.add(new EmpleadoPorHoras(i*1000));	// SET Precio por hora
			
			Empleado tmpEmp = empleados.get(i); 
			tmpEmp.setNombre(Integer.toString(i));			// SET Nombre
			
			// Introducir y comprobar DNI
			try {
				tmpEmp.setDni("20461325L");		// SET dni
			} catch (Exception e) {				// Si el dni es incorrecto, causa una excepci�n
				e.printStackTrace();
			}
			
			// Titulaciones
			tmpEmp.setTitulaciones("Ingeniero de obras", "Topografo", "Astronomo");
		}
		
		
		
		// Imprime la informaci�n por pantalla
		for(Empleado emp:empleados)
			System.out.println(emp.presentarInfo());
			
	}

}
