package Orientada_a_objetos;

import java.util.Objects;

public class Persona {
	private String persona;
	private String apellido;
	private int edad;
	float salario;

	protected String getPersona() {
		return persona;
	}

	protected void setPersona(String persona) {
		this.persona = persona;
	}

	protected String getApellido() {
		return apellido;
	}

	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected float getSalario() {
		return salario;
	}

	protected void setSalario(float salario) {
		this.salario = salario;
	}

	protected Persona(String persona, String apellido, int edad, float salario) {
		super();
		this.persona = persona;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Persona [persona=" + persona + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ "]";
	}

	protected Persona() {
		super();
	}

	public void concentrarse(String lugar) {
		System.out.println("concentrarse en un lugar");

	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, edad, persona, salario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && edad == other.edad && Objects.equals(persona, other.persona)
				&& Float.floatToIntBits(salario) == Float.floatToIntBits(other.salario);
	}

	public void concentrarse() {
		System.out.println("concentrarse persona");

	}

}
