package Lista5;
import java.util.Scanner;
public class ex11 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int valor=0;
		double valorinformado;
		float total_pago,total_compra;
		System.out.printf("Digite o total da compra");
		total_compra = tc.nextFloat();
		System.out.println("Digite o total pago");
		total_pago = tc.nextFloat();
		valorinformado = total_pago - total_compra;
		
		
		if(valorinformado>100) {
			System.out.printf("Seu troco é de R$" + valorinformado +("%n"));
			valor = (int)valorinformado/100;
			System.out.printf("%d notas de 100.00%n", valor);
			valorinformado = valorinformado % 100.0;
			
			valor = (int)valorinformado/10;
			System.out.printf("%d notas de 10.00%n", valor);
			valorinformado = valorinformado % 10.0;
			
			valor = (int)valorinformado/01;
			System.out.printf("%d notas de 01.00%n", valor);
			valorinformado = valorinformado % 01.0;
		}
		else if(valorinformado<100 && valorinformado >0) {
			System.out.printf("Seu troco é de R$" + valorinformado);
			valor = (int)valorinformado/10;
			System.out.printf("%d notas de 10.00%n", valor);
			valorinformado = valorinformado % 10.0;

			valor = (int)valorinformado/01;
			System.out.printf("%d notas de 01.00%n", valor);
			valorinformado = valorinformado % 01.0;
		}
		else {
			System.out.println("Compra negada!");
		}

	tc.close();
	}
	}
