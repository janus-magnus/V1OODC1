package w4practium1;

import java.time.Year;

public class Fiets extends Voertuig {
	private int framenummer;

	public Fiets(String type, double nieuwprijs, int bouwjaar, int framenummer) {
		super(type, nieuwprijs, bouwjaar);
		this.framenummer = framenummer;
	}

	@Override
	public double huidigeWaarde() {
		int jaarenDelta = Year.now().getValue() - bouwjaar;
		double newPrice = nieuwprijs;
		for (int i = 1; i <= jaarenDelta; i++) {
			newPrice -= (newPrice / 100) * 10;
		}
		return newPrice;
	}

	@Override
	public boolean equals(Object obj) {
		boolean eq = false;
		if (obj instanceof Fiets) {
			eq = this.framenummer == ((Fiets) obj).framenummer;
		}
		return eq;
	}
}
