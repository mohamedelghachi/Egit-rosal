import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class INI5 {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("a.in")));
		String s = in.readLine();
		int i =1;
		while(s!=null){
			if(i%2==0)
				System.out.println(s);
			i++;
			s = in.readLine();
		}
	}

}
