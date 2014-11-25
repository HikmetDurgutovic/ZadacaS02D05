
public class BrojBezNula {
	
	public static void main(String[] args) {
		System.out.println("Unesi neki broj koji sadrzi nule!");
		int broj = TextIO.getlnInt();
		int cifra = 0;
		int n = 1;
		while (broj != 0) {
			if (broj % 10 != 0) {
				cifra = cifra + broj % 10 * n;
				n *= 10;
			}
			
			broj /= 10;
		}
		System.out.println(cifra);

	}
}


