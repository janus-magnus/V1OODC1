package w4practicum1;

import java.util.ArrayList;

public class BedrijfsInventaris {
	private String bedrijfsnaam;
	private double budget;
	private ArrayList<Goed> allegoederen;

	public BedrijfsInventaris(String bedrijfsnaam, double budget) {
		this.bedrijfsnaam = bedrijfsnaam;
		this.budget = budget;
		allegoederen = new ArrayList<Goed>();
	}

	public void schafAan(Goed g) {
		if (!allegoederen.contains(g) && budget >= g.huidigeWaarde()) {
			allegoederen.add(g);
			budget -= g.huidigeWaarde();
		}
	}

	public String toString() {
		String s = bedrijfsnaam + " met inventaris: ";
		for (Goed g : allegoederen) {
			s += "\n" + g.toString();
		}
		return s;
	}
}
