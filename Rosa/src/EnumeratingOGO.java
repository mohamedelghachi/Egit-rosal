import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EnumeratingOGO {

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
//		int n = in.nextInt();
		int n = 2;
		String s ="";
		for(int e = 1;e<=n;e++){
			s+=e+" ";
		}
		for(int o =0;o<Math.pow(2, n);o++)
		{
			String ss = s;
			String[] tab = ss.split(" ");
			if(o==0) ;
			else if(o<=n && o>0) tab[o-1]="-"+tab[o-1];
			else if(o>n && o<2*n) ;
			boolean[] b = new boolean[tab.length];
			String res = "";
			po(n, tab, res, out, b);
			out.close();
		}
		
	}

}
