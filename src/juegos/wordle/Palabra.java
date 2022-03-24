package juegos.wordle;

/**
 * Deberá contener métodos para comprobar que una palabra
 * tiene cinco letras, que no tenga números ni acentos y todo
 * lo que se os ocurra.
 * 
 * @author guillermo
 *
 */
public class Palabra {

	private Letra[] palabra;

	public Palabra(String palabra) {
		this.palabra = new Letra[palabra.length()];
		for (int i = 0; i < palabra.length(); i++)
			this.palabra[i] = new Letra(palabra.charAt(i));
	}

	public Letra getLetraAt(int i) {
		return palabra[i];
	}

	public int length() {
		return palabra.length;
	}

	@Override
	public String toString() {
		String resultado = "";
		for (Letra element : palabra)
			resultado += element.getCaracter();
		resultado += "\n";
		for (Letra element : palabra)
			if (element.posicionCorrecta())
				resultado += "¡";
			else if (element.existe())
				resultado += "^";
			else
				resultado += " ";
		return resultado;
	}

}
