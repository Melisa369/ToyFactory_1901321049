package toyfactory;

import toyfactory.Singleton.Singleton;
import toyfactory.abstfactory.AbstractToyFactory;
import toyfactory.command.Bikes;
import toyfactory.command.Dolls;
import toyfactory.abstfactory.FactoryProducer;
import toyfactory.abstfactory.Toys;
import toyfactory.command.BikeToys;
import toyfactory.command.Command;
import toyfactory.command.DollToys;
import toyfactory.command.RemoteController;
import toyfactory.observer.Observer;
import toyfactory.observer.Subject;
import toyfactory.observer.SubjectSubscriber;

public class MainFactory {

	public static void main(String[] args) {
		
		Singleton connection = Singleton.getInstance();
		AbstractToyFactory toyFactory = FactoryProducer.getFactory("Играчка");
		
		

		Bikes bikes = new Bikes();
		Dolls dolls = new Dolls();
		Command bikeToys = new BikeToys(bikes);
		Command dollToys = new DollToys(dolls);
		RemoteController remote = new RemoteController();
		
		Subject subject = new Subject();
		Observer obs1 = new SubjectSubscriber("Джудже_1");
		Observer obs2 = new SubjectSubscriber("Джудже_2");
		Observer obs3 = new SubjectSubscriber("Джудже_3");
		
		
		connection.postMessage("Искам колела!");
	
		
		subject.subscribe(obs1);
		subject.setSubject("Добре, Дядо Коледа!");
		subject.unsubscribe(obs1);
		
		subject.subscribe(obs2);
		subject.setSubject("Почваме да изработваме!");
		subject.unsubscribe(obs2);
		
		subject.subscribe(obs3);
		subject.setSubject("Почти сме готови :)!");
		subject.unsubscribe(obs3);
		
		remote.setCommand(bikeToys);
		remote.pressButton();
	
		Toys bike = toyFactory.getToys("Колела");
		bike.create();
		
		System.out.println("");
		
		
		connection.postMessage("Искам кукли!");
		
		
		subject.subscribe(obs1);
		subject.setSubject("Добре, Дядо Коледа!");
		subject.unsubscribe(obs1);
		
		subject.subscribe(obs2);
		subject.setSubject("Почваме да изработваме!");
		subject.unsubscribe(obs2);
		
		subject.subscribe(obs3);
		subject.setSubject("Почти сме готови :)!");
		subject.unsubscribe(obs3);
		
		remote.setCommand(dollToys);
		remote.pressButton();

		Toys doll = toyFactory.getToys("Кукли");
		doll.create();
		
		
	}

}
