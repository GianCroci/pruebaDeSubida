package trabajoPractico01;

public class PruebaTelevisor {

	public static void main(String[] args) {
		
		Televisor philco = new Televisor();
		
		philco.setCanal(20);
//		philco.volverAlCanalAnterior();
		
		System.out.println("el canal es: " + philco.getCanal());
		
        philco.setCanal(33);
		
		System.out.println("el canal es: " + philco.getCanal());
		
	
		
		System.out.println("el canal es: " + philco.getCanalAnterior() 	);

	}

}
