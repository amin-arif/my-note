import java.io.*;

public class IO {
	public static void main(String[] args) throws IOException {

		FileInputStream sourceFile = null;
		FileOutputStream destinationFile = null;

		try {
			sourceFile = new FileInputStream("test.txt");
			destinationFile = new FileOutputStream("outTest.txt");

			int temp;

			while ((temp = sourceFile.read()) != -1) {
				destinationFile.write((byte) temp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sourceFile != null)
				sourceFile.close();

			if (destinationFile != null)
				destinationFile.close();
		}
	}
}
