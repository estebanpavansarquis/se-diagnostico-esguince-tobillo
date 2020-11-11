package model.enums;

public enum PresentaHinchazon {
	Nula, 
	Leve, 
	Alta;
	
	public Boolean isa(PresentaHinchazon presentaHinchazon) {
		
		return this.toString() == presentaHinchazon.toString();
		
	}

}
