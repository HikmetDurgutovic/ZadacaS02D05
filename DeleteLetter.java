
public class DeleteLetter {
	
	public static void main(String[] args) {
		System.out.println("Ispisite recenicu.");
		String recenica = TextIO.getlnString().toLowerCase();
		System.out.println("Upisite slovo koje zelite izbaciti.");
		String slovo = TextIO.getln().toLowerCase();
		String skrRecenica = recenica.replaceAll(slovo, "");
		System.out.println(skrRecenica);
	}

}
