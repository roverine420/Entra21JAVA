package Lista5;
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int diaSemana;
	System.out.println("\nDigite um numero!!!!");	
		diaSemana = tc.nextInt();
		
	switch(diaSemana) {
	case 1: System.out.println("Domingo");break;
	case 2: System.out.println("Segunda");break;
	case 3: System.out.println("Ter?a");break;
	case 4: System.out.println("Quarta");break;
	case 5: System.out.println("Quinta");break;
	case 6: System.out.println("Sexta");break;
	case 7: System.out.println("Sabado");break;
	default: System.out.println("ERROOORRR 2444 5000 6666 777 666 HAHAHAHA");
	}

	}

}
