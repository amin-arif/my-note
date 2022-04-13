package iostreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileNote {
	public static void main(String[] args) {
		
		try {
			// create a file object for the current location
			File file = new File("src/iostreams/newFile.txt");
			
			// trying to create a file based on object
			boolean isCreated = file.createNewFile();
			
			if(isCreated) {
				System.out.println("File successfuly created");
			} else {
				System.out.println("The file already exists.");
			}
			
			char[] myFile = new char[100];
			String myText = "Make a simple person.";
			
			FileReader fileReader = new FileReader("src/iostreams/sample.txt"); // creates a file reader to reads a file
			FileWriter fileWriter = new FileWriter("src/iostreams/sampleOutput.txt"); // create a file writer object			
			
			fileReader.read(myFile); // read characters from file			
			System.out.println(myFile);			
			fileReader.close();
			
			fileWriter.write(myText); // write data to the file
			fileWriter.close();
			
			boolean isDeleted = file.delete(); // delete the file (src/iostreams/newFile.txt)
			
			if(isDeleted) {
				System.out.println("File is deleted.");
			} else {
				System.out.println("File is not exists.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
