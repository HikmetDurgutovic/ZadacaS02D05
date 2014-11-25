
public class PresjekSkupova {

	public static void main(String[] args) {
		System.out.println("Unesite granice skupa S1!");
		int a = TextIO.getlnInt();
		int b = TextIO.getlnInt();
		System.out.println("Unesite granice skupa S2!");
		int c = TextIO.getlnInt();
		int d = TextIO.getlnInt();
		String presjek = "";
		if (a < c && b > d) {
			System.out.println("Skup S2 je sadrzan u skupu S1.");
		}
		if (a > c && b < d) {
			System.out.println("Skup S1 je sadrzan u skupu S2.");
		}
		if (a < c && b < d) {
			for (int i = c; i <= b; i++) {
				presjek += i + " ";
			}
			System.out.println("Presjek skupova je: " + presjek);
		}
		if (c < a && d < b) {
			for (int i = a; i <= d; i++) {
				presjek += i + " ";
			}
			System.out.println("Presjek skupova je: " + presjek);
		}
	}
}

