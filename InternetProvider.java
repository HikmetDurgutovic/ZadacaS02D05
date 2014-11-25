
public class InternetProvider {
	
	public static void main(String[] args) {
		System.out.println("Unesite broj sati koje provodite na internetu.");
		int brojSati = TextIO.getlnInt();
		double prvaFirma = 10 + (0.50 * brojSati);
		double drugaFirma = 0.80 * brojSati;
		if (prvaFirma < drugaFirma) {
			double razlika = drugaFirma - prvaFirma;
			System.out.println("Za uneseni broj sati isplatnija vam je prva firma za " + razlika + " KM.");
		}
		if (drugaFirma < prvaFirma) {
			double razlika1 = prvaFirma - drugaFirma;
			System.out.println("Za uneseni broj sati isplatnija vam je druga firma za" + razlika1 + " KM.");
		}
		if (prvaFirma == drugaFirma) {
			System.out.println("Za uneseni broj sati nema razlike u firmama,svejedno je koju cete izabrati.");
		}
	}
}


