package write_read_object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainApplication {
	
	private static final String filePath = "/home/ruhul/Documents/my-note/java/write-read-object/src/objFile.txt";
	
	private void writeObjectToFile(Object obj) {
		try {
			FileOutputStream fileOutput = new FileOutputStream(filePath);
			ObjectOutputStream objOutput = new ObjectOutputStream(fileOutput);
			
			// Write object into file
			objOutput.writeObject(obj);
			objOutput.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private Object readObjectFromFile() {
		try {
			FileInputStream fileInput = new FileInputStream(filePath);
			ObjectInputStream objInput = new ObjectInputStream(fileInput);
			
			// Read object from file
			Object finalObj = objInput.readObject();
			objInput.close();
			
			return finalObj;
			
		} catch (Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}
	
	public static void main(String[] args) {	
		
		MainApplication mainObj = new MainApplication();
		
		/*--- Write object to file ---*/
		Employee empWrite = new Employee("Arif", "Male", 25);
		mainObj.writeObjectToFile(empWrite);
		
		/*--- Read object from file ---*/
		Employee empRead = (Employee) mainObj.readObjectFromFile();
		System.out.println(empRead);
		
		// direct output from Employee
		// System.out.println(emp.toString());
	}
}
