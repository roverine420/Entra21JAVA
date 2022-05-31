package Lista7;
import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdeAlunos = 10;
		double[] nota1 = new double[qtdeAlunos];
		double[] nota2 = new double[qtdeAlunos];
		double[] result = new double[qtdeAlunos];
		
		for (int i = 0; i < qtdeAlunos; i++) {
			loop:
			while (true) {
				System.out.printf("%nPrimeira nota do %d aluno: ", i+1);
				nota1[i] = sc.nextDouble();
				
				if (nota1[i] > 10 || nota1[i] < 0) {
					System.out.println("Digite uma valor entre 0 e 10");
				}
				else {
					break loop;
				}
			}
			
			loop:
			while (true) {
				System.out.printf("Segunda nota do %d aluno: ", i+1);
				nota2[i] = sc.nextDouble();
				
				if (nota2[i] > 10 || nota2[i] < 0) {
					System.out.println("Digite uma valor entre 0 e 10");
				}
				else {
					break loop;
				}
			}
			
			
			result[i] = (nota1[i] + nota2[i])/2;
		}
		
		for (int i = 0; i < qtdeAlunos; i++) {
			System.out.printf("%nMedia aritmética do %dº aluno: %.2f%n", i+1, result[i]);
			
			if (result[i] >= 7) {
				System.out.println("Aluno aprovado.");
			}
			else {
				System.out.println("Aluno reprovado.");
			}
		}
		
		

	}

}
