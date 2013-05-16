package no.kriska.marka.graph;

public enum Post {

	SOGNSVANN("sognsvann", 0), //
	ULLEVALSETER("ullevalseter", 21), //
	SKJENNUNGSTUA("skjennungstua", 23), //
	MELLOMKOLLEN("mellomkollen", 28), //
	LIGGEREN("liggeren", 31), //
	FAGERVANN("fagervann", 33), //
	BRUNKOLLEN("brunkollen", 34), //
	STUDENTERHYTTA("studenterhytta", 35), //
	BJORNHOLDT("bjornholdt", 45), //
	TOMTE("tomte", 49), //
	VENAS("venas", 59), //
	GORJA("gorja", 65), //
	SAETEREN("saeteren", 66), //
	KIKUT("kikut", 75), //
	SMEDMYRKOIA("smedmyrkoia", 83), //
	KOBBERHAUG("kobberhaug", 100), //
	PRESTHYTTA("presthytta", 131), //
	MYRSETER("myrseter", 138), //
	SINNERDAMMEN("sinnerdammen", 139), //
	OPPKUVEN("oppkuven", 151), //
	KATNOSDAMMEN("katnosdammen", 161), //
	JORGENHYTTA("jorgenhytta", 176), //
	PERSHUSFJELLET("pershusfjellet", 182), //
	MUSTADKROKEN("mustadkroken", 190), //
	GYRIHAUG("gyrihaug", 201);

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
