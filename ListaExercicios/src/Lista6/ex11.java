package Lista6;
import java.util.Scanner;
public class ex11 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int num, numero;
		System.out.println("Digite um numero para saber a tabuada");
		num = tc.nextInt();
		for(int i = 1; i <= 10; i++) {
			numero = num*i;
			System.out.println("Resultado: " +num + "X" + i + "="+numero);
		}

	}

}
