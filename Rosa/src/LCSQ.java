import java.io.*;

public class LCSQ {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream("a.in")));
		BufferedWriter out = new BufferedWriter(new FileWriter("b.out"));
		String s1 = in.readLine();// "ATCTGAT";
		String s2 = in.readLine();// "TGCATA";
		String superS = "";
		int[][] tab = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 0; i <= s1.length(); i++)
			tab[i][0] = i;
		for (int i = 0; i <= s2.length(); i++)
			tab[0][i] = i;
		int max = 0;
		int x = 0;
		int y = 0;
		for (int i = 1; i <= s1.length(); i++) {
			for (int j = 1; j <= s2.length(); j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					tab[i][j] = tab[i - 1][j - 1] + 1;
					if (tab[i][j] >= max) {
						max = tab[i][j];
						x = i;
						y = j;
					}
				} else {
					tab[i][j] = Math.min(tab[i - 1][j] + 1, tab[i][j - 1] + 1);
					if (tab[i][j] >= max) {
						max = tab[i][j];
						x = i;
						y = j;
					}
				}
			}
		}
		while (x >= 1 || y >= 1) {
			if(y==0)
			{
				for(;x>0;x--)
					superS+=""+s1.charAt(x-1);
				continue;
			}
			if(x==0)
			{
				for(;y>0;y--)
					superS+=""+s2.charAt(y-1);
				continue;
			}
				if (s1.charAt(x - 1) == s2.charAt(y - 1)) {
					superS += "" + s1.charAt(x - 1);
					if (x >= 0)
						x--;
					if (y >= 0)
						y--;
				} else {
					if (tab[x][y] - 1 == tab[x - 1][y] || y == 0) {
						superS += "" + s1.charAt(x - 1);
						if (x >= 0)
							x--;
					} else {
						superS += "" + s2.charAt(y - 1);
						if (y >= 0)
							y--;
					}
				}
		}
		for (int i = 0; i < superS.length(); i++)
			out.write(superS.charAt(superS.length() - 1 - i));
		out.close();
		// out.println(superS.length());
	}
}
