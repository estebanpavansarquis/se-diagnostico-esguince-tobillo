package model;

import model.enums.CapacidadDeMovimiento;
import model.enums.PresentaHinchazon;

public class Tobillo {
	
	Boolean presentaHematomas;
	Boolean presentaEspasmosMusculares;
	Boolean soportaSuPropioPeso;
	CapacidadDeMovimiento capacidadDeMovimiento;
	PresentaHinchazon presentaHinchazon;	
	
	public Tobillo() {
		this.presentaHematomas = false;
		this.presentaEspasmosMusculares = false;
		this.soportaSuPropioPeso = true;
		this.capacidadDeMovimiento = CapacidadDeMovimiento.Total;
		this.presentaHinchazon = PresentaHinchazon.Nula;
	}
	
	@Override
	public String toString() {
		return  "Presenta Hematomas: " 					+ this.presentaHematomas + "\n" +
				"Presenta espasmos musculares: " 		+ this.presentaEspasmosMusculares + "\n" +
				"Soporta su propio peso: " 				+ this.soportaSuPropioPeso + "\n" +
				"Capacidad de Movimiento: " 			+ this.capacidadDeMovimiento + "\n" +
				"Presenta Hinchazon: " 					+ this.presentaHinchazon + "\n";
	}
	
	
	public Boolean getPresentaHematomas() {
		return presentaHematomas;
	}

	public void setPresentaHematomas(Boolean presentaHematomas) {
		this.presentaHematomas = presentaHematomas;
	}
	
	
	public Boolean getPresentaEspasmosMusculares() {
		return presentaEspasmosMusculares;
	}

	public void setPresentaEspasmosMusculares(Boolean presentaEspasmosMusculares) {
		this.presentaEspasmosMusculares = presentaEspasmosMusculares;
	}
	
	public Boolean getSoportaSuPropioPeso() {
		return soportaSuPropioPeso;
	}

	public void setSoportaSuPropioPeso(Boolean soportaSuPropioPeso) {
		this.soportaSuPropioPeso = soportaSuPropioPeso;
	}
	
	public CapacidadDeMovimiento getCapacidadDeMovimiento() {
		return capacidadDeMovimiento;
	}

	public void setCapacidadDeMovimiento(CapacidadDeMovimiento capacidadDeMovimiento) {
		this.capacidadDeMovimiento = capacidadDeMovimiento;
	}
	
	
	public PresentaHinchazon getPresentaHinchazon() {
		return presentaHinchazon;
	}

	public void setPresentaHinchazon(PresentaHinchazon presentaHinchazon) {
		this.presentaHinchazon = presentaHinchazon;
	}

}
