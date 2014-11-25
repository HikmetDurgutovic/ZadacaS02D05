
public class StraniceTrougla {
	
	public static void main(String[] args) {
		System.out.println("Unesite pozitivnu duzinu jedne stranice trougla!");
		int a = TextIO.getlnInt();
		System.out.println("Unesite pozitivnu duzinu druge stranice trougla!");
		int b = TextIO.getlnInt();
		int c = 0;
		if (a < b) {
			c = b - a + 1;
			System.out.println("Najmanja moguca duzina trece stranice je " + c);
		}
		
		if (a > b) {
			c = a - b + 1;
			System.out.println("Najmanja moguca duzina trece stranice je " + c);
		}
		
		if (a == b) {
			c = 1;
			System.out.println("Najmanja moguca duzina trece stranice je " + c);
		}
	}

}
