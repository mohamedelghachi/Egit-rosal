import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EnumeratingGO {

	/**
	 * @param args
	 */
	public static void po(int n, String[] tab, String res, BufferedWriter out,
			boolean[] b) throws IOException {
		out.write(res + "\n");
		// System.out.println(res);
		if (n == 0) {
			System.out.println(res);
		} else {
			for (int i = 0; i < tab.length; i++) {
				String tmpRes = "";
				if (b[i])
					continue;
				b[i] = true;
				tmpRes = res + tab[i] + " ";
				po(n - 1, tab, tmpRes, out, b);
				b[i]=false;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		BufferedWriter out = new BufferedWriter(new FileWriter("b.out"));
		// String s = in.nextLine();
		String s = "1 2";
		String[] tab = s.split(" ");
		boolean[] b = new boolean[tab.length];
		String res = "";
		int n = 2;// in.nextInt();
		po(n, tab, res, out, b);
		out.close();
	}

}
