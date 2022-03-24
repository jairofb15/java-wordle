package juegos.wordle;

import java.util.ArrayList;
import java.util.Collections;

public class Ranking {

	private String nombreFichero;
	private ArrayList<RegistroRanking> ranking;
	 
	public Ranking(String nombreFichero) {
		/*	Lo siguiente está comentado para que no haya errores con las clases que ya no se usan.
		this.nombreFichero = nombreFichero;
		ranking = new ArrayList<>();
		LectorLineas lector = new LectorLineas(nombreFichero);
		ArrayList<String> cadenas = lector.leerLineas();
		for (int i = 0; i < cadenas.size(); i++) {
			String[] registro = cadenas.get(i).split("#");
			RegistroRanking r = new RegistroRanking(registro[0], Integer.parseInt(registro[1]));
			ranking.add(r);
		}
		*/

	}

	public void addRegistro(RegistroRanking registro) {
		ranking.add(registro);
	}

	public void ganaPartida(String jugador) {
		/**
		 * Buscar al usuario en el arraylist (ranking) Si existe, al usuario
		 * incrementarle una partida. Si no existe, crear un nuevo usuario (y añadirlo
		 * al arraylist).
		 *
		 */
		boolean existe = false;
		for (RegistroRanking element : ranking) {
			if (element.getNombre().equals(jugador)) {
				element.ganarPartida();
				existe = true;
				break;
			}
		}
		if (!existe) {
			RegistroRanking rr = new RegistroRanking(jugador, 1);
			ranking.add(rr);
		}
	}

	public ArrayList<RegistroRanking> getRanking() {
		return ranking;
	}

	public void ordenarRanking() {
		Collections.sort(ranking);
	}

	/**
	 * Con la nueva "arquitectura" de la aplicación, esto debería
	 * modificarse para que use un objeto del tipo GestorFicheros.
	 */
	public void publicarResultados() {
	/*	Lo siguiente está comentado para que no haya errores con las clases que ya no se usan.
	    EscritorLineas escritor = new EscritorLineas(nombreFichero);
		escritor.resetearFichero();
		for (RegistroRanking element : ranking)
			escritor.escribirLinea(element.toString());
			*/
	}

	@Override
	public String toString() {
		String resultado = "";
		for (RegistroRanking element : ranking)
			resultado += element.getNombre() + " " + element.getPartidasGanadas() + "\n";
		return resultado;
	}

}
