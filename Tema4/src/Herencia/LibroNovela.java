package Herencia;

public class LibroNovela extends Libro{
	
	private String tipoNovela;

	public LibroNovela() {
		super();
	}

	public LibroNovela(String tituloLibro, String autorLibro, String editorialLibro, float precioLibro, String tipoNovela) {
		super(tituloLibro, autorLibro, editorialLibro, precioLibro);
		this.tipoNovela=tipoNovela;
	}

	public String getTipoNovela() {
		return tipoNovela;
	}

	public void setTipoNovela(String tipoNovela) {
		this.tipoNovela = tipoNovela;
	}

	@Override
	public String toString() {
		return super.toString()+"LibroNovela [tipoNovela=" + tipoNovela + "]";
	}
	
}
