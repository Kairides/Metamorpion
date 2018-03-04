
public class Grille {
	
	private boolean[] etat = new boolean[3];
	
	Grille()
	{
		this.etat[0] = true;
		this.etat[1] = false;
		this.etat[2] = false;
	}

	public boolean estVide()
	{
		return this.etat[0];
	}
		
	
}
