package no.kriska.marka.graph;

import java.util.Arrays;
import java.util.LinkedList;

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

	public GraphBuilder sti(Post fra, Post til, double lengde, double abFaktor,
			double baFaktor) {
		Sti sti = new Sti(fra, til, lengde, abFaktor, baFaktor);
		graph.leggTilSti(sti);
		return this;
	}

	public GraphBuilder skalBesoke(Post... post) {
		graph.setSkalBesoke(new LinkedList<Post>(Arrays.asList(post)));
		return this;
	}

}
