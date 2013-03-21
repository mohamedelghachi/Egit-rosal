import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LCSM {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
//		Scanner in = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("b.out")));
		in.readLine();
		String s1 = in.readLine();
		in.readLine();
		String s2 = in.readLine();
		int l1 = s1.length();
		int l2 = s2.length();
		int z = 0;
		List<String> liste = new ArrayList<String>();
		// List<Integer> f = new ArrayList<Integer>();
		int[][] tab = new int[l1][l2];
		for (int i = 0; i < l1; i++) {
			for (int j = 0; j < l2; j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					if (i == 0 || j == 0)
						tab[i][j] = 1;
					else {
						tab[i][j] = tab[i - 1][j - 1] + 1;
					}
					if (tab[i][j] > z) {
						z = tab[i][j];
						liste.clear();
						liste.add(s1.substring(i - z + 1, i + 1));
						continue;
					}
					if (tab[i][j] == z) {
						liste.add(s1.substring(i - z + 1, i + 1));
					}

				}
			}
		}
		s2 = in.readLine();
		boolean[] b = new boolean[liste.size()]; 
		while (s2 != null) {
			s2 = in.readLine();
			int u = 0;
			for (String f : liste) {
				if(!s2.contains(f))
					b[u]=true;
				u++;
			}
			s2=in.readLine();
			if(s2==null)
				break;
		}
		int u =0;
		
		for(String t:liste)
		{
//			if(liste.size()==1)
//			{
//				System.out.println(liste.get(0));
//				return;
//			}
			if(!b[u])
			{
				System.out.println(liste.get(u));
//				break;
			}
			u++;
		}
//		System.out.println(liste.get(0));
		// System.out.println(z);

	}
}
