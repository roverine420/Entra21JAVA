package Lista6;
import java.util.Scanner;
public class ex08 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int limiteSuperior, limiteInferior, aux, soma =0;
		String text = "";
		
		System.out.print("Limite superior (int): ");
		limiteSuperior = tc.nextInt();
		System.out.print("Limite inferior (int): ");
		limiteInferior = tc.nextInt();
		
		if (limiteInferior > limiteSuperior) {
			aux = limiteInferior;
			limiteInferior = limiteSuperior;
			limiteSuperior = aux;
		}
		for(int i = limiteInferior; i < limiteSuperior; i++) {
		if ((i %2) == 0) {
			text += String.valueOf(i) + " ";
			soma += i;
		}
	}
		System.out.printf("%nNumeros pares no intervalo aberto de %d e %d: %s", limiteSuperior, limiteInferior,text);
		System.out.printf("%nSoma desses numeros: %d", soma);
}
}
