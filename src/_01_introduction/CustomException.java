package _01_introduction;

public class CustomException extends Exception {
	void terminate() {
		System.out.println("exit");
		System.exit(0);
	}
}
