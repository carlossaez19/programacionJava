package Orientada_a_objetos;

import java.security.KeyStore.TrustedCertificateEntry;
import java.util.Objects;

public class Personaje {
	private String nombre;
	private int nivel;
	private int puntos_vida;
	private String arma;

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getNivel() {
		return nivel;
	}

	protected void setNivel(int nivel) {
		this.nivel = nivel;
	}

	protected int getPuntos_vida() {
		return puntos_vida;
	}

	protected void setPuntos_vida(int puntos_vida) {
		this.puntos_vida = puntos_vida;
	}

	protected String getArma() {
		return arma;
	}

	protected void setArma(String arma) {
		this.arma = arma;
	}

	protected Personaje(String nombre, int nivel, int puntos_vida, String arma) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		this.puntos_vida = puntos_vida;
		this.arma = arma;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", nivel=" + nivel + ", puntos_vida=" + puntos_vida + ", arma=" + arma
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(arma, nivel, nombre, puntos_vida);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(arma, other.arma) && nivel == other.nivel && Objects.equals(nombre, other.nombre)
				&& puntos_vida == other.puntos_vida;
	}

	protected boolean atacado(){return true}
	protected String getarma() {return String}
	
	
	
}
