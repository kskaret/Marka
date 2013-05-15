package no.kriska.marka.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph {

	private final Kryss start;

	private final List<Sti> stier;

	public Graph(Kryss start, List<Sti> stier) {
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

	public Kryss getStart() {
		return start;
	}

	public Set<Kryss> poster() {
		Set<Kryss> poster = new HashSet<Kryss>();
		for (Sti sti : stier) {
			// poster.add(sti.getFra());
			poster.add(sti.getTil());
		}
		return poster;
	}
}
