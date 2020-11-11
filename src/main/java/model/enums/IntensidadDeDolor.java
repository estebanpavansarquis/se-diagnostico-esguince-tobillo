package model.enums;

public enum IntensidadDeDolor {
	Nulo,
	Leve,
	Intenso;
	
	public Boolean isa(IntensidadDeDolor intensidadDeDolor) {
		
		return this.toString() == intensidadDeDolor.toString();
		
	}

}
