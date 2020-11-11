package model;

public class Lesion {
	Boolean condicionesAmbientales;
	Boolean condicionFatiga;
	Boolean condicionEquipoInadecuado;
	Boolean escucharPop;
	Boolean sentirPop;
	int diasTranscurridosDeLaLesion;
	
	public Lesion() {
		this.condicionesAmbientales=false;
		this.condicionFatiga=false;
		this.condicionEquipoInadecuado=false;
		this.escucharPop=false;
		this.sentirPop=false;
		this.diasTranscurridosDeLaLesion=0;
	}
	
	@Override
	public String toString() {
		return  "Condiciones Ambientales: " 				+ this.condicionesAmbientales + "\n" +
				"Condiciones de Fatiga: " 					+ this.condicionFatiga + "\n" +
				"Condiciones de Equipamiento inadecuado: " 	+ this.condicionEquipoInadecuado + "\n" +
				"Escuchar Pop: " 							+ this.escucharPop + "\n" +
				"Sentir Pop: " 								+ this.sentirPop + "\n" +
				"Dias Transcurrido de la Lesion: " 			+ this.diasTranscurridosDeLaLesion + "\n";
	}
	
	public Boolean getCondicionesAmbientales() {
		return condicionesAmbientales;
	}

	public void setCondicionesAmbientales(Boolean condicionesAmbientales) {
		this.condicionesAmbientales = condicionesAmbientales;
	}
	
	public Boolean getCondicionFatiga() {
		return condicionFatiga;
	}

	public void setCondicionFatiga(Boolean condicionFatiga) {
		this.condicionFatiga = condicionFatiga;
	}
	
	public Boolean getCondicionEquipoInadecuado() {
		return condicionEquipoInadecuado;
	}

	public void setCondicionEquipoInadecuado(Boolean condicionEquipoInadecuado) {
		this.condicionEquipoInadecuado = condicionEquipoInadecuado;
	}
	
	public Boolean getEscucharPop() {
		return escucharPop;
	}

	public void setEscucharPop(Boolean escucharPop) {
		this.escucharPop = escucharPop;
	}
	
	public Boolean getSentirPop() {
		return sentirPop;
	}

	public void setSentirPop(Boolean sentirPop) {
		this.sentirPop = sentirPop;
	}
	
	public int getDiasTranscurridosDeLaLesion() {
		return diasTranscurridosDeLaLesion;
	}

	public void setSentirPop(int diasTranscurridosDeLaLesion) {
		this.diasTranscurridosDeLaLesion = diasTranscurridosDeLaLesion;
	}
	
}
