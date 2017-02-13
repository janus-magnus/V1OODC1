package w4practicum1;

import java.time.Year;

public class Computer implements Goed {
	private String type;
	private String macAdres;
	private double aanschafPrijs;
	private int productieJaar;

	public Computer(String type, String macAdres, double aanschafPrijs, int productieJaar) {
		this.type = type;
		this.macAdres = macAdres;
		this.aanschafPrijs = aanschafPrijs;
		this.productieJaar = productieJaar;
	}

	@Override
	public double huidigeWaarde() {
		int jaarenDelta = Year.now().getValue() - productieJaar;
		double newPrice = aanschafPrijs;
		for (int i = 1; i <= jaarenDelta; i++) {
			newPrice -= (newPrice / 100) * 40;
		}
		return newPrice;
	}

	public boolean equals(Object obj) {
		boolean eq = false;
		if (obj instanceof Computer) {
//			eq = this.type.equals(((Computer) obj).type);
			eq = this.macAdres.equals(((Computer) obj).macAdres);
//			eq = this.productieJaar == ((Computer) obj).productieJaar;
		}

		return eq;
	}

	public String toString() {
		String s = "Computer: " + type + " heeft een waarde van: " + huidigeWaarde();
		return s;
	}
}
