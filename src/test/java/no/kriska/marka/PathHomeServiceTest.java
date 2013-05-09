package no.kriska.marka;

import java.util.Set;

import no.kriska.marka.graph.Graph;
import no.kriska.marka.graph.GraphFactory2;
import no.kriska.marka.graph.Post;

import org.junit.Test;

public class PathHomeServiceTest {

	@Test
	public void skalFinneShortestPathHomeIMiniGraph() {
		Graph graph = new GraphFactory2().miniGraph();

		Set<Post> poster = shortestPathsHome(graph);
		for (Post post : poster) {
			System.out.println(post.getKortesteVeiKmf() + " " + post);
		}
	}


	@Test
	public void skalFinneShortestPathHomeIFullGraph() {
		Graph graph = new GraphFactory2().fullGraph();

		Set<Post> poster = shortestPathsHome(graph);
		for (Post post : poster) {
			System.out.println(post.getKortesteVeiKmf() + " " + post);
		}
	}
	
	private Set<Post> shortestPathsHome(Graph graph) {
		Post start = graph.getStart();
		start.finnKorteteVeiKmf(0);

		return graph.poster();
	}
}
