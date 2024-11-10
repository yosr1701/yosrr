package TdAbstract;

public abstract class compteur {
	public static final int MIN=0;
	protected int courant ;
	
	public compteur () {
		this.courant=MIN ;
	}
	
	public void raz ()
	{
		this.courant=0;
	}
	
	public abstract void incrementer ();
	
	public int getCourant() {
		return this.courant ;
	}
	
}
