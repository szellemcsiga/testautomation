import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    public String readFile(String fileName) {
        String writtenText = "";
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                writtenText += line + "\n";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return writtenText.toString();
    }

}
