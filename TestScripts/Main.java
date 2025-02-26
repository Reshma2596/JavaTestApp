package Com.MyFirstJavaApp.TestScripts;

public class Main {

	public static void main(String[] args) {
		int age = 19;
		String message = null;
		if(age>18) {
			message = "you are eligible to apply voter id";
			
		}else {
			message = "you should wait until 18 years";
		}
System.out.println(message);
	}

}
