package model;

import model.enums.Grado;

public class DiagnosticoEsguince {
	
	Boolean tratarConPRICE;
	Boolean tratarConMedicacion;
	Boolean tratarConInmovilizacion;
	Boolean tratarConFisioterapia;
	Boolean tratarConCirugia;
	int diasDeReposo;
	Boolean necesitaProximaSitaDeControl;
	
	Grado grado;
	
	public DiagnosticoEsguince(Boolean tratarConPRICE, Boolean tratarConMedicacion, Boolean tratarConInmovilizacion,
			Boolean tratarConFisioterapia, Boolean tratarConCirugia, int diasDeReposo,
			Boolean necesitaProximaSitaDeControl, Grado grado) {
		this.tratarConPRICE = tratarConPRICE;
		this.tratarConMedicacion = tratarConMedicacion;
		this.tratarConInmovilizacion = tratarConInmovilizacion;
		this.tratarConFisioterapia = tratarConFisioterapia;
		this.tratarConCirugia = tratarConCirugia;
		this.diasDeReposo = diasDeReposo;
		this.necesitaProximaSitaDeControl = necesitaProximaSitaDeControl;
		this.grado = grado;
	}
	
	public DiagnosticoEsguince() {
		this.tratarConPRICE = false;
		this.tratarConMedicacion = false;
		this.tratarConInmovilizacion = false;
		this.tratarConFisioterapia = false;
		this.tratarConCirugia = false;
		this.diasDeReposo = 0;
		this.necesitaProximaSitaDeControl = false;
		this.grado = Grado.Sin_Esguince;
	}
	
	@Override
	public String toString() {
		return  "Tratar con PRICE: " 			+ this.tratarConPRICE + "\n" +
				"Tratar con Medicacion: " 		+ this.tratarConMedicacion + "\n" +
				"Tratar con Inmovilizacion: " 	+ this.tratarConInmovilizacion + "\n" +
				"Tratar con Fisioterapia: " 	+ this.tratarConFisioterapia + "\n" +
				"Tratar con Cirugia: " 			+ this.tratarConCirugia + "\n" +
				"Dias de reposo: " 				+ this.diasDeReposo + "\n" +
				"Grado: "				 		+ this.grado + "\n" +
				"Presenta lesion osea: " 		+ this.necesitaProximaSitaDeControl + "\n";
	}
	
	public Grado getDiagnosticoEsguince() {
		return grado;
	}

	public Boolean getTratarConPRICE() {
		return tratarConPRICE;
	}

	public void setTratarConPRICE(Boolean tratarConPRICE) {
		this.tratarConPRICE = tratarConPRICE;
	}

	public Boolean getTratarConMedicacion() {
		return tratarConMedicacion;
	}

	public void setTratarConMedicacion(Boolean tratarConMedicacion) {
		this.tratarConMedicacion = tratarConMedicacion;
	}

	public Boolean getTratarConInmovilizacion() {
		return tratarConInmovilizacion;
	}

	public void setTratarConInmovilizacion(Boolean tratarConInmovilizacion) {
		this.tratarConInmovilizacion = tratarConInmovilizacion;
	}

	public Boolean getTratarConFisioterapia() {
		return tratarConFisioterapia;
	}

	public void setTratarConFisioterapia(Boolean tratarConFisioterapia) {
		this.tratarConFisioterapia = tratarConFisioterapia;
	}

	public Boolean getTratarConCirugia() {
		return tratarConCirugia;
	}

	public void setTratarConCirugia(Boolean tratarConCirugia) {
		this.tratarConCirugia = tratarConCirugia;
	}

	public int getDiasDeReposo() {
		return diasDeReposo;
	}

	public void setDiasDeReposo(int diasDeReposo) {
		this.diasDeReposo = diasDeReposo;
	}

	public Boolean getNecesitaProximaSitaDeControl() {
		return necesitaProximaSitaDeControl;
	}

	public void setNecesitaProximaSitaDeControl(Boolean necesitaProximaSitaDeControl) {
		this.necesitaProximaSitaDeControl = necesitaProximaSitaDeControl;
	}

	public Grado getGrado() {
		return grado;
	}

	public void setGrado(Grado grado) {
		this.grado = grado;
	}

}
