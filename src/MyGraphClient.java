import java.util.*;

public class MyGraphClient {
	@SuppressWarnings("unused")
	public static void main(String[] args){
		Set<Vertex> v = new HashSet<Vertex>();
		Set<Edge> e = new HashSet<Edge>();
		setUp(v, e);
		MyGraph g = new MyGraph(v, e);
	}
	
	private static void setUp(Set<Vertex> v, Set<Edge> e){
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 7; i++){
			sb.append(i);
			v.add(new Vertex(sb.toString()));
		}
	}
}
