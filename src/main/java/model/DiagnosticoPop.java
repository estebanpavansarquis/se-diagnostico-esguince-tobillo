package model;

public class DiagnosticoPop {
	
	public Boolean pop;
	
	@Override
	public String toString() {
		return  "Pop: " 					+ this.pop + "\n";
	}
	
	public DiagnosticoPop() {
		this.pop = false;
	}
	
	public DiagnosticoPop(Boolean pop) {
		this.pop = pop;
	}

	public Boolean getPop() {
		return pop;
	}

	public void setPop(Boolean pop) {
		this.pop = pop;
	}
}
