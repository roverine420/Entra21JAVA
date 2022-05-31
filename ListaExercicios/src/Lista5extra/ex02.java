package Lista5extra;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		float preco1, preco2, preco3;
		
		System.out.println("Informe o valor de 3 produtos");
		preco1 = tc.nextFloat();
		preco2 = tc.nextFloat();
		preco3 = tc.nextFloat();
		
		if(preco1 < preco2) {
			System.out.println("Seguindo o criterio do MABA");
			System.out.println("Recomendamos o produto n°1 com o valor de " + preco1);
		}
		else if(preco1 < preco3) {
			System.out.println("Seguindo o criterio do MABA");
			System.out.println("Recomendamos o produto n°1 com o valor de " + preco1);
		}
		else if(preco2 < preco1) {
			System.out.println("Seguindo o criterio do MABA");
			System.out.println("Recomendamos o produto n°2 com o valor de " + preco2);
		}
		else if(preco2 < preco3) {
			System.out.println("Seguindo o criterio do MABA");
			System.out.println("Recomendamos o produto n°2 com o valor de " + preco2);
		}
		else if(preco3 < preco1) {
			System.out.println("Seguindo o criterio do MABA");
			System.out.println("Recomendamos o produto n°3 com o valor de " + preco3);
		}
		else if(preco3 < preco2) {
			System.out.println("Seguindo o criterio do MABA");
			System.out.println("Recomendamos o produto n°3 com o valor de " + preco3);
		}
		else {
			System.out.println("ERROR");
		}
	}

}
