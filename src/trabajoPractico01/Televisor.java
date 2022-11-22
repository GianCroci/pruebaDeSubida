package trabajoPractico01;

public class Televisor {

	int canal;
	int canalAnterior;
	
	public Televisor() {
		canal = 0;
		canalAnterior = 0;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
		int canalAux;
		canalAux = this.canal;
//		this.canal = this.canalAnterior;
		this.canalAnterior = canalAux;
		
	}
	public int getCanal() {
		return canal;
	}
	public void volverAlCanalAnterior() {
		int canalAux;
		canalAux = this.canal;
//		this.canal = this.canalAnterior;
		this.canalAnterior = canalAux;
	}
	public int getCanalAnterior() {
		return canalAnterior;
	}
}
