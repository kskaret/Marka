package no.kriska.marka.graph;


public class GraphBuilder {

	Graph graph;
	public GraphBuilder start(Post start) {
		start.setMaal();
		graph = new Graph(start);
		return this;
	}

	public GraphBuilder sti(Post fra, Post til, double lengde) {
		Sti sti = new Sti(fra, til, lengde);
		graph.leggTilSti(sti);
		return this;
	}

	public Graph build() {
		return graph;		
	}

}
