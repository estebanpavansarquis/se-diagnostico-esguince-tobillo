package model;

import model.enums.Antecedentes;
import model.enums.IntensidadDeDolor;

public class Paciente {
	public Lesion lesion;
	public Radiografia radiografia;
	public ResonanciaMagnetica resosnanciaMagnetica;
	public Tobillo tobillo;
	public IntensidadDeDolor intensidadDeDolor;
	public Antecedentes antecedentes;
	
	public DiagnosticoExploracionFisica diagnosticoExploracionFisica;
	public DiagnosticoPop diagnosticoPop;
	public DiagnosticoCondicionesExternas diagnosticoCondicionesExternas;
	public DiagnosticoRadiografia diagnosticoRadiografia;
	public DiagnosticoResonancia diagnosticoResonancia;
	public DiagnosticoEsguince diagnosticoEsguince;
	
	
	public Paciente(Lesion lesion, Radiografia radiografia, ResonanciaMagnetica resosnanciaMagnetica, Tobillo tobillo){
		this.lesion = lesion;
		this.radiografia = radiografia;
		this.resosnanciaMagnetica = resosnanciaMagnetica;
		this.tobillo = tobillo;
		this.intensidadDeDolor = IntensidadDeDolor.Nulo;
		this.antecedentes = Antecedentes.No_Influyentes;
		this.diagnosticoExploracionFisica = new DiagnosticoExploracionFisica();
		this.diagnosticoPop = new DiagnosticoPop();
		this.diagnosticoCondicionesExternas = new DiagnosticoCondicionesExternas();
		this.diagnosticoEsguince = new DiagnosticoEsguince();
	}
	
	public Paciente(){
		this.lesion = new Lesion();
		this.radiografia = new Radiografia();
		this.resosnanciaMagnetica = new ResonanciaMagnetica();
		this.tobillo = new Tobillo();
		this.intensidadDeDolor = IntensidadDeDolor.Nulo;
		this.antecedentes = Antecedentes.No_Influyentes;
		this.diagnosticoRadiografia = new DiagnosticoRadiografia();
		this.diagnosticoResonancia = new DiagnosticoResonancia();
		this.diagnosticoExploracionFisica = new DiagnosticoExploracionFisica();
		this.diagnosticoPop = new DiagnosticoPop();
		this.diagnosticoCondicionesExternas = new DiagnosticoCondicionesExternas();
		this.diagnosticoEsguince = new DiagnosticoEsguince();
	}
	
	public IntensidadDeDolor getIntensidadDeDolor() {
		return intensidadDeDolor;
	}

	public void setIntensidadDeDolor(IntensidadDeDolor intensidadDeDolor) {
		this.intensidadDeDolor = intensidadDeDolor;
	}
	
	public Antecedentes getAntecedentes() {
		return antecedentes;
	}

	public void setAntecedentes(Antecedentes antecedentes) {
		this.antecedentes = antecedentes;
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
		this.diagnosticoPop.setPop(aplicaPop);
	}

	public DiagnosticoCondicionesExternas getDiagnosticoCondicionesExternas() {
		return diagnosticoCondicionesExternas;
	}

	public void setDiagnosticoCondicionesExternas(Boolean aplicanCondicionesExternas) {
		this.diagnosticoCondicionesExternas.setDiagnosticoCondicionesExternas(aplicanCondicionesExternas);
	}

	public void setDiagnosticoEsguince(DiagnosticoEsguince diagnosticoEsguince) {
		this.diagnosticoEsguince = diagnosticoEsguince;
	}
	
	public void setNecesitaResonanciaMagnetica(Boolean necesitaResonanciaMagnetica) {
		this.diagnosticoExploracionFisica.setNecesitaResonanciaMagnetica(necesitaResonanciaMagnetica);;
	}

	public void setNecesitaRadiografia(Boolean necesitaRadiografia) {
		this.diagnosticoExploracionFisica.setNecesitaRadiografia(necesitaRadiografia);
	}
	
	
}
