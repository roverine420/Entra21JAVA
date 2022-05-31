package Lista7;
import java.util.Scanner;
public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetorA[] = new int[10];
		int par =0, impar=0;
		double percentpar, percentimpar;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um numero");
			vetorA[i] = sc.nextInt();
			
			if(vetorA[i] %2 ==0) {
				++par;
				
			}
			else {
				++impar;
			}
		}	
		percentpar= (par*100)/ vetorA.length;
		percentimpar = (impar*100)/vetorA.length;
		System.out.println("Percentual de numeros pares "+percentpar+"%");
		System.out.println("Percentual de numeros impares "+percentimpar+"%");
}
}