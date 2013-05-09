package no.kriska.marka.graph;

import no.kriska.marka.Ryggsekk;

public class Sti {

	private Post postA;
	private Post postB;
	private double lengde;
	private double abFaktor;
	private double baFaktor;
	private boolean rute;
	private boolean gattFraA;
	private boolean gattFraB;
	private boolean skalGaa;

	public Sti(Post fra, Post til, double lengde) {
		this(fra, til, lengde, 1.0, 1.0);
	}

	public Sti(Post fra, Post til, double lengde, double abFaktor,
			double baFaktor) {
		this.postA = fra;
		this.postB = til;
		this.lengde = lengde;
		this.abFaktor = abFaktor;
		this.baFaktor = baFaktor;
		this.rute = false;
		fra.leggTilSti(this);
		til.leggTilSti(this);
	}

	public String toString() {
		// a -- b [len=1, label=1];
		return postA + " -- " + postB + " [len=" + lengde  + ", label="
				+ lengde + "]\n";
	}

	public boolean gattFra(Post fra) {
		if (fra.equals(postA) && gattFraA) {
			return true;
		} else if (fra.equals(postB) && gattFraB) {
			return true;
		} else {
			return false;
		}
	}

	public boolean gattTil(Post til) {
		if (til.equals(postA) && gattFraB) {
			return true;
		} else if (til.equals(postB) && gattFraA) {
			return true;
		}
		return false;
	}

	public void gaaFra(Post fra, Ryggsekk ryggsekk) {
		if (ryggsekk.kanBesoke(fra)) {

			if (postA.equals(fra)) {
				gattFraA = true;
				postB.besoek(ryggsekk, lengde * abFaktor, lengde);
				gattFraA = false;
			} else if (postB.equals(fra)) {
				gattFraB = true;
				postA.besoek(ryggsekk, lengde * baFaktor, lengde);
				gattFraB = false;
			}
		}
	}

	public void finnKortesteVeiFkm(Post fra, double fkm) {
		if (postA.equals(fra)) {
			postB.finnKorteteVeiKmf(fkm + lengde * abFaktor);
		} else {
			postA.finnKorteteVeiKmf(fkm + lengde * baFaktor);
		}
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
