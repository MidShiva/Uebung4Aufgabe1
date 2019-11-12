
public class GeometrischeForm {

	public static void main(String[] args) {
		
		Kegel kegel1 = new Kegel(3,5);
		Kugel kugel1 = new Kugel(4);
		Zylinder zylinder1 = new Zylinder(3, 8);
		Pyramide pyramide1 = new Pyramide(3, 6);
		
		System.out.println("Kugel: r = 4");
		System.out.println("\tOberfleache: " + kugel1.Oberflaecheninhalt() + " (erwartet: ~ 201.06)");
		System.out.println("\tVolumen: " + kugel1.Volumen() + " (erwartet: ~ 268.08)" + System.lineSeparator());

		System.out.println("Kegel: r = 3, h = 5");
		System.out.println("\tOberfleache: " + kegel1.Oberflaecheninhalt() + " (erwartet: ~ 83.23)");
		System.out.println("\tVolumen: " + kegel1.Volumen() + " (erwartet: ~ 47.12)");
		System.out.println("\tMantel: " + kegel1.Mantelfleache() + " (erwartet: ~ 54.95)" + System.lineSeparator());
		
		System.out.println("Zylinder: r = 3, h = 8");
		System.out.println("\tOberfleache: " + zylinder1.Oberflaecheninhalt() + " (erwartet: ~ 207.34)");
		System.out.println("\tVolumen: " + zylinder1.Volumen() + " (erwartet: ~ 226.19)");
		System.out.println("\tMantel: " + zylinder1.Mantelfleache() + " (erwartet: ~ 150.79)" + System.lineSeparator());
		
		System.out.println("Pyramide: a = 3, h = 6");
		System.out.println("\tOberfleache: " + pyramide1.Oberflaecheninhalt() + " (erwartet: ~ 46.10)");
		System.out.println("\tVolumen: " + pyramide1.Volumen() + " (erwartet: 18)");
		System.out.println("\tMantel: " + pyramide1.Grundfleache() + " (erwartet: 9)");
	}

}
