package Lista6;
import java.util.Scanner;
public class ex18 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int popA = 0;
		int popB=  0;
		int anos = 0;
		double porcentoA;
		double porcentoB;
		boolean opcao = false;
        System.out.println("Digite a popula�ao do pais (A)");
        popA = tc.nextInt();
        System.out.println("Digite a popula�ao do pais (B)");
        popB = tc.nextInt();
        if(popA > popB) {
			System.out.println("A popula�ao (A) � maior que a popula��o (B)");
		}
        while(popA<popB) {
			porcentoA = (popA*3)/100;
			popA += porcentoA;
			porcentoB = (popB*1.5)/100;
			popB += porcentoB;
			anos++;
			opcao = true;
	}
		
        if(opcao == true) {
        	System.out.println("A popul�ao (A) vai ultrapassar a popula�ao (B) em "+anos+" anos");
        	System.out.println("Popula��o A: "+popA);
        	System.out.println("Popula��o B: "+popB);
          }
    	}
	}
