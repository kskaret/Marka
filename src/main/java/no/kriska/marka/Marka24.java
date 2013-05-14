package no.kriska.marka;

import no.kriska.marka.graph.Graph;
import no.kriska.marka.graph.GraphFactory;

public class Marka24 {
	public static void main(String[] args) {
		Graph graph = new GraphFactory().fullGraph();

		RouteService routeService = new RouteService();

		//List<Post> skalBesoke = Arrays.asList(Post)
		
		routeService.optimalRoute(graph, 275);
	}
}

//.skalBesoke(skjennungstua, studenterhytta, kobberhaug)//
//.skalBesoke(skjennungstua, studenterhytta, kobberhaug, bjornholdt)//
//.skalBesoke(skjennungstua, studenterhytta, kobberhaug, bjornholdt, liggeren)//
//.skalBesoke(skjennungstua, studenterhytta, kobberhaug, bjornholdt, kikut)//
//.skalBesoke(skjennungstua, studenterhytta, kobberhaug, bjornholdt, gorja)//
//.skalBesoke(skjennungstua, studenterhytta, kobberhaug, kikut)//						
//.skalBesoke(skjennungstua, studenterhytta, kobberhaug, kikut, gorja)//
//.skalBesoke(skjennungstua, studenterhytta, kobberhaug, kikut, oppkuven)//
//.skalBesoke(skjennungstua, studenterhytta, kobberhaug, kikut, smedmyrkoia)//
//.skalBesoke(skjennungstua, studenterhytta, kobberhaug, smedmyrkoia, oppkuven, kikut, gorja)//
//.skalBesoke(skjennungstua, studenterhytta, kobberhaug, smedmyrkoia, kikut)//
//.skalBesoke(skjennungstua, studenterhytta, kobberhaug, smedmyrkoia, oppkuven)//
// .skalBesoke(skjennungstua, studenterhytta, kobberhaug, smedmyrkoia,
// myrseter)//
