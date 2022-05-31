package Pseudocodigo2;
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		float celsius, fahren;
		System.out.println("Quantos graus CELSIUS?");
		celsius = tc.nextFloat();
		fahren = celsius+32;
		System.out.println("A temperatura é " + fahren + "Fahrenheit");
	}

}
