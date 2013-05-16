package no.kriska.marka.graph;

public class LarsFaktorkalkulator2012 implements Faktorkalkulator {

	private double avrund(double d) {
		return (Math.round(d * 100.0)) / 100.0;
	}

	@Override
	public double faktor(double distanse, double stigning, double nedtur,
			int andelVei) {
		double stiInnvirkning = 1.5;
		double veiInnvirkning = 1.0;
		double perHoldemeter = 0.04;
		double perFallmeter = -0.004;

		double andelSti = 100 - andelVei;
		double x = distanse * andelVei / 100.0 * veiInnvirkning;
		double y = distanse * andelSti / 100.0 * stiInnvirkning;
		double z = stigning * perHoldemeter;
		double w = nedtur * perFallmeter;

		double turFaktor = (x + y + z + w) / distanse;

		return avrund(turFaktor);
	}
}
