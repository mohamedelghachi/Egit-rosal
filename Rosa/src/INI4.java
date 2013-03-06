
public class INI4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int k = 4576;
		int j = 9187;
		long s = 0;
		for(int i =k;i<=j;i++)
			if(i%2!=0)
				s+=i;
		System.out.println(s);

	}

}
