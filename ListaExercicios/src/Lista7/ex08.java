package Lista7;
import java.util.Scanner;
public class ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		int menor15 = 0, igual15 = 0, maior15 = 0, maiorr15 = 0, nA;
		double media = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um numero:");
			vetorA[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			nA = vetorA[i];
			if (nA < 15) {
				menor15 += nA;
			}
			else if (nA == 15) {
				++igual15;
			}
			else {
				maior15 += nA;
				++maiorr15;
			}
			
			if (maiorr15 > 0) {
				media = maior15 / maiorr15;
			}
		}
		
		System.out.println("Soma dos numeros menores que 15: " + menor15);
		System.out.println("Quantidade de numeros iguais a 15: " + igual15);
		System.out.println("Média dos numeros maiores que 15: " + media);
		
		

	}

}
