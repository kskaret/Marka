package no.kriska.marka.graph;

import static no.kriska.marka.graph.Post.BJORNHOLDT;
import static no.kriska.marka.graph.Post.BRUNKOLLEN;
import static no.kriska.marka.graph.Post.FAGERVANN;
import static no.kriska.marka.graph.Post.GORJA;
import static no.kriska.marka.graph.Post.GYRIHAUG;
import static no.kriska.marka.graph.Post.JORGENHYTTA;
import static no.kriska.marka.graph.Post.KATNOSDAMMEN;
import static no.kriska.marka.graph.Post.KIKUT;
import static no.kriska.marka.graph.Post.KOBBERHAUG;
import static no.kriska.marka.graph.Post.LIGGEREN;
import static no.kriska.marka.graph.Post.MELLOMKOLLEN;
import static no.kriska.marka.graph.Post.MUSTADKROKEN;
import static no.kriska.marka.graph.Post.MYRSETER;
import static no.kriska.marka.graph.Post.OPPKUVEN;
import static no.kriska.marka.graph.Post.PERSHUSFJELLET;
import static no.kriska.marka.graph.Post.PRESTHYTTA;
import static no.kriska.marka.graph.Post.SAETEREN;
import static no.kriska.marka.graph.Post.SINNERDAMMEN;
import static no.kriska.marka.graph.Post.SKJENNUNGSTUA;
import static no.kriska.marka.graph.Post.SMEDMYRKOIA;
import static no.kriska.marka.graph.Post.SOGNSVANN;
import static no.kriska.marka.graph.Post.STUDENTERHYTTA;
import static no.kriska.marka.graph.Post.TOMTE;
import static no.kriska.marka.graph.Post.ULLEVALSETER;
import static no.kriska.marka.graph.Post.VENAS;

public class GraphFactory {

	public Graph miniGraph() {
		return new GraphBuilder() //
				.start(SOGNSVANN) //
				.sti(SOGNSVANN, ULLEVALSETER, 5.2, 1.65, 0.90) //
				.sti(SOGNSVANN, SKJENNUNGSTUA, 4.9, 2.39, 0.84) //
				.sti(ULLEVALSETER, FAGERVANN, 3.9, 2.30, 1.53) //
				.sti(ULLEVALSETER, SKJENNUNGSTUA, 2.3, 2.15, 0.71) //
				.sti(ULLEVALSETER, STUDENTERHYTTA, 4.3, 1.54, 1.23) //
				.sti(FAGERVANN, STUDENTERHYTTA, 8.2, 1.40, 1.55) //
				.sti(SKJENNUNGSTUA, STUDENTERHYTTA, 3.8, 1.11, 1.69) //
				.build();
	}

	public Graph fullGraph() {
		return new GraphBuilder() //
				.start(SOGNSVANN) //
				.sti(SOGNSVANN, ULLEVALSETER, 5.15, 1.75, 0.86) //
				.sti(SOGNSVANN, SAETEREN, 13.35, 1.20, 1.26) //
				.sti(SOGNSVANN, SKJENNUNGSTUA, 4.9, 2.51, 0.79) //
				.sti(ULLEVALSETER, SKJENNUNGSTUA, 2.2, 2.44, 0.68) //
				.sti(ULLEVALSETER, FAGERVANN, 3.85, 2.39, 1.61) //
				.sti(ULLEVALSETER, STUDENTERHYTTA, 4.35, 1.44, 1.12) //
				.sti(SKJENNUNGSTUA, STUDENTERHYTTA, 3.8, 1.10, 1.76) //
				.sti(SKJENNUNGSTUA, BRUNKOLLEN, 13.7, 1.43, 1.64) //
				.sti(SKJENNUNGSTUA, SAETEREN, 14.1, 1.18, 1.85) //
				.sti(SKJENNUNGSTUA, VENAS, 13.5, 1.23, 1.58) //
				.sti(MELLOMKOLLEN, FAGERVANN, 5.3, 1.58, 2.44) //
				.sti(MELLOMKOLLEN, TOMTE, 1.8, 1.31, 2.58) //
				.sti(MELLOMKOLLEN, GORJA, 4.6, 1.27, 2.40) //
				.sti(LIGGEREN, FAGERVANN, 3.8, 2.22, 1.52)//
				.sti(LIGGEREN, BJORNHOLDT, 5.4, 1.21, 1.03)//
				.sti(LIGGEREN, KIKUT, 6.6, 1.67, 1.57)//
				.sti(LIGGEREN, GORJA, 3.2, 2.38, 1.97)//
				.sti(LIGGEREN, TOMTE, 1.8, 3.66, 0.95)//
				.sti(FAGERVANN, STUDENTERHYTTA, 8.2, 1.46, 1.62)//
				.sti(FAGERVANN, BJORNHOLDT, 5.5, 1.50, 1.84)//
				.sti(FAGERVANN, KOBBERHAUG, 8.3, 1.58, 1.60)//
				.sti(FAGERVANN, TOMTE, 4.5, 2.36, 1.96)//
				.sti(STUDENTERHYTTA, KOBBERHAUG, 1.4, 1.69, 1.06)//
				.sti(STUDENTERHYTTA, BRUNKOLLEN, 13.9, 1.36, 1.39)//
				.sti(STUDENTERHYTTA, SMEDMYRKOIA, 10.4, 1.25, 1.43)//
				.sti(STUDENTERHYTTA, VENAS, 11.7, 1.38, 1.57)//
				.sti(BJORNHOLDT, KIKUT, 5.35, 1.54, 1.57)//
				.sti(BJORNHOLDT, GORJA, 7.2, 1.19, 1.14)//
				.sti(BJORNHOLDT, KOBBERHAUG, 2.9, 2.72, 1.74)//
				.sti(KIKUT, GORJA, 6.8, 1.08, 0.99)//
				.sti(KIKUT, KOBBERHAUG, 5.2, 1.93, 1.44)//
				.sti(KIKUT, SMEDMYRKOIA, 13.6, 1.39, 1.41)//
				.sti(KIKUT, OPPKUVEN, 11.9, 2.12, 1.24)//
				.sti(GORJA, TOMTE, 4, 2.19, 1.40)//
				.sti(KOBBERHAUG, SMEDMYRKOIA, 11.1, 1.26, 1.53)//
				.sti(BRUNKOLLEN, SAETEREN, 3.4, 1.01, 3.32)//
				.sti(BRUNKOLLEN, VENAS, 5.3, 1.63, 1.97)//
				.sti(BRUNKOLLEN, MUSTADKROKEN, 15.4, 1.51, 1.55)//
				.sti(SMEDMYRKOIA, VENAS, 9.4, 1.61, 1.65)//
				.sti(SMEDMYRKOIA, MYRSETER, 13.9, 1.49, 1.52)//
				.sti(SMEDMYRKOIA, OPPKUVEN, 4.9, 3.33, 0.93)//
				.sti(SMEDMYRKOIA, PRESTHYTTA, 12.8, 1.84, 1.52)//
				.sti(VENAS, MUSTADKROKEN, 14.7, 1.72, 1.70)//
				.sti(VENAS, MYRSETER, 9.8, 1.57, 1.56)//
				.sti(VENAS, PRESTHYTTA, 9.2, 2.02, 1.49)//
				.sti(MUSTADKROKEN, MYRSETER, 12.8, 1.70, 1.91)//
				.sti(MUSTADKROKEN, JORGENHYTTA, 8.2, 1.27, 1.07)//
				.sti(MYRSETER, PRESTHYTTA, 3, 1.86, 0.84)//
				.sti(MYRSETER, JORGENHYTTA, 7.9, 2.09, 1.52)//
				.sti(OPPKUVEN, PRESTHYTTA, 11.6, 1.34, 2.12)//
				.sti(OPPKUVEN, GYRIHAUG, 11.35, 1.69, 1.79)//
				.sti(OPPKUVEN, SINNERDAMMEN, 14.4, 1.13, 1.54)//
				.sti(OPPKUVEN, KATNOSDAMMEN, 14.1, 1.31, 1.84)//
				.sti(PRESTHYTTA, GYRIHAUG, 6.5, 2.09, 0.94)//
				.sti(GYRIHAUG, SINNERDAMMEN, 15.0, 1.33, 1.66)//
				.sti(SINNERDAMMEN, PERSHUSFJELLET, 3.4, 2.05, 1.29)//
				.sti(SINNERDAMMEN, KATNOSDAMMEN, 7.5, 1.65, 1.71)//
				.sti(PERSHUSFJELLET, KATNOSDAMMEN, 10.2, 1.59, 1.95)//
				.build();
	}

	public Graph fullGraph2() {
		return new GraphBuilder() //
				.start(SOGNSVANN) //
				.sti(SOGNSVANN, ULLEVALSETER, 5.15, 174, 21, 100) //
				.sti(SOGNSVANN, SAETEREN, 13.35, 200, 228, 100) //
				.sti(SOGNSVANN, SKJENNUNGSTUA, 4.9, 264, 0, 70) //
				.sti(ULLEVALSETER, SKJENNUNGSTUA, 2.2, 134, 3, 100) //
				.sti(ULLEVALSETER, FAGERVANN, 3.85, 169, 83, 23) //
				.sti(ULLEVALSETER, STUDENTERHYTTA, 4.35, 87, 43, 78) //
				.sti(SKJENNUNGSTUA, STUDENTERHYTTA, 3.8, 38, 117, 80) //
				.sti(SKJENNUNGSTUA, BRUNKOLLEN, 13.7, 275, 363, 70) //
				.sti(SKJENNUNGSTUA, SAETEREN, 14.1, 159, 456, 70) //
				.sti(SKJENNUNGSTUA, VENAS, 13.5, 164, 311, 83) //
				.sti(MELLOMKOLLEN, FAGERVANN, 5.3, 109, 240, 20) //
				.sti(MELLOMKOLLEN, TOMTE, 1.8, 10, 79, 0) //
				.sti(MELLOMKOLLEN, GORJA, 4.6, 28, 173, 10) //
				.sti(LIGGEREN, FAGERVANN, 3.8, 117, 45, 5)//
				.sti(LIGGEREN, BJORNHOLDT, 5.4, 59, 28, 95)//
				.sti(LIGGEREN, KIKUT, 6.6, 97, 79, 38)//
				.sti(LIGGEREN, GORJA, 3.2, 144, 107, 8)//
				.sti(LIGGEREN, TOMTE, 1.8, 135, 0, 0)//
				.sti(FAGERVANN, STUDENTERHYTTA, 8.2, 161, 202, 68)//
				.sti(FAGERVANN, BJORNHOLDT, 5.5, 71, 125, 10)//
				.sti(FAGERVANN, KOBBERHAUG, 8.3, 191, 196, 65)//
				.sti(FAGERVANN, TOMTE, 4.5, 179, 131, 13)//
				.sti(STUDENTERHYTTA, KOBBERHAUG, 1.4, 31, 2, 40)//
				.sti(STUDENTERHYTTA, BRUNKOLLEN, 13.9, 306, 318, 85)//
				.sti(STUDENTERHYTTA, SMEDMYRKOIA, 10.4, 178, 241, 93)//
				.sti(STUDENTERHYTTA, VENAS, 11.7, 168, 234, 75)//
				.sti(BJORNHOLDT, KIKUT, 5.35, 43, 47, 0)//
				.sti(BJORNHOLDT, GORJA, 7.2, 86, 75, 98)//
				.sti(BJORNHOLDT, KOBBERHAUG, 2.9, 150, 72, 0)//
				.sti(KIKUT, GORJA, 6.8, 54, 34, 100)//
				.sti(KIKUT, KOBBERHAUG, 5.2, 105, 36, 5)//
				.sti(KIKUT, SMEDMYRKOIA, 13.6, 273, 281, 85)//
				.sti(KIKUT, OPPKUVEN, 11.9, 447, 132, 55)//
				.sti(GORJA, TOMTE, 4, 115, 29, 5)//
				.sti(KOBBERHAUG, SMEDMYRKOIA, 11.1, 183, 283, 73)//
				.sti(BRUNKOLLEN, SAETEREN, 3.4, 0, 213, 5)//
				.sti(BRUNKOLLEN, VENAS, 5.3, 91, 142, 15)//
				.sti(BRUNKOLLEN, MUSTADKROKEN, 15.4, 450, 471, 70)//
				.sti(SMEDMYRKOIA, VENAS, 9.4, 204, 214, 60)//
				.sti(SMEDMYRKOIA, MYRSETER, 13.9, 332, 346, 70)//
				.sti(SMEDMYRKOIA, OPPKUVEN, 4.9, 335, 1, 13)//
				.sti(SMEDMYRKOIA, PRESTHYTTA, 12.8, 384, 261, 50)//
				.sti(VENAS, MUSTADKROKEN, 14.7, 490, 478, 60)//
				.sti(VENAS, MYRSETER, 9.8, 188, 187, 60)//
				.sti(VENAS, PRESTHYTTA, 9.2, 253, 115, 15)//
				.sti(MUSTADKROKEN, MYRSETER, 12.8, 220, 294, 8)//
				.sti(MUSTADKROKEN, JORGENHYTTA, 8.2, 111, 58, 90)//
				.sti(MYRSETER, PRESTHYTTA, 3, 106, 6, 88)//
				.sti(MYRSETER, JORGENHYTTA, 7.9, 245, 118, 30)//
				.sti(OPPKUVEN, PRESTHYTTA, 11.6, 129, 400, 20)//
				.sti(OPPKUVEN, GYRIHAUG, 11.35, 252, 286, 18)//
				.sti(OPPKUVEN, SINNERDAMMEN, 14.4, 130, 321, 85)//
				.sti(OPPKUVEN, KATNOSDAMMEN, 14.1, 207, 435, 80)//
				.sti(PRESTHYTTA, GYRIHAUG, 6.5, 276, 37, 80)//
				.sti(GYRIHAUG, SINNERDAMMEN, 15.0, 328, 497, 53)//
				.sti(SINNERDAMMEN, PERSHUSFJELLET, 3.4, 79, 8, 0)//
				.sti(SINNERDAMMEN, KATNOSDAMMEN, 7.5, 95, 108, 0)//
				.sti(PERSHUSFJELLET, KATNOSDAMMEN, 10.2, 128, 228, 0)//
				.build();

	}
}
