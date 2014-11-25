
public class ZbirDjeliocaBroja {
	
	public static void main(String[] args) {
		
		System.out.println("Unesite broj");
		
		int unos = TextIO.getlnInt();
		
		int i = 1;
		
		int zbir = 0;
		
		
		
		while (unos < 0) {
			System.out.println("Unesite broj");
			unos = TextIO.getlnInt();					
		}
				
		for (i = 1; i <= unos; i++) {

			if (unos % i == 0) {
				zbir = zbir + i;
			}

		}
           
		System.out.println("Suma djelilaca vaseg broja je " +zbir);
		
	}

}
