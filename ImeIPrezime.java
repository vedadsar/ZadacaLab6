import java.util.Scanner;

/**
 * program trazi od vas da upisete vase ime i prezime, zatim prebroji koliko
 * slova ima ime a koliko prezim
 * 
 * @author Vedad
 *
 */
public class ImeIPrezime {
	public static void main(String[] args) {
		String imeIPrezime;

		Scanner in = new Scanner(System.in);

		System.out.println("Unesite vase ime i prezime");
		imeIPrezime = in.nextLine();

		String ime = imeIPrezime.substring(0, imeIPrezime.indexOf(" "));
		String prezime = imeIPrezime.substring((imeIPrezime.indexOf(" ")) + 1,
				imeIPrezime.length());

		int brojacIme = ime.length();
		int brojacPrezime = prezime.length();

		char iIme = ime.charAt(0);
		char iPrezime = prezime.charAt(0);

		System.out.println("Vase ime je " + ime + " i ima " + brojacIme
				+ " slova");
		System.out.println("Vase prezime je " + prezime + " i ima"
				+ brojacPrezime + " slova");
		System.out.println("Vasi inicijali su " + iIme + iPrezime);
	}
}
