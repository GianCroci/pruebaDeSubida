package trabajoPractico02;

public class Alumno {
	//Caracteristicas o atributos
	
	private String nombre;
	private float nota1;
	private float nota2;
	
	//metodos
	public float calcularElPromedio(){
		float resultado;
		
		resultado = (nota1 + nota2)/2;
		
		return resultado;
	}
	
	public void setNota1(float valor) {
		nota1 = valor;
	}
	
	public void setNota2(float valor) {
		nota2 = valor;
	}
	
	public void setNombre(String valor) {
		nombre = valor;
	}
	
	public String getNombre(){
		return nombre;
	}

}
