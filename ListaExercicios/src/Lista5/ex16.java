package Lista5;
import java.util.Scanner;
public class ex16 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		int opcao, desconto =5;
		float qnt;
		float qnt_total; 
		double preco;
		System.out.println("Escolha a carne");
		System.out.println("(1) para file duplo");
		System.out.println("(2) para alcatra");
		System.out.println("(3) picanha");
		opcao = tc.nextInt();
		System.out.println("Quantos kg?");
		qnt = tc.nextFloat();
		System.out.println("Selecione o metodo de pagamento");
		System.out.println("(1) Para dinheiro");
		System.out.println("(2) Para cartao");
		int opcao2 = tc.nextInt();
		double precofinal;
		if (opcao ==1) {
		System.out.println("Voce escolheu file duplo");
		
		if (qnt > 5) {
			preco = qnt*4.9;
			System.out.println("Total a ser pago: R$" + preco);
		}
		else if (opcao < 5) {
			preco = qnt*5.8;
			System.out.println("Total a ser pago: R$" + preco);	
		}
		else if (opcao ==1 && opcao2 ==2) {
			System.out.println("Voce escolheu file duplo");
			
			if (qnt > 5) {
				preco = qnt*4.9;
				precofinal = (preco*5)/100;
				System.out.println("Total a ser pago: R$" + preco);
			}
			else {
				preco = qnt*5.8;
				precofinal = (preco*5)/100;
				System.out.println("Total a ser pago: R$" + preco);
				System.out.println("Total a ser pago: R$" + preco);	
				
			}
		}
		
		else if (opcao==2) {
		System.out.println("Voce escolheu alcatra");
		if (qnt > 5) {
			preco = qnt*5.9;
			System.out.println("Total a ser pago: R$" + preco);
		}
		else {
			preco = qnt*6.8;
			System.out.println("Total a ser pago: R$" + preco);
		}
		}
		else if (opcao ==3) {
		System.out.println("Voce escolheu picanha");
		if (qnt > 5) {
			preco = qnt*7.8;
			System.out.println("Total a ser pago: R$" + preco);
		}
		else {
			preco = qnt*6.9;
			System.out.println("Total a ser pago: R$" + preco);
		}
		}
		
		else {
			System.out.println("Numero invalido");
		}
	}

	}
}
