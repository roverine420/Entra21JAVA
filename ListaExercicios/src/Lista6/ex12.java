package Lista6;

public class ex12 {

	public static void main(String[] args) {
		long graos = 0;
		for (int i = 0; i<64; i++) {
			if(graos == 0) {
				graos =1;
				continue;
			}
			graos*=2;
		}
		System.out.printf("A rainha devera pagar ao monge %,d graos de trigo",graos);
	}

}
