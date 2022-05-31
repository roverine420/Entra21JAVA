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
        System.out.println("Digite a populaçao do pais (A)");
        popA = tc.nextInt();
        System.out.println("Digite a populaçao do pais (B)");
        popB = tc.nextInt();
        if(popA > popB) {
			System.out.println("A populaçao (A) é maior que a população (B)");
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
        	System.out.println("A populçao (A) vai ultrapassar a populaçao (B) em "+anos+" anos");
        	System.out.println("População A: "+popA);
        	System.out.println("População B: "+popB);
          }
    	}
	}
