package no.kriska.marka;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import junit.framework.Assert;

import no.kriska.marka.graph.Graph;
import no.kriska.marka.graph.GraphFactory;
import no.kriska.marka.graph.Post;
import no.kriska.marka.graph.Rute;

import org.junit.Test;

public class PathHomeServiceTest {

	@Test
	public void skalFinneShortestPathHomeIMikroGraph() {
		PathHomeService pathHomeService = new PathHomeService();
		Graph graph = new GraphFactory().mikroGraph();

		Set<Post> poster = pathHomeService.shortestPathsHome(graph);
		for (Post post : poster) {
			System.out.println(post.getKortesteVei() + " " + post);
		}
	}

	@Test
	public void skalFinneShortestPathHomeIMiniGraph() {
		PathHomeService pathHomeService = new PathHomeService();
		Graph graph = new GraphFactory().miniGraph();

		Set<Post> poster = pathHomeService.shortestPathsHome(graph);
		for (Post post : poster) {
			System.out.println(post.getKortesteVei() + " " + post);
		}
	}

	@Test
	public void skalFinneShortestPathHomeIFullGraph() {
		PathHomeService pathHomeService = new PathHomeService();
		Graph graph = new GraphFactory().fullGraph();

		Set<Post> poster = pathHomeService.shortestPathsHome(graph);
		for (Post post : poster) {
			System.out.println(post.getKortesteVei() + " " + post);
		}
	}
}
