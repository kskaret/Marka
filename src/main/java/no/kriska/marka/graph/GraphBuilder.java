package no.kriska.marka.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphBuilder {

	private Kryss start;

	private List<Sti> stier = new ArrayList<Sti>();

	public GraphBuilder start(Kryss start) {
		start.setMaal();
		this.start = start;
		return this;
	}

	public Graph build() {
		return new Graph(start, stier);
	}

	public GraphBuilder sti(Kryss postA, Kryss postB, double lengde,
			double abFaktor, double baFaktor) {

		stier.add(new Sti(postA, postB, lengde, abFaktor));
		stier.add(new Sti(postB, postA, lengde, baFaktor));
		return this;
	}

}
