import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class edge {
	String cont;
	List<edge> succ = new ArrayList<edge>();
	List<edge> pred = new ArrayList<edge>();

	public edge(String s) {
		this.cont = s;
	}
}

public class LONG {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream("a.in")));
		String s = in.readLine();
		String cont = in.readLine();
		edge e = new edge(cont);
		List<edge> liste = new ArrayList<edge>();
		liste.add(e);
		s = in.readLine();
		while (s != null) {
			cont = in.readLine();
			e = new edge(cont);
			liste.add(e);
			s = in.readLine();
		}
		while (liste.size() != 1) {
			List<edge> liste2 = new ArrayList<edge>();
			edge first ;
			boolean b = false;
			for (edge y : liste) {
				if(!b){
					first = y;
					b = true;
					liste2.add(first);
					continue;
					}
			}
		}

	}

}
