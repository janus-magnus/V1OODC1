package w3practicum2;

import java.util.ArrayList;

public class Persoon {
	private String naam;
	private double budget;
	private ArrayList<Game> mijnGames;

	public Persoon(String naam, double budget) {
		this.naam = naam;
		this.budget = budget;
		mijnGames = new ArrayList<Game>();
	}

	public boolean koop(Game g) {
		if (g.huidigeWaarde() <= budget) {
			// System.out.println(mijnGames);
			if (!mijnGames.isEmpty()) {
				// System.out.println("test2");
				if (!mijnGames.contains(g)) {
					// System.out.println("test3");
					mijnGames.add(g);
					budget -= g.huidigeWaarde();
					return true;
				}
			} else {
				budget -= g.huidigeWaarde();
				mijnGames.add(g);
				return true;
			}
		} else {
			return false;
		}
		return false;
	}

	public boolean verkoop(Game g, Persoon koper) {
		// add budget calc
		if (mijnGames.contains(g) && koper.koop(g)) {
			budget += g.huidigeWaarde();
			mijnGames.remove(g);
			return true;
		} else {
			return false;
		}
	}

	public Game zoekGameOpNaam(String naam) {
		for (Game g : mijnGames) {
			if (g.getNaam().equals(naam)) {
				return g;
			}
		}
		return null;
	}

	public String toString() {
		String s = naam + " heeft een budget van €" + budget + " en bezit de volgende games:";
		for (Game g : mijnGames) {
			s += "\n" + g.toString();
		}
		return s;
	}
}