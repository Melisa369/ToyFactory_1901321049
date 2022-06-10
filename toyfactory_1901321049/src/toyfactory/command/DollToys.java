package toyfactory.command;

public class DollToys implements Command {

private Dolls dolls;
	
	public DollToys(Dolls dolls) {
		this.dolls = dolls;
	}

	@Override
	public void execute() {
		this.dolls.makeDolls();
	}
}
