package toyfactory.abstfactory;

public class ToyFactory extends AbstractToyFactory {

	@Override
	public Toys getToys(String toyName) {
		if(toyName.equals("������")) {
			return new Bikes();
		}
		
		if(toyName == "�����") {
			return new Dolls();
		}
		System.out.println("�������� �����!");
		return null;
	}



}
