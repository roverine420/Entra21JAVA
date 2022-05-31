package Lista5;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int numero,numeropar, numeroimpar,teste;
		System.out.println("Digite um numero");
		numero = tc.nextInt();
	teste =	(numero%2);
	
	
	switch(teste) {
	case 0: System.out.println("Par");break;
	default: System.out.println("Impar");
	
	}
	}
}
