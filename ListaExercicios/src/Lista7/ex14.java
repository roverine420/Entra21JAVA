package Lista7;
import java.util.Scanner;
public class ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] vetorA = new double[10];
		double[] vetorB = new double[10];
		double[] vetorC = new double[vetorA.length + vetorB.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Digite um numero: ", i);
			vetorA[i] = sc.nextDouble();
			
			vetorC[i] = vetorA[i];
		}
		System.out.println();
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Digite outro numero: ", i);
			vetorB[i] = sc.nextDouble();
			
			vetorC[vetorA.length+i] = vetorB[i];
		}
		
		System.out.print("\nValores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + (i == (vetorA.length - 1)? "." : ", "));
		}
		
		System.out.print("\nValores do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + (i == (vetorB.length - 1)? "." : ", "));
		}
		
		System.out.print("\nValores do vetor C: ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + (i == (vetorC.length - 1)? "." : ", "));
		}

	}

}
