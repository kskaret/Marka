package no.kriska.marka.graph;

import junit.framework.Assert;

import no.kriska.marka.graph.Graph;
import no.kriska.marka.graph.GraphBuilder;
import no.kriska.marka.graph.Kryss;

import org.junit.Test;

public class GraphBuilderTest {

	@Test
	public void skalByggeGraph() {
		Kryss sognsvann = new Kryss("sognsvann", 1);
		Kryss ullevalseter = new Kryss("ullevalseter", 1);
		Kryss fagervann = new Kryss("fagervann", 1);

		Graph graph = new GraphBuilder() //
				.start(sognsvann) //
				.sti(sognsvann, ullevalseter, 5.3, 1.0, 1.0) //
				.sti(ullevalseter, fagervann, 3.9, 1.0, 1.0) //
				.sti(fagervann, sognsvann, 8.2, 1.0, 1.0) //
				.build();
		System.out.println(graph);

		Assert.assertEquals("graph G {\n"
				+ "sognsvann -- ullevalseter [len=5.3, label=5.3]\n"
				+ "ullevalseter -- sognsvann [len=5.3, label=5.3]\n"
				+ "ullevalseter -- fagervann [len=3.9, label=3.9]\n"
				+ "fagervann -- ullevalseter [len=3.9, label=3.9]\n"
				+ "fagervann -- sognsvann [len=8.2, label=8.2]\n"
				+ "sognsvann -- fagervann [len=8.2, label=8.2]\n" + "}",
				graph.toString());

	}
}
