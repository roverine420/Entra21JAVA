package Lista5;
import java.util.Scanner;
public class ex09 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int opcao;
		float valor,qnt; 
		double apagar;
		System.out.println("Qual tipo de combustivel?");
		System.out.println("1 GASOLINA");
		System.out.println("2 ETANOL");
		System.out.println("3 DIESEL");
		opcao = tc.nextInt();
		if (opcao ==1) {
			System.out.println("Voce escolheu GASOLINA");
			System.out.println("Qual a quantidade voce deseja abastecer?");
			qnt = tc.nextFloat();
			apagar = qnt*2.53;
			System.out.println("Total a pagar R$" + apagar);
		}
		else if(opcao ==2) {
			System.out.println("Voce escolheu ETANOL");
			System.out.println("Qual a quantidade voce deseja abastecer?");
			qnt = tc.nextFloat();
			apagar = qnt*2.09;
			System.out.println("Total a pagar R$" + apagar);
			if(qnt >=30) {
				System.out.println("VOCE GANHOU UM BONUS: 1 troca de oleo gratis");
			}
		}
		else if(opcao ==3) {
			System.out.println("Voce escolheu DIESEL");
			System.out.println("Qual a quantidade voce deseja abastecer?");
			qnt = tc.nextFloat();
			apagar = qnt*1.92;
			System.out.println("Total a pagar R$" + apagar);
		}
		else {
			System.out.println("NUMERO INVALIDO");
		}

	}

}
