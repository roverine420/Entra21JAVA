package Lista6;

public class ex17 {

	public static void main(String[] args) {
		int popA = 80000;
		int popB=  200000;
		int anos = 0;
		int porcentoA;
		double porcentoB;
        
		while(popA<popB) {
			porcentoA = (popA*3)/100;
			popA += porcentoA;
			porcentoB = (popB*1.5)/100;
			popB += porcentoB;
			anos++;
			
			
		}
		System.out.println("A populçao (A) vai ultrapassar a populaçao (B) em "+anos+" anos");
		System.out.println("População A: "+popA);
    	System.out.println("População B: "+popB);
	}

}
