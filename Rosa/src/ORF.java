import java.util.*;

public class ORF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<String> liste = new ArrayList<String>();
		String[] s = { "UUU", "F", "CUU", "L", "AUU", "I", "GUU", "V", "UUC",
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
		String f = in.next();
//		String f = "AGCCATGTAGCTAACTCAGGTTACATGGGGATGACCCCGCGACTTGGATTAGAGTCTCTTTTGGAATAAGCCTGAATGATCCGAGTAGCATCTCAG";
		f = f.replace('T', 'U');
		String res = "";
		boolean b = true;
		for(int p=0;p<2;p++){
		for(int o =0;o<3;o++){
		for (int i = o; i < f.length() - 2; i += 3) {
			String u = f.substring(i, i + 3);
			if (!u.equals("AUG") && b)
				continue;
			b = false;
			for (int j = 0; j < s.length - 1; j += 2) {
				if (u.equals(s[j])) {
					if (s[j + 1].equals(" ")) {
						if(!liste.contains(res))
						liste.add(res);
						i=i-res.length()*3+3;
						res = "";
						b = true;
					} else
						res += s[j + 1];
					break;
				}
			}
		}
		res="";
		b=true;
	}
		String r = "";
		for(int i =f.length()-1;i>=0;i--){
			if(f.charAt(i)=='A') r+= 'U'+"";
			if(f.charAt(i)=='U') r+= 'A'+"";
			if(f.charAt(i)=='C') r+= 'G'+"";
			if(f.charAt(i)=='G') r+= 'C'+"";
		}
		res="";
		b=true;
		f=r;
		
	}
		for(String z:liste)
			System.out.println(z);
//		 System.out.println(f);
	}
}
