import java.io.*;
import java.util.*;

public class SPLC {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// Scanner in = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream("a.in")));
		in.readLine();
		String f = in.readLine();
		in.readLine();
		String s = in.readLine();
		while (s != null) {
			while (f.contains(s)) {
				f = f.replace(s, "");
			}
			s = in.readLine();
			if (s != null)
				s = in.readLine();
			else
				break;
		}
		f = f.replace('T', 'U');
		String[] tab = { "UUU", "F", "CUU", "L", "AUU", "I", "GUU", "V", "UUC",
				"F", "CUC", "L", "AUC", "I", "GUC", "V", "UUA", "L", "CUA",
				"L", "AUA", "I", "GUA", "V", "UUG", "L", "CUG", "L", "AUG",
				"M", "GUG", "V", "UCU", "S", "CCU", "P", "ACU", "T", "GCU",
				"A", "UCC", "S", "CCC", "P", "ACC", "T", "GCC", "A", "UCA",
				"S", "CCA", "P", "ACA", "T", "GCA", "A", "UCG", "S", "CCG",
				"P", "ACG", "T", "GCG", "A", "UAU", "Y", "CAU", "H", "AAU",
				"N", "GAU", "D", "UAC", "Y", "CAC", "H", "AAC", "N", "GAC",
				"D", "UAA", " ", "CAA", "Q", "AAA", "K", "GAA", "E", "UAG",
				" ", "CAG", "Q", "AAG", "K", "GAG", "E", "UGU", "C", "CGU",
				"R", "AGU", "S", "GGU", "G", "UGC", "C", "CGC", "R", "AGC",
				"S", "GGC", "G", "UGA", " ", "CGA", "R", "AGA", "R", "GGA",
				"G", "UGG", "W", "CGG", "R", "AGG", "R", "GGG", "G" };
		for (int i = 0; i < f.length(); i += 3) {
			for (int j = 0; j < tab.length; j++) {
				if (f.substring(i, i + 3).equals(tab[j])) {
					System.out.print(tab[j+1]);;
				}
			}	
		}
	}
}