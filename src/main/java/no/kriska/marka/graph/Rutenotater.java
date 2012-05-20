package no.kriska.marka.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

import sun.tools.tree.LengthExpression;

import no.kriska.marka.Sorenskriver;

public class Rutenotater {

	TreeSet<Rute> aktuelleRuter;
	Sorenskriver sorenskriver;

	

	public Rutenotater() {
		aktuelleRuter = new TreeSet<Rute>();
		sorenskriver = new Sorenskriver();
	}

	public void noter(int poeng, double distanse, String beskrivelse) {
		Rute nyRute = new Rute(poeng, distanse, beskrivelse);
	
		if (!finnesKortereRuteMedFlerPoeng(nyRute)) {
			slettLengreRuterMedFaerrePoeng(nyRute);
			aktuelleRuter.add(nyRute);
			System.out.println("Noterer " + nyRute);
			lagreRuterTilFil();
			lagreRaadataTilFil();
		}
	}

	private void lagreRuterTilFil() {
		StringBuilder sb = new StringBuilder();
		for (Rute rute : aktuelleRuter) {
			sb.append(rute.toString() + "\n");
		}
		sorenskriver.write("aktuelleRuter.txt", sb.toString());
	}

	private void lagreRaadataTilFil() {
		StringBuilder sb = new StringBuilder();
		for (Rute rute : aktuelleRuter) {
			sb.append((int) (rute.getDistanse() * 10) + "\t" + rute.getPoeng()
					+ "\n");
		}
		sorenskriver.write("raaData.txt", sb.toString());
	}

	private void slettLengreRuterMedFaerrePoeng(Rute nyRute) {
		List<Rute> ruterAaSlette = new ArrayList<Rute>();
		for (Rute rute : aktuelleRuter.headSet(nyRute, true)) {
			if (rute.getDistanse() >= nyRute.getDistanse()) {
				ruterAaSlette.add(rute);
			}
		}
		for (Rute rute : ruterAaSlette) {
			aktuelleRuter.remove(rute);
		}
	}

	public Collection<Rute> ruter() {
		return aktuelleRuter;
	}

	public boolean finnesKortereRuteMedFlerPoeng(Rute nyRute) {
		Rute ruteMedFlerPoeng = aktuelleRuter.ceiling(nyRute);
		return ruteMedFlerPoeng != null
				&& ruteMedFlerPoeng.getDistanse() <= nyRute.getDistanse();
	}

}
