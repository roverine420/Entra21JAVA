package Lista6;
import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int num, multi, n1=0, n2=0, n3 = 0;
		boolean triangular =false;
		System.out.println("Digite um numero");
		num = tc.nextInt();
		
		for(int i=0; i<num; i++ ) {
			n1 =i;
			n2 =i+1;
			n3 =i+3;
			multi= n1*n2*n3;
			
			if (multi == num) {
				triangular = true;
				break;
			}
		}
		System.out.printf("%n %s %d %s ","o numero", num, (triangular == true)? "é triangular":"não é triangular.");
		if(triangular == true) {
			System.out.printf("%n%s x %d x %d", "Os tres numeros consecutivos que formam são",n1,n2,n3);
		}
		tc.close();
	}
}
