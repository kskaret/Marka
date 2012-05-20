package no.kriska.marka.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph {

	Post start;

	List<Sti> stier;

	public Graph(Post start) {
		this.start = start;
		stier = new ArrayList<Sti>();
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

}
