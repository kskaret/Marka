package no.kriska.marka.graph;

public class GraphFactory {

	private Post sognsvann = new Post("sognsvann", 0);
	private Post ullevalseter = new Post("ullevalseter", 21);
	private Post skjennungstua = new Post("skjennungstua", 23);
	private Post mellomkollen = new Post("mellomkollen", 28);
	private Post liggeren = new Post("liggeren", 31);
	private Post fagervann = new Post("fagervann", 33);
	private Post studenterhytta = new Post("studenterhytta", 35);
	private Post bjornholdt = new Post("bjornholdt", 45);
	private Post kikut = new Post("kikut", 75);
	private Post gorja = new Post("gorja", 65);
	private Post kobberhaug = new Post("kobberhaug", 80);
	private Post tomte = new Post("tomte", 80);
	private Post brunkollen = new Post("brunkollen", 34);
	private Post smedmyrkoia = new Post("smedmyrkoia", 83);
	private Post saeteren = new Post("saeteren", 66);
	private Post venas = new Post("venas", 59);
	private Post mustadkroken = new Post("mustadkroken", 190);
	private Post myrseter = new Post("myrseter", 138);
	private Post oppkuven = new Post("oppkuven", 151);
	private Post presthytta = new Post("presthytta", 131);
	private Post gyrihaug = new Post("gyrihaug", 201);
	private Post jorgenhytta = new Post("jorgenhytta", 176);
	private Post sinnerdammen = new Post("sinnerdammen", 169);
	private Post pershusfjellet = new Post("pershusfjellet", 182);
	private Post katnosdammen = new Post("katnosdammen", 131);

	public Graph miniGraph() {
		return new GraphBuilder() //
				.start(sognsvann) //
				.sti(sognsvann, ullevalseter, 5.2, 1.65, 0.90) //
				.sti(sognsvann, skjennungstua, 4.9, 2.39, 0.84) //
				.sti(ullevalseter, fagervann, 3.9, 2.30, 1.53) //
				.sti(ullevalseter, skjennungstua, 2.3, 2.15, 0.71) //
				.sti(ullevalseter, studenterhytta, 4.3, 1.54, 1.23) //
				.sti(fagervann, studenterhytta, 8.2, 1.40, 1.55) //
				.sti(skjennungstua, studenterhytta, 3.8, 1.11, 1.69) //
				.build();
	}

	public Graph fullGraph() {
		return new GraphBuilder() //
				.start(sognsvann) //
				.sti(sognsvann, ullevalseter, 5.15, 1.75, 0.86) //
				// .sti(sognsvann, saeteren, 13.35, 1.20, 1.26) //
				.sti(sognsvann, skjennungstua, 4.9, 2.51, 0.79) //
				.sti(ullevalseter, skjennungstua, 2.2, 2.44, 0.68) //
				.sti(ullevalseter, fagervann, 3.85, 2.39, 1.61) //
				.sti(ullevalseter, studenterhytta, 4.35, 1.44, 1.12) //
				.sti(skjennungstua, studenterhytta, 3.8, 1.10, 1.76) //
				.sti(skjennungstua, brunkollen, 13.7, 1.43, 1.64) //
				.sti(skjennungstua, saeteren, 14.1, 1.18, 1.85) //
				.sti(skjennungstua, venas, 13.5, 1.23, 1.58) //
				.sti(mellomkollen, fagervann, 5.3, 1.58, 2.44) //
				.sti(mellomkollen, tomte, 1.8, 1.31, 2.58) //
				.sti(mellomkollen, gorja, 4.6, 1.27, 2.40) //
				.sti(liggeren, fagervann, 3.8, 2.22, 1.52)//
				.sti(liggeren, bjornholdt, 5.4, 1.21, 1.03)//
				.sti(liggeren, kikut, 6.6, 1.67, 1.57)//
				.sti(liggeren, gorja, 3.2, 2.38, 1.97)//
				.sti(liggeren, tomte, 1.8, 3.66, 0.95)//
				.sti(fagervann, studenterhytta, 8.2, 1.46, 1.62)//
				.sti(fagervann, bjornholdt, 5.5, 1.50, 1.84)//
				.sti(fagervann, kobberhaug, 8.3, 1.58, 1.60)//
				.sti(fagervann, tomte, 4.5, 2.36, 1.96)//
				.sti(studenterhytta, kobberhaug, 1.4, 1.69, 1.06)//
				.sti(studenterhytta, brunkollen, 13.9, 1.36, 1.39)//
				.sti(studenterhytta, smedmyrkoia, 10.4, 1.25, 1.43)//
				.sti(studenterhytta, venas, 11.7, 1.38, 1.57)//
				.sti(bjornholdt, kikut, 5.35, 1.54, 1.57)//
				.sti(bjornholdt, gorja, 7.2, 1.19, 1.14)//
				.sti(bjornholdt, kobberhaug, 2.9, 2.72, 1.74)//
				.sti(kikut, gorja, 6.8, 1.08, 0.99)//
				.sti(kikut, kobberhaug, 5.2, 1.93, 1.44)//
				.sti(kikut, smedmyrkoia, 13.6, 1.39, 1.41)//
				.sti(kikut, oppkuven, 11.9, 2.12, 1.24)//
				.sti(gorja, tomte, 4, 2.19, 1.40)//
				.sti(kobberhaug, smedmyrkoia, 11.1, 1.26, 1.53)//
				.sti(brunkollen, saeteren, 3.4, 1.01, 3.32)//
				.sti(brunkollen, venas, 5.3, 1.63, 1.97)//
				.sti(brunkollen, mustadkroken, 15.4, 1.51, 1.55)//
				.sti(smedmyrkoia, venas, 9.4, 1.61, 1.65)//
				.sti(smedmyrkoia, myrseter, 13.9, 1.49, 1.52)//
				.sti(smedmyrkoia, oppkuven, 4.9, 3.33, 0.93)//
				.sti(smedmyrkoia, presthytta, 12.8, 1.84, 1.52)//
				.sti(venas, mustadkroken, 14.7, 1.72, 1.70)//
				.sti(venas, myrseter, 9.8, 1.57, 1.56)//
				.sti(venas, presthytta, 9.2, 2.02, 1.49)//
				.sti(mustadkroken, myrseter, 12.8, 1.70, 1.91)//
				.sti(mustadkroken, jorgenhytta, 8.2, 1.27, 1.07)//
				.sti(myrseter, presthytta, 3, 1.86, 0.84)//
				.sti(myrseter, jorgenhytta, 7.9, 2.09, 1.52)//
				.sti(oppkuven, presthytta, 11.6, 1.34, 2.12)//
				.sti(oppkuven, gyrihaug, 11.35, 1.69, 1.79)//
				.sti(oppkuven, sinnerdammen, 14.4, 1.13, 1.54)//
				.sti(oppkuven, katnosdammen, 14.1, 1.31, 1.84)//
				.sti(presthytta, gyrihaug, 6.5, 2.09, 0.94)//
				.sti(gyrihaug, sinnerdammen, 15.0, 1.33, 1.66)//
				.sti(sinnerdammen, pershusfjellet, 3.4, 2.05, 1.29)//
				.sti(sinnerdammen, katnosdammen, 7.5, 1.65, 1.71)//
				.sti(pershusfjellet, katnosdammen, 10.2, 1.59, 1.95)//
				.build();
	}

}
