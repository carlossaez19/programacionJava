package Orientada_a_objetos;

public class GestionaPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona("pepe", "perez", 30, 3000);
		Persona p2 = new Entrenador("juan", "garcia", 30, 2000, "d545");
		Entrenador p3 = new Entrenador("pacp", "alves", 21, 2000, "f1234");
		Entrenador p4 = new Entrenador();
		System.out.println(p3.toString());
		;
		p1.concentrarse();
		p2.concentrarse();
		p3.concentrarse();
		p1.concentrarse("madrid");

	}

}
