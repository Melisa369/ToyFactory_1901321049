package toyfactory.observer;

public class SubjectSubscriber implements Observer {

	private String name;
	private Observable subject;

	public SubjectSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.subject == null) {
			System.out.println("���� ������� �������!");
			return;
		}
		String lastSubject = this.subject.getUpdate();
		System.out.println(this.name + " ��������: " + lastSubject);
	}

	@Override
	public void setSubject(Observable subject) {
		this.subject = subject;
	}
}
