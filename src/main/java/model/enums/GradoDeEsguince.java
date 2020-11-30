package model.enums;

public enum GradoDeEsguince {
	
	Sin_Diagnostico,
	Sin_Esguince,
	Leve,
	Medio,
	Grave;
	
	public Boolean isa(GradoDeEsguince grado) {
		
		return this.toString() == grado.toString();
		
	}

}
