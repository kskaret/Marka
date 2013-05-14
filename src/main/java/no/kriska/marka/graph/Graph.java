package no.kriska.marka.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph {

	private final Post start;

	private final List<Sti> stier;

	public Graph(Post start, List<Sti> stier) {
		this.start = start;
		this.stier = stier;
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

	public Post getStart() {
		return start;
	}

	public Set<Post> poster() {
		Set<Post> poster = new HashSet<Post>();
		for (Sti sti : stier) {
			// poster.add(sti.getFra());
			poster.add(sti.getTil());
		}
		return poster;
	}
}
