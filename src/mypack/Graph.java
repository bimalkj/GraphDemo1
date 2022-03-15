package mypack;
import java.util.*;

public class Graph {

	LinkedList<Integer> adn[];
	int novert;
	
	@SuppressWarnings("unchecked")
	public Graph(int novert) {
		this.novert=novert;
		adn=new LinkedList[novert];
		for (int i = 0; i < novert; i++) {
			adn[i]=new LinkedList<Integer>();
		}
	}
	
	void addEdge(int d,int v) {
		adn[d].add(v);
	}
	
	
}
