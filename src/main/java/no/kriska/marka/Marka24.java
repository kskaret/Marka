package no.kriska.marka;

import no.kriska.marka.graph.Graph;
import no.kriska.marka.graph.GraphFactory;

public class Marka24 {
	public static void main(String[] args) {
		Graph graph = new GraphFactory().fullGraph();

		RouteService routeService = new RouteService();

		routeService.optimalRoute(graph, 275);
	}
}
