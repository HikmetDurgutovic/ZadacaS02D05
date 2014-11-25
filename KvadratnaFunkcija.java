
public class KvadratnaFunkcija {

	public static void main(String[] args) {
		System.out.println("Unesite koeficijent a!");
		int a = TextIO.getlnInt();
		System.out.println("Unesite koeficijent b!");
		int b = TextIO.getlnInt();
		System.out.println("Unesite koeficijent c!");
		int c = TextIO.getlnInt();
		System.out.println("Unesite tacku x!");
		int x = TextIO.getlnInt();
		int jednacina = a * (x * x) + b * x + c;
		if ((a < -10 || a > 10) || (b < -10 || b > 10) || (c < -10 || c > 10)) {
			System.out.println("Koeficienti a, b, c nisu u zadanom intervalu!");
		} else {
			System.out.println("f(" + x + ") = " + jednacina);
		}

	}
}
