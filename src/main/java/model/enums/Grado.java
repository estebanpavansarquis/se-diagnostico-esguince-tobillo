package model.enums;

public enum Grado {
	
	Sin_Esguince,
	Leve,
	Medio,
	Grave;
	
	public Boolean isa(Grado grado) {
		
		return this.toString() == grado.toString();
		
	}

}
