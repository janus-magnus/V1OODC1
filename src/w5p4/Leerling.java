package w5p4;

public class Leerling {
	private String naam;
	private double cijfer = 0.0;
	
	public Leerling(String naam){
		this.naam = naam;		
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public double getCijfer() {
		return cijfer;
	}

	public void setCijfer(double cijfer) {
		this.cijfer = cijfer;
	}

	public String toString(){
		String s = naam + " heeft cijfer: " + cijfer;
		return s;
	}
}
