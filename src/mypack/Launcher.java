package mypack;

public class Launcher {

	//Comment added in launcher
	public static void main(String[] args) {
		Graph g=new Graph(4);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(0,3);
		
		g.addEdge(1,2);
		g.addEdge(1,4);
		g.addEdge(2,3);
	}
}
