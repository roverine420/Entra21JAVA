package Lista7;
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		int vetorC[] = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.printf("%nDigite um numero");
			vetorA[i] = sc.nextInt();
			System.out.printf("Digite outro numero %n");
			vetorB[i] = sc.nextInt();
			vetorC[i] = vetorA[i]+vetorB[i];
			System.out.println();
			System.out.printf("%nA soma dos vetores A e vetores B � %nResultado: "+vetorC[i]);
			vetorC[i] = vetorA[i]-vetorB[i];
			System.out.println();
			System.out.printf("%nA subtra��o dos vetores A e vetores B � %nResultado: "+vetorC[i]);
			vetorC[i] = vetorA[i]*vetorB[i];
			System.out.println();
			System.out.printf("%nA multiplica��o dos vetores A e vetores B � %nResultado: "+vetorC[i]);
			vetorC[i] = vetorA[i]/vetorB[i];
			System.out.println();
			System.out.printf("%nA divis�o dos vetores A e vetores B � %nResultado: "+vetorC[i]);
			System.out.println();}
	}

}
