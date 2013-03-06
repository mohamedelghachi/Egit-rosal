import java.util.Scanner;


public class INI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int a =0,c=0,g=0,t=0;
		for(int i = 0;i<s.length();i++){
			if(s.charAt(i)=='A') a++;
			if(s.charAt(i)=='C') c++;
			if(s.charAt(i)=='G') g++;
			if(s.charAt(i)=='T') t++;
		}
		System.out.print(a+" "+c+" "+g+" "+t);

	}

}
