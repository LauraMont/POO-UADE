package Subte.src.modelo;

public class VagonAleman extends Vagon{
	
	public VagonAleman() {
		super(30);
	}
	
	public boolean sosAleman() {
		return true;
	}
	
	public boolean somosCompatibles(Vagon vagon) {
		return vagon.sosAleman();
	}

}
