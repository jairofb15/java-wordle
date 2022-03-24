package juegos.wordle;

public class Letra {

	private final char c;
	private boolean existe;
	private boolean posicionCorrecta;

	Letra(char c) {
		this.c = c;
		existe = false;
		posicionCorrecta = false;
	}

	public boolean existe() {
		return existe;
	}

	public char getCaracter() {
		return c;
	}

	public boolean posicionCorrecta() {
		return posicionCorrecta;
	}

	public void setExiste(boolean existe) {
		this.existe = existe;
	}

	public void setPosicionCorrecta(boolean posicionCorrecta) {
		this.posicionCorrecta = posicionCorrecta;
	}

}
