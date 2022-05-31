package Lista6;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		Scanner tc =  new Scanner(System.in);
		
		int carteira = 0;
		int numMulta=0;
		int reg;
		float maior=0;
		float soma=0;
		float val=0;
		float cnhM=0;
		float granaD=0;
		
		System.out.println("Insira a quantidade de registros para computar: ");
		reg = tc.nextInt();
		
			for(int contador = 0; contador <reg; contador++) {
				soma=0;
				System.out.println("Insira o numero da carteira: ");
				carteira = tc.nextInt();
				System.out.println("Insira o numero de multas");
				numMulta = tc.nextInt();
				if(numMulta> maior) { 
					maior = numMulta;
					cnhM = carteira;
					
			}
				for(int contador2 = 0; contador2 <numMulta; contador2++) {
				System.out.println("Insira o valor da multa : ");
				val = tc.nextInt();
				soma +=val;
				granaD += val;
				
				if(contador2==numMulta) { 
					break;
				}
			}		
			System.out.println("O motorista da carteira: "+ carteira +" Teve: " + numMulta + " multas, tera que pagar: R$" +soma);
		}
		System.out.println("O maior numero de multas foi: "+ maior +" do motorista: "+ cnhM+" tera que pagar: R$ "+soma);
	    System.out.println("Total arrecadado foi de : R$"+granaD);
	    
	}
}
