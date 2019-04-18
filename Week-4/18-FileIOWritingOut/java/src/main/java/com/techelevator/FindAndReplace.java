package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {
	
	// we need to add a request and variable to store a replacement word from the user
	// we need to replace the word 
	// we need to create and write to a new file within this directory
		//we may need to initialize a string which will hold the entire document and  we can += lineChanged + "\n" into to get same lines returned
	
	

	public static void main(String[] args) {
		 
		
		File inputFile =  getInputFileFromUser();
		
		Scanner userStringInput = new Scanner(System.in);
		
		System.out.println("Please enter a name to save the new file in (remember no spaces and make sure it is a .txt file).");
		String copiedFile = userStringInput.nextLine();
		
		System.out.println("Type the word you would like to find: ");
		String stringToSearch = userStringInput.nextLine();
		
		System.out.println("What word would you like as the replacement?");
		String replacementWord = userStringInput.nextLine();
		
		File newFile = new File(copiedFile);
		
		try {
			Scanner fileScanner = new Scanner(inputFile);
			PrintWriter writer = new PrintWriter(copiedFile);
			
				while(fileScanner.hasNextLine()) {
					String line = fileScanner.nextLine();
					
					if(line.contains(stringToSearch)) {
						line = line.replace(stringToSearch, replacementWord);
						
					}
					writer.println(line);
					
					
				}		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
		
		

	} // main(string[] args)


//method to get file location from the user
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter the path to a file: ");
		String filePath = userInput.nextLine();
		File inputFile = new File(filePath);
	
		if(!inputFile.exists()) {
			System.out.println("File does not exist.");
			System.exit(1);
		}	
		else if(!inputFile.isFile()) {
			System.out.println(filePath + " is not a file");
			System.exit(1);
		}
		return inputFile;
		
		
	}// getInPutFileFromUser() Close

} //Class Body