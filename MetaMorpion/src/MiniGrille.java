
public class MiniGrille extends Grille{

	private Cellule[][] plateau;
	private int x,y;

	MiniGrille(int i1, int i2)
	{
		super();
		this.x = i1;
		this.y = i2;
		
		plateau = new Cellule[3][3];
		
		for(int i = 0; i < 3; i++){
			for(int	j = 0; j < 3; j++){
				this.plateau[i][j] = new Cellule(i*this.x,j*this.y);
			}
		}
	}
	
	public Cellule[][] getPlateau()
	{
		return this.plateau;
	}
	
	
	public Cellule getCellule(int x, int y)
	{
		int xRetour = x, yRetour = y;
		
		if(x<0){
			xRetour = 0;
		}else if(x>2){
			xRetour = 2;
		}
		
		if(y<0){
			yRetour = 0;
		}else if(y>2){
			yRetour = 2;
		}
		
		return this.plateau[xRetour][yRetour];
	}
	
	public void estGagnee()
	{
		int i, j;
		for(j = 0; j < 3; j++){
			
		}
	}
	
}






