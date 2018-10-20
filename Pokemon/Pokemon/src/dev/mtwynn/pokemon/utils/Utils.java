package dev.mtwynn.pokemon.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Coded with help by CodeNMore
public class Utils {
	
	//converts a given text file into a string sequence
	public static String loadFileAsString(String path) {
		StringBuilder builder = new StringBuilder();
		
		try{
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line;
			while((line = br.readLine()) != null)
					builder.append(line + "\n");
			
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return builder.toString();
		
	}
	
	//returns the integer conversion of each String value in the text file
	public static int parseInt(String number) {
		try {
			return Integer.parseInt(number);
		}catch(NumberFormatException e) {
			e.printStackTrace();
			return 0;
		}
	}

}
