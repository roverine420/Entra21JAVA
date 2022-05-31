package Lista6;
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
	Scanner tc =new Scanner(System.in);
	int sexo, fem=0, masc=0;
	double altura, maior = 0, menor = 0, sumFem = 0,mediaFem,sumPop=0, mediaPop, percent;

	for (int i = 1; i <6; i++) {
		System.out.printf("%nDigite 0 para homem e 1 para mulher");	
		sexo = tc.nextInt();
        while (sexo !=1 && sexo !=0) {
        	System.out.printf("Sexo invalido. Digite 0 para homem e 1 para mulher ");
        	sexo=tc.nextInt();
        }
        System.out.printf("Altura do habitante %d: ", i);
        altura = tc.nextDouble();
        
        if (altura > maior) {
        	maior = altura;
        }
        if (menor == 0) {
        	menor = altura;
        }
        else if(altura < menor) {
        	menor = altura;
        }
        if (sexo ==1) {
        	++fem;
        	sumFem += altura;
        }
        else {
        	++masc;
        }
        sumPop += altura;
	}
		mediaFem= sumFem/fem;
		mediaPop = sumPop/5;
		percent = (100 * masc)/5;
		
		System.out.printf("%nA maior altura foi de %.2fm, e a menor de %.2fm.",maior,menor);
		System.out.printf("%nA media de altura das mulheres é de %.2fm,",mediaFem);
		System.out.printf("%nA media da população entrevistada é de %.2fm.",mediaPop);
		System.out.printf("%nO percentual de homens na população entrevistada é de %.1f%%.", percent);
		tc.close();
	}

}
