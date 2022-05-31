package Pseudocodigo3;
import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
	Scanner tc = new Scanner(System.in);
		
		float receita, despesa, despesaa, porcent, porcento;
		double lucro;
		
		System.out.println("Quanto de receita?");
		receita = tc.nextFloat();
		System.out.println("Quanto de despesa?");
		despesa = tc.nextFloat();
		lucro = receita-despesa;
		porcent = despesa*100;
		porcento = porcent/receita; 
		System.out.println("Sua empresa lucrou " + lucro + "reais");
		System.out.println("Você teve " + porcento + "% de despesa");		
	}
}

