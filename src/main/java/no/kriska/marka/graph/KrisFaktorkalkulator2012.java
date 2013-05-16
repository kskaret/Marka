package no.kriska.marka.graph;

public class KrisFaktorkalkulator2012 implements Faktorkalkulator {

	private double avrund(double d) {
		return (Math.round(d * 100.0)) / 100.0;
	}

	@Override
	public double faktor(double distanse, double stigning, double nedtur,
			int andelVei) {
		int oppInnvirkning = 20;
		int nedInnvirkning = 5;
		double stiInnvirkning = 1.5;

		double oppProsent = stigning / (distanse * 1000);
		double nedProsent = nedtur / (distanse * 1000);

		double oppFaktor = 1 + oppProsent * oppInnvirkning;
		double nedFaktor = 1 - nedProsent * nedInnvirkning;

		double andelSti = (100 - andelVei) / 100.0;
		double stifaktor = andelVei / 100.0 + stiInnvirkning * andelSti;

		double turFaktor = oppFaktor * nedFaktor * stifaktor;
		return avrund(turFaktor);
	}
}
