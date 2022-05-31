package Lista6;
import java.util.Scanner;
public class ex09 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		double num;
		boolean primo = true;
		boolean parar = true;
		System.out.print("Digite um numero");
		num = tc.nextDouble();
		while(parar == true) {
		for (int i = 2; i < num; i++) {
			if ((num% i)==0) {
				primo = false;
				break;
			}
			else {
				primo = true;
			}
		}
		if (primo) {
			System.out.println("Numero primo.");
			System.out.println("Digite um numero");
			num = tc.nextDouble();
		}
		else {
			System.out.println("Não é numero primo");
			num = tc.nextDouble();
		}
	}
	}
}
