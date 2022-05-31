package Lista5;
import java.util.Scanner;
public class ex14 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.println("Digite o primeiro lado");
		n1 = tc.nextInt();
		System.out.println("Digite o segundo lado");
		n2 = tc.nextInt();
		System.out.println("Digite o terceiro lado");
		n3 = tc.nextInt();

		if (n1 + n2 < n3) {
			System.out.println("Nao é um triangulo");
		}
		else if (n1+ n3 < n2) {
			System.out.println("Nao é um triangulo");
		}
		else if (n2+n3 < n1) {
			System.out.println("Nao é um triangulo");
		}
		else if (n1 == n2 && n2==n3) {
			System.out.println("É um triangulo EQUILATERO");
		}
		else if (n1 == n2 && n2!=n3) {
			System.out.println("É um triangulo ISOSCELES");
		}
		else if (n1 == n3 && n2!=n1) {
			System.out.println("É um triangulo ISOSCELES");
		}
		else if (n2 == n3 && n2!=n1) {
			System.out.println("É um triangulo ISOSCELES");
		}
		else if (n1 != n2 && n2!=n3) {
			System.out.println("É um triangulo ESCALENO");
		}
		else {
			System.out.println("ERRORRR");
		}
	}

}
