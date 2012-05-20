package no.kriska.marka.graph;

import no.kriska.marka.Ryggsekk;

public class Sti {

	private Post postA;
	private Post postB;
	private double lengde;
	private boolean rute;
	private boolean gattFraA;
	private boolean gattFraB;

	public Sti(Post fra, Post til, double lengde) {
		this.postA = fra;
		this.postB = til;
		this.lengde = lengde;
		this.rute = false;
		fra.leggTilSti(this);
		til.leggTilSti(this);
	}

	public String toString() {
		// a -- b [len=1, label=1];
		return postA + " -- " + postB + " [len=" + lengde / 2.0 + ", label="
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
			if (postA.equals(fra)) {
				gattFraA = true;
				postB.besoek(ryggsekk, lengde);
				gattFraA = false;
			} else if (postB.equals(fra)) {
				gattFraB = true;
				postA.besoek(ryggsekk, lengde);
				gattFraB = false;
			}
	}


	public double getLengde() {
		return lengde;
	}

	public void finnKortesteVei(Post fra, double distanse) {
		if (postA.equals(fra)) {
			postB.finnKorteteVei(distanse + lengde);
		} else {
			postA.finnKorteteVei(distanse + lengde);
		}
	}

	public Post getPostA() {
		return postA;
	}

	public Post getPostB() {
		return postB;
	}
	
	public Post getMotsatt(Post post){
		if(post.equals(postA)) {
			return postB;
		} else {
			return postA;
		}
	}

}
