package Lista7;
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetorA[] = new int[15];
		int vetorB[] = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um numero");
			vetorA[i]=sc.nextInt();
			vetorB[i] = vetorA[i]*vetorA[i];
		}
		for(int i = 0; i < vetorA.length; i++) {
			System.out.printf("%nNumero:"+ 	vetorA[i] + "%n quadrado:" + vetorB[i]);
			System.out.println("");
		}
		

	}

}
