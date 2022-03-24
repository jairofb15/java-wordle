package juegos.wordle;

public class Jugador {
	
	private String nombre;
	private String password;
	private GestorFicheros gestorFicheros;
	
	/**
	 * Comprueba que existe el usuario 'nombre' y que
	 * tiene la contraseña 'password' en el fichero jugadores.dat
	 * 
	 * Si el usuario existe y la contraseña coincide, lanza la aplicación.
	 * Si el usuario existe y la contraseña no coincide, vuelve a pedir la contraseña.
	 * Si el usuario no existe, solicita un nombre, una contraseña y lo guarda en jugadores.dat
	 * @param nombre
	 * @param password
	 */
	public Jugador(String nombre, String password) {
		this.nombre=nombre;
		this.password=password;
		gestorFicheros=new GestorFicheros();
		
	}
	
	/**
	 * Esto guardaría un jugador en el fichero de datos.
	 * Habrá que comprobar que el usuario no exista, que ni
	 * el nombre ni la password estén vacíos, que ninguno de 
	 * los dos contenga el carácter separador (#), y todo lo que
	 * se os ocurra
	 */
	public void guardarJugador() {
		gestorFicheros.guardarJugador(this);
	}

}
