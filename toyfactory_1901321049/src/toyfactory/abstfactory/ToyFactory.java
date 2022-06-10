package toyfactory.abstfactory;

public class ToyFactory extends AbstractToyFactory {

	@Override
	public Toys getToys(String toyName) {
		if(toyName.equals("Колела")) {
			return new Bikes();
		}
		
		if(toyName == "Кукли") {
			return new Dolls();
		}
		System.out.println("Непознат обект!");
		return null;
	}



}
