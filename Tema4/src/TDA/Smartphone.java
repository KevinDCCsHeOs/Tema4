package TDA;

import EntradasSalidas.Tools;
import TDA.Bateria;

public class Smartphone {
	private String modelo;
	private int i;
	private Bateria bateria;
	private Chip chip[];
	
	public Smartphone() {}
	
	public Smartphone(String modelo, int miniAmperios, String marca, String tipoConector) {
		this.bateria=new Bateria(miniAmperios, marca, tipoConector);
		this.modelo=modelo;
		this.chip=new Chip[2];
		this.i=0;
	}
	
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	public void setBateria(Bateria bateria) {
		this.bateria=bateria;
	}
	
	@Override
	public String toString() {
		return "Smartphone [modelo=" + modelo + ", i=" + i + ", \nbateria=" + bateria + ", \nchip=" + imprimeChips() + "]";
	}
	
	public void agregarChip(Chip chips) {
		if (i<chip.length) {
			this.chip[i]=chips;
			i++;
		}
		else Tools.salidaError("Los chips estan llenos");;
	}
	
	public String imprimeChips() {
		String cad="\n";
		for(byte j=0;j<i;j++) {
			cad+=chip[j].toString()+"\n";
		}
		return cad;
	}
}
