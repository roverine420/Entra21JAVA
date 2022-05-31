package Pseudocodigo1;
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int num1, num2, num3, n1,n2,n3;
		int soma;
		System.out.println("Digite os numeros positivos para terminarem negativo");
		num1 = tc.nextInt();
		num2= tc.nextInt();
		num3= tc.nextInt();
		n1 = num1%2;
		n2 = num2%2;
		n3 = num3%2;
		if (n1 == 0) {
			System.out.println("É um numero par");
		}
		else {
			System.out.println("É um numero impar");
		}
		if(n2==0) {
			System.out.println("É um numero par");
		}
		else {
			System.out.println("É um numero impar");
		}
		if(n3==0) {
			System.out.println("É um numero par");
		}
		else {
			System.out.println("É um numero impar");
		}
		if (n1 == 0 && n2 == 0 && n3==0) {
			 soma = num1+num2+num3;
			System.out.println("A soma dos numeros pares é: " + soma);
		}
		else if (n1 == 0 && n2 == 0) {
			soma = num1+num2;
			System.out.println("A soma dos numeros pares é: " + soma);
		}
		else if (n2 == 0 && n3==0) {
			soma = num2+num3;
			System.out.println("A soma dos numeros pares é: " + soma);
		}
		else if(n1 == 0 && n3==0);{
		soma = num1+num3;
		System.out.println("A soma dos numeros pares é: " + soma);
	}
		tc.close();
		}		
}
