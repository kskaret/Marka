package no.kriska.marka.graph;

import no.kriska.marka.Ryggsekk;

public class Sti {

	private final Post til;
	private final Post fra;
	private final double lengde;
	private final double faktor;
	private boolean brukt;

	public Sti(Post fra, Post til, double lengde, double abFaktor) {
		this.fra = fra;
		this.til = til;
		this.lengde = lengde;
		this.faktor = abFaktor;
		this.brukt = false;

		fra.leggTilSti(this);
	}

	public String toString() {
		// a -- b [len=1, label=1];
		return fra + " -- " + til + " [len=" + lengde + ", label=" + lengde
				+ "]\n";
	}

	public boolean erBrukt() {
		return brukt;
	}

	public void gaa(Ryggsekk ryggsekk) {
		brukt = true;
		til.besoek(ryggsekk, lengde * faktor, lengde);
		brukt = false;
	}

	public void finnKortesteVeiKmf(double kmf) {
		til.finnKorteteVeiKmf(kmf + lengde * faktor);
	}

	public Post getTil() {
		return til;
	}

}
