package no.kriska.marka.graph;

public class GraphBuilder {

	Graph graph;

	public GraphBuilder start(Post start) {
		start.setMaal();
		graph = new Graph(start);
		return this;
	}

	public Graph build() {
		return graph;
	}

	public GraphBuilder sti(Post postA, Post postB, double lengde,
			double abFaktor, double baFaktor) {
		graph.leggTilSti(new Sti(postA, postB, lengde, abFaktor));
		graph.leggTilSti(new Sti(postB, postA, lengde, baFaktor));
		return this;
	}

}
