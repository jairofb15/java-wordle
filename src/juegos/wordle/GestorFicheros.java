package juegos.wordle;

import java.util.ArrayList;

/**
 * Clase que contiene todos los métodos para acceder
 * a los ficheros de datos.
 * 
 * Seguramente interese que herede de una clase "Lector", o
 * quizá dividir esta clase en LectorFicheros y EscritorFicheros, y que
 * cada uno herede de "Lector" y "Escritor", respectivamente.
 * 
 * O que esta clase contenga un atributo del tipo LectorLineas y otro
 * del tipo EscritorLineas, y que use cada uno para leer o escribir (creo que
 * esto sería lo más simple).
 * 
 * @author guillermo
 *
 */
public class GestorFicheros {
	
	private final String FICHERO_JUGADORES="./data/wordle/jugadores.dat";
	private final String FICHERO_RANKING="./data/wordle/resultados.dat";
	private final String FICHERO_PALABRAS="./data/wordle/palabras5letras.dat";
	
	public ArrayList<Jugador> leerJugadores() {
		return null;
	}
	
	public Jugador getJugador(String nombre) {
		return null;
	}
	
	public void guardarJugador(Jugador j) {
		
	}
	
	public ArrayList<RegistroRanking> getRanking(){
		return null;
	}
	
	public void actualizraRanking(RegistroRanking r) {
		
	}
	
	/**
	 * Debería comprobarse que se devuelve una palabra de cinco letras y,
	 * de no ser así, tratarlo con excepciones.
	 * @return
	 */
	public Palabra getPalabra() {
		return null;
	}
	
	/**
	 * Debería añadir al fichero de palabras una palabra, comprobando también
	 * que tiene cinco letras y, si no, tratarlo con excepciones.
	 * @param palabra
	 */
	public void guardarPalabra(Palabra p) {
		
	}
	
}
