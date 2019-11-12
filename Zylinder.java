
public class Zylinder {

	private int radius;
	private int hoehe;
	
	/**
	 * Konstruktor fuer einen Zylinder
	 * @param radius
	 * @param hoehe
	 */
	public Zylinder(int radius, int hoehe) {
		this.radius = radius;
		this.hoehe = hoehe;
	}
	
	/**
	 * Berechnet den Oberflaecheninhalt des Zylinders
	 * @return den Oberfleacheninhalt
	 */
	public float Oberflaecheninhalt() {
		return (2*Grundflaeche()+Mantelflaeche());
	}
	
	/**
	 * Berechnet das Volumen des Zylinders
	 * @return das Gesamtvolumen
	 */
	public float Volumen() {
		return (Grundflaeche()*hoehe);
	}
	
	/**
	 * Berechnet die Mantelflaeche des Zylinders
	 * @return die Mantelflaeche
	 */
	public float Mantelflaeche() {
		return (2*pi()*radius*hoehe);
	}

	public float Grundflaeche() {
		return (pi()*(radius*radius));
	}

	public float pi() {
		return 3.14159265359f;
	}
}
