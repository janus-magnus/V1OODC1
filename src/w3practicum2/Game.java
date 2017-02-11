package w3practicum2;

import java.time.Year;

public class Game {
	private String name;
	private int releaseJaar;
	private double nieuwPrijs;

	public Game(String name, int rj, double nPr) {
		this.name = name;
		releaseJaar = rj;
		nieuwPrijs = nPr;
	}

	public String getNaam() {
		return name;
	}

	public double huidigeWaarde() {
		int jaarenDelta = Year.now().getValue() - releaseJaar;
		double newPrice = nieuwPrijs;
		for (int i = 1; i <= jaarenDelta; i++) {
			newPrice -= (newPrice / 100) * 30;
		}
		return newPrice;
	}

	public boolean equals(Object andereObject) {
		boolean b = this.name.equals(((Game) andereObject).name);

		return b;
	}

	public String toString() {
		String s = name + " , uitgegeven in " + releaseJaar + " ; nieuwprijs: " + nieuwPrijs + " nu voor: "
				+ huidigeWaarde();
		return s;
	}
}
