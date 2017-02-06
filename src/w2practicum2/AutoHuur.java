package w2practicum2;

public class AutoHuur {
	private int aantalDagen;
	private Auto gehuurdeAuto;
	private Klant huurder;

	public AutoHuur() {

	}

	public void setAantalDagen(int aantalDagen) {
		this.aantalDagen = aantalDagen;
	}

	public Auto getGehuurdeAuto() {
		return gehuurdeAuto;
	}

	public void setGehuurdeAuto(Auto gehuurdeAuto) {
		this.gehuurdeAuto = gehuurdeAuto;
	}

	public Klant getHuurder() {
		return huurder;
	}

	public void setHuurder(Klant huurder) {
		this.huurder = huurder;
	}

	public double totaalPrijs() {
		if (gehuurdeAuto != null) {
			double prijs = gehuurdeAuto.getPrijsPerDag() * aantalDagen;
			double korting = prijs / 100 * huurder.getKortingsPercentage();
			double t = prijs - korting;
			return t;
		} else {
			return 0;
		}
	}

	public String toString() {
		String s = "";
		if (gehuurdeAuto == null) {
			s += "er is geen auto bekend \n";
		} else {
			s += gehuurdeAuto + "\n ";
		}
		if (huurder == null) {
			System.out.println("test2");
			s += "er is geen huurder bekend";
		} else {
			s += huurder + "\n ";
		}
		s += " aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
		return s;
	}

}
