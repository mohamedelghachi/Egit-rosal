import java.util.*;


public class LGIS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] tab = new int[n];
		List<Integer> min = new ArrayList<Integer>();
		List<Integer> max = new ArrayList<Integer>();
		List<Integer> min_temp = new ArrayList<Integer>();
		List<Integer> max_temp = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			tab[i] = in.nextInt();
		}
		for(int i =0;i<n;i++){
			min_temp.add(tab[i]);
			for(int j =i+1;j<n;j++){
				int o = min_temp.get(min_temp.size()-1);
				if(tab[j]<o) 
					min_temp.add(tab[j]);
			}
			if(min.size()==0 || min.size()<min_temp.size())
				min = min_temp;
			min_temp = new ArrayList<Integer>();
		}
		for(int y :min)
			System.out.print(y+" ");

	}

}
