package Pseudocodigo3;
import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		float idade, dias;
	
		
		System.out.println("Escreva sua idade!");
		idade = tc.nextFloat();
		dias = idade*365;
		System.out.println("Você viveu até hoje aproximadamente " + dias + " Dias");
	}

}


