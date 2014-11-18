import java.util.Scanner;

/**
 * Provjeriti dali unesena rijec ima duplih slova CASE SENSITIVE
 * 
 * @author vedadzornic
 *
 */
public class StringZnakoviRazliciti {
	public static void main(String[] args) {
		String unos;

		System.out.println("Unesite jednu rijec ");
		Scanner in = new Scanner(System.in);
		unos = in.next();

		for (int i = 0; i < (unos.length()); i++) {
			String Slovo = unos.substring(i, i + 1);

			for (int a = i + 1; a < unos.length(); a++) {
				String Slovo1 = unos.substring(a, a + 1);

				if (Slovo.equals(Slovo1)) {

					System.out.println("Ima duplih slova");

					return;
				}

			}

		}
	}
}
