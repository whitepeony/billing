package water.billing.mainframe;

import java.util.ArrayList;

public class Test {
	String message;
	int noOfMessages;
	ArrayList<String> myMessageSaved;
	
	public Test(int noOfMsg, String myMsg) {
		noOfMessages = noOfMsg;
		message = myMsg;
		myMessageSaved = new ArrayList<String>();
	}
	
	public void addMessages() {
		for(int i=1; i <= noOfMessages; i++) 
			myMessageSaved.add(message + " " + i);
	}
	
	public void printMessages() {
		for(String message:myMessageSaved) System.out.println(message);
	}
	public static void main(String[] input) {
		Test myTest = new Test(10, "Me llamo ");
		myTest.addMessages();
		myTest.printMessages();
	}

}
