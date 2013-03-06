import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class forma {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("a.in")));
		BufferedWriter out = new BufferedWriter(new FileWriter("b.out"));
		String s = in.readLine();
		out.write(s+"\n");
		s = in.readLine();
		do {
			while (s.charAt(0) != '>') {
				out.write(s);
				s = in.readLine();
				if (s == null)
					break;
			}
			if(s==null) break;
			out.write("\n");
			out.write(s+"\n");
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
