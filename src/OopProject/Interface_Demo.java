package OopProject;

public class Interface_Demo {

	public static void main(String args[]){
//Since we can not create instance of interface Remote i.e. new Remote;Invalid
		Remote remote=new television();
		remote.powerDown();
		remote.powerOn();
		remote.volumeDown();
		remote.volumeUp();
	}
}

interface Remote{

	abstract public void volumeUp();
	//'abstract public' is actually redundant code here as it is be default so it can be removed
	void volumeDown();
	void powerDown();
	void powerOn();
}
class television implements Remote{

//IntelliJ IDEA has overridden all abstract methods for us
	@Override
	public void volumeUp() {
		System.out.println("Volume Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("Volume Down");
	}

	@Override
	public void powerDown() {
		System.out.println("Power Down");
	}

	@Override
	public void powerOn() {
		System.out.println("Power On");
	}
}
//So interface can be defined as a medium for the object to interact with outside world