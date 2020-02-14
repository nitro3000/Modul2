package Task3.Level1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsTo {



    public static Path sourse = Paths.get ("C:\\Users\\Lenovo X220 Tablet\\IdeaProjects\\Go2IT.dat.txt");
    public static Path destination = Paths.get ("C:\\Users\\Lenovo X220 Tablet\\Desktop\\Go2ITnew.dat.txt");
    public static Path destination2 = Paths.get ("C:\\Users\\Lenovo X220 Tablet\\Desktop\\Go2ITnew2.dat.txt");

    public void existanceOfFileSourse() {
        if (Files.exists (sourse)) {
            System.out.println ("The file Exist" );
        }else {
            System.out.println ("The file does not exist" );
        }
    }
    public void existanceOfFileDestination() {
        if (Files.exists (destination)) {
            System.out.println ("The file Exist" );
        }else {
            System.out.println ("The file does not exist" );
        }
    }
    public void existanceOfFileDestination2() {
        if (Files.exists (destination2)) {
            System.out.println ("The file Exist" );
        }else {
            System.out.println ("The file does not exist" );
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
