package Lista7;
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetorA[] = new int[10];
		int resultado=0;
		int soma=0;
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um numero");
			vetorA[i] = sc.nextInt();
			if(vetorA[i] %2 ==1) {
				soma += vetorA[i];
				resultado = soma/vetorA.length;
			}
		
		}
		System.out.println("A media aritimedica dos numero impares é "+resultado);
	
	}
}
