
import java.io.*;

/**
 *
 * @author kan
 */
public class FileHandlingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        // TODO code application logic here

        final String FILE_NAME = "./sample.txt";

        File file = new File(FILE_NAME);
        System.out.println("File \"" + file.getName() + "\" does " + (file.exists() ? "exists" : "not exists"));
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File Created");
        }

        //File Reader
        FileReader fileReader = new FileReader(FILE_NAME);
        int i;
        String fileData = "";
        i = fileReader.read();
        while (i != -1) {
            fileData += (char) i;
            i = fileReader.read();
        }
        System.out.println("File Data:\n"+fileData);

        //File Writer
        FileWriter fileWriter = new FileWriter(FILE_NAME);

        fileWriter.write("//Created By Code\n" + fileData);
        fileWriter.close();
        System.out.println("File Updated");
    }

}
