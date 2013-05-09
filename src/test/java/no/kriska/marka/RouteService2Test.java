package no.kriska.marka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import junit.framework.Assert;
import no.kriska.marka.graph.Graph;
import no.kriska.marka.graph.GraphFactory2;
import no.kriska.marka.graph.Post;
import no.kriska.marka.graph.Rute;

import org.junit.Test;

public class RouteService2Test {

	@Test
	public void skalFinneRuteGjennomMiniGraph() {

		Graph graph = new GraphFactory2().miniGraph();

		RouteService routeService = new RouteService();
		Collection<Rute> ruter = routeService.optimalRoute(graph, 40);

		for (Rute rute : ruter) {
			System.out.println("Rute " + rute);
		}

		List<String> expected = Arrays
				.asList("Rute: 44 poeng - 12.4 km - sognsvann - skjennungstua - ullevalseter - sognsvann", //
						"Rute: 79 poeng - 18.2 km - sognsvann - skjennungstua - studenterhytta - ullevalseter - sognsvann", //
						"Rute: 112 poeng - 26.0 km - sognsvann - skjennungstua - studenterhytta - ullevalseter - fagervann - ullevalseter - sognsvann");
		assertList(expected, ruter);
	}

	@Test
	public void skalFinneRuteGjennomFullGraph() {

		Graph graph = new GraphFactory2().fullGraph();

		RouteService routeService = new RouteService();
		Collection<Rute> ruter = routeService.optimalRoute(graph, 60);

		for (Rute rute : ruter) {
			System.out.println("Rute " + rute);
		}
	}

	@Test
	public void skalFinneFullRute() {

		Graph graph = new GraphFactory2().fullGraph();

		RouteService routeService = new RouteService();

		Collection<Rute> ruter = routeService.optimalRoute(graph, 275);
	}

	
	@Test
	public void skalTegneGraph() {
		Graph graph = new GraphFactory2().fullGraph();

		new Sorenskriver().write("fulLGraph.dot", graph.toString());
	}

	private void assertList(List<String> excpected, Collection<Rute> actual) {
		Assert.assertEquals(excpected.size(), actual.size());
		Iterator<Rute> it = actual.iterator();
		for (String s : excpected) {
			Assert.assertEquals(s, it.next().toString());
		}
	}
}
