
public class IgraPogadjanjeBroja {

	public static void main(String[] args) {
		int randomBroj = (int) (1 + Math.random() * 100);
		System.out.println("Unesite broj od 1 do 100.");
		int broj = TextIO.getlnInt();
		int brojac = 0;
		while (broj > -1) {
			if (broj < randomBroj && broj > -1) {
				System.out.println("Vas broj je manji od trazenog broja.");
				brojac++;
			}
			if (broj > randomBroj) {
				System.out.println("Vas broj je veci od trazenog broja.");
				brojac++;
			}
			if (broj == randomBroj) {
				brojac++;
				System.out.println("Cestitam. Pogodili ste broj!  Broj Vasih pokusaja je: " + brojac);
			}
			if (broj == -1) {
				System.out.println("Hvala.");
			}
			System.out.println("Ponovo unesite broj!");
			broj = TextIO.getlnInt();
		}
	}
}
