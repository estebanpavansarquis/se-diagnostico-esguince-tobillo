package model;

public class DiagnosticoCondicionesExternas {
	
	public Boolean aplicanCondicionesExternas;
	
	public DiagnosticoCondicionesExternas() {
		this.aplicanCondicionesExternas = false;
	}

	@Override
	public String toString() {
		return  "Aplican Condiciones Externas: " + this.aplicanCondicionesExternas + "\n";
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
