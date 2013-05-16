package no.kriska.marka.graph;

public class Faktorkalkulator2012 implements Faktorkalkulator {

	private KrisFaktorkalkulator2012 krisFaktorkalkulator2012;
	private LarsFaktorkalkulator2012 larsFaktorkalkulator2012;

	public Faktorkalkulator2012() {
		krisFaktorkalkulator2012 = new KrisFaktorkalkulator2012();
		larsFaktorkalkulator2012 = new LarsFaktorkalkulator2012();
	}

	private static double avrund(double d) {
		return (Math.round(d * 100.0)) / 100.0;
	}

	@Override
	public double faktor(double distanse, double stigning, double nedtur,
			int andelVei) {
		double krisFaktor = krisFaktorkalkulator2012.faktor(distanse, stigning,
				nedtur, andelVei);
		double larsFaktor = larsFaktorkalkulator2012.faktor(distanse, stigning,
				nedtur, andelVei);
		double larsNormalisert = larsFaktor / 2.05 * 1.63;

		return avrund((krisFaktor + larsNormalisert) / 2);
	}
}
