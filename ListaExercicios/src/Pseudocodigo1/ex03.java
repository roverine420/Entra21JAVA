package Pseudocodigo1;
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		
		float qnt;
		double valor;
		Scanner tc = new Scanner(System.in);
		
		System.out.println("A unidade da copia custa R$ 0.08");
		System.out.println("Quantas cópias você deseja?");
		System.out.println("_____________________________________");
			qnt = tc.nextFloat();
			valor = (qnt*2)*0.08; 
		System.out.println("total a ser pago é R$ " + valor);
	}

}
