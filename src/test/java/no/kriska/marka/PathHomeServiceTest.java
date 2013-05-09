package no.kriska.marka;

import java.util.Set;

import no.kriska.marka.graph.Graph;
import no.kriska.marka.graph.GraphFactory1;
import no.kriska.marka.graph.Post;

import org.junit.Test;

public class PathHomeServiceTest {

	@Test
	public void skalFinneShortestPathHomeIMikroGraph() {
		PathHomeService pathHomeService = new PathHomeService();
		Graph graph = new GraphFactory1().mikroGraph();

		Set<Post> poster = pathHomeService.shortestPathsHome(graph);
		for (Post post : poster) {
			System.out.println(post.getKortesteVeiKmf() + " " + post);
		}
	}

	@Test
	public void skalFinneShortestPathHomeIMiniGraph() {
		PathHomeService pathHomeService = new PathHomeService();
		Graph graph = new GraphFactory1().miniGraph();

		Set<Post> poster = pathHomeService.shortestPathsHome(graph);
		for (Post post : poster) {
			System.out.println(post.getKortesteVeiKmf() + " " + post);
		}
	}

	@Test
	public void skalFinneShortestPathHomeIFullGraph() {
		PathHomeService pathHomeService = new PathHomeService();
		Graph graph = new GraphFactory1().fullGraph();

		Set<Post> poster = pathHomeService.shortestPathsHome(graph);
		for (Post post : poster) {
			System.out.println(post.getKortesteVeiKmf() + " " + post);
		}
	}
}
