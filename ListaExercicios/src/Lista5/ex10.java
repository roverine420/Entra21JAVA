package Lista5;
import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int laranja = 60;
		int limao = 80;
		int morango = 20;
		int opcao;
		int qnt;
		float valor;
		float total;
		System.out.println("Qual fruta voce deseja?");
		System.out.println("1 LARANJA");
		System.out.println("2 LIMAO");
		System.out.println("3 MORANGO");
		opcao = tc.nextInt();
		
		if (opcao ==1) {
			System.out.println("Voce escolheu LARANJA");
			System.out.println("Quantas unidades voce deseja?");
			qnt = tc.nextInt();
			System.out.println("Qual o valor pela unidade?");
			valor = tc.nextFloat();
			if(qnt>60) {
				System.out.println("Estoque insuficiente");
			}
			total = qnt*valor;
			System.out.println("Total a pagar R$" + total);
			
		}
		else if (opcao ==2) {
			System.out.println("Voce escolheu LIMAO");
			System.out.println("Quantas unidades voce deseja?");
			qnt = tc.nextInt();
			System.out.println("Qual o valor pela unidade?");
			valor = tc.nextFloat();
			if(qnt>80) {
				System.out.println("Estoque insuficiente");
			}
			total = qnt*valor;
			System.out.println("Total a pagar R$" + total);
			
		}
		else if (opcao ==3) {
			System.out.println("Voce escolheu MORNAGO");
			System.out.println("Quantas unidades voce deseja?");
			qnt = tc.nextInt();
			System.out.println("Qual o valor pela unidade?");
			valor = tc.nextFloat();
			if(qnt>20) {
				System.out.println("Estoque insuficiente");
			}
			total = qnt*valor;
			System.out.println("Total a pagar R$" + total);
			}
		else {
			System.out.println("ERRORR 5544 445 555");
		}

	}

}
