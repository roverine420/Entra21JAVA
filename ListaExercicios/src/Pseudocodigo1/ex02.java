package Pseudocodigo1;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		
		float entrada, saida, minutos;
		double total;
		
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Hora de entrada");
		entrada = tc.nextFloat();
		System.out.println("Hora de saida");
		saida = tc.nextFloat();
		minutos = (saida-entrada)*60;
		System.out.println("Você ficou " + minutos +" minutos");
		total = (saida-entrada)*2.30;
		System.out.println("O total a pagar é R$" + total);
		
		
	}

}
