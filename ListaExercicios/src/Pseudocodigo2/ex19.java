package Pseudocodigo2;
import java.util.Scanner;
public class ex19 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		float fotos, pacote, qnt_pacote;
		double qnt_fotos, valor_total;
		System.out.println("Fotos");
		System.out.println("Pacote com 100 fotos R$ 44,00");
		System.out.println("Foto avulsa R$ 0,70");
		System.out.println("Quantas fotos você deseja?");
		fotos = tc.nextFloat();
		qnt_fotos = fotos*0.70;
		System.out.println("Quantos pacotes você deseja?");
		pacote = tc.nextFloat();
		qnt_pacote = pacote*44;
		valor_total = qnt_fotos+qnt_pacote;
		System.out.println("O total da sua compra é de R$ " + valor_total);
	}

}
