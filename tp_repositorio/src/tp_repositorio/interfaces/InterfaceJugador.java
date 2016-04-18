package tp_repositorio.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;

import tp_repositorio.dtos.JugadorDTO;


public interface InterfaceJugador extends Remote 
{
	/* retorna un alumno */
	public JugadorDTO obtengoJugador(int nroJugador) throws RemoteException;
	
	/* recibe un alumno */ 
	public void envioJugador(JugadorDTO Jugador)throws RemoteException;
	 
	/* retorna todos los alumnos */ 
	public Set<JugadorDTO> obtengoJugador()throws RemoteException;
	
	public int cantidadJugador() throws RemoteException;
}
