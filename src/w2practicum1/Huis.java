package w2practicum1;

public class Huis {
	private String adres;
	private int bouwjaar;
	private Persoon huisbaas;
	
	public Huis(String adr, int bj){
		adres = adr;
		bouwjaar = bj;
	}
		
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public int getBouwjaar() {
		return bouwjaar;
	}
	public void setBouwjaar(int bouwjaar) {
		this.bouwjaar = bouwjaar;
	}
	public Persoon getHuisbaas() {
		return huisbaas;
	}
	public void setHuisbaas(Persoon huisbaas) {
		this.huisbaas = huisbaas;
	}
	public String toString(){
		String s = "Huis" + adres + " is gebouwd in " + bouwjaar + "\n en heeft huisbaas " + huisbaas;
		return s;
	}
	

}
