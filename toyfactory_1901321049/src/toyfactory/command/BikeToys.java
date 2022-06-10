package toyfactory.command;

public class BikeToys implements Command  {
	
	private Bikes bikes;
	
	public BikeToys(Bikes bikes) {
		this.bikes = bikes;
	}

	@Override
	public void execute() {
		this.bikes.makeBikes();
	}

}
