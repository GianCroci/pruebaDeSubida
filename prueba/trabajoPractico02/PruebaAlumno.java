package trabajoPractico02;

public class PruebaAlumno {

	public static void main(String[] args) {
		// Calcular el promedio de las notas
        String nombre = "Gian";
        float nota1 = 10.0F;
        float nota2 = 10.0F;
        float promedio = (nota1 + nota2) / 2;
        
        //System.out.print("El promedio del alumno " + nombre + " es " + promedio);
        
        // POO 
        
        Alumno gian;
        gian = new Alumno();
        gian.setNombre("Gian");
        gian.setNota1(10.0F);
        gian.setNota2(10.0F);
       // gian.promedio = (gian.nota1 + gian.nota2) / 2;
        System.out.println("El promedio del alumno " + gian.getNombre() + " es " + gian.calcularElPromedio());
        
      
        
        
        
	}

}
