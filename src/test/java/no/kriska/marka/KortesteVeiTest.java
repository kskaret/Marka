package no.kriska.marka;

import java.util.Set;

import no.kriska.marka.graph.Graph;
import no.kriska.marka.graph.GraphFactory;
import no.kriska.marka.graph.Kryss;

import org.junit.Test;

public class KortesteVeiTest {

	@Test
	public void skalFinneShortestPathHomeIMiniGraph() {
		Graph graph = new GraphFactory().miniGraph();

		Set<Kryss> poster = shortestPathsHome(graph);
		for (Kryss post : poster) {
			System.out.println(post.getKortesteVeiKmf() + " " + post);
		}
	}


	@Test
	public void skalFinneShortestPathHomeIFullGraph() {
		Graph graph = new GraphFactory().fullGraph();

		Set<Kryss> poster = shortestPathsHome(graph);
		for (Kryss post : poster) {
			System.out.println(post.getKortesteVeiKmf() + " " + post);
		}
	}
	
	private Set<Kryss> shortestPathsHome(Graph graph) {
		Kryss start = graph.getStart();
		start.finnKorteteVeiKmf(0);

		return graph.poster();
	}
}
