package Orientada_a_objetos;

import java.util.Objects;

public class Entrenador extends Persona {
	String idfederacionString;

	protected String getIdfederacionString() {
		return idfederacionString;
	}

	protected void setIdfederacionString(String idfederacionString) {
		this.idfederacionString = idfederacionString;
	}

	protected Entrenador(String persona, String apellido, int edad, float salario, String idfederacionString) {
		super(persona, apellido, edad, salario);
		this.idfederacionString = idfederacionString;
	}

	@Override
	public String toString() {
		return "Entrenador [idfederacionString=" + idfederacionString + ", salario=" + salario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(idfederacionString);
		return result;
	}

	protected Entrenador(String persona, String apellido, int edad, float salario) {
		super(persona, apellido, edad, salario);
	}

	protected Entrenador() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrenador other = (Entrenador) obj;
		return Objects.equals(idfederacionString, other.idfederacionString);

	}

	@Override
	public void concentrarse() {
		System.out.println("concentrarse entrenador");
	}
}
