
public class Jefe extends Persona{
	
	private String cargo;
	private double salario;

	//CONSTRUCTOR
	public Jefe(String nombre, 
				int edad, 
				String sexo, 
				String cargo, 
				double salario)
	{
		super(nombre, edad, sexo);
		this.setCargo(cargo);
		this.setSalario(salario);
	}
	
	//constructor vacio
	public Jefe()
	{
		this("",0,"","",0.0);
	}
	
	public void setCargo(String cargo)
	{
		this.cargo = cargo;
	}
	
	public void setSalario(double salario)
	{
		this.salario = (salario > 0) ? salario : 0.0;
	}
	
	public String getCargo()
	{
		return this.cargo;
	}
	
	public double getSalario()
	{
		return this.salario;
	}
	
	public String toString()
	{
		String nombre = "Nombre del jefe: " + this.getNombre();
		String sexo = "Sexo del jefe: " + this.getSexo();
		String edad = "Edad del jefe" + this.getEdad();
		String salario = "Salario que obtiene el jefe: " + this.getSalario();
		String cargo = "El cargo del jefe es: " + this.getCargo();
		
		return String.format("%s\n%s\n%s\n%s\n%s", nombre, sexo, edad, salario, cargo);
	}

}
