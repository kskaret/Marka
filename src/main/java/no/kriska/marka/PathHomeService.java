package no.kriska.marka;

import java.util.Set;

import no.kriska.marka.graph.Graph;
import no.kriska.marka.graph.Post;

public class PathHomeService {

	public Set<Post> shortestPathsHome(Graph graph) {
		Post start = graph.getStart();
		start.finnKorteteVeiKmf(0);

		return graph.poster();
	}
}
