package no.kriska.marka.graph;

import static no.kriska.marka.Utils.cleanDouble;

import java.util.ArrayList;
import java.util.List;

import no.kriska.marka.Ryggsekk;

public class Post implements Comparable<Post> {

	private final String navn;
	private final int poeng;
	private final List<Sti> stier;
	private boolean maal;
	private boolean besoekt;
	private double kortesteVeiKmf;

	public Post(String navn, int poeng) {
		this.navn = navn;
		this.poeng = poeng;
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
		return navn;
	}

	public List<Sti> stier() {
		return stier;
	}

	public void besoek(Ryggsekk ryggsekk, double kmf, double distanse) {
		if (ryggsekk.kanBesoke(this)) {
			Ryggsekk nyRyggsekk = ryggsekk.fyll(poeng, kmf, distanse, this);
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

	public boolean equals(Post annen) {
		return navn.equals(annen.toString());
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
	public int compareTo(Post o) {
		return navn.compareTo(o.navn);
	}
}
