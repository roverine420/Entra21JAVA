package Lista5;
import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		float nota1, nota2, nota3, media,mediaexercicio;
		System.out.println("Digite a primeira nota");
		nota1 = tc.nextFloat();
		System.out.println("Digite a segunda nota");
		nota2 = tc.nextFloat();
		System.out.println("Digite a terceira nota");
		nota3 = tc.nextFloat();
		mediaexercicio = (nota1+nota2+nota3);
		media = (nota1+(nota2*2)+(nota3*3)+mediaexercicio)/7;
		
		 if (media >=9) {
			 System.out.println("Sua classificação final é: A ");
		 }
		 else if (media >= 7.5 && media <9.0) {
			 System.out.println("Sua classificação final é: B ");
		 }
		 else if (media >= 6.0 && media <7.5) {
			 System.out.println("Sua classificação final é: C ");
		 }
		 else if (media <6) {
			 System.out.println("Sua classificação final é: D ");
		 }
	}
}


