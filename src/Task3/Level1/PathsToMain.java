package Task3.Level1;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsToMain {
    public static void main(String[] args) throws IOException {
        PathsTo p = new PathsTo ( );

        Path currentDir = Paths.get (".");
        System.out.print ("1. This is Path to current directory : ");
        System.out.println (currentDir.toAbsolutePath ( ));
        System.out.print ("2. Check if file 'Go2IT.dat' exist : ");

        p.existanceOfFileSourse ( );
        System.out.print ("3. Check if file 'Go2ITnew.dat' exist : ");
        p.existanceOfFileDestination ( );
        try {
            Files.copy (PathsTo.sourse, PathsTo.destination); //copy file

        } catch (FileAlreadyExistsException e) {
            System.out.println ("File 'Go2ITnew.dat' already exist(Deleting....)  ");
            Files.delete (PathsTo.destination);  // delete file (if exist Exception : 'FileAlreadyExistsException')
            Files.copy (PathsTo.sourse, PathsTo.destination);  // copy file again
        }
        System.out.print ("4. Check if file 'Go2ITnew2.dat' exist : "); //copy content to file
        p.existanceOfFileDestination2 ( );

        p.copyFileByStream ();


    }
}
