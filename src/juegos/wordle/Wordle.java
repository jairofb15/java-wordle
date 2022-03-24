package juegos.wordle;

import java.util.Scanner;

/**
 *
 * @author guillermogb
 *
 */
public class Wordle {

	private String secreto;

	/**
	 * Al comenzar la partida pedirá por teclado un nombre de jugador y
	 * una contraseña.
	 *
	 * Cuando termine la partida, escribirá en un fichero de texto llamado
	 * resultados.dat el resultado con el siguiente formato:
	 *
	 * Jugador#PalabraAdivinada#NumeroIntentos
	 * Jugador#PalabraAdivinada#NumeroIntentos
	 * Jugador#PalabraAdivinada#NumeroIntentos
	 * Jugador#PalabraAdivinada#NumeroIntentos
	 */
	public Wordle(String secreto) { //Habrá que eliminar este parámetro, si se va a leer por ficheros
		/*
		 * Haremos que la palabra "secreto" sea leída del fichero
		 * wordle/palabras5letras.dat
		 *
		 */
		this.secreto = secreto.toUpperCase();
		int contador = 1;
		while (contador < secreto.length() + 1) {
			try {
				System.out.println("** Intento " + contador + " de " + secreto.length());
				Palabra conjetura = null;
				conjetura = pedirConjetura();
				comprobarConjetura(conjetura);
				System.out.println(conjetura);
				if (esCorrecta(conjetura)) {
					System.out.println("Has ganado la partida en el intento " + contador + " de " + secreto.length());
					break;
				}
				if (!esCorrecta(conjetura) && contador >= secreto.length())
					System.out.println("Has perdido la partida.");
				contador++;
			} catch (Exception e) {
				System.err.println(e.getLocalizedMessage());
			}
		}
		System.out.println("La palabra secreta era " + secreto + ".");
	}

	/**
	 * De alguna manera habrá que hacer que tanto la
	 * conjetura como el secreto estén en mayúsculas o
	 * minúsculas, para que coincidan.
	 * @param conjetura
	 */
	public void comprobarConjetura(Palabra conjetura) {
		for (int i = 0; i < secreto.length(); i++) {
			estaEnPosicion(conjetura, i);
			contiene(conjetura, secreto.charAt(i));
		}
	}

	public void contiene(Palabra conjetura, char c) {
		for (int i = 0; i < conjetura.length(); i++)
			if (conjetura.getLetraAt(i).getCaracter() == c)
				conjetura.getLetraAt(i).setExiste(true);
			else
				conjetura.getLetraAt(i).setExiste(false);
	}

	public boolean esCorrecta(Palabra conjetura) {
		for (int i = 0; i < conjetura.length(); i++)
			if (conjetura.getLetraAt(i).getCaracter() != secreto.charAt(i))
				return false;
		return true;
	}

	public void estaEnPosicion(Palabra conjetura, int posicion) {
		if (conjetura.getLetraAt(posicion).getCaracter() == secreto.charAt(posicion))
			conjetura.getLetraAt(posicion).setPosicionCorrecta(true);
		else
			conjetura.getLetraAt(posicion).setPosicionCorrecta(false);
	}

	public Palabra pedirConjetura() throws Exception {
		String palabra;
		Palabra p;
		System.out.println("Introduce una palabra de " + secreto.length() + " letras:");
		Scanner s = new Scanner(System.in);
		palabra = s.nextLine().toUpperCase();
		if (palabra.length() != secreto.length())
			throw new Exception("Ambas palabras deben tener la misma longitud (se obtuvo " + palabra.length()
					+ " y se esperaba " + secreto.length() + ")");
		p = new Palabra(palabra);
		return p;
	}

}
