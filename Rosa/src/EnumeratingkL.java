import java.io.*;
import java.util.*;

public class EnumeratingkL {

	public static void po(int n, String[] tab, String res,BufferedWriter out) throws IOException {
//		out.write(res+"\n");
//		System.out.println(res);
		if (n == 0) {
			System.out.println(res);
		}
		else{
			for (int i = 0; i < tab.length; i++) {
				String tmpRes = res + tab[i];
				po(n-1, tab, tmpRes,out);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		BufferedWriter out = new BufferedWriter(new FileWriter("b.out"));
		String s = in.nextLine();
		String[] tab = s.split(" ");
		String res = "";
		int n = in.nextInt();
		po(n, tab, res,out);
		out.close();
	}
}