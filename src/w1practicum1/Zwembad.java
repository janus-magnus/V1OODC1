package w1practicum1;

public class Zwembad {
	private double breedte;
	private double diepte;
	private double lengte;
	
	public Zwembad(double br, double hg, double ln){
		breedte = br;
		diepte = hg;
		lengte = ln;
	}
	
	public Zwembad(){
		
	}
	
	public double getBreedte(){
		return breedte;
	}

	public void setBreedte(double breedte) {
		this.breedte = breedte;
	}
	
	public double getDiepte() {
		return diepte;
	}

	public void setDiepte(double hoogte) {
		this.diepte = hoogte;
	}

	public double getLengte() {
		return lengte;
	}

	public void setLengte(double lengte) {
		this.lengte = lengte;
	}

	public double inhoud(){
		return diepte*lengte*lengte;
	}
	
	public String toString(){
		String s = "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
		return s;
	}
	
	
	
}

