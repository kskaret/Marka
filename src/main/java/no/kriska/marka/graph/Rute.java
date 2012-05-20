package no.kriska.marka.graph;

public class Rute implements Comparable<Rute> {

	private int poeng;
	private double distanse;
	private String beskrivelse;

	public Rute(int poeng, double distanse, String beskrivelse) {
		super();
		this.poeng = poeng;
		this.distanse = distanse;
		this.beskrivelse = beskrivelse;
	}

	@Override
	public int compareTo(Rute o) {
		return poeng - o.getPoeng();
	}

	public String toString() {
		return "Rute: " + poeng + " poeng - " + (int) (10 * distanse) / 10.0
				+ " km - " + beskrivelse;
	}

	public int getPoeng() {
		return poeng;
	}

	public double getDistanse() {
		return distanse;
	}

}
