package Lista7;
import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetorA[] = new int[11];
		int soma;
		
		for(int i =0; i < vetorA.length; i++) {
			System.out.println("Digite um numero");
			vetorA[i] = sc.nextInt();
		}
		for(int i = 0; i < vetorA.length; i++) {
			for(int x = 0; x < vetorA.length; x++) {
				if(i==x) {
			}
				else {
					soma = vetorA[i]+vetorA[x];
					
					if(soma % 5 == 0 && x > i) {
						System.out.printf("%nA soma de %d com %d ? multiplo de 5.",vetorA[i],vetorA[x],soma);
					}
				}
		}
	}
sc.close();		
}
}

