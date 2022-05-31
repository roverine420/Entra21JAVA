package Lista7;
import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Digite um numero: ", i);
			vetorA[i] = sc.nextInt();
			
			vetorB[vetorB.length-1-i] = vetorA[i];
		}
		
		System.out.print("\nValores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + (i == (vetorA.length - 1)? "." : ", "));
		}
		
		System.out.print("\nValores do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + (i == (vetorB.length - 1)? "." : ", "));
		}

	}

}
