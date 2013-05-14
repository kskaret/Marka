package no.kriska.marka.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphBuilder {

	private Post start;

	private List<Sti> stier = new ArrayList<Sti>();

	public GraphBuilder start(Post start) {
		start.setMaal();
		this.start = start;
		return this;
	}

	public Graph build() {
		return new Graph(start, stier);
	}

	public GraphBuilder sti(Post postA, Post postB, double lengde,
			double abFaktor, double baFaktor) {

		stier.add(new Sti(postA, postB, lengde, abFaktor));
		stier.add(new Sti(postB, postA, lengde, baFaktor));
		return this;
	}

}
