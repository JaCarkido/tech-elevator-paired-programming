package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		int counterWords = 0;
		int counterSentence = 0;
		File smallPoem = new File("alices_adventures_in_wonderland.txt");
		try {
			Scanner keyboard = new Scanner(smallPoem);
			
			while(keyboard.hasNextLine()) {
				String line = keyboard.nextLine();
				line = line.replaceAll("  ", " ");
				String[] words = line.split(" ");
				for (String word : words) {
					if (word.equals("")) {
						counterWords--;
						
					}
					if (word.contains("?") || word.contains(".") || word.contains("!")) {
					counterSentence++;
				
				}
			}
				counterWords += words.length;
			}
			System.out.println(counterWords);
			System.out.println(counterSentence);
		}catch (FileNotFoundException e) {
			
		}
	}

}
