package model.enums;

public enum CapacidadDeMovimiento {
	Nula, 
	Limitada, 
	Total;

	public Boolean isa(CapacidadDeMovimiento capacidadDeMovimiento) {
		
		return this.toString() == capacidadDeMovimiento.toString();
		
	}
	
}
