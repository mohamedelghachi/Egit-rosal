import java.io.*;
import java.util.*;

public class kMerC {

	public static void po(int n, String[] tab, String res,BufferedWriter out,List<String> tab2) throws IOException {
//		out.write(res+"\n");
//		System.out.println(res);
		if (n == 0) {
//			System.out.println(res);
			tab2.add(res);	
		}
		else{
			for (int i = 0; i < tab.length; i++) {
				String tmpRes = res + tab[i];
				po(n-1, tab, tmpRes,out,tab2);
			}
		}
	}

	public static void main(String[] args) throws IOException {
//		Scanner in = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream("a.in")));
		BufferedWriter out = new BufferedWriter(new FileWriter("b.out"));
		String s = "A C G T";
		String[] tab = s.split(" ");
		List<String> tab2 = new ArrayList<String>(256);
		int[] t = new int[256];
		String res = "";
		int n = 4;
		po(n, tab, res,out,tab2);
		out.close();
		in.readLine();
		String dna = "";
		String temp = in.readLine();
		while(temp!=null)
		{
			dna+=temp;
			temp = in.readLine();
		}
		for(int i = 0;i<dna.length()-3;i++){
			int j =0;
			for(String r:tab2){
				if(r.equals(dna.substring(i, i+4))){
					t[j]++;
					break;
				}
				j++;
			}
		}
		for(int i=0;i<256;i++)
			System.out.print(t[i]+" ");
	}
}