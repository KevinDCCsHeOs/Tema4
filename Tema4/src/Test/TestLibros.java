package Test;

import EntradasSalidas.Tools;
import Herencia.*;

public class TestLibros {
	public static void main(String[] args) {
		MenuCuentas("Libro,Libro de texto,Libro de texto TECNM,Libro de novela,Imprimir,Salir");
	}
	
	public static void MenuCuentas(String menu) {
		String sel="",li="",lite="",litetec="",lino="";
		do {
			sel=Tools.Desplegable("Tipos de libros",menu);
			switch (sel) {
			case "Libro":
				Libro lib=new Libro(Tools.leerString("Nombre del libro"),Tools.leerString("Nombre del autor"),Tools.leerString("Editorial"),
						Tools.leerFloat("Precio del libro"));
				li+=lib.toString()+"\n";
				break;
			case "Libro de texto":
				LibrosDeTexto libTex=new LibrosDeTexto(Tools.leerString("Nombre del libro"),Tools.leerString("Nombre del autor"),
						Tools.leerString("Editorial"),Tools.leerFloat("Precio del libro"),Tools.leerString("Nombre del curso asociado al libro"));
				lite+=libTex.toString()+"\n";
				break;
			case "Libro de texto TECNM":
				LibrosDeTextoTECNM libTexTec=new LibrosDeTextoTECNM(Tools.leerString("Nombre del libro"),Tools.leerString("Nombre del autor"),
						Tools.leerString("Editorial"),Tools.leerFloat("Precio del libro"),Tools.leerString("Nombre del curso asociado al libro"),
						Tools.leerString("Campus que lo publico"),Tools.leerByte("Dia de publicación"),Tools.leerByte("Mes de publicación"),
						Tools.leerShort("Año de publicación"));
				litetec+=libTexTec.toString()+"\n";
				break;
			case "Libro de novela":
				LibroNovela libNov=new LibroNovela(Tools.leerString("Nombre del libro"),Tools.leerString("Nombre del autor"),
						Tools.leerString("Editorial"),Tools.leerFloat("Precio del libro"),
						Tools.Desplegable("Tipo de novela","Histórica,Romántica,Policíaca,Realista,Ciencia Ficción,Aventuras"));
				lino+=libNov.toString()+"\n";
				break;
			case "Imprimir":
				Tools.imprimePantalla("Libros capturados\n\nLibros normales:\n"+li+"\n\nLibros de Texto:\n"+lite+"\n\nLibros de texto del TECNM:\n"+
						litetec+"\n\nLibros de Novelas:\n"+lino);
				break;
			case "Salir":
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}
}
