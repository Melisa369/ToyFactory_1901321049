package toyfactory.abstfactory;

public class FactoryProducer {
	
	public static AbstractToyFactory getFactory(String factoryName) {
		
		if(factoryName.equals("�������")) {
			return new ToyFactory();
		}
		
		System.out.println("��������� �����������!");
		return null;

	}
}
