package Lista5;
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int numero;
		
		numero = tc.nextInt();
		switch(numero) {
		case 1:System.out.println("Alimento não-perecivel");break;
		case 2:System.out.println("Alimento perecivel");break;
		case 3:System.out.println("Alimento perecivel");break;
		case 4:System.out.println("Alimento perecivel");break;
		case 5:System.out.println("Vestuario");break;
		case 6:System.out.println("Vestuario");break;
		case 7:System.out.println("Higiene Pessoal");break;
		default: break;
		}
		if (numero >7 && numero <=15) {
			System.out.println("Limpeza e utilitarios");
		}
		else {
			System.out.println("Numero invalido");
		}

	}

}
