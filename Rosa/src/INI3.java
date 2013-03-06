import java.util.Scanner;


public class INI3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		System.out.println(s.substring(a, b+1)+" "+s.substring(c, d+1));
	}

}
