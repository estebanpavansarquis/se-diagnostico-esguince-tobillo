package model;

import model.enums.DesgarroDeNervios;
import model.enums.ExtensionDeLesion;

public class DiagnosticoResonancia {

	ExtensionDeLesion	extensionDeLesion;
	DesgarroDeNervios	desgarroDeNervios;
	
	public DiagnosticoResonancia() {
		this.extensionDeLesion = ExtensionDeLesion.Nula;
		this.desgarroDeNervios = DesgarroDeNervios.Nulo;
	}
	
	@Override
	public String toString() {
		return  "Extension de lesion: " 		+ this.extensionDeLesion + "\n" +
				"Presenta lesion osea: " 		+ this.desgarroDeNervios + "\n";
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
	
	public void setDesgarroDeNerviosNulo() {
		this.desgarroDeNervios = DesgarroDeNervios.Nulo;
	}
	
	public void setDesgarroDeNerviosParcial() {
		this.desgarroDeNervios = DesgarroDeNervios.Parcial;
	}
	
	public void setDesgarroDeNerviosTotal() {
		this.desgarroDeNervios = DesgarroDeNervios.Total;
	}
	
	public void setExtensionDeLesionNula() {
		this.extensionDeLesion = ExtensionDeLesion.Nula;
	}
	
	public void setExtensionDeLesionLeve() {
		this.extensionDeLesion = ExtensionDeLesion.Leve;
	}
	
	public void setExtensionDeLesionExtensa() {
		this.extensionDeLesion = ExtensionDeLesion.Extensa;
	}
	
	
}

