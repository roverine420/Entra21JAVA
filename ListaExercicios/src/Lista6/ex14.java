package Lista6;
import java.util.Scanner;
public class ex14 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int colecao;
		int cds;
		int qnt_gasto;
		while(true) {
		System.out.printf("%nDigite o total investido");
		qnt_gasto = tc.nextInt();
		System.out.println("Digite a quantidade");
		cds = tc.nextInt();
		colecao = qnt_gasto/cds;
		System.out.printf("O custo medio para cada cd ? R$ %,d",colecao);
		}
	}

}
