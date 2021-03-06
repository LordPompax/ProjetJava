import java.util.ArrayList;

public class Tour extends Piece implements InterTour{
	public Tour(int couleur){
		super(couleur);
		//this.setTest(this.getNom());
		//this.test = "0";
	}

	public String getNom(){
		return this.nom;
	}
	public String getSymbole(){
		return (this.couleur == 0) ? this.symboleB : this.symboleN; // si la couleur == 0 (si elle est blanche) alors retourne symboleB (picece de couleur blanche) sinon retourne symboleN (picece de couleur noire)
	}
	public int getNumPiece(){
		return this.numPiece;
	}
	public int getPts(){
		return this.pts;
	}
	public String getImage(){
		return (this.couleur == 0) ? this.imageB : this.imageN; // si la couleur == 0 (si elle est blanche) alors retourne symboleB (picece de couleur blanche) sinon retourne symboleN (picece de couleur noire)
	}
}