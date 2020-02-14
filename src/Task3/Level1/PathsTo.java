package Task3.Level1;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsTo {



    public static Path source = Paths.get ("C:\\Users\\Lenovo X220 Tablet\\IdeaProjects\\Go2IT.dat.txt"); // manualy created file in folder
    public static Path destination = Paths.get ("C:\\Users\\Lenovo X220 Tablet\\Desktop\\Go2ITnew.dat.txt");
    public static Path destination2 = Paths.get ("C:\\Users\\Lenovo X220 Tablet\\Desktop\\Go2ITnew2.dat.txt");

    public void existanceOfFileSourse() {  // checking if file exist at source folder
        if (Files.exists (source)) {
            System.out.println ("The file Exist" );
        }else {
            System.out.println ("The file does not exist" );
        }
    }
    public void existanceOfFileDestination() {  // checking if file exist at destination folder
        if (Files.exists (destination)) {
            System.out.println ("The file Exist" );
        }else {
            System.out.println ("The file does not exist" );
        }
    }
    public void existanceOfFileDestination2() {  // checking if file exist at second destination  folder
        if (Files.exists (destination2)) {
            System.out.println ("The file Exist" );
        }else {
            System.out.println ("The file does not exist" );
        }
    }
    public void copyAndCreate () throws IOException {
        try {
            Files.copy (PathsTo.source, PathsTo.destination); //copy file from 'source' to 'destination' simultaneously creating file if not exist.
//todo: refactoring of method to if else block
        } catch (FileAlreadyExistsException e) { // in case file already exist will delete it an recreate it again
            System.out.println ("   File 'Go2ITnew.dat' already exist(Deleting....)  ");
            Files.delete (PathsTo.destination);  // delete file (if exist Exception : 'FileAlreadyExistsException')
            Files.copy (PathsTo.source, PathsTo.destination);  // copy file again
        }
    }

    public void copyFileByStream ()throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream ("C:\\Users\\Lenovo X220 Tablet\\Desktop\\Go2ITnew.dat.txt");
            out = new FileOutputStream ("Go2IT.abc");
            int c;

            while ((c = in.read ( )) != -1) {
                System.out.println (c);
                out.write (c);
            }

        } finally {
            if (in!=null) in.close ();
            if (out!=null) out.close ();
        }
    }
}
