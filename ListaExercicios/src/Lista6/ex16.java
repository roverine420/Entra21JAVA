package Lista6;
import java.util.Scanner;
public class ex16 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		String nome;
		int idade;
		int salario;
		char sexo;
		char civil;
		
		System.out.println("Nome");
		nome = tc.next();
		System.out.println("Idade");
		idade = tc.nextInt();
		
		if(idade >=0 && idade <=100) {
			System.out.println("Salario");
			salario = tc.nextInt();
			while(salario <=0) {
				System.out.println("Digite um salario maior que 0");
				salario = tc.nextInt();
			}
			System.out.println("Digite (M)masculino (F)feminino");
			sexo = tc.next().charAt(0);
			System.out.println("Estado civil");
			civil = tc.next().charAt(0);
			
		}

	}

}
