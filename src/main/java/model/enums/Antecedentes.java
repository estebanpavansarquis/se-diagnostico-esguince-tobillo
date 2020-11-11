package model.enums;

public enum Antecedentes {
	
	Influyentes,
	No_Influyentes;
	
	public Boolean isa(Antecedentes antecedentes) {
		
		return this.toString() == antecedentes.toString();
		
	}

}
