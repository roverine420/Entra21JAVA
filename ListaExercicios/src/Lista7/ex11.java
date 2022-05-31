package Lista7;
import java.util.Scanner;
public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean palindromo = false;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Digite um numero: ", i);
			vetorA[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] == vetorA[vetorA.length-1-i]) {
				palindromo = true;
			}
			else {
				palindromo = false;
				break;
			}
		}
		
		System.out.printf("%n%s %s %s", "O vetor A", ((palindromo == true)? "é" : "não é"), "um palíndromo.");
	}

}
