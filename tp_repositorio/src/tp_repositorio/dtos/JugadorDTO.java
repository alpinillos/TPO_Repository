package tp_repositorio.dtos;

import java.io.Serializable;

public class JugadorDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numeroJugador;
	private String nombre;
	public JugadorDTO(int numeroJugador, String nombre) {
		this.numeroJugador = numeroJugador;
		this.nombre = nombre;
	}
	public int getNumeroJugador() {
		return numeroJugador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNumeroJugador(int numeroJugador) {
		this.numeroJugador = numeroJugador;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", numeroJugador=" + numeroJugador
				+ "]";
	}

	
}