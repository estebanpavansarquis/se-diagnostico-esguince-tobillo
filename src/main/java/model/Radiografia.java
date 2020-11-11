package model;

public class Radiografia {
	Boolean presentaFractura;
	Boolean presentaLesionOsea;
	
	public Radiografia() {
		this.presentaFractura=false;
		this.presentaLesionOsea=false;
	}
	
	@Override
	public String toString() {
		return  "Presenta fractura: " 		+ this.presentaFractura + "\n" +
				"Presenta lesion osea: " 				+ this.presentaLesionOsea + "\n";
	}
	
	public Boolean getPresentaFractura() {
		return presentaFractura;
	}

	public void setPresentaFractura(Boolean presentaFractura) {
		this.presentaFractura = presentaFractura;
	}
	
	public Boolean getPresentaLesionOsea() {
		return presentaLesionOsea;
	}

	public void setPresentaLesionOsea(Boolean presentaLesionOsea) {
		this.presentaLesionOsea = presentaLesionOsea;
	}
	
}
