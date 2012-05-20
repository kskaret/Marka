package no.kriska.marka.graph;

import static no.kriska.marka.Utils.cleanDouble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import no.kriska.marka.Ryggsekk;
import no.kriska.marka.Utils;

public class Post implements Comparable<Post> {

	private String navn;
	private int poeng;
	private List<Sti> stier;
	private boolean maal;
	private int besoekt;
	private double kortesteVei;

	public Post(String navn, int poeng) {
		this.navn = navn;
		this.poeng = poeng;
		stier = new ArrayList<Sti>();
		maal = false;
		besoekt = 0;
		kortesteVei = Double.MAX_VALUE;
	}

	public void setMaal() {
		maal = true;
	}

	public void leggTilSti(Sti sti) {
		stier.add(sti);
		Collections.sort(stier, new Comparator<Sti>() {

			@Override
			public int compare(Sti o1, Sti o2) {
				return (int) (o1.getLengde() * 10 - o2.getLengde() * 10);
			}
		});
	}

	public String toString() {
		return navn;
	}

	public List<Sti> stier() {
		return stier;
	}

	public void besoek(Ryggsekk ryggsekk, double distanse) {
		Ryggsekk nyRyggsekk = ryggsekk.fyll(getPoeng(), distanse, this);
		if (nyRyggsekk.overMakslengde(kortesteVei)) {
			return;
		}
		if (maal) {
			nyRyggsekk.noterRute();
		} else {
			besoekt++;

			List<Sti> tilbakeStier = new ArrayList<Sti>();
			for (Sti sti : stier) {
				// utsett gaa tilbake langs stier
				if (sti.gattTil(this)) {
					tilbakeStier.add(sti);
				} else if (!sti.gattFra(this)) {
					// ikke gaa til post som er bes¿kt (bortsett fra tilbake)
					if (sti.getMotsatt(this).besoekt == 0) {
						sti.gaaFra(this, nyRyggsekk);
					}
				}
			}
			for (Sti sti : tilbakeStier) {
				if (!sti.gattFra(this) && meningsfultAaGaaTilbake(sti)) {
					sti.gaaFra(this, nyRyggsekk);
				}
			}

			besoekt--;
		}
	}

	private boolean meningsfultAaGaaTilbake(Sti sti) {
		Post motsatt = sti.getMotsatt(this);
		if (Utils.cleanDouble(motsatt.getKortesteVei() + sti.getLengde()) <= kortesteVei) {
			return true;
		} else {
			return false;
		}
	}

	private int getPoeng() {
		if (besoekt > 0) {
			return 0;
		} else {
			return poeng;
		}
	}

	public boolean equals(Post annen) {
		return navn.equals(annen.toString());
	}

	public void finnKorteteVei(double distanse) {
		if (distanse < kortesteVei) {
			kortesteVei = distanse;
			for (Sti sti : stier) {
				sti.finnKortesteVei(this, distanse);
			}
		}
	}

	public double getKortesteVei() {
		return cleanDouble(kortesteVei);
	}

	@Override
	public int compareTo(Post o) {
		return navn.compareTo(o.navn);
	}
}
