import java.io.*;
import java.util.*;


public class permu {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws IOException{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(n);
		boolean[] elem = new boolean[n];
		int[] list = new int[n];
		for(int i = 1;i <=n;i++){
			list[i-1] = i;
		}
		toS(list);
	}
	
	public static void toS(int[] list){
		for(int i = 0;i<list.length;i++)
			System.out.print(list[i]+" ");
	}

}

