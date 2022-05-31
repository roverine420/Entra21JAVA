package Lista5;
import java.util.Scanner;
public class ex12 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		float num1, num2;
		int opcao;
		
		System.out.println("Selecione uma opção");
		System.out.println("1 para somar (+)");
		System.out.println("2 para subtrair (-)");
		System.out.println("3 para multiplicar (*)");
		System.out.println("4 para dividir (/)");
		opcao = tc.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Voce escolheu (SOMA)");
			System.out.println("Qual primeiro numero?");
			num1 = tc.nextFloat();
			System.out.println("Qual segundo numero?");
			num2 = tc.nextFloat();
			System.out.println("O resultado da soma é" + (num1+num2));break;
		case 2:
			System.out.println("Voce escolheu (SUBTRAÇÃO)");
			System.out.println("Qual primeiro numero?");
			num1 = tc.nextFloat();
			System.out.println("Qual segundo numero?");
			num2 = tc.nextFloat();
			System.out.println("O resultado da SUBTRAÇÃO é" + (num1-num2));break;
		case 3:
			System.out.println("Voce escolheu (MULTIPLICAR)");
			System.out.println("Qual primeiro numero?");
			num1 = tc.nextFloat();
			System.out.println("Qual segundo numero?");
			num2 = tc.nextFloat();
			System.out.println("O resultado da MULTIPLICAÇÃO é" + (num1*num2));break;
		case 4:
			System.out.println("Voce escolheu (DIVIDIR)");
			System.out.println("Qual primeiro numero?");
			num1 = tc.nextFloat();
			System.out.println("Qual segundo numero?");
			num2 = tc.nextFloat();
			System.out.println("O resultado da DIVISÃO é: " + (num1/num2));break;
		default: System.out.println("NUMERO INVALIDO");
	}
	}

}
