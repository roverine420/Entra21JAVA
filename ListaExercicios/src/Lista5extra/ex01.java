package Lista5extra;
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		float indice;
		System.out.println("Digite o indice");
		System.out.println("Nivel aceitavel 0 até 0.25");
		indice = tc.nextFloat();
		if (indice < 0.30) {
			System.out.println("Tudo sob controle tropa");
		}
		else if (indice >= 0.30 && indice <0.40) {
			System.out.println("Empresas do 1° grupo SUSPENDER ATIVIDADES");
		}
		else if (indice >=0.40 && indice <0.50) {
			System.out.println("Empresas do 1° e 2° grupo SUSPENDER ATIVIDADES");
		}
		else if (indice >=0.50 && indice <0.70) {
			System.out.println("todos os grupos SUSPENDER ATIVIDADES");
		}
		else if (indice >0.70) {
			System.out.println("SUSPENDER ATIVIDADES");
		} 
		

	}

}
