package Herencia;

public class LibrosDeTexto extends Libro{
	
	protected String nomCurso;

	public LibrosDeTexto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LibrosDeTexto(String tituloLibro, String autorLibro, String editorialLibro, float precioLibro, String nomCurso) {
		super(tituloLibro, autorLibro, editorialLibro, precioLibro);
		this.nomCurso=nomCurso;
	}

	public String getNomCurso() {
		return nomCurso;
	}

	public void setNomCurso(String nomCurso) {
		this.nomCurso = nomCurso;
	}

	@Override
	public String toString() {
		return super.toString()+"LibrosDeTexto [nomCurso=" + nomCurso + "]";
	}
	
	
}
