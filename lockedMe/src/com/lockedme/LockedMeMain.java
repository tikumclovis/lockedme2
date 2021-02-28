package com.lockedme;

public class LockedMeMain {

	public static void main(String[] args) {
		
		//main folder where my application start and end 
				FileOperations.createMainFolderIfNotPresent("main");
				
				String appName;
				MenuOptions.printWelcomeScreen("LockedMe", "Clovis");				
				HandleOptions.handleWelcomeScreenInput();
	
	}

}
