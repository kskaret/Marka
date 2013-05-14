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
		return optimalRoute(graph, maksKmf, new ArrayList<Post>());
	}

	public Collection<Rute> optimalRoute(Graph graph, double maksKmf,
			List<Post> skalBesoke) {
		Date startTid = new Date();

		Post start = graph.getStart();

		// beregn korteste vei hjem for alle noder
		start.finnKorteteVeiKmf(0);

		Ryggsekk ryggsekk = new Ryggsekk(start, maksKmf, skalBesoke);

		for (Sti sti : start.stier()) {
			sti.gaa(ryggsekk);
		}

		Date sluttTid = new Date();

		long brukt = sluttTid.getTime() - startTid.getTime();
		System.out.println("Tid brukt " + brukt + " ms");

		return ryggsekk.getRuter();
	}
}
