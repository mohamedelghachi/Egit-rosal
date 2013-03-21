import java.util.*;


public class FIBD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int m = in.nextInt();
		int n = 92;
		int m = 20;
		long[][] tab = new long[n][m];
		tab[0][0] = 1;
		for(int i = 1;i<n;i++){
			for(int j = 1;j<m;j++){
				tab[i][0]+=tab[i-1][j];
				tab[i][j] = tab[i-1][j-1];
			}
		}
		long res = 0;
		for(int i = 0;i<m;i++)
			res+=tab[n-1][i];
		System.out.println(res);
	}

}
