package no.kriska.marka;

import java.util.Arrays;
import java.util.List;

import no.kriska.marka.graph.Faktorkalkulator2013;
import no.kriska.marka.graph.Graph;
import no.kriska.marka.graph.GraphFactory;
import no.kriska.marka.graph.Post;

public class Marka24 {
	public static void main(String[] args) {
		Graph graph = new GraphFactory().fullGraph2(new Faktorkalkulator2013());

		RouteService routeService = new RouteService();

		// List<Post> skalBesoke = Arrays.asList();
		// List<Post> skalBesoke = Arrays.asList(SKJENNUNGSTUA, STUDENTERHYTTA);
		// List<Post> skalBesoke = Arrays.asList(Post.SAETEREN,
		// Post.BRUNKOLLEN);
		List<Post> skalBesoke = Arrays.asList(Post.SAETEREN, Post.BRUNKOLLEN,
				Post.VENAS, Post.MYRSETER, Post.PRESTHYTTA);

		routeService.optimalRoute(graph, 275, skalBesoke);
	}
}
