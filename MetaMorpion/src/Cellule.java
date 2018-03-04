public class Cellule {

	private boolean[] etat = new boolean[3];
	private int larg,haut; //dimension
	private int x,y; //coordonnées
	
	Cellule(int nouveauX, int nouveauY)
	{
		this.larg = Constantes.TAILLE_CELLULE;
		this.haut = Constantes.TAILLE_CELLULE;
		this.x = nouveauX;
		this.y = nouveauY;
		this.etat[0] = true;
		this.etat[1] = false;
		this.etat[2] = false;
	}
	
	public boolean isVide()
	{
		return this.etat[0];
	}
	
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public void cochee(int i)
	{
		//Verification de la valeur
		if(i<1){
			i=1;
		}else if(i>2){
			i=2;
		}
		
		//Changement de la valeur si la condition est verifiee.
		if(this.isVide()){
			this.etat[0] = false;
			this.etat[i] = true;
		}
	}
	
}
