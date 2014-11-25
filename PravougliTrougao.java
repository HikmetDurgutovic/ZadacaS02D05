
public class PravougliTrougao {
	
	public static void main(String[] args) {
		System.out.println("Unesite duzinu jedne stranice.");
		int a = TextIO.getlnInt();
		System.out.println("Unesite duzinu druge stranice.");
		int b = TextIO.getlnInt();
		int razlika = 0;
		if (a > b) {
			razlika = a * a - b * b;
		}
		if (a < b) {
			razlika = b * b - a * a;
		}
		if (a == b) {
			razlika = a * a + b * b;
		}

		double c = Math.sqrt(razlika);
		System.out.println("Treca stranica je " + c);
	}

}
