package Herencia;

public class Usuario {
	
	protected String idUsuario;
	protected String nombre;
	protected String apPaterno;
	protected String apMaterno;
	protected byte edad;
	protected String departamento;
	
	public Usuario() {}
	
	public Usuario(String nombre, String apPaterno, String apMaterno, byte edad, String departamento) {
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.edad = edad;
		this.departamento = departamento;
		this.idUsuario=GeneraId();
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public byte getEdad() {
		return edad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", apPaterno=" + apPaterno + ", apMaterno="
				+ apMaterno + ", edad=" + edad + ", departamento=" + departamento + "]";
	}
	
	public String GeneraId() {
		String id="";
		switch(departamento) {
		case "ISC":
			id+=letrasApellido()+letrasNombre();break;
		case "INF":	
			id+=letrasApellido()+"_"+letrasNombre();break;
		}
		
		id=id.toUpperCase();
		return id;
	}
	
	public String letrasApellido() {
		return apPaterno.substring(0, 3);
	}
	
	public String letrasNombre() {
		return nombre.substring(0, 2);
	}
	
}
