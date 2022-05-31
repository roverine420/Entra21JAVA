package Lista6;
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int x= 1000;
		int y=2000;
		for(int i=x; i<y; i++) {
			if(i%11==5) {
				System.out.println("Numero divisivel foi: "+i);
			}
		}
	}
}
