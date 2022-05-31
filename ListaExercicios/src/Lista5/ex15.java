package Lista5;
import java.util.Scanner;
public class ex15 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
	float saldo,saldof;
		System.out.println("Qual seu saldo medio?");
		saldo = tc.nextFloat();
		
		
		if (saldo >0 && saldo <=200) {
			System.out.println("Voce nao tem nenhum credito");
		}
		else if (saldo >200 && saldo <=400) {
			saldof = (saldo*20)/100;
			System.out.println("Voce tem um credito de 20% do saldo medio. R$" + saldof);
		}
		else if (saldo >400 && saldo <=600) {
			saldof = (saldo*30)/100;
			System.out.println("Voce tem um credito de 30% do saldo medio. R$" + saldof);
		}
		else if (saldo >600) {
			saldof = (saldo*40)/100;
			System.out.println("Voce tem um credito de 40% do saldo medio. R$" + saldof);
		}
		else {
			
		}
	}

}
