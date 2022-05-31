package Lista5;
import java.util.Scanner;
public class ex08 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		double compra, apagar,porcento;
		double desconto = 0.1;
		System.out.println("Qual o total da compra?");
		compra = tc.nextFloat();
		System.out.println("Qual metodo de pagamento?");
		System.out.println("1: Dinheiro");
		System.out.println("1: CARTAO");
		System.out.println("1: Cheque");
		int opcao = tc.nextInt();
		
		if (opcao == 1 && compra >=100) {
			porcento = (desconto*compra);
			apagar = compra-porcento;
			System.out.println("Total a pagar: R$" + apagar );
		}
		else if (opcao >1 && opcao <=3) {
			System.out.println("Total a pagar " + compra);
		}
		else if (opcao >3) {
			System.out.println("ERRO, NUMERO INVALIDO");
		}

	}

}
