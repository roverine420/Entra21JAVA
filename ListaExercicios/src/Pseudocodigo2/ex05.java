package Pseudocodigo2;
import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
			int atraso;
			double valor;
	
	System.out.println("Seja bem-vindo a Biblioteca");
    System.out.println("Quantos dias de atraso?");
			atraso = tc.nextInt();
			valor = atraso*2.50;
	System.out.println("O seu atraso resultou em " + "R$" + valor);
	System.out.println("Obrigado e volte sempre que precisar!");
	
	}

}
