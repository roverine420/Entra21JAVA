package Lista7;
import java.util.Scanner;
public class ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdeClientes = 5, qtdeLocGratis;
		String[] nome = new String[qtdeClientes];
		int[] qtdeDVDs = new int[qtdeClientes];
		
		for (int i = 0; i < nome.length; i++) {
			System.out.printf("nome do cliente: ", i+1);
			nome[i] = sc.next();
			System.out.print("Quantidade de CD locados: ");
			qtdeDVDs[i] = sc.nextInt();
		}
		
		for (int i = 0; i < qtdeDVDs.length; i++) {
			qtdeLocGratis = (int)(qtdeDVDs[i] / 10);
			System.out.printf("%n%S tem direito a %d locações grátis.", nome[i], qtdeLocGratis);
		}
	}

}
