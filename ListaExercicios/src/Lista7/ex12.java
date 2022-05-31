package Lista7;
import java.util.Scanner;
public class ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean par = true;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Digite um numero: ", i);
			vetorA[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				par = true;
			}
			else {
				par = false;
				break;
			}
		}
		
		if (par) {
			System.out.println("Todos os elementos do vetor são pares.");
		}
		else {
			System.out.println("Quase todos os vetores sao pares");
		}


	}

}
