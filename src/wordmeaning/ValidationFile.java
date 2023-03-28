package wordmeaning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class ValidationFile {
	public static void main(String args[]) throws FileNotFoundException {
		doesFileexist();
	}
public static void doesFileexist() throws FileNotFoundException {
   
	 
	
	File f = new File("src/file.txt");
	Scanner input = new Scanner(f);
	
	if(f.exists()){
	    System.out.println("File exist");
	}
	else{
	    System.out.println("File doesnot exist");
	}
	while (input.hasNextLine()) {
		  System.out.println(input.nextLine());
		}
	
    
}}
