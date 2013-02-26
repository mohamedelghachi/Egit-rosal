import java.util.Scanner;


public class RabbitsRR {

	/**
	 * @param args
	 */
	static int k = 0;
	public static long fib(int n){
		if(n==1 || n==2) return 1;
		return fib(n-1)+fib(n-2)*k;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		k = in.nextInt();
		System.out.println(fib(n));

	}

}
