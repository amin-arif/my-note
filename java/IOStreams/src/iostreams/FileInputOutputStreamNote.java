package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputStreamNote {
	public static void main(String[] args) {	
		
		// FileInputStream block
		byte[] value = new byte[150];
		
		try {
			FileInputStream input = new FileInputStream("src/iostreams/sample.txt");
			FileInputStream input2 = new FileInputStream("src/iostreams/sample.txt");		
					
			System.out.println("Available bytes in the file: " + input.available()); // how many text was written in text file		
			input.read(value); // read data from input stream (file)	 
			System.out.println("After String conversion: "+ new String(value)); // byte array to string conversion
					
			input2.skip(6); // skip byte (here skips first 6 bytes)					 
			int byteValue = input2.read(); // reads the first byte
			System.out.print("Print byte by byte (After skip): ");
			
			while(byteValue != -1) {
				System.out.print((char) byteValue);
				
				// reads next byte from the file
				byteValue = input2.read();
			}	
			
			// close input stream
			input.close();
			input2.close();	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// FileOutputStream block
		String data = "Welcome to Bangladesh!";
		
		try {
			FileOutputStream output = new FileOutputStream("src/iostreams/sampleOutput.txt"); // New data overwrites existing data
			FileOutputStream output2 = new FileOutputStream("src/iostreams/sampleOutput2.txt", true); // New data appended after existing data
			
			byte[] bytesValue = data.getBytes(); // string to byte conversion
			
			output.write(bytesValue); // write into the file
			output2.write(bytesValue);
			
			
			// close output stream
			output.close();
			output2.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
