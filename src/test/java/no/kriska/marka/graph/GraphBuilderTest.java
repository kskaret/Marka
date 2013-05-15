package no.kriska.marka.graph;

import static no.kriska.marka.graph.Post.FAGERVANN;
import static no.kriska.marka.graph.Post.SOGNSVANN;
import static no.kriska.marka.graph.Post.ULLEVALSETER;
import junit.framework.Assert;

import org.junit.Test;

public class GraphBuilderTest {

	@Test
	public void skalByggeGraph() {
		Graph graph = new GraphBuilder() //
				.start(SOGNSVANN) //
				.sti(SOGNSVANN, ULLEVALSETER, 5.3, 1.0, 1.0) //
				.sti(ULLEVALSETER, FAGERVANN, 3.9, 1.0, 1.0) //
				.sti(FAGERVANN, SOGNSVANN, 8.2, 1.0, 1.0) //
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
