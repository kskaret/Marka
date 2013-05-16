package no.kriska.marka.graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FaktorKalkulatorTest {

	@Test
	public void skalBeregneKrisFaktor() {
		KrisFaktorkalkulator2012 krisFaktorkalkulator2012 = new KrisFaktorkalkulator2012();
		double krisFaktor = krisFaktorkalkulator2012.faktor(5.2, 177, 21, 100);

		assertEquals(1.65, krisFaktor, 0.0);

		double krisFaktorRetur = krisFaktorkalkulator2012.faktor(5.2, 21, 177,
				100);

		assertEquals(0.90, krisFaktorRetur, 0.0);

		double krisFaktor2 = krisFaktorkalkulator2012
				.faktor(13.7, 275, 363, 70);

		assertEquals(1.40, krisFaktor2, 0.0);
	}

	@Test
	public void skalBeregneLarsFaktor() {
		double larsFaktor = new LarsFaktorkalkulator2012().faktor(5.15, 174, 21, 100);

		assertEquals(2.34, larsFaktor, 0.0);

	}

	@Test
	public void skalBeregneSnittFaktor() {
		double larsFaktor = new Faktorkalkulator2012().faktor(5.15, 174, 21,
				100);

		assertEquals(1.75, larsFaktor, 0.0);
	}

}
