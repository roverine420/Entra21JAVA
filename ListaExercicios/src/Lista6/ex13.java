package Lista6;
import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int numero = 0;
		int num = 0;
		
		while(true) {
			System.out.println("Digite um numero positivo ou -1 para finalizar");
			num = tc.nextInt();
			if(num > numero) {
				numero=num;
		}
			if(num == -1) {
				System.out.println("O maior valor digitado � "+ numero);
				break;
			}
		

	}
	}
}
