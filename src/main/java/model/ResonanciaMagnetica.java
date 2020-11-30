package model;

import model.enums.DesgarroDeNervios;
import model.enums.ExtensionDeLesion;

public class ResonanciaMagnetica {
	
	ExtensionDeLesion	extensionDeLesion;
	DesgarroDeNervios	desgarroDeNervios;
	
	public ResonanciaMagnetica() {
		this.extensionDeLesion = ExtensionDeLesion.Nula;
		this.desgarroDeNervios = DesgarroDeNervios.Nulo;
	}
	
	@Override
	public String toString() {
		return  "Extension de lesion: " 	+ this.extensionDeLesion + "\n" +
				"Presenta lesion osea: " 	+ this.desgarroDeNervios + "\n";
	}
	
	public ExtensionDeLesion getExtensionDeLesion() {
		return extensionDeLesion;
	}


	public void setExtensionDeLesion(ExtensionDeLesion extensionDeLesion) {
		this.extensionDeLesion = extensionDeLesion;
	}
	
	public DesgarroDeNervios getDesgarroDeNervios() {
		return desgarroDeNervios;
	}

	public void setDesgarroDeNervios(DesgarroDeNervios desgarroDeNervios) {
		this.desgarroDeNervios = desgarroDeNervios;
	}

}

