package Lista5;
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		
		
		System.out.println("Qual seu nome?");
		String nome = tc.next();
		System.out.println("Qual sua idade?");
		int idade = tc.nextInt();
		
		if (idade >=5 && idade <=7) {
			System.out.println("Ola " + nome);
			System.out.println("Voce esta na categoria (Infantil A)");
		}
		if (idade >=8 && idade <=10) {
			System.out.println("Ola " + nome);
			System.out.println("Voce esta na categoria (Infantil B)");
		}
		if (idade >=11 && idade <=13) {
			System.out.println("Ola " + nome);
			System.out.println("Voce esta na categoria (Juvenil A)");
		}
		if (idade >=14 && idade <= 17) {
			System.out.println("Ola " + nome);
			System.out.println("Voce esta na categoria (Juvenil B)");
		}
		if (idade >=18) {
			System.out.println("Ola " + nome);
			System.out.println("Voce esta na categoria (Adulto)");
		}
	}

}
