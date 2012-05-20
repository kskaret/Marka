package no.kriska.marka;

import java.util.Collection;

import no.kriska.marka.graph.Post;
import no.kriska.marka.graph.Rute;
import no.kriska.marka.graph.Rutenotater;

public class Ryggsekk {

	private int poeng;
	private double distanse;
	private Post post;
	private Ryggsekk forrigeRyggsekk = null;
	private Rutenotater ruteNotater;
	private double makslengde;

	public Ryggsekk(Post post, double makslengde) {
		this.poeng = 0;
		this.distanse = 0;
		this.post = post;
		this.ruteNotater = new Rutenotater();
		this.makslengde = makslengde;
	}

	private Ryggsekk(int poeng, double distanse, Rutenotater ruteNotater,
			Post post, Ryggsekk forrigeRyggsekk) {
		this.poeng = poeng;
		this.distanse = distanse;
		this.ruteNotater = ruteNotater;
		this.post = post;
		this.forrigeRyggsekk = forrigeRyggsekk;
		this.makslengde = forrigeRyggsekk.makslengde;
	}

	public int getPoeng() {
		return poeng;
	}

	public double getDistanse() {
		return distanse;
	}

	public void noterRute() {
		if (poeng == 2227 && distanse < makslengde) {
			System.out.println("NY MAKSLENGDE " + distanse);
		}
		ruteNotater.noter(poeng, distanse, ruteBeskrivelse());
	}

	public String ruteBeskrivelse() {
		if (post == null) {
			return "";
		}
		if (forrigeRyggsekk == null) {
			return post.toString();
		}
		return forrigeRyggsekk.ruteBeskrivelse() + " - " + post;
	}

	public Collection<Rute> getRuter() {
		return ruteNotater.ruter();
	}

	public Ryggsekk fyll(int p, double d, Post post) {
		return new Ryggsekk(poeng + p, sum(distanse, d), ruteNotater, post,
				this);
	}

	private double sum(double d1, double d2) {
		return (((int) (d1 * 10)) + ((int) (d2 * 10))) / 10.0;
	}

	public boolean overMakslengde(double kortesteVeiHjem) {
		return distanse + kortesteVeiHjem > makslengde;
	}
}
