package w2practicum2;

public class Klant {
	private String naam;
	private double kortingsPercentage;
	
	public Klant(String nm){
		naam = nm;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public double getKortingsPercentage() {
		return kortingsPercentage;
	}

	public void setKorting(double kortingsPercentage) {
		this.kortingsPercentage = kortingsPercentage;
	}

	public String toString(){
		String s = "op naam van: " + naam + " (korting: " + kortingsPercentage + "%)";
		return s;
	}


	
}
