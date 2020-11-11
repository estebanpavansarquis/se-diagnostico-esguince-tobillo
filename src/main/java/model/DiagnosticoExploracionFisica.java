package model;

public class DiagnosticoExploracionFisica {
	
	Boolean necesitaRadiografia;
	Boolean necesitaResonanciaMagnetica;
	
	public DiagnosticoExploracionFisica() {
		this.necesitaRadiografia = false;
		this.necesitaResonanciaMagnetica = false;
	}
	
	@Override
	public String toString() {
		return  "Necesita Radiografia: " 					+ this.necesitaRadiografia + "\n" +
				"Necesita Resonancia Magnetica: " 			+ this.necesitaResonanciaMagnetica + "\n";
	}
	
	public Boolean getNecesitaRadiografia() {
		return necesitaRadiografia;
	}
	
	
	public Boolean getNecesitaResonanciaMagnetica() {
		return necesitaResonanciaMagnetica;
	}

	public void setNecesitaResonanciaMagnetica(Boolean necesitaResonanciaMagnetica) {
		this.necesitaResonanciaMagnetica = necesitaResonanciaMagnetica;
	}


	public void setNecesitaRadiografia(Boolean necesitaRadiografia) {
		this.necesitaRadiografia = necesitaRadiografia;
	}

}
