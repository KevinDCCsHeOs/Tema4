package Test;

import EntradasSalidas.Tools;
import Herencia.*;

public class DocenteAlumnos {
	
	public static void main(String[] args) {
		Docente doc=new Docente(Tools.leerString("Nombre"),Tools.leerString("Apellido paterno"),Tools.leerString("Apellido Materno"),Tools.leerByte("Edad"),Tools.Desplegable("ISC,INF"),Tools.leerByte("antiguedad"),Tools.leerString("Grado adademico"));
		Alumno alu=new Alumno(Tools.leerString("Nombre"),Tools.leerString("Apellido paterno"),Tools.leerString("Apellido Materno"),Tools.leerByte("Edad"),Tools.Desplegable("ISC,INF"),Tools.leerByte("Semestre"),Tools.leerFloat("Promedio"));
		Tools.imprimePantalla("Docente: \n"+doc.toString()+"\n\nAlumno:\n"+alu.toString());
	}
	
}
