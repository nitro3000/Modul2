package Task3.Level2.Lecture;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {
    public static void main(String[] args) throws IOException {
        Path fileToRead = Paths.get ("C:\\Users\\Lenovo X220 Tablet\\IdeaProjects\\Modul2\\src\\Task3\\Level2\\Lecture\\dummyData");//FileReader reader = null;
        try (FileReader reader = new FileReader (fileToRead.toFile ( ));
             FileWriter writer = new FileWriter (Paths.get (fileToRead.getParent ( ).toString ( ), "dummyData.copy").toFile ( ))) {  // write to folder :fileToRead.getParent ().toFile ())  // Try   with resources
            System.out.println ("Successful start");

            int i;
            while ((i = reader.read ( )) != -1) {
                System.out.println (i);
                writer.write (i);
            }
            System.out.println ("Successful end");
//        } finally {
//
//            if (reader != null) {
//                reader.close ( );
//            }
        }
    }
}
