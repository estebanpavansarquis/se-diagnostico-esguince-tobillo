package model.enums;

public enum ExtensionDeLesion {
	
	Nula,
	Leve, 
	Extensa;
	
	public Boolean isa(ExtensionDeLesion extensionDeLesion) {
		
		return this.toString() == extensionDeLesion.toString();
		
	}

}
