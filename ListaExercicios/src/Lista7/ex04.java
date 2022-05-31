package Lista7;
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetorA[] = new int[10];
		float resultado;
		int contador=0;
		for(int i=0; i < vetorA.length; i++) {
			System.out.println("");
			System.out.printf("%nDigite um numero");
			vetorA[i] = sc.nextInt();
			resultado = vetorA[i]%2;
			if(resultado == 0) {
				System.out.printf("É um numero par");
				contador++;
			}
		}
		System.out.printf("%nQuantidade de numero par: "+contador);
	}

}
