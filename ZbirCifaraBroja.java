
public class ZbirCifaraBroja {

	public static void main(String[] args) {
		System.out.println("Unesite broj.");
		int broj = TextIO.getlnInt();
		int suma = 0;
		int cifra = 0;
		int n = 10;
		while (broj != 0) {
			cifra = broj % n;
			suma += cifra;
			broj /= 10;
		}
		System.out.println("Suma cifara unesenog broja je " + suma);
	}
}
