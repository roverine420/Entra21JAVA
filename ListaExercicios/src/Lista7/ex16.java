package Lista7;
import java.util.Scanner;
public class ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] vetorA = new double[20];
		double[] vetorACompacto;
		int countNulNeg = 0, j = 0;
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um numero: "+ i);
			vetorA[i] = sc.nextDouble();
			
			if (vetorA[i] <= 0) {
				++countNulNeg;
			}
		}
		
		
		vetorACompacto = new double[vetorA.length - countNulNeg];
		for (int i = 0; i < vetorACompacto.length; i++) {
			loop:
			while (j < vetorA.length) {
				if (vetorA[j] > 0) {
					vetorACompacto[i] = vetorA[j];
					j++;
					break loop;
				}
				else {
					j++;
				}
			}
		}
		for (int i = 0; i < vetorACompacto.length; i++) {
			System.out.print(vetorACompacto[i] + ((vetorACompacto.length - 1 == i)? "." : ", "));
		}
	}

}
