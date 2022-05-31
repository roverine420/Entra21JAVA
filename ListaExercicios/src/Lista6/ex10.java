package Lista6;
import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int valorA = 1000;
		float total;
		
		for (int i =0; i <= 5;) {
			total = valorA%11;
			if(total == 5) {
				valorA++;
				i++;
			}
			else {
				valorA++;
			}
			if(i==5) {
				break;
				
			}
		}
		
		System.out.println("O quinto numero divisivel por 11 cujo o resto é 5. = "+valorA);
	}

}
