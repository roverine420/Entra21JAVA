package Lista5;
import java.util.Scanner;
public class ex162 {

	public static void main(String[] args) {
		Scanner tc= new Scanner(System.in);
		double qnt,valorr;
		int opcao, opcao2;
		double precofinal;
		double valor;
		System.out.println("Escola uma carne");
		System.out.println("(1) para file simples");
		System.out.println("(2) para alcatra");
		System.out.println("(3) para picanha");
		opcao = tc.nextInt();
		System.out.println("Selecione o metodo de pagamento");
		System.out.println("(1) para dinheiro");
		System.out.println("(2) para cartao");
		opcao2 = tc.nextInt();
		System.out.println("Quantos kg?");
		qnt = tc.nextFloat();
		if (opcao == 1 && opcao2 == 2) {
			System.out.println("Voce escolheu File simples");
		if (qnt >5) {
			valor = qnt*4.9;
			precofinal = (valor*5)/100;
			valorr = valor-precofinal;
			System.out.println("O total a ser pago é "+ valorr);
		}
			else if(qnt <5) {
				valor = qnt*5.8;
				precofinal = (valor*5)/100;
				valorr = valor-precofinal;
				System.out.println("O total a ser pago é "+ valorr);
			}	
		}
		if (opcao==2 && opcao2 ==2) {
			System.out.println("Voce escolheu alcatra");
			if (qnt >5) {
				valor = qnt*5.9;
				precofinal = (valor*5)/100;
				valorr = valor-precofinal;
				System.out.println("O total a ser pago é "+ valorr);
			}
			else {
				valor = qnt*6.8;
				precofinal = (valor*5)/100;
				valorr = valor-precofinal;
				System.out.println("O total a ser pago é "+ valorr);
			}		
		}
	   else if (opcao == 3 && opcao2 == 2) {
		   System.out.println("Voce escolheu picanha");
		   if (qnt >5) {
				valor = qnt*6.9;
				precofinal = (valor*5)/100;
				valorr = valor-precofinal;
				System.out.println("O total a ser pago é "+ valorr);
			} 
		   else {
				valor = qnt*7.8;
				precofinal = (valor*5)/100;
				valorr = valor-precofinal;
				System.out.println("O total a ser pago é "+ valorr);
			}  
	   }
	   else if (opcao == 1 && opcao2 != 2) {
				System.out.println("Voce escolheu File simples");
			if (qnt >5) {
				valor = qnt*4.9;
				System.out.println("O total a ser pago é "+ valor);
			}
			else if (qnt <5) {
				valor = qnt*5.8;
				System.out.println("O total a ser pago é "+ valor);
			}   
	   }
	   else if (opcao ==2 && opcao != 2) {
			System.out.println("Voce escolheu alcatra");
		if (qnt >5) {
			valor = qnt*5.9;
			System.out.println("O total a ser pago é "+ valor);
		}
		else if(qnt <5) {
			valor = qnt*6.8;
			System.out.println("O total a ser pago é "+ valor);
		}    
	   
	   }
	   else if (opcao == 3 && opcao !=2) {
			System.out.println("Voce escolheu picanha");
		if (qnt >5) {
			valor = qnt*6.9;
			System.out.println("O total a ser pago é "+ valor);
		}
		else if(qnt <5) {
			valor = qnt*7.8;
			System.out.println("O total a ser pago é "+ valor);
		}   
   
	   }
	}

}
