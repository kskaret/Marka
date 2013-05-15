package no.kriska.marka.graph;

import static no.kriska.marka.Utils.cleanDouble;

import java.util.ArrayList;
import java.util.List;

import no.kriska.marka.Ryggsekk;

public class Kryss implements Comparable<Kryss> {

	private final Post post;
	private final List<Sti> stier;
	private boolean maal;
	private boolean besoekt;
	private double kortesteVeiKmf;

	public Kryss(Post post) {
		this.post = post;
		stier = new ArrayList<Sti>();
		maal = false;
		besoekt = false;
		kortesteVeiKmf = Double.MAX_VALUE;
	}

	public void setMaal() {
		maal = true;
	}

	public void leggTilSti(Sti sti) {
		stier.add(sti);
	}

	public String toString() {
		return post.getNavn();
	}

	public List<Sti> stier() {
		return stier;
	}

	public void besoek(Ryggsekk ryggsekk, double kmf, double distanse) {
		if (ryggsekk.kanBesoke(this)) {
			Ryggsekk nyRyggsekk = ryggsekk.fyll(post.getPoeng(), kmf, distanse,
					this);
			if (nyRyggsekk.overMaksKmf(kortesteVeiKmf)) {
				return;
			}
			if (maal) {
				nyRyggsekk.noterRute();
			} else {
				besoekt = true;

				for (Sti sti : stier) {
					// ikke gaa til post som er besokt
					if (!sti.getTil().besoekt) {
						sti.gaa(nyRyggsekk);
					}
				}

				besoekt = false;
			}
		}
	}

	public boolean equals(Kryss annen) {
		return post.equals(annen.getPost());
	}

	public Post getPost() {
		return post;
	}

	public void finnKorteteVeiKmf(double kmf) {
		if (kmf < kortesteVeiKmf) {
			kortesteVeiKmf = kmf;
			for (Sti sti : stier) {
				sti.finnKortesteVeiKmf(kmf);
			}
		}
	}

	public double getKortesteVeiKmf() {
		return cleanDouble(kortesteVeiKmf);
	}

	@Override
	public int compareTo(Kryss o) {
		return post.compareTo(o.getPost());
	}
}
