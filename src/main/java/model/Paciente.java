package model;

import model.enums.*;


public class Paciente {
	public Lesion lesion;
	public Radiografia radiografia;
	public ResonanciaMagnetica resosnanciaMagnetica;
	public Tobillo tobillo;
	public IntensidadDeDolor intensidadDeDolor;
	public Boolean antecedentesInfluyentes;

	public DiagnosticoPop diagnosticoPop;
	public DiagnosticoCondicionesExternas diagnosticoCondicionesExternas;
	public DiagnosticoExploracionFisica diagnosticoExploracionFisica;
	public DiagnosticoRadiografia diagnosticoRadiografia;
	public DiagnosticoResonancia diagnosticoResonancia;
	public DiagnosticoEsguince diagnosticoEsguince;

	public Paciente(IntensidadDeDolor intensidadDeDolor, Boolean antecedentesInfluyentes, Lesion lesion,
			Radiografia radiografia, ResonanciaMagnetica resosnanciaMagnetica, Tobillo tobillo) {
		this.lesion = lesion;
		this.radiografia = radiografia;
		this.resosnanciaMagnetica = resosnanciaMagnetica;
		this.tobillo = tobillo;
		this.intensidadDeDolor = intensidadDeDolor;
		this.antecedentesInfluyentes = antecedentesInfluyentes;
		this.diagnosticoExploracionFisica = null;
		this.diagnosticoPop = null;
		this.diagnosticoCondicionesExternas = null;
		this.diagnosticoRadiografia = null;
		this.diagnosticoResonancia = null;
		this.diagnosticoEsguince = null;
	}

	public Paciente() {
		this.lesion = new Lesion();
		this.radiografia = new Radiografia();
		this.resosnanciaMagnetica = new ResonanciaMagnetica();
		this.tobillo = new Tobillo();
		this.intensidadDeDolor = IntensidadDeDolor.Nulo;
		this.antecedentesInfluyentes = false;
		this.diagnosticoRadiografia = null;
		this.diagnosticoResonancia = null;
		this.diagnosticoExploracionFisica = null;
		this.diagnosticoPop = null ;
		this.diagnosticoCondicionesExternas = null;
		this.diagnosticoEsguince = new DiagnosticoEsguince();
	}

	public IntensidadDeDolor getIntensidadDeDolor() {
		return intensidadDeDolor;
	}

	public void setIntensidadDeDolor(IntensidadDeDolor intensidadDeDolor) {
		this.intensidadDeDolor = intensidadDeDolor;
	}

	public Boolean getAntecedentesInfluyentes() {
		return antecedentesInfluyentes;
	}

	public void setAntecedentesInfluyentes(Boolean antecedentes) {
		this.antecedentesInfluyentes = antecedentes;
	}

	public Lesion getLesion() {
		return lesion;
	}

	public void setLesion(Lesion lesion) {
		this.lesion = lesion;
	}

	public Radiografia getRadiografia() {
		return radiografia;
	}

	public void setRadiografia(Radiografia radiografia) {
		this.radiografia = radiografia;
	}

	public ResonanciaMagnetica getResonanciaMagnetica() {
		return resosnanciaMagnetica;
	}

	public void setResonanciaMagnetica(ResonanciaMagnetica resosnanciaMagnetica) {
		this.resosnanciaMagnetica = resosnanciaMagnetica;
	}

	public Tobillo getTobillo() {
		return tobillo;
	}

	public void setTobillo(Tobillo tobillo) {
		this.tobillo = tobillo;
	}

	public DiagnosticoEsguince getDiagnosticoEsguince() {
		return diagnosticoEsguince;
	}

	public ResonanciaMagnetica getResosnanciaMagnetica() {
		return resosnanciaMagnetica;
	}

	public void setResosnanciaMagnetica(ResonanciaMagnetica resosnanciaMagnetica) {
		this.resosnanciaMagnetica = resosnanciaMagnetica;
	}

	public DiagnosticoExploracionFisica getDiagnosticoExploracionFisica() {
		return diagnosticoExploracionFisica;
	}

	public void setDiagnosticoExploracionFisica(DiagnosticoExploracionFisica diagnosticoExploracionFisica) {
		this.diagnosticoExploracionFisica = diagnosticoExploracionFisica;
	}

	public DiagnosticoPop getDiagnosticoPop() {
		return diagnosticoPop;
	}

	public void setDiagnosticoPop(Boolean aplicaPop) {
		if (this.diagnosticoPop == null) {
			this.diagnosticoPop = new DiagnosticoPop();
		}
		this.diagnosticoPop.setPop(true);
	}

	public DiagnosticoCondicionesExternas getDiagnosticoCondicionesExternas() {
		if (this.diagnosticoCondicionesExternas == null) {
			this.diagnosticoCondicionesExternas = new DiagnosticoCondicionesExternas();
		}
		return diagnosticoCondicionesExternas;
	}

	public void setDiagnosticoCondicionesExternas(Boolean aplicanCondicionesExternas) {
		if (this.diagnosticoCondicionesExternas == null) {
			this.diagnosticoCondicionesExternas = new DiagnosticoCondicionesExternas();
		}
		this.diagnosticoCondicionesExternas.setDiagnosticoCondicionesExternas(aplicanCondicionesExternas);
	}

	public void setNecesitaResonanciaMagnetica(Boolean necesitaResonanciaMagnetica) {
		if (this.diagnosticoExploracionFisica == null) {
			this.diagnosticoExploracionFisica = new DiagnosticoExploracionFisica();
		}
		this.diagnosticoExploracionFisica.setNecesitaResonanciaMagnetica(necesitaResonanciaMagnetica);
	}

	public void setNecesitaRadiografia(Boolean necesitaRadiografia) {
		if (this.diagnosticoExploracionFisica == null) {
			this.diagnosticoExploracionFisica = new DiagnosticoExploracionFisica();
		}
		this.diagnosticoExploracionFisica.setNecesitaRadiografia(necesitaRadiografia);
	}
	
	public void setFracturaDiagnosticoRadiografía(Boolean presentaFractura) {
		if (this.diagnosticoRadiografia == null) {
			this.diagnosticoRadiografia = new DiagnosticoRadiografia();
		}
		this.diagnosticoRadiografia.setPresentaFractura(presentaFractura);
	}
	
	public void setLesionOseaDiagnosticoRadiografía(Boolean presentaLesionOsea) {
		if (this.diagnosticoRadiografia == null) {
			this.diagnosticoRadiografia = new DiagnosticoRadiografia();
		}
		this.diagnosticoRadiografia.setPresentaLesionOsea(presentaLesionOsea);
	}
	
	public void setDesgarroDeNerviosDiagnosticoResonancia(DesgarroDeNervios desgarroDeNervios) {
		if (this.diagnosticoResonancia == null) {
			this.diagnosticoResonancia = new DiagnosticoResonancia();
		}
		this.diagnosticoResonancia.setDesgarroDeNervios(desgarroDeNervios);
	}
	
	public void setExtensionDeLesionDiagnosticoResonancia(ExtensionDeLesion extensionDeLesion) {
		if (this.diagnosticoResonancia == null) {
			this.diagnosticoResonancia = new DiagnosticoResonancia();
		}
		this.diagnosticoResonancia.setExtensionDeLesion(extensionDeLesion);
	}
	
	
	
}
