
public class Empleado extends Persona{
	
	private int idEmpleado;
	private String area;
	
	public Empleado(String nombre, int edad, String sexo
			, int idEmpleado, String area)
	{
		super(nombre, edad, sexo);
		this.setArea(area);
		this.setIdEmpleado(idEmpleado);
	}
	
	public Empleado()
	{
		this("", 0, "", 0, "");
	}
	
	public void setArea(String area)
	{
		this.area = area;
	}
	
	public void setIdEmpleado(int id)
	{
		this.idEmpleado = id;
	}
	
	public String getArea()
	{
		return this.area;
	}
	
	public int getIdEmpleado()
	{
		return this.idEmpleado;
	}


	public String toString()
	{
		String nombre = "Nombre del empleado: " + this.getNombre();
		String sexo = "Sexo del empleado: " + this.getSexo();
		String edad = "Edad del empleado" + this.getEdad();
		String areaEmpleado = "Area que desempeña el empleado: " + this.getArea();
		String idEmpleado = "El id del empleado es: " + this.getIdEmpleado();
		
		return String.format("%s\n%s\n%s\n%s\n%s\n", nombre, sexo, edad, areaEmpleado, idEmpleado);
	}
}
