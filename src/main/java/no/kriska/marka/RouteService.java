package no.kriska.marka;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import no.kriska.marka.graph.Graph;
import no.kriska.marka.graph.Post;
import no.kriska.marka.graph.Rute;
import no.kriska.marka.graph.Sti;

public class RouteService {

	public Collection<Rute> optimalRoute(Graph graph, double maksKmf) {
		Date startTid = new Date();

		Post start = graph.getStart();

		// beregn korteste vei hjem for alle noder
		start.finnKorteteVeiKmf(0);
		
		Ryggsekk ryggsekk = new Ryggsekk(start, maksKmf, graph.getSkalBesoke());

		for (Sti sti : start.stier()) {
			sti.gaaFra(start, ryggsekk);
		}

		Date sluttTid = new Date();

		long brukt = sluttTid.getTime() - startTid.getTime();
		System.out.println("Tid brukt " + brukt + " ms");

		return ryggsekk.getRuter();
	}
}
