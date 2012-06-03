package no.kriska.marka.graph;


public class GraphFactory1 {

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

	public Graph mikroGraph() {
		return new GraphBuilder() //
				.start(sognsvann) //
				.sti(sognsvann, ullevalseter, 5.3) //
				.sti(ullevalseter, fagervann, 3.9) //
				.sti(fagervann, sognsvann, 8.2) //
				.build();
	}

	public Graph miniGraph() {
		return new GraphBuilder() //
				.start(sognsvann) //
				.sti(sognsvann, ullevalseter, 5.3) //
				.sti(sognsvann, skjennungstua, 5.1) //
				.sti(ullevalseter, fagervann, 3.9) //
				.sti(ullevalseter, skjennungstua, 2.3) //
				.sti(ullevalseter, studenterhytta, 4.3) //
				.sti(fagervann, sognsvann, 8.2) //
				.sti(fagervann, studenterhytta, 7.8) //
				.sti(skjennungstua, studenterhytta, 3.8) //
				.build();
	}

	public Graph fullGraph() {
		return new GraphBuilder() //
				.start(sognsvann) //
				.sti(sognsvann, ullevalseter, 5.3) //
				.sti(sognsvann, skjennungstua, 5.1) //
				//.sti(sognsvann, fagervann, 8.2) //
				.sti(sognsvann, brunkollen, 14.1) //
				.sti(sognsvann, saeteren, 13.4) //
				.sti(ullevalseter, skjennungstua, 2.3) //
				//.sti(ullevalseter, liggeren, 7.3) //
				.sti(ullevalseter, fagervann, 3.9) //
				.sti(ullevalseter, studenterhytta, 4.3) //
				//.sti(ullevalseter, bjornholdt, 5.5) //
				//.sti(ullevalseter, kobberhaug, 4.4) //
				.sti(ullevalseter, tomte, 8.2) //
				.sti(skjennungstua, studenterhytta, 3.8) //
				//.sti(skjennungstua, bjornholdt, 5.8) //
				//.sti(skjennungstua, kobberhaug, 4.6) //
				.sti(skjennungstua, brunkollen, 13.7) //
				//.sti(skjennungstua, smedmyrkoia, 12.3) //
				.sti(skjennungstua, saeteren, 14.1) //
				.sti(skjennungstua, venas, 13.5) //
				.sti(mellomkollen, fagervann, 5.3) //
				.sti(mellomkollen, tomte, 1.8) //
				.sti(liggeren, fagervann, 3.8)//
				.sti(liggeren, bjornholdt, 5.4)//
				.sti(liggeren, kikut, 7.7)//
				.sti(liggeren, gorja, 3.2)//
				//.sti(liggeren, kobberhaug, 8.3)//
				.sti(liggeren, tomte, 1.8)//
				.sti(fagervann, studenterhytta, 7.8)//
				.sti(fagervann, bjornholdt, 5.6)//
				.sti(fagervann, kobberhaug, 8.3)//
				.sti(fagervann, tomte, 4.5)//
				//.sti(studenterhytta, bjornholdt, 4.2)//
				.sti(studenterhytta, kobberhaug, 1.5)//
				.sti(studenterhytta, brunkollen, 13.9)//
				.sti(studenterhytta, smedmyrkoia, 10.5)//
				.sti(studenterhytta, venas, 11.7)//
				.sti(bjornholdt, kikut, 5.4)//
				.sti(bjornholdt, gorja, 7.2)//
				.sti(bjornholdt, kobberhaug, 2.9)//
				//.sti(bjornholdt, smedmyrkoia, 14.0)//
				.sti(kikut, gorja, 7.9)//
				.sti(kikut, kobberhaug, 6.4)//
				.sti(kikut, smedmyrkoia, 14.1)//
				.sti(kikut, oppkuven, 12.4)//
				.sti(kikut, katnosdammen, 9.4)//
				.sti(gorja, tomte, 4)//
				.sti(kobberhaug, smedmyrkoia, 11.1)//
				.sti(brunkollen, saeteren, 3.4)//
				.sti(brunkollen, venas, 5.3)//
				.sti(brunkollen, mustadkroken, 15.4)//
				.sti(smedmyrkoia, venas, 9.5)//
				.sti(smedmyrkoia, myrseter, 13.9)//
				.sti(smedmyrkoia, oppkuven, 4.9)//
				.sti(smedmyrkoia, presthytta, 12.8)//
				//.sti(saeteren, mustadkroken, 15.7)//
				.sti(venas, mustadkroken, 14.7)//
				.sti(venas, myrseter, 9.8)//
				.sti(venas, presthytta, 9.2)//
				.sti(mustadkroken, myrseter, 12.8)//
				.sti(mustadkroken, jorgenhytta, 8.2)//
				.sti(myrseter, presthytta, 3.2)//
				.sti(myrseter, jorgenhytta, 7.9)//
				.sti(oppkuven, presthytta, 11.9)//
				.sti(oppkuven, gyrihaug, 11.7)//
				.sti(oppkuven, sinnerdammen, 12.1)//
				.sti(oppkuven, katnosdammen, 14.1)//
				.sti(presthytta, gyrihaug, 6.6)//
				//.sti(presthytta, jorgenhytta, 9.9)//
				.sti(gyrihaug, sinnerdammen, 15.0)//
				.sti(sinnerdammen, pershusfjellet, 3.4)//
				.sti(sinnerdammen, katnosdammen, 7.5)//
				.build();
	}
	
	public Graph utenBrunkollenSaeteren() {
		return new GraphBuilder() //
				.start(sognsvann) //
				.sti(sognsvann, ullevalseter, 5.3) //
				.sti(sognsvann, skjennungstua, 5.1) //
				//.sti(sognsvann, fagervann, 8.2) //
				//.sti(sognsvann, brunkollen, 14.1) //
				//.sti(sognsvann, saeteren, 13.4) //
				.sti(ullevalseter, skjennungstua, 2.3) //
				//.sti(ullevalseter, liggeren, 7.3) //
				.sti(ullevalseter, fagervann, 3.9) //
				.sti(ullevalseter, studenterhytta, 4.3) //
				//.sti(ullevalseter, bjornholdt, 5.5) //
				//.sti(ullevalseter, kobberhaug, 4.4) //
				.sti(ullevalseter, tomte, 8.2) //
				.sti(skjennungstua, studenterhytta, 3.8) //
				//.sti(skjennungstua, bjornholdt, 5.8) //
				//.sti(skjennungstua, kobberhaug, 4.6) //
				//.sti(skjennungstua, brunkollen, 13.7) //
				//.sti(skjennungstua, smedmyrkoia, 12.3) //
				//.sti(skjennungstua, saeteren, 14.1) //
				.sti(skjennungstua, venas, 13.5) //
				.sti(mellomkollen, fagervann, 5.3) //
				.sti(mellomkollen, tomte, 1.8) //
				.sti(liggeren, fagervann, 3.8)//
				.sti(liggeren, bjornholdt, 5.4)//
				.sti(liggeren, kikut, 7.7)//
				.sti(liggeren, gorja, 3.2)//
				//.sti(liggeren, kobberhaug, 8.3)//
				.sti(liggeren, tomte, 1.8)//
				.sti(fagervann, studenterhytta, 7.8)//
				.sti(fagervann, bjornholdt, 5.6)//
				.sti(fagervann, kobberhaug, 8.3)//
				.sti(fagervann, tomte, 4.5)//
				//.sti(studenterhytta, bjornholdt, 4.2)//
				.sti(studenterhytta, kobberhaug, 1.5)//
				//.sti(studenterhytta, brunkollen, 13.9)//
				.sti(studenterhytta, smedmyrkoia, 10.5)//
				.sti(studenterhytta, venas, 11.7)//
				.sti(bjornholdt, kikut, 5.4)//
				.sti(bjornholdt, gorja, 7.2)//
				.sti(bjornholdt, kobberhaug, 2.9)//
				//.sti(bjornholdt, smedmyrkoia, 14.0)//
				.sti(kikut, gorja, 7.9)//
				.sti(kikut, kobberhaug, 6.4)//
				.sti(kikut, smedmyrkoia, 14.1)//
				.sti(kikut, oppkuven, 12.4)//
				.sti(kikut, katnosdammen, 9.4)//
				.sti(gorja, tomte, 4)//
				.sti(kobberhaug, smedmyrkoia, 11.1)//
				//.sti(brunkollen, saeteren, 3.4)//
				//.sti(brunkollen, venas, 5.3)//
				//.sti(brunkollen, mustadkroken, 15.4)//
				.sti(smedmyrkoia, venas, 9.5)//
				.sti(smedmyrkoia, myrseter, 13.9)//
				.sti(smedmyrkoia, oppkuven, 4.9)//
				.sti(smedmyrkoia, presthytta, 12.8)//
				//.sti(saeteren, mustadkroken, 15.7)//
				.sti(venas, mustadkroken, 14.7)//
				.sti(venas, myrseter, 9.8)//
				.sti(venas, presthytta, 9.2)//
				.sti(mustadkroken, myrseter, 12.8)//
				.sti(mustadkroken, jorgenhytta, 8.2)//
				.sti(myrseter, presthytta, 3.2)//
				.sti(myrseter, jorgenhytta, 7.9)//
				.sti(oppkuven, presthytta, 11.9)//
				.sti(oppkuven, gyrihaug, 11.7)//
				.sti(oppkuven, sinnerdammen, 12.1)//
				.sti(oppkuven, katnosdammen, 14.1)//
				.sti(presthytta, gyrihaug, 6.6)//
				//.sti(presthytta, jorgenhytta, 9.9)//
				.sti(gyrihaug, sinnerdammen, 15.0)//
				.sti(sinnerdammen, pershusfjellet, 3.4)//
				.sti(sinnerdammen, katnosdammen, 7.5)//
				.build();
	}
}
