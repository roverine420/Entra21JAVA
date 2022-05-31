package Pseudocodigo2;
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
			double peso_prato,valor;
			double tara;
		System.out.println("Seja bem vindo ao restaurante!!");
		System.out.println("Self service R$20 kg");
		System.out.println("Qual peso do seu prato?");
		peso_prato = tc.nextFloat();
		tara = 0.230;
		valor = (peso_prato - tara)*20;
		System.out.println("O valor do seu prato é R$:" + valor);
	}

}
