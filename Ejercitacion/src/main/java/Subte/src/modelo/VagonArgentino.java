package Subte.src.modelo;

public class VagonArgentino extends Vagon{

	public VagonArgentino() {
		super(25);
	}
	
	@Override
	public boolean sosArgentino() {
		return true;
	}
	
	public boolean somosCompatibles(Vagon vagon) {
		return vagon.sosArgentino();
	}

}
