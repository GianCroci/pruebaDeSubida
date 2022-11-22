package trabajoPractico02;

public class PruebaASCII {

	public static void main(String[] args) {
		System.out.println("La tabla ASCII es el resultado de apretear la tecla Alt + un numero, eso devuelve el caracter correspondiente en la tabla");
		int codigoAsciiNumeros=48;
		int numeroEntero=0;
		System.out.println("Numeros Enteros:");
		while(codigoAsciiNumeros<58) {	
			System.out.print(codigoAsciiNumeros + "-" + numeroEntero + " / ");
			codigoAsciiNumeros++;
			numeroEntero++;
		}
		System.out.println("");
		int codigoAsciiLetrasMin=97;
		char letraMinuscula='a';
		System.out.println("Letras Minusculas:");
		while(codigoAsciiLetrasMin<123) {	
			System.out.print(codigoAsciiLetrasMin + "-" + letraMinuscula + " / ");
			codigoAsciiLetrasMin++;
			letraMinuscula++;
		}
		System.out.println("");
		int codigoAsciiLetrasMay=65;
		char letraMayuscula='A';
		System.out.println("Letras Mayusculas:");
		while(codigoAsciiLetrasMay<91) {	
			System.out.print(codigoAsciiLetrasMay + "-" + letraMayuscula + " / ");
			codigoAsciiLetrasMay++;
			letraMayuscula++;
		}
		System.out.println("");
		int codigoAsciiCaracterEspecial=33;
		char caracterEspecial='!';
		System.out.println("Caracteres Especiales:");
		while(codigoAsciiCaracterEspecial<48) {	
			System.out.print(codigoAsciiCaracterEspecial + " - " + caracterEspecial + " / ");
			codigoAsciiCaracterEspecial++;
			caracterEspecial++;
		}

	}

}
