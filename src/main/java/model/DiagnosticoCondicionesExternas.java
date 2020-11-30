package model;

public class DiagnosticoCondicionesExternas {
	
	public Boolean aplicanCondicionesExternas;

	@Override
	public String toString() {
		return  "Aplican Condiciones Externas: " + this.aplicanCondicionesExternas + "\n";
	}
	
	public DiagnosticoCondicionesExternas() {
		this.aplicanCondicionesExternas = false;
	}
	
	public DiagnosticoCondicionesExternas(Boolean pop) {
		this.aplicanCondicionesExternas = pop;
	}

	public Boolean getDiagnosticoCondicionesExternas() {
		return aplicanCondicionesExternas;
	}

	public void setDiagnosticoCondicionesExternas(Boolean aplicanCondicionesExternas) {
		this.aplicanCondicionesExternas = aplicanCondicionesExternas;
	}

}
