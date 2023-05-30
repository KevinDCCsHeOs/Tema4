package Herencia;

public class Alumno extends Usuario{
	
	private byte semestre;
	private float promedio;
	
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Alumno(String nombre, String apPaterno, String apMaterno, byte edad, String departamento,byte semestre, float promedio) {
		super(nombre, apPaterno, apMaterno, edad, departamento);
		this.semestre=semestre;
		this.promedio=promedio;
		// TODO Auto-generated constructor stub
	}

	public byte getSemestre() {
		return semestre;
	}

	public float getPromedio() {
		return promedio;
	}

	public void setSemestre(byte semestre) {
		this.semestre = semestre;
	}

	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return super.toString()+"Alumno [semestre=" + semestre + ", promedio=" + promedio + "]";
	}
	
}
