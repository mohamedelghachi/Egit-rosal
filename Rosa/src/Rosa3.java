import java.io.*;
import java.util.*;

public class Rosa3 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream("a.in")));
		String n = in.readLine();
		String s = in.readLine();
		int k = s.length();
		int[] a = new int[k];
		int[] c = new int[k];
		int[] g = new int[k];
		int[] t = new int[k];
		do {
			for (int i = 0; i < k; i++) {
				if (s.charAt(i) == 'A')
					a[i]++;
				else if (s.charAt(i) == 'T')
					t[i]++;
				else if (s.charAt(i) == 'C')
					c[i]++;
				else if (s.charAt(i) == 'G')
					g[i]++;
			}
			s = in.readLine();
			if (s != null)
				s = in.readLine();

		} while (s != null);
		
		for (int j = 0; j < k; j++) {
			int max = 0;
			char r = 0  ;
			if(a[j]>max)
			{
				max = a[j];
				r='A';
			}
			if(c[j]>max)
			{
				max = c[j];
				r='C';
			}
			if(g[j]>max)
			{
				max = g[j];
				r='G';
			}
			if(t[j]>max)
			{
				max = t[j];
				r='T';
			}
			System.out.print(r);
		}
		System.out.println();
		System.out.print("A: ");
		for (int i = 0; i < k; i++) {
			if (i == k - 1)
				System.out.print(a[i]);
			else
				System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("C: ");
		for (int i = 0; i < k; i++) {
			if (i == k - 1)
				System.out.print(c[i]);
			else
				System.out.print(c[i] + " ");
		}
		System.out.println();
		System.out.print("G: ");
		for (int i = 0; i < k; i++) {
			if (i == k - 1)
				System.out.print(g[i]);
			else
				System.out.print(g[i] + " ");
		}
		System.out.println();
		System.out.print("T: ");
		for (int i = 0; i < k; i++) {
			if (i == k - 1)
				System.out.print(t[i]);
			else
				System.out.print(t[i] + " ");
		}

		
	}
}
