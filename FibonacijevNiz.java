
public class FibonacijevNiz {

	public static void main(String[] args) {
		System.out.println("Unesite broj od 0 do 50.");
		int broj = TextIO.getlnInt();
		int i = 0;
		int a = 1;
		int b = 1;

		int fib = 0;
		if (broj > 50 || broj < 0) {
			System.out.println("Broj koji ste unijeli nije u intervalu koji je zadat. Unesite ispravan broj.");
			return;
		}

		if (broj == 1) {
			fib = 1;
			System.out.println(fib);
			return;
		}
		if (broj == 2) {
			fib = 1;
			System.out.println(fib);
			return;
		}
		if (broj == 3) {
			fib = a + b;
			System.out.println(fib);
		}
		i = 4;
		while (i <= broj) {
			if (broj > 3) {
				b = a + b;
				a = b - a;
				fib = a + b;
				i++;
			}
		}

		System.out.println(broj + ". broj u Fibonacijevom nizu je " + fib);
	}
}

