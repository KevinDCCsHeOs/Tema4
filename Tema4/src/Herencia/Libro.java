package Herencia;

public class Libro {

	protected String tituloLibro;
	protected String autorLibro;
	protected String editorialLibro;
	protected float precioLibro;
	
	public Libro() {}
	
	public Libro(String tituloLibro, String autorLibro, String editorialLibro, float precioLibro) {
		this.tituloLibro = tituloLibro;
		this.autorLibro = autorLibro;
		this.editorialLibro = editorialLibro;
		this.precioLibro = precioLibro;
	}

	public String getTituloLibro() {
		return tituloLibro;
	}

	public String getAutorLibro() {
		return autorLibro;
	}

	public String getEditorialLibro() {
		return editorialLibro;
	}

	public float getPrecioLibro() {
		return precioLibro;
	}

	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}

	public void setAutorLibro(String autorLibro) {
		this.autorLibro = autorLibro;
	}

	public void setEditorialLibro(String editorialLibro) {
		this.editorialLibro = editorialLibro;
	}

	public void setPrecioLibro(float precioLibro) {
		this.precioLibro = precioLibro;
	}

	@Override
	public String toString() {
		return "Libro [tituloLibro=" + tituloLibro + ", autorLibro=" + autorLibro + ", editorialLibro=" + editorialLibro
				+ ", precioLibro=" + precioLibro + "]";
	}
	
	
}
