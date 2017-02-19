package w4practicum2;

public class KamerType {
	private String typeNaam;
	private int aantalBedden;
	private double prijsPerNacht;

	public KamerType(String tN, int aB, double prijs) {
		typeNaam = tN;
		aantalBedden = aB;
		prijsPerNacht = prijs;
	}

	public String getTypeNaam() {
		return typeNaam;
	}

	public String toString() {
		String s = typeNaam + ", bedden: " + aantalBedden;
		s += ", € " + prijsPerNacht + " p.n.";
		return s;
	}
}
