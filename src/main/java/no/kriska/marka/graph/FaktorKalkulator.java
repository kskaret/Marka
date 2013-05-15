package no.kriska.marka.graph;

public class FaktorKalkulator {

	public static double krisFaktor(double distanse, double stigning,
			double nedtur, int veiProsent) {

		int oppInnvirkning = 20;
		int nedInnvirkning = 5;
		double stiInnvirkning = 1.5;

		double oppProsent = stigning / (distanse * 1000);
		double nedProsent = nedtur / (distanse * 1000);

		double oppFaktor = 1 + oppProsent * oppInnvirkning;
		double nedFaktor = 1 - nedProsent * nedInnvirkning;

		double stiProsent = (100 - veiProsent) / 100.0;
		double stifaktor = veiProsent / 100.0 + stiInnvirkning * stiProsent;

		double turFaktor = oppFaktor * nedFaktor * stifaktor;
		return avrund(turFaktor);
	}

	public static double larsFaktor(double distanse, double stigning,
			double nedtur, int veiProsent) {

		double stiInnvirkning = 1.5;
		double veiInnvirkning = 1.0;
		double perHoldemeter = 0.04;
		double perFallmeter = -0.004;

		double stiProsent = 100 - veiProsent;
		double x = distanse * veiProsent / 100.0 * veiInnvirkning;
		double y = distanse * stiProsent / 100.0 * stiInnvirkning;
		double z = stigning * perHoldemeter;
		double w = nedtur * perFallmeter;

		double turFaktor = (x + y + z + w) / distanse;

		return avrund(turFaktor);
	}

	private static double avrund(double d) {
		return (Math.round(d * 100.0)) / 100.0;
	}
}
