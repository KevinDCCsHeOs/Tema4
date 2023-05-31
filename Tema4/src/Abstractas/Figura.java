package Abstractas;

public abstract class Figura {
	
	private String nomFig;
	private String color;
	
	public Figura(String nom,String col) {
		nomFig=nom;
		color=col;
	}

	public String getNomFig() {
		return nomFig;
	}

	public String getColor() {
		return color;
	}

	public void setNomFig(String nomFig) {
		this.nomFig = nomFig;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double area();
	
}
