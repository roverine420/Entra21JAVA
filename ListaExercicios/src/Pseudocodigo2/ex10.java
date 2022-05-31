package Pseudocodigo2;
import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		float rosa, tulipa, total, sal,qnt;
		double valor, invest;
		System.out.println("Quantas Rosas voce deseja?");
		rosa = tc.nextFloat();
		System.out.println("Quantas Tulipas voce deseja?");
		tulipa = tc.nextFloat();
		valor = (rosa*2.80) + (tulipa*4.20);
		System.out.println("Seu buque tem " + rosa + "rosas" + tulipa + " Tulipas" + "E o preço é R$:" + valor);
		System.out.println("Quanto voce quer gastar nesse buque?");
		sal = tc.nextFloat();
		
		invest = sal/valor;
		System.out.println("Com " + sal + "Voce consegue comprar " + invest);
		
		

	}

}
