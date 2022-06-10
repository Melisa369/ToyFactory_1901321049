package toyfactory.abstfactory;

public class FactoryProducer {
	
	public static AbstractToyFactory getFactory(String factoryName) {
		
		if(factoryName.equals("Играчка")) {
			return new ToyFactory();
		}
		
		System.out.println("Непозната работилница!");
		return null;

	}
}
