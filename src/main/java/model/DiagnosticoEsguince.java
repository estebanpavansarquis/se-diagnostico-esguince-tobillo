package model;

import model.enums.GradoDeEsguince;

public class DiagnosticoEsguince {
	
	Boolean tratarConPRICE;
	Boolean tratarConMedicacion;
	Boolean tratarConInmovilizacion;
	Boolean tratarConFisioterapia;
	Boolean tratarConCirugia;
	int diasDeReposo;
	Boolean necesitaProximaSitaDeControl;
	
	GradoDeEsguince gradoDeEsguince;
	
	public DiagnosticoEsguince(Boolean tratarConPRICE, Boolean tratarConMedicacion, Boolean tratarConInmovilizacion,
			Boolean tratarConFisioterapia, Boolean tratarConCirugia, int diasDeReposo,
			Boolean necesitaProximaSitaDeControl, GradoDeEsguince gradoDeEsguince) {
		this.tratarConPRICE = tratarConPRICE;
		this.tratarConMedicacion = tratarConMedicacion;
		this.tratarConInmovilizacion = tratarConInmovilizacion;
		this.tratarConFisioterapia = tratarConFisioterapia;
		this.tratarConCirugia = tratarConCirugia;
		this.diasDeReposo = diasDeReposo;
		this.necesitaProximaSitaDeControl = necesitaProximaSitaDeControl;
		this.gradoDeEsguince = gradoDeEsguince;
	}
	
	public DiagnosticoEsguince() {
		this.tratarConPRICE = false;
		this.tratarConMedicacion = false;
		this.tratarConInmovilizacion = false;
		this.tratarConFisioterapia = false;
		this.tratarConCirugia = false;
		this.diasDeReposo = 0;
		this.necesitaProximaSitaDeControl = false;
		this.gradoDeEsguince = GradoDeEsguince.Sin_Diagnostico;
	}
	
	@Override
	public String toString() {
		return  "Grado de Esguince: "					+ this.gradoDeEsguince + "\n" +
				"Dias de reposo: " 						+ this.diasDeReposo + "\n" +
				"Necesita Proxima Sita De Control: " 	+ this.necesitaProximaSitaDeControl + "\n" +
				"Tratar con PRICE: " 					+ this.tratarConPRICE + "\n" +
				"Tratar con Medicacion: " 				+ this.tratarConMedicacion + "\n" +
				"Tratar con Inmovilizacion: " 			+ this.tratarConInmovilizacion + "\n" +
				"Tratar con Fisioterapia: " 			+ this.tratarConFisioterapia + "\n" +
				"Tratar con Cirugia: " 					+ this.tratarConCirugia;
	}
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diasDeReposo;
		result = prime * result + ((gradoDeEsguince == null) ? 0 : gradoDeEsguince.hashCode());
		result = prime * result
				+ ((necesitaProximaSitaDeControl == null) ? 0 : necesitaProximaSitaDeControl.hashCode());
		result = prime * result + ((tratarConCirugia == null) ? 0 : tratarConCirugia.hashCode());
		result = prime * result + ((tratarConFisioterapia == null) ? 0 : tratarConFisioterapia.hashCode());
		result = prime * result + ((tratarConInmovilizacion == null) ? 0 : tratarConInmovilizacion.hashCode());
		result = prime * result + ((tratarConMedicacion == null) ? 0 : tratarConMedicacion.hashCode());
		result = prime * result + ((tratarConPRICE == null) ? 0 : tratarConPRICE.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiagnosticoEsguince other = (DiagnosticoEsguince) obj;
		if (diasDeReposo != other.diasDeReposo)
			return false;
		if (gradoDeEsguince != other.gradoDeEsguince)
			return false;
		if (necesitaProximaSitaDeControl == null) {
			if (other.necesitaProximaSitaDeControl != null)
				return false;
		} else if (!necesitaProximaSitaDeControl.equals(other.necesitaProximaSitaDeControl))
			return false;
		if (tratarConCirugia == null) {
			if (other.tratarConCirugia != null)
				return false;
		} else if (!tratarConCirugia.equals(other.tratarConCirugia))
			return false;
		if (tratarConFisioterapia == null) {
			if (other.tratarConFisioterapia != null)
				return false;
		} else if (!tratarConFisioterapia.equals(other.tratarConFisioterapia))
			return false;
		if (tratarConInmovilizacion == null) {
			if (other.tratarConInmovilizacion != null)
				return false;
		} else if (!tratarConInmovilizacion.equals(other.tratarConInmovilizacion))
			return false;
		if (tratarConMedicacion == null) {
			if (other.tratarConMedicacion != null)
				return false;
		} else if (!tratarConMedicacion.equals(other.tratarConMedicacion))
			return false;
		if (tratarConPRICE == null) {
			if (other.tratarConPRICE != null)
				return false;
		} else if (!tratarConPRICE.equals(other.tratarConPRICE))
			return false;
		return true;
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

	public GradoDeEsguince getGradoDeEsguince() {
		return gradoDeEsguince;
	}

	public void setGradoDeEsguince(GradoDeEsguince gradoDeEsguince) {
		this.gradoDeEsguince = gradoDeEsguince;
	}
	
	public void setGradoDeEsguinceSinEsguince() {
		this.gradoDeEsguince = GradoDeEsguince.Sin_Esguince;
	}
	
	public void setGradoDeEsguinceLeve() {
		this.gradoDeEsguince = GradoDeEsguince.Leve;
	}
	
	public void setGradoDeEsguinceMedio() {
		this.gradoDeEsguince = GradoDeEsguince.Medio;
	}
	
	public void setGradoDeEsguinceGrave() {
		this.gradoDeEsguince = GradoDeEsguince.Grave;
	}
	

}
