package no.kriska.marka;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import junit.framework.Assert;
import no.kriska.marka.graph.Graph;
import no.kriska.marka.graph.GraphFactory;
import no.kriska.marka.graph.Rute;

import org.junit.Test;

public class RouteServiceTest {

	@Test
	public void skalFinneRuteGjennomMiniGraph() {

		Graph graph = new GraphFactory().miniGraph();

		RouteService routeService = new RouteService();
		Collection<Rute> ruter = routeService.optimalRoute(graph, 50);

		List<String> expected = Arrays
				.asList("Rute: 44 poeng - 17.5 kmf - 12.4 km - sognsvann - ullevalseter - skjennungstua - sognsvann", //
						"Rute: 79 poeng - 25.6 kmf - 18.2 km - sognsvann - ullevalseter - studenterhytta - skjennungstua - sognsvann", //
						"Rute: 112 poeng - 39.1 kmf - 26.0 km - sognsvann - skjennungstua - studenterhytta - fagervann - ullevalseter - sognsvann");
		assertList(expected, ruter);
	}

	@Test
	public void skalFinneKorteRuterGjennomFullGraph() {
		Graph graph = new GraphFactory().fullGraph();

		RouteService routeService = new RouteService();
		Collection<Rute> ruter = routeService.optimalRoute(graph, 80);

		List<String> expected = Arrays
				.asList("Rute: 44 poeng - 18.0 kmf - 12.2 km - sognsvann - skjennungstua - ullevalseter - sognsvann",//
						"Rute: 79 poeng - 25.5 kmf - 18.1 km - sognsvann - skjennungstua - studenterhytta - ullevalseter - sognsvann",//
						"Rute: 112 poeng - 40.0 kmf - 25.8 km - sognsvann - skjennungstua - studenterhytta - fagervann - ullevalseter - sognsvann",//
						"Rute: 192 poeng - 42.3 kmf - 27.3 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - fagervann - ullevalseter - sognsvann",//
						"Rute: 237 poeng - 44.2 kmf - 27.4 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - bjornholdt - fagervann - ullevalseter - sognsvann",//
						"Rute: 268 poeng - 48.0 kmf - 31.1 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - bjornholdt - liggeren - fagervann - ullevalseter - sognsvann",//
						"Rute: 348 poeng - 54.9 kmf - 33.6 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - bjornholdt - liggeren - tomte - fagervann - ullevalseter - sognsvann",//
						"Rute: 363 poeng - 58.5 kmf - 38.0 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - kikut - gorja - liggeren - fagervann - ullevalseter - sognsvann",//
						"Rute: 376 poeng - 59.0 kmf - 36.2 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - bjornholdt - liggeren - tomte - mellomkollen - fagervann - ullevalseter - sognsvann",//
						"Rute: 382 poeng - 60.1 kmf - 37.6 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - bjornholdt - gorja - tomte - fagervann - ullevalseter - sognsvann",//
						"Rute: 412 poeng - 61.3 kmf - 39.5 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - kikut - gorja - tomte - fagervann - ullevalseter - sognsvann",//
						"Rute: 413 poeng - 61.4 kmf - 38.7 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - bjornholdt - gorja - tomte - liggeren - fagervann - ullevalseter - sognsvann",//
						"Rute: 443 poeng - 62.6 kmf - 40.6 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - kikut - gorja - tomte - liggeren - fagervann - ullevalseter - sognsvann",//
						"Rute: 457 poeng - 67.1 kmf - 42.5 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - bjornholdt - kikut - gorja - tomte - fagervann - ullevalseter - sognsvann",//
						"Rute: 471 poeng - 67.2 kmf - 43.0 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - kikut - gorja - mellomkollen - tomte - liggeren - fagervann - ullevalseter - sognsvann",//
						"Rute: 488 poeng - 68.4 kmf - 43.6 km - sognsvann - skjennungstua - studenterhytta - kobberhaug - bjornholdt - kikut - gorja - tomte - liggeren - fagervann - ullevalseter - sognsvann");

		assertList(expected, ruter);

	}

	@Test
	public void skalTegneGraph() {
		Graph graph = new GraphFactory().fullGraph();

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
