import java.util.ArrayList;
import java.util.Random;

public class DominoNumber {
public ArrayList<Domino> domino = new ArrayList<Domino>();
public ArrayList<Integer> randomization = new ArrayList<>();

//stores Dominonumber
public void storeDominoNumber() {
int a = 6;
String n = "D";
int f = 1;
Domino lets;
	for(int i = 6; i >= 0; i--) {
	
		for(int j = a; j >= 0; j-- ) {
		lets = new Domino(i,j,n+" "+f);
		domino.add(lets);
		f++;
		}
		a--;
	}
	
}

// randomization prep
public void rando() 
	{
 for(int i = 0; i < 28; i++)
 {
	 randomization.add(i);
 }

	}



//returns random 7 dominos
public ArrayList<Domino> getrando(){
	ArrayList<Domino> returnset = new ArrayList<Domino>();
	for (int i = 0; i < 7; i++) {
		Random rannum = new Random();
		int f = randomization.size();
		int rand = rannum.nextInt(f);
		returnset.add(domino.get(randomization.get(rand)));
		randomization.remove(rand);
	}
	return returnset;
}



//test dominonumber information
public void testDomNum() {
	for(int i = 0; i < 28; i++) {
		System.out.println("("+domino.get(i).getleft()+","+domino.get(i).getright()+")"+" -"+domino.get(i).getname());
	}
}

}
