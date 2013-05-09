package no.kriska.marka.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Graph {

	Post start;

	List<Sti> stier;

	List<Post> skalBesoke;

	public Graph(Post start) {
		this.start = start;
		stier = new ArrayList<Sti>();
		this.skalBesoke = new ArrayList<Post>();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("graph G {\n");
		for (Sti sti : stier) {
			sb.append(sti.toString());
		}
		sb.append("}");

		return sb.toString();
	}

	public void leggTilSti(Sti sti) {
		stier.add(sti);
	}

	public Post getStart() {
		return start;
	}

	public Set<Post> poster() {
		Set<Post> poster = new HashSet<Post>();
		for (Sti sti : stier) {
			poster.add(sti.getPostA());
			poster.add(sti.getPostB());
		}
		return poster;
	}

	public void setSkalBesoke(List<Post> skalBesoke) {
		this.skalBesoke = skalBesoke;
	}

	public List<Post> getSkalBesoke() {
		return skalBesoke;
	}

}
