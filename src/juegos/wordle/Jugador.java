package juegos.wordle;

public class Jugador {
	
	private String nombre;
	private String password;
	private GestorFicheros gestorFicheros;
	
	/**
	 * Comprueba que existe el usuario 'nombre' y que
	 * tiene la contrase�a 'password' en el fichero jugadores.dat
	 * 
	 * Si el usuario existe y la contrase�a coincide, lanza la aplicaci�n.
	 * Si el usuario existe y la contrase�a no coincide, vuelve a pedir la contrase�a.
	 * Si el usuario no existe, solicita un nombre, una contrase�a y lo guarda en jugadores.dat
	 * @param nombre
	 * @param password
	 */
	public Jugador(String nombre, String password) {
		this.nombre=nombre;
		this.password=password;
		gestorFicheros=new GestorFicheros();
		
	}
	
	/**
	 * Esto guardar�a un jugador en el fichero de datos.
	 * Habr� que comprobar que el usuario no exista, que ni
	 * el nombre ni la password est�n vac�os, que ninguno de 
	 * los dos contenga el car�cter separador (#), y todo lo que
	 * se os ocurra
	 */
	public void guardarJugador() {
		gestorFicheros.guardarJugador(this);
	}

}
