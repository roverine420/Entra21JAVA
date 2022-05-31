package Lista7;
import java.util.Scanner;
public class ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		int idademaior35 = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			
			loop2:
			while (true) {
				System.out.printf("Digite a %d idade: ", i+1);
				vetorA[i] = sc.nextInt();
				
				if (vetorA[i] < 0) {
					System.out.println("Digite a idade maior que zero.\n");
				}
				else {
					break loop2;
				}
			}
			
			if (vetorA[i] > 35) {
				++idademaior35;
			}
		}
		System.out.println("Quantidade de pessoas com idade maior que 35: " + idademaior35);
		
		
	}

}
