import java.util.ArrayList;

public class DominoPlayer {


private ArrayList<Domino> playerhand = new ArrayList<Domino>();
private int score = 0;

public DominoPlayer(ArrayList<Domino> dhand) {

playerhand = dhand;
}

//returns playerdomino @ arrayposition
public Domino getdominos(int i) {
	
	return playerhand.get(i);
}

//removes domino from playerhand
public void Dremove(Domino o) {
	playerhand.remove(o);
}

// get how many dominoes there are
public int getdominoamount() {
	return playerhand.size();
}
//get score
public int getScore() {
	return score;
}
// update playerscore
public void updatescore(int i) {
	score = score + i;
}

//test playerhand info
public void printplayerhand() {
	for(int i = 0; i < 7; i++) {
		System.out.println("("+getdominos(i).getleft()+","+getdominos(i).getright()+")"+" -"+getdominos(i).getname());
	}
}

}

