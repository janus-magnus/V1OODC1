package w2practicum2;

public class Auto {
	private String type;
	private double prijsPerDag;
	
	public Auto(String type, double prPd){
		this.type = type;
		prijsPerDag = prPd;
	}

	public double getPrijsPerDag() {
		return prijsPerDag;
	}

	public void setPrijsPerDag(double prijsPerDag) {
		this.prijsPerDag = prijsPerDag;
	}
	
	public String toString(){
		String s = "autotype: " + type + " met prijs per dag: " + prijsPerDag;
		return s;
	}
}
