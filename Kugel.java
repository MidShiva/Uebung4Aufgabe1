

public class Kugel {
	private float pi = 3.14159265359f;
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
		return pi * 4 * (radius*radius);
	}
	
	/**
	 * Berechnet das Volumen der Kugel
	 * @return das Gesamtvolumen
	 */
	public float Volumen() {
		return (4/3) * pi * (radius*radius*radius);
	}
}
