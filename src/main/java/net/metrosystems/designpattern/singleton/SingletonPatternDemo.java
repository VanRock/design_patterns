package net.metrosystems.designpattern.singleton;

public class SingletonPatternDemo {
	public static void main(String[] args) {

		// illegal consturct
		// Complie Time Error: The constructor SingleObject() is not visible
		// SingleObject ob = new SingleObject();
		
		//Get only object available
		SingleObject object = SingleObject.getInstance();
		
		//show the message
		object.showMessage();
	}
}
