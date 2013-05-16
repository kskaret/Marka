package no.kriska.marka.graph;

public class Faktorkalkulator2013 implements Faktorkalkulator {

	private static double avrund(double d) {
		return (Math.round(d * 100.0)) / 100.0;
	}

	@Override
	public double faktor(double distanse, double stigning, double nedtur,
			int andelVei) {
		double krisFaktor = krisFaktor(distanse, stigning, nedtur, andelVei);
		double larsFaktor = larsFaktor(distanse, stigning, nedtur, andelVei);
		double larsNormalisert = larsFaktor / 2.05 * 1.63;

		return avrund((krisFaktor + larsNormalisert) / 2);
	}

	private double krisFaktor(double distanse, double stigning, double nedtur,
			int andelVei) {
		int oppInnvirkning = 20;
		int nedInnvirkning = 5;
		double stiInnvirkning = 1.8;

		double oppProsent = stigning / (distanse * 1000);
		double nedProsent = nedtur / (distanse * 1000);

		double oppFaktor = 1 + oppProsent * oppInnvirkning;
		double nedFaktor = 1 - nedProsent * nedInnvirkning;

		double andelSti = (100 - andelVei) / 100.0;
		double stifaktor = andelVei / 100.0 + stiInnvirkning * andelSti;

		double turFaktor = oppFaktor * nedFaktor * stifaktor;
		return avrund(turFaktor);
	}

	public double larsFaktor(double distanse, double stigning, double nedtur,
			int andelVei) {
		double stiInnvirkning = 1.8;
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
