package Pseudocodigo3;
import java.util.Scanner;

public class ex001 {

		public static void main(String[] args) {
			Scanner tc = new Scanner(System.in);
			
			
			float a, b, resultado;
			
			System.out.println("Digite um numero");
			a =  tc.nextFloat();
			System.out.println("Digite outro numero");
			b = tc.nextFloat();
			
			System.out.println("O numero A é:" + a);
			System.out.println("O numero B é:" + b);
			a = b;
			System.out.println("O numero de A passou a ser é" + a );
			b = a;
			System.out.println("O numero de  passou a ser " + b );
		}
	}

