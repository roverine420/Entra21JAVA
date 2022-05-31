package Lista5;
import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		Scanner tc =  new Scanner(System.in);
		float altura;
		double ideal;
		String sexo;
		System.out.println("Qual sua altura?");
		altura = tc.nextFloat();
		System.out.println("Digite M para homem e F para mulher");
		sexo = tc.next();
		
		 switch (sexo) {
		 case "m": 
			 ideal = (72.7*altura)-58;
		System.out.println("Seu peso ideal é: " + ideal);break;
		
		 case "f": 
			 ideal = (62.1*altura)-44.7;
		System.out.println("Seu peso ideal é: " + ideal);break;
		 default: System.out.println("ERROR");
		}
	}

}
