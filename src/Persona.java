
public abstract class Persona {
	
	private String nombre;
	private int edad;
	private String sexo;
	
	//CONSTRUCTORES	
	
	//constructor con parametos vacios
	public Persona()
	{
		this("",0,"");
	}
	
	public Persona(String nombre, int edad, String sexo)
	{
		setEdad(edad);
		setNombre(nombre);
		setSexo(sexo);
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}
	
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public int getEdad()
	{
		return this.edad;
	}
	
	public String getSexo()
	{
		return sexo;
	}
	
	public String toString()
	{
		return String.format("Nombre: %s\n"
						   + "Edad: %d\n"
						   + "Sexo: %s\n", this.getNombre(), this.getEdad(), this.getSexo());
	}
	
}
