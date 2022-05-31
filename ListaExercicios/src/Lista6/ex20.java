package Lista6;
import java.util.Scanner;
public class ex20 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int num1, num2,resultado,opcao,soma=0;
		boolean function =false;
	
		while(function == false) {
		
		System.out.println("Digite um numero inteiro");
		num1 = tc.nextInt();
		System.out.println("Digite outro numero");
		num2 = tc.nextInt();
		
		if(num1<0 || num2 <0){
			System.out.println("Digite um numero inteiro positivo");
		}
		else if(num1<num2) {
			resultado = num2-num1;
			System.out.println("O intervalo entre eles é " +resultado);
			soma= num1+num2;
			System.out.println("A soma dos numero é " +soma);
			
		}
		else if(num2<num1) {
			resultado =num1-num2;
			System.out.println("O intervalo entre eles é " +resultado);
			System.out.println("A soma dos numero é " + soma);
		}
		else if(num2==num1) {
			System.out.println("São numeros iguais");
			System.out.println("A soma dos numero é " + soma);
		}
		System.out.printf("Continuar ou encerrar? %n (1)Continuar %n (2)Encerrar");
		opcao = tc.nextInt();
		if (opcao==2) {
			function = true;
		}
		}		
	}

}
