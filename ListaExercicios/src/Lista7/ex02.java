package Lista7;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		int vetorC[] = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um numero");
			vetorA[i] = sc.nextInt();
			vetorB[i] = vetorA[i]*i;
			vetorC[i] = vetorA[i]%2;
		}
		for(int i = 0; i < vetorA.length; i++) {
			System.out.printf("%nNumero: "+ 	vetorA[i] + "%nMultiplicado pelo indice " +i+"%nResultado: "+ vetorB[i]);
			System.out.println("");
			System.out.printf("%nNumero: "+ 	vetorA[i] + "%nResto da divisao por dois%nResultado: "+ vetorC[i]);
			System.out.println("");
		}
		

	}

}
