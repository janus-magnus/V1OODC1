package w4practium1;

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
		// System.out.println(g);
		if (!allegoederen.contains(g)) {
			// System.out.println("ja");
			allegoederen.add(g);
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
