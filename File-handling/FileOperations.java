
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			// creating a file
			
		File file = new File("students.txt");                             // create the file
		if(file.createNewFile()) {
			System.out.println("file is created successfully. ");
		}
		else {
			System.out.println("file already exists. ");
		}
		
		// writing the data into a file
		
		FileWriter writer = new FileWriter("students.txt");             // It writes data to a file.  filewriter can also create the file if it does not exist. 
		writer.write("i am Tejashwini");
		writer.close();        // closing is important
		System.out.println("Data written successfully.");
		
		//reading the file content
		
		FileReader reader = new FileReader("students.txt");             // reads data from a file one character at a time.
		int ch;
		while((ch = reader.read()) != -1) {
			System.out.print((char) ch);
		}
		reader.close();
		
		
		// writes data more efficiently using bufferedwriter
		
		BufferedWriter bwriter = new BufferedWriter(new FileWriter("students.txt"));
		bwriter.write("JAVA\n");
		bwriter.write("SQL\n");
		bwriter.write("LEETCODE\n");
		bwriter.close();
		System.out.println("\nstored successfully");

		// reads data line by line. It is much faster than FileReader.

		BufferedReader breader =
                new BufferedReader(
                        new FileReader("students.txt"));

        String line;

        while ((line = breader.readLine()) != null) {

            System.out.println(line);
        }

        reader.close();
		
		}catch(IOException e) {                                          // Input output exception
			System.out.println("An error occurred. ");                    // System.out.println("An error occurred. ");
		}
	}

}


// catch block will execute


// try {

//    BufferedReader reader =
//       new BufferedReader(
//            new FileReader("abc.txt"));

//    String line;

//    while ((line = reader.readLine()) != null) {
//        System.out.println(line);
//    }

//    reader.close();
// }

// catch (IOException e) {

//    System.out.println("File not found or cannot be read.");
// }
