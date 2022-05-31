package Lista5;
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int numero;
		
		
	System.out.println("Digite um numero");
	numero = tc.nextInt();
	if (numero ==0) {
	System.out.println("Numero NEUTRO");
	}
	else if (numero >0) {
		System.out.println("Numero POSITIVO");
	}
	else if (numero <0) {
		System.out.println("Numero NEGATIVO");
	}
	}

}
