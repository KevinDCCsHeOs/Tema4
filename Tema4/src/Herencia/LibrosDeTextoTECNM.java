package Herencia;

public class LibrosDeTextoTECNM extends LibrosDeTexto{
	
	private String campus;
	private Fecha fecha;
	
	public LibrosDeTextoTECNM() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LibrosDeTextoTECNM(String tituloLibro, String autorLibro, String editorialLibro, float precioLibro, String nomCurso, String campus, byte dia,byte mes,short añio) {
		super(tituloLibro, autorLibro, editorialLibro, precioLibro, nomCurso);
		this.campus=campus;
		this.fecha=new Fecha(dia,mes,añio);
		// TODO Auto-generated constructor stub
	}
	public String getCampus() {
		return campus;
	}
	
	public Fecha getFecha() {
		return fecha;
	}
	
	public void setCampus(String campus) {
		this.campus = campus;
	}
	
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return super.toString()+"LibrosDeTextoTECNM [campus=" + campus + ", fecha=" + fecha + "]";
	}
	
}
