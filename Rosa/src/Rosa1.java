import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Rosa1 {

	public static double countIt(String s) {
		double n = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'C' || s.charAt(i) == 'G')
				n++;
		}
		return (n / s.length()) * 100;
	};

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader in =new BufferedReader(new InputStreamReader(new FileInputStream("a.in")));
		DecimalFormat df = new DecimalFormat () ; 
		df.setMinimumFractionDigits (6) ; 
		String n="";
		String s;
		double f=0;
		double max = (double) -1;
		boolean b = true;
		String n1 = "";
		String s11 = "";
		do {
			if(b) 
				n1 = in.readLine();
			b = false;
			String s1 = "";
			s1 = in.readLine();
			s11 = in.readLine();
			while(s11.charAt(0)!='>')
			{
				s1 += s11;
				s11 = in. readLine();
				if(s11.equals("*")) break;
			}
			double f1 = countIt(s1);
			System.out.println(n1.substring(1, n1.length()));
			System.out.println(df.format(f1));
			if (f1 > max)
			{
				n = n1;
				s = s1;
				f = f1;
			}
			if(s11.equals("*"))
				break;
			else n1 = s11;
		} while (!n1.equals(""));
		
	}
}
