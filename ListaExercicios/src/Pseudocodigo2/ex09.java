package Pseudocodigo2;
import java.util.Scanner;
public class ex09 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
			float salario, hora_trab, qnt_filhos, sal_base, aumento, sal_final;
			float acrescimo;
			String nome;
	   
		System.out.println("Qual seu nome?");
		nome = tc.next();
		System.out.println("Ola, " + nome);
		System.out.println("Quanto você recebe por hora?");
		hora_trab = tc.nextFloat();
		System.out.println("Possui quantos filhos?");
		qnt_filhos = tc.nextFloat();
		sal_base = (hora_trab*8)*30;
		aumento = (sal_base*3)/100;
		sal_final = qnt_filhos*aumento;
		acrescimo = sal_base + sal_final;
		System.out.println("\nO funcionario " + nome + " recebe:");
		System.out.println("\nSalario base R$" + sal_base);
		System.out.println("\nSeu salario é R$ " + acrescimo);
		System.out.println("\nVoce recebeu um acresimo de R$" + sal_final + " pela ajuda de custo de " + qnt_filhos + " Filhos");
		
		
		
		
		
		
	}

}
