package no.kriska.marka;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import junit.framework.Assert;

import no.kriska.marka.graph.Graph;
import no.kriska.marka.graph.GraphFactory1;
import no.kriska.marka.graph.GraphFactory2;
import no.kriska.marka.graph.Rute;

import org.junit.Test;

public class RouteService2Test {


	@Test
	public void skalFinneRuteGjennomMiniGraph() {

		Graph graph = new GraphFactory2().miniGraph();

		RouteService routeService = new RouteService();
		Collection<Rute> ruter = routeService.optimalRoute(graph, 40);
		
		for(Rute rute: ruter) {
			System.out.println("Rute " + rute);
		}
		
		List<String> expected = Arrays
				.asList("Rute: 23 poeng - 9.8 km - sognsvann - skjennungstua - sognsvann", //
						"Rute: 44 poeng - 12.4 km - sognsvann - skjennungstua - ullevalseter - sognsvann", //
						"Rute: 58 poeng - 17.4 km - sognsvann - skjennungstua - studenterhytta - skjennungstua - sognsvann", //
						"Rute: 79 poeng - 18.2 km - sognsvann - skjennungstua - studenterhytta - ullevalseter - sognsvann", //
						"Rute: 112 poeng - 26.0 km - sognsvann - skjennungstua - studenterhytta - ullevalseter - fagervann - ullevalseter - sognsvann");
		assertList(expected, ruter);
	}

	@Test
	public void skalFinneRuteGjennomFullGraph() {

		Graph graph = new GraphFactory1().fullGraph();

		RouteService routeService = new RouteService();
		Collection<Rute> ruter = routeService.optimalRoute(graph, 30);

		List<String> expected = Arrays
				.asList("Rute: 23 poeng - 10.2 km - sognsvann - skjennungstua - sognsvann", //
						"Rute: 44 poeng - 12.7 km - sognsvann - skjennungstua - ullevalseter - sognsvann", //
						"Rute: 58 poeng - 17.8 km - sognsvann - skjennungstua - studenterhytta - skjennungstua - sognsvann", //
						"Rute: 79 poeng - 18.5 km - sognsvann - skjennungstua - studenterhytta - ullevalseter - sognsvann", //
						"Rute: 138 poeng - 20.8 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - studenterhytta - skjennungstua - sognsvann", //
						"Rute: 159 poeng - 21.5 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - studenterhytta - ullevalseter - sognsvann", //
						"Rute: 183 poeng - 26.6 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - bjornholdt - kobberhaug - studenterhytta - skjennungstua - sognsvann", //
						"Rute: 204 poeng - 27.3 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - bjornholdt - kobberhaug - studenterhytta - ullevalseter - sognsvann", //
						"Rute: 237 poeng - 28.1 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - bjornholdt - fagervann - ullevalseter - sognsvann");

		assertList(expected, ruter);
	}
	
	@Test
	public void skalFinneFullRute() {

		Graph graph = new GraphFactory1().fullGraph();

		RouteService routeService = new RouteService();
		Collection<Rute> ruter = routeService.optimalRoute(graph, 162.7);
	}
	
	
	@Test
	public void skalFinneFullRuteUtenBrunkollenSaeteren() {

		Graph graph = new GraphFactory1().utenBrunkollenSaeteren();

		RouteService routeService = new RouteService();
		Collection<Rute> ruter = routeService.optimalRoute(graph, 162.7);
	}
	
	@Test
	public void skalTegneGraph() {
		Graph graph = new GraphFactory1().fullGraph();

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
