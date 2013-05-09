package no.kriska.marka.graph;

import no.kriska.marka.Ryggsekk;

public class Sti {

	private Post postA;
	private Post postB;
	private double lengde;
	private double abFaktor;
	private double baFaktor;

	private boolean brukt;

	public Sti(Post fra, Post til, double lengde, double abFaktor,
			double baFaktor) {
		this.postA = fra;
		this.postB = til;
		this.lengde = lengde;
		this.abFaktor = abFaktor;
		this.baFaktor = baFaktor;
		this.brukt = false;

		fra.leggTilSti(this);
		til.leggTilSti(this);
	}

	public String toString() {
		// a -- b [len=1, label=1];
		return postA + " -- " + postB + " [len=" + lengde + ", label=" + lengde
				+ "]\n";
	}

	public boolean erBrukt() {
		return brukt;
	}

	public void gaaFra(Post fra, Ryggsekk ryggsekk) {
		brukt = true;
		if (postA.equals(fra)) {
			postB.besoek(ryggsekk, abKmf(), lengde);
		} else if (postB.equals(fra)) {
			postA.besoek(ryggsekk, baKmf(), lengde);
		}
		brukt = false;
	}

	public void finnKortesteVeiKmf(Post fra, double kmf) {
		if (postA.equals(fra)) {
			postB.finnKorteteVeiKmf(kmf + abKmf());
		} else {
			postA.finnKorteteVeiKmf(kmf + baKmf());
		}
	}

	private double abKmf() {
		return lengde * abFaktor;
	}

	private double baKmf() {
		return lengde * baFaktor;
	}

	public Post getPostA() {
		return postA;
	}

	public Post getPostB() {
		return postB;
	}

	public Post getMotsatt(Post post) {
		if (post.equals(postA)) {
			return postB;
		} else {
			return postA;
		}
	}

}
