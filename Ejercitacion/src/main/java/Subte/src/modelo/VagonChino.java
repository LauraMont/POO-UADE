package Subte.src.modelo;

public class VagonChino extends Vagon{

	public VagonChino() {
		super(20);
	}

	public boolean sosChino() {
		return true;
	}
	
	public boolean somosCompatibles(Vagon vagon) {
		return vagon.sosChino();
	}
	
}
