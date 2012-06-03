package no.kriska.marka.graph;

public class GraphFactory2 {

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
				.sti(sognsvann, ullevalseter, 5.2, 1.65, 0.90) //
				.sti(sognsvann, skjennungstua, 4.9, 2.39, 0.84) //
				.sti(sognsvann, saeteren, 13.2, 1.18, 1.23) //
				.sti(ullevalseter, skjennungstua, 2.3, 2.15, 0.71) //
				.sti(ullevalseter, fagervann, 3.9, 2.30, 1.53) //
				.sti(ullevalseter, studenterhytta, 4.3, 1.54, 1.23) //
				.sti(ullevalseter, tomte, 8.2, 2.33, 1.75) //
				.sti(skjennungstua, studenterhytta, 3.8, 1.11, 1.69) //
				.sti(skjennungstua, brunkollen, 13.7, 1.4, 1.58) //
				.sti(skjennungstua, saeteren, 14.1, 1.18, 1.79) //
				.sti(skjennungstua, venas, 13.5, 1.4, 1.18) //
				.sti(mellomkollen, tomte, 1.8, 1.4, 2.6) //
				.sti(mellomkollen, gorja, 4.6, 1.32, 2.46) //
				.sti(mellomkollen, fagervann, 5.3, 1.53, 2.39) //
				.sti(liggeren, fagervann, 3.8, 2.2, 1.52)//
				.sti(liggeren, bjornholdt, 5.4, 1.19, 1.04)//
				.sti(liggeren, kikut, 6.6, 1.46, 1.38)//
				.sti(liggeren, gorja, 3.2, 2.33, 1.91)//
				.sti(liggeren, tomte, 1.8, 3.75, 0.94)//
				.sti(fagervann, studenterhytta, 8.2, 1.4, 1.55)//
				.sti(fagervann, bjornholdt, 5.5, 1.67, 2.04)//
				.sti(fagervann, kobberhaug, 8.3, 1.48, 1.5)//
				.sti(fagervann, tomte, 4.5, 2.11, 1.74)//
				.sti(studenterhytta, kobberhaug, 1.5, 1.16, 2.15)//
				.sti(studenterhytta, brunkollen, 13.9, 1.43, 1.46)//
				.sti(studenterhytta, smedmyrkoia, 10.5, 1.25, 1.40)//
				.sti(studenterhytta, venas, 11.7, 1.22, 1.36)//
				.sti(bjornholdt, kikut, 5.4, 1.66, 1.69)//
				.sti(bjornholdt, gorja, 7.2, 1.17, 1.14)//
				.sti(bjornholdt, kobberhaug, 2.9, 2.67, 1.66)//
				.sti(kikut, gorja, 6.8, 1.13, 1.06)//
				.sti(kikut, kobberhaug, 5.2, 1.97, 1.48)//
				.sti(kikut, smedmyrkoia, 13.6, 1.35, 1.37)//
				.sti(kikut, oppkuven, 11.9, 1.98, 1.19)//
				.sti(gorja, tomte, 4, 2.20, 1.42)//
				.sti(kobberhaug, smedmyrkoia, 11.1, 1.39, 1.66)//
				.sti(brunkollen, saeteren, 3.4, 1.01, 3.32)//
				.sti(brunkollen, venas, 5.3, 1.66, 2.0)//
				.sti(brunkollen, mustadkroken, 15.4, 1.68, 1.72)//
				.sti(smedmyrkoia, venas, 9.5, 1.45, 1.5)//
				.sti(smedmyrkoia, myrseter, 13.9, 1.49, 1.52)//
				.sti(smedmyrkoia, oppkuven, 4.9, 3.43, 0.96)//
				.sti(smedmyrkoia, presthytta, 12.8, 1.8, 1.5)//
				.sti(venas, mustadkroken, 14.7, 1.74, 1.72)//
				.sti(venas, myrseter, 9.8, 1.44, 1.44)//
				.sti(venas, presthytta, 9.2, 2.07, 1.54)//
				.sti(mustadkroken, myrseter, 12.8, 1.73, 1.93)//
				.sti(mustadkroken, jorgenhytta, 8.2, 1.29, 1.12)//
				.sti(myrseter, presthytta, 3, 1.82, 0.92)//
				.sti(myrseter, jorgenhytta, 7.9, 1.95, 1.43)//
				.sti(oppkuven, presthytta, 11.6, 1.47, 2.31)//
				.sti(oppkuven, gyrihaug, 11.4, 1.87, 1.97)//
				.sti(oppkuven, sinnerdammen, 14.4, 1.1, 1.45)//
				.sti(oppkuven, katnosdammen, 14.1, 1.12, 1.54)//
				.sti(presthytta, gyrihaug, 6.5, 1.98, 0.97)//
				.sti(gyrihaug, sinnerdammen, 15.0, 1.68, 2.08)//
				.sti(sinnerdammen, pershusfjellet, 3.4, 2.17, 1.39)//
				.sti(sinnerdammen, katnosdammen, 7.5, 1.74, 1.81)//
				.sti(pershusfjellet, katnosdammen, 10.2, 1.67, 2.03)//
				.build();
	}
}
