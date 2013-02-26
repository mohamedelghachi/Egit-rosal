import java.text.DecimalFormat;
import java.util.*;

public class CalculatingPM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat () ; 
		df.setMaximumFractionDigits (3) ; 
		String s = in.next();
		double[] r = { 71.03711, 103.00919, 115.02694, 129.04259, 147.06841,
				57.02146, 137.05891, 113.08406, 128.09496, 113.08406,
				131.04049, 114.04293, 97.05276, 128.05858, 156.10111, 87.03203,
				101.04768, 99.06841, 186.07931, 163.06333 };
		String alph = "ACDEFGHIKLMNPQRSTVWY";
		double g = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < 20; j++) {
				if (s.charAt(i) == alph.charAt(j)) {
					g += r[j];
					break;
				}
			}
		}
		System.out.println(df.format(g).replace(',','.'));
	}
	
}
