package no.kriska.marka;

import static no.kriska.marka.graph.Post.SKJENNUNGSTUA;
import static no.kriska.marka.graph.Post.STUDENTERHYTTA;

import java.util.Arrays;
import java.util.List;

import no.kriska.marka.graph.Graph;
import no.kriska.marka.graph.GraphFactory;
import no.kriska.marka.graph.Post;

public class Marka24 {
	public static void main(String[] args) {
		Graph graph = new GraphFactory().fullGraph2();

		RouteService routeService = new RouteService();

		List<Post> skalBesoke = Arrays.asList(SKJENNUNGSTUA, STUDENTERHYTTA);
		routeService.optimalRoute(graph, 275, skalBesoke);
		//routeService.optimalRoute(graph, 275);
	}
}

// .skalBesoke(skjennungstua, studenterhytta, kobberhaug)//
// .skalBesoke(skjennungstua, studenterhytta, kobberhaug, bjornholdt)//
// .skalBesoke(skjennungstua, studenterhytta, kobberhaug, bjornholdt,
// liggeren)//
// .skalBesoke(skjennungstua, studenterhytta, kobberhaug, bjornholdt, kikut)//
// .skalBesoke(skjennungstua, studenterhytta, kobberhaug, bjornholdt, gorja)//
// .skalBesoke(skjennungstua, studenterhytta, kobberhaug, kikut)//
// .skalBesoke(skjennungstua, studenterhytta, kobberhaug, kikut, gorja)//
// .skalBesoke(skjennungstua, studenterhytta, kobberhaug, kikut, oppkuven)//
// .skalBesoke(skjennungstua, studenterhytta, kobberhaug, kikut, smedmyrkoia)//
// .skalBesoke(skjennungstua, studenterhytta, kobberhaug, smedmyrkoia, oppkuven,
// kikut, gorja)//
// .skalBesoke(skjennungstua, studenterhytta, kobberhaug, smedmyrkoia, kikut)//
// .skalBesoke(skjennungstua, studenterhytta, kobberhaug, smedmyrkoia,
// oppkuven)//
// .skalBesoke(skjennungstua, studenterhytta, kobberhaug, smedmyrkoia,
// myrseter)//
