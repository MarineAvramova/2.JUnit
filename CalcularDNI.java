import java.util.Scanner;

public class CalcularDNI {

	public static void main(String[] args) {
	    int numero = 0;
		int resto;
		char letra;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre el numero de DNI: ");
		numero = entrada.nextInt();
        
		CalcularDNI calcularDNI = new CalcularDNI();
		
		resto = calcularDNI.divisionNumeroDni(numero);
		System.out.println("El resto es " + resto);
		
		letra = calcularDNI.encontrarLaLetra(resto);
		System.out.println("La letra es " + letra);
	}
	
	public int divisionNumeroDni(int numero) {
		int resto = numero % 23;
		return resto;
		}
	
	public char encontrarLaLetra(int resto) {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra = letras.charAt(resto);
		return letra;
	}
}
