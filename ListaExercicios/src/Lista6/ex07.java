package Lista6;
import java.util.Scanner;
public class ex07 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		boolean opcao = true;
		double num;
		int conta = 0;
		
		while (opcao) {
			System.out.println("Digite um numero");
			num = tc.nextDouble();
			
			if (num == 0) {
				break;
			}
			else if(num >= 100 && num <= 200) {
				++conta;
			}
			if (conta !=0) {
				System.out.printf("%s digitados %d %s entre 100 e 200.",(conta>1)? "Foram" : "foi", conta, (conta >1)? " numeros" : "numeros");
			}
			else {
				System.out.println("Não foram digitados numeros entre 100 e 200");
				opcao= false;
			}
			
		}
	}

}
