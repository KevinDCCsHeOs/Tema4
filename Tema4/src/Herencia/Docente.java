package Herencia;

public class Docente extends Usuario{
	
	private byte antiguedad;
	private String gradoAcademico;
	
	public Docente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Docente(String nombre, String apPaterno, String apMaterno, byte edad, String departamento,byte antiguedad,String gradoAcademico) {
		super(nombre, apPaterno, apMaterno, edad, departamento);
		this.antiguedad=antiguedad;
		this.gradoAcademico=gradoAcademico;
		// TODO Auto-generated constructor stub
	}
	
	public byte getAntiguedad() {
		return antiguedad;
	}
	
	public String getGradoAcademico() {
		return gradoAcademico;
	}
	
	public void setAntiguedad(byte antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}

	@Override
	public String toString() {
		return super.toString()+"Docente [antiguedad=" + antiguedad + ", gradoAcademico=" + gradoAcademico + "]";
	}
	
}
