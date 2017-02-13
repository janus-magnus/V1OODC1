package w4practium1;

import java.time.Year;

public class Auto extends Voertuig {
	private String kenteken;

	public Auto(String type, double nieuwprijs, int bouwjaar, String kenteken) {
		super(type, nieuwprijs, bouwjaar);
		this.kenteken = kenteken;
	}

	@Override
	public double huidigeWaarde() {
		int jaarenDelta = Year.now().getValue() - bouwjaar;
		double newPrice = nieuwprijs;
		for (int i = 1; i <= jaarenDelta; i++) {
			newPrice -= (newPrice / 100) * 30;
		}
		return newPrice;
	}

	
	@Override
	public boolean equals(Object obj) {
		boolean eq = false;
		if (obj instanceof Auto) {
			eq = this.kenteken.equals(((Auto) obj).kenteken);
		}
		return eq;
	}
}
