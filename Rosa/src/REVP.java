import java.util.*;

public class REVP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String f = "";
		for (int k = 4; k <= 12; k++) {
			for (int i = 0; i < s.length() - k + 1; i++) {
				f=trans(s.substring(i, i + k));
				if (f.equals(s.substring(i, i + k)))
					System.out.println((i + 1) + " " + k);
			}
		}
	}

	private static String trans(String s) {
		String f = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == 'A')
				f += 'T';
			if (s.charAt(i) == 'T')
				f += 'A';
			if (s.charAt(i) == 'C')
				f += 'G';
			if (s.charAt(i) == 'G')
				f += 'C';
		}
		return f;
	}

}
