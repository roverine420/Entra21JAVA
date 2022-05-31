package Lista6;
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		boolean control = true;
		int num,soma=0,produto=0;
		
		while (control ==true) {
			System.out.println("Digite um numero positivo e para terminar em negativo ou zero");
			num = tc.nextInt();
			
			if (num <=0 ) {
				break;
		}
			else {
				if((num%2)==0) {
					soma += num;
		}
			else {
				if(produto ==0) {
					produto =1;
			}
				produto *= num;
		}
			
	}
		
}
		System.out.printf("%n%s %d %n%s %d","produto dos numero impares: ", produto, "soma dos numeros pares", soma);
		tc.close();
	}	
}