package com.lockedme;

import java.util.Scanner;

public class HandleOptions {
		public static void handleWelcomeScreenInput() {
			boolean running = true;
			Scanner sc = new Scanner(System.in);
			do {
				try {
					MenuOptions.displayMenu();
					int input = sc.nextInt();

					switch (input) {
					case 1:
						FileOperations.displayAllFiles("main");
						break;
					case 2:
						HandleOptions.handleFileMenuOptions();
						break;
					case 3:
						System.out.println("Program exited successfully.");
						running = false;
						sc.close();
						System.exit(0);
						break;
					default:
						System.out.println("Please select a valid option from above.");
					}
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					handleWelcomeScreenInput();
				} 
			} while (running == true);
			
		}

		private static void handleFileMenuOptions() {
			// TODO Auto-generated method stub
			
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
