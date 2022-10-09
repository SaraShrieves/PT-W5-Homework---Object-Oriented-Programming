package main;

public class App {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		logger.log("Hey there");
		System.out.println();
		logger.error("What's up");
		System.out.println();
		
		
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.log("Hello");
		System.out.println();
		System.out.println();
		spacedLogger.error("Cool");
		System.out.println();
		
	}
	
	
}
