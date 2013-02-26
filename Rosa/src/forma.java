import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class forma {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("a.in")));
		String s = in.readLine();
		System.out.println(s);
		s = in.readLine();
		do {
			while (s.charAt(0) != '>') {
				System.out.print(s);
				s = in.readLine();
				if (s == null)
					break;
			}
			if(s==null) break;
			System.out.println();
			System.out.println(s);
			s = in.readLine();
		} while (s != null);
	}
	
//	RosalindParser(String filename){}
//	
//	getValue(String label) {
//		return "";
//	}
//	
//	Vectror<String> getAllLabels() {return null;}
	
	

}
