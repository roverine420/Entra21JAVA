package Pseudocodigo3;
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		float horas,minutos,segundos;
	System.out.println("Que horas são?");
		horas = tc.nextFloat();
		minutos = (horas*60f);
		segundos = (minutos*60f);
	System.out.println(horas);
	System.out.println(minutos);
	System.out.println(segundos);
	}

}
