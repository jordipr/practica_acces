
public class cGestorInternNumeric {
	
	private int[] aElements;
	private int aMidaMaxima;
	private int aMida;
	
	public cGestorInternNumeric(int pMidaMaxima) {
		
		
		this.aMidaMaxima = pMidaMaxima;
		this.aElements = new int [aMidaMaxima];
		this.aMida= 0;
		
		
		for (int i = 0; i < this.aElements.length; i++){
			
			this.aElements[i] = -1;
			
			
		}
		
		
	}
	
	
	

	
	
	
	public void fInserirElement(int pPosicion,int pValor) {
		
		
		for (int i = 0; i < this.aElements.length; i++){
		
		     if(this.aElements[i] == -1) { 
			this.aElements[pPosicion]=pValor;
			
			this.aMida++;
			
		}
		
	}
	
	}
	
	public void fEliminarElement(int pPosicion) {
		for (int i = 0; i < this.aElements.length; i++){
		if(this.aElements[i] != -1) {
			
			this.aElements[pPosicion] = -1;
			
			this.aMida--;
		}
		
		}
	}
	
	public void fConsultarElement( int pPosicion){
		
		
			
		for (int i = 0; i < this.aElements.length; i++){
			
			if(pPosicion == i) {
			
			System.out.println(this.aElements[i]);
			
			}
		}
		
		
	}
	
	public void fConsultarMidaMaxima() {
		
		System.out.println(this.aMidaMaxima);
		
		
		
	}
	
	public void fConsultarMida() {
		
		
		System.out.println(this.aMida);
		
	}
		
	
	public void Mostrar() {
	
		for (int i = 0; i < this.aElements.length; i++){
			
			System.out.println(this.aElements[i]);
		}
		
	}
}
