package principios;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo coche = new Vehiculo("ford", "fiesta", "rojo", "8787");
		Vehiculo coche1 = new Vehiculo("bmw", "", "blanco", "999");
		coche.setColor("verde");
		
		Object obj = coche;
		coche1 = coche;	
		
		coche1.setColor("azul marino");
		
		System.out.println(coche);
		System.out.println(obj);
		System.out.println(coche1);
		
		Motocicleta moto = new Motocicleta("Honda", "CRM", "rojo", "AL343");		
				
		System.out.println(obj instanceof Vehiculo);
		System.out.println(coche instanceof Object);
		System.out.println(coche1 instanceof Motocicleta);
		System.out.println(moto instanceof Object);
		
		System.out.println("--------------------------------------");
		System.out.println(moto.ficha().getMarca());
		System.out.println("______________________________________");
		
		
		Vehiculo vector[] = {coche, moto};
		
		
		System.out.println("--------------------------------------");
		System.out.println(vector[0] instanceof Motocicleta);
		System.out.println(vector[1] instanceof Motocicleta);
		System.out.println(vector[1] instanceof Vehiculo);
		System.out.println("--------------------------------------");
		
		//vector[1].getManillar();
		
		
		
		Motocicleta m1 = (Motocicleta)vector[1];
		m1.setManillar(false);						
		System.out.println( ((Motocicleta)vector[1]).getManillar() );
		
		
		// Foreach
		/*for(Vehiculo item: vector){
			System.out.println(item.ficha().getModelo());
		}
		*/
	}

}
