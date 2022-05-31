package Pseudocodigo2;
import java.util.Scanner;
public class ex08 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
			int amigos;
			double comida,bebida,valor_cerveja,valor_carne;
			System.out.println("Quantos convidados?");
			amigos = tc.nextInt();
			bebida = amigos*6;
			comida = amigos*0.500;
			valor_cerveja = bebida*1.70;
			valor_carne = comida*18;
			System.out.println("O total gasto é R$" + (valor_carne+valor_cerveja));

	}

}
