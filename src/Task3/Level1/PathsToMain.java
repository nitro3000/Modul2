package Task3.Level1;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsToMain {
    public static void main(String[] args) throws IOException {
        PathsTo p = new PathsTo ( );

        Path absPath = Paths.get (".");
        System.out.print ("1. This is an Absolute Path to current directory : ");
        System.out.println (absPath.toAbsolutePath ());  //showing the Path to the current directory

        Path referencePath = Paths.get ("Task3.Level1.PathsTo");
        System.out.print ("1a. This is an Absolute Path to current directory : ");
        System.out.println (referencePath.toString ());  //showing the Path to the current directory

        System.out.print ("2. Check if file 'Go2IT.dat' exist : ");
        p.existanceOfFileSourse ( );
        System.out.print ("3. Check if file 'Go2ITnew.dat' exist : ");
        p.existanceOfFileDestination ( );
        System.out.println ("4. Copying and creating the file ");
        p.copyAndCreate ();

        System.out.print ("5. Check if file 'Go2ITnew2.dat' exist : "); //copy content to file
        p.existanceOfFileDestination2 ( );

        p.copyFileByStream ();


    }
}
