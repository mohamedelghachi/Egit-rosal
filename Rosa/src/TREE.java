import java.io.*;
import java.util.*;

class edge2{
	int n ;
	List<edge2> succ = new ArrayList<edge2>();
	List<edge2> pred = new ArrayList<edge2>();
	boolean b;
	public edge2(int n ) {
		this.n = n;
		b=false;
	}
}

public class TREE {

	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream("a.in")));
		int n = Integer.parseInt(in.readLine());
		List<edge2> l = new ArrayList<edge2>();
		for(int i = 1;i<=n;i++){
			edge2 e = new edge2(i);
			l.add(e);
		}
		String s = in.readLine();
		while(s!=null){
			edge2 e1 = l.get(Integer.parseInt(s.split(" ")[0])-1);
			edge2 e2 = l.get(Integer.parseInt(s.split(" ")[1])-1);
			e1.succ.add(e2);
			e2.pred.add(e1);
			s=in.readLine();
		}
		int res=0;
		for(edge2 e:l){
			if(!e.b){
				res++;
				p(e,l);
			}
		}
		System.out.println(res-1);
	}

	private static void p(edge2 e, List<edge2> l) {
		e.b = true;
		for(edge2 o:e.succ){
			if(!o.b)
				p(o,l);
		}
		for(edge2 o:e.pred){
			if(!o.b)
				p(o,l);
		}
	}

}
