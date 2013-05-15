package no.kriska.marka.graph;

public enum Post {

	SOGNSVANN("sognsvann", 0), //
	ULLEVALSETER("ullevalseter", 21), //
	SKJENNUNGSTUA("skjennungstua", 23), //
	MELLOMKOLLEN("mellomkollen", 28), //
	LIGGEREN("liggeren", 31), //
	FAGERVANN("fagervann", 33), //
	STUDENTERHYTTA("studenterhytta", 35), //
	BJORNHOLDT("bjornholdt", 45), //
	KIKUT("kikut", 75), //
	GORJA("gorja", 65), //
	KOBBERHAUG("kobberhaug", 80), //
	TOMTE("tomte", 80), //
	BRUNKOLLEN("brunkollen", 34), //
	SMEDMYRKOIA("smedmyrkoia", 83), //
	SAETEREN("saeteren", 66), //
	VENAS("venas", 59), //
	MUSTADKROKEN("mustadkroken", 190), //
	MYRSETER("myrseter", 138), //
	OPPKUVEN("oppkuven", 151), //
	PRESTHYTTA("presthytta", 131), //
	GYRIHAUG("gyrihaug", 201), //
	JORGENHYTTA("jorgenhytta", 176), //
	SINNERDAMMEN("sinnerdammen", 169), //
	PERSHUSFJELLET("pershusfjellet", 182), //
	KATNOSDAMMEN("katnosdammen", 131);

	private final String navn;
	private final int poeng;

	private Post(String navn, int poeng) {
		this.navn = navn;
		this.poeng = poeng;
	}

	public String getNavn() {
		return navn;
	}

	public int getPoeng() {
		return poeng;
	}

}
