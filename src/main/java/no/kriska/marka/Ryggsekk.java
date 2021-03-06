package no.kriska.marka;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import no.kriska.marka.graph.Kryss;
import no.kriska.marka.graph.Post;
import no.kriska.marka.graph.Rute;
import no.kriska.marka.graph.Rutenotater;

public class Ryggsekk {

	private final int poeng;
	private final double kmf;
	private final double distanse;
	private final Kryss post;
	private final Ryggsekk forrigeRyggsekk;
	private final Rutenotater ruteNotater;
	private final double makskmf;
	private final List<Post> skalBesoke;

	public Ryggsekk(Kryss post, double maksKmf, List<Post> skalBesoke) {
		this.poeng = 0;
		this.kmf = 0;
		this.distanse = 0;
		this.post = post;
		this.forrigeRyggsekk = null;
		this.ruteNotater = new Rutenotater();
		this.makskmf = maksKmf;
		this.skalBesoke = skalBesoke;
	}

	private Ryggsekk(int poeng, double kmf, double distanse,
			Rutenotater ruteNotater, Kryss post, Ryggsekk forrigeRyggsekk,
			List<Post> skalBesoke) {
		this.poeng = poeng;
		this.kmf = kmf;
		this.distanse = distanse;
		this.ruteNotater = ruteNotater;
		this.post = post;
		this.forrigeRyggsekk = forrigeRyggsekk;
		this.makskmf = forrigeRyggsekk.makskmf;
		this.skalBesoke = skalBesoke;
	}

	public int getPoeng() {
		return poeng;
	}

	public double getKmf() {
		return kmf;
	}

	public void noterRute() {
		if (poeng == 2227 && kmf < makskmf) {
			System.out.println("NY MAKSLENGDE " + kmf);
		}
		ruteNotater.noter(poeng, kmf, distanse, ruteBeskrivelse());
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

	public Ryggsekk fyll(int p, double dKmf, double dDistanse, Kryss post) {
		return new Ryggsekk(poeng + p, sum(kmf, dKmf),
				sum(distanse, dDistanse), ruteNotater, post, this, nyAaBesoke());
	}

	private List<Post> nyAaBesoke() {
		LinkedList<Post> nyAaBesoke = new LinkedList<Post>(skalBesoke);
		if (!nyAaBesoke.isEmpty()) {
			nyAaBesoke.remove(0);
		}
		return nyAaBesoke;
	}

	private double sum(double d1, double d2) {
		return (((int) (d1 * 10)) + ((int) (d2 * 10))) / 10.0;
	}

	public boolean overMaksKmf(double kortesteVeiHjem) {
		return kmf + kortesteVeiHjem > makskmf;
	}

	public boolean kanBesoke(Kryss fra) {
		if (skalBesoke.isEmpty()) {
			return true;
		} else {
			Post post = skalBesoke.get(0);
			return (fra.getPost().equals(post));
		}
	}

}
