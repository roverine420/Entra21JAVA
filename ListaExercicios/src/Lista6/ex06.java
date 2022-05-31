package Lista6;
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		float chico, juca, cjuca,cchico;
		int anos=0;
		chico = 1.50f;
		juca = 1.10f;
		cchico = 0.02f;
		cjuca = 0.03f;
		
		while(juca < chico) {
			chico += cchico;
			juca +=cjuca;
			++anos;
		}
		System.out.println("Juca levara "+anos+" anos para ser maior que chico");

	}

}
