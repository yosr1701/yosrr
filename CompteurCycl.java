package TdAbstract;

public class CompteurCycl extends compteur {
	private static final int MAX=4 ;
	
	public void incrementer() {
		if (this.courant <MAX)
		{ this.courant ++ ;}
		else 
		{ this.courant = MIN ;}
	}

}
