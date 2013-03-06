import java.util.*;

public class MRNA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = { 'A', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K', 'L', 'M',
				'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'Y' };
		int[] t = { 4, 2, 2, 2, 2, 4, 2, 3, 2, 6, 1, 2, 4, 2, 6, 6, 4, 4, 1, 2 };
		String ss = in.next();
		long res = 1;
		for(int i = 0;i<ss.length();i++){
			for(int j =0;j<s.length;j++)
			{
				if(ss.charAt(i)==s[j])
				{
					res*=t[j];
					res%=1000000;
					break;
				}
			}
		}
		res*=3;
		res%=1000000;
		System.out.println(res);
			
	}

}
