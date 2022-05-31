package Pseudocodigo2;
import java.util.Scanner;
public class ex07 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
			float km, tempo, distancia,vel;
			String  nome;
		
		System.out.println("Qual é seu nome?");
		nome = tc.next();
		System.out.print("Qual a distancia percorrida?");
		distancia = tc.nextFloat();
		System.out.print("Quanto tempo voce levou?");
		tempo = tc.nextFloat();
		vel = (distancia/tempo);
		System.out.print("O piloto percorreu a uma velocidade média de: " + vel);

	}

}
