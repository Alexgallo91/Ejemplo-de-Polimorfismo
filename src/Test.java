
public class Test {

	public static void main(String[] args) 
	{
		System.out.println("PRUEBA DE POLIMORFISMO\n\n");
		
		//se instancian los objetos
		Empleado miEmpleado = new Empleado("Alex", 23, "Masculino", 1, "Sistemas / IT");
		Jefe miJefe = new Jefe("Jose", 40, "masculino", "Negocios", 80000);
		Empleado miEmpleado2 = new Empleado("Jose", 33, "masculino", 2, "contabilidad");
		Persona persona1 = miEmpleado;
		Persona persona2 = miJefe;
		
		Persona []personas = {miEmpleado, miEmpleado2, miJefe, persona1, persona2};
		
		for(Persona laPersona : personas)
		{
			System.out.println(laPersona);
			
			if(laPersona instanceof Jefe)
			{
				System.out.println("Este en realidad es un jefe");
				System.out.println();
			}
		}
	}

}
