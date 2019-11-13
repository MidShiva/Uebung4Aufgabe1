import java.lang.Math;

public class Kugel {
	
	private int radius;
	
	/**
	 * Konstruktor fuer einen Zylinder
	 * @param radius
	 */
	public Kugel(int radius) {
		this.radius = radius;
	}
	
	/**
	 * Berechnet den Oberflaecheninhalt der Kugel
	 * @return den Oberfleacheninhalt
	 */
	public float Oberflaecheninhalt() {
		return Math.PI*4*(r*r);
	}
	
	/**
	 * Berechnet das Volumen der Kugel
	 * @return das Gesamtvolumen
	 */
	public float Volumen() {
		return (4/3)*Math.PI*(r*r*r);
	}
}
