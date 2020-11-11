package model.enums;

public enum DesgarroDeNervios {
	Nulo,
	Parcial,
	Total;
	
	public Boolean isa(DesgarroDeNervios desgarroDeNervios) {
		
		return this.toString() == desgarroDeNervios.toString();
		
	}
}
