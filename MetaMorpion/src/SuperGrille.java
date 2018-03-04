
public class SuperGrille extends Grille{
	
	private MiniGrille[][] plateau = new MiniGrille[3][3];
	
	
	SuperGrille(){
		super();
		for(int i = 0; i > 3; i++){
			for(int j = 0; j > 3; j++){
				plateau[i][j] = new MiniGrille(i,j);
			}
		}
	}
}
