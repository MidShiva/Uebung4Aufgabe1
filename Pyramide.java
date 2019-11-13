/**
 * Repräsentiert eine 4 seitige Pyramide  
 */
public class Pyramide {

	private int grundseite;
	private int hoehe;
	
	public Pyramide (int grundseite, int hoehe) {
		this.grundseite = grundseite;
		this.hoehe = hoehe;
	}
	
	/**
	 * Berechnet den Oberflaecheninhalt der Pyramide
	 * @return den Oberfleacheninhalt
	 */
	public float Oberflaecheninhalt() {
		return (Grundflaeche() + 4 * (grundseite*hoehe/2));
	}
	
	/**
	 * Berechnet das Volumen der Pyramide
	 * @return das Gesamtvolumen
	 */
	public float Volumen() {
		return (Grundflaeche()*hoehe/3);
	}
	
	/**
	 * Berechnet die Grundfleache der Pyramide
	 * @return die Grundfleache
	 */
	public float Grundflaeche() {
		return (grundseite * grundseite);
	}
}
