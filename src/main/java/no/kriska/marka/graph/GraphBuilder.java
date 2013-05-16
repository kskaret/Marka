package no.kriska.marka.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphBuilder {

	private Kryss start;

	private List<Sti> stier = new ArrayList<Sti>();

	private Map<Post, Kryss> alleKryss = new HashMap<Post, Kryss>();

	private final Faktorkalkulator faktorkalkulator;

	public GraphBuilder() {
		this.faktorkalkulator = new Faktorkalkulator2012();
	}

	public GraphBuilder(Faktorkalkulator faktorkalkulator) {
		this.faktorkalkulator = faktorkalkulator;
	}

	public GraphBuilder start(Post post) {
		this.start = new Kryss(post, true);
		alleKryss.put(post, start);
		return this;
	}

	public Graph build() {
		return new Graph(start, stier);
	}

	public GraphBuilder sti(Post postA, Post postB, double lengde,
			double abFaktor, double baFaktor) {

		Kryss kryssA = putOrGet(postA);
		Kryss kryssB = putOrGet(postB);

		stier.add(new Sti(kryssA, kryssB, lengde, abFaktor));
		stier.add(new Sti(kryssB, kryssA, lengde, baFaktor));
		return this;
	}

	public GraphBuilder sti(Post sognsvann, Post ullevalseter, double distanse,
			int stigning, int nedtur, int andelVei) {
		double turfaktor = faktorkalkulator.faktor(distanse, stigning, nedtur,
				andelVei);
		double returfaktor = faktorkalkulator.faktor(distanse, nedtur,
				stigning, andelVei);

		return sti(sognsvann, ullevalseter, distanse, turfaktor, returfaktor);
	}

	private Kryss putOrGet(Post post) {
		if (alleKryss.containsKey(post)) {
			return alleKryss.get(post);
		} else {
			Kryss kryss = new Kryss(post);
			alleKryss.put(post, kryss);
			return kryss;
		}
	}

}
