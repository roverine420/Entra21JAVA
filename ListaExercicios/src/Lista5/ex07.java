package Lista5;
import java.util.Scanner;
public class ex07 {

	public static void main(String[] args) {
		float imc,altura,peso;
		Scanner tc = new Scanner(System.in);
		System.out.println("Qual seu peso?");
		peso = tc.nextFloat();
		System.out.println("Qual sua altura?");
		altura = tc.nextFloat();
		imc = (float) (peso/Math.pow(altura, 2));
		System.out.println("Teste " + imc);
		
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		}
		if (imc >=18.5 && imc <=25) {
			System.out.println("Peso normal");
		}
		if (imc >=25 && imc <=30) {
			System.out.println("Acima do peso");
		}
		if (imc >30) {
			System.out.println("OBESOOO GORDAO");
		}
		else {
			
		}

	}

}
