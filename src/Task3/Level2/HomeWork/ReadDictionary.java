package Task3.Level2.HomeWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReadDictionary {
    //  only read from file as data, not organize it in Map back.
    public void readFromFile1() throws IOException {
        FileReader reader = new FileReader ("C:\\Users\\Lenovo X220 Tablet\\IdeaProjects\\Modul2\\src\\Task3\\Level2\\HomeWork\\Dictionary");
        int data;
        while ((data = reader.read ( )) != -1) {
            System.out.print ((char) data);
        }
    }
// ++++++++++++ method to read from file and organize it in Map

    public void readFromFile2() {
        // creation of a MAP 'dictionaryMap'
        Map<String, String> dictionaryMap = new HashMap<> ( );
        Map<String, String> dictionaryMap2 = new HashMap<> ( );
        // wrapping of a FileReader in to BufferedReader
        try (BufferedReader fileReader = new BufferedReader (new FileReader ("C:\\Users\\Lenovo X220 Tablet\\IdeaProjects\\Modul2\\src\\Task3\\Level2\\HomeWork\\Dictionary"))) {
            String data;
            String[] array;

            while ((data = fileReader.readLine ( )) != null) {

                array = data.split (",", 5);// read by line till 'regex' then start to read next line. again read till 'regex' then next line. And like this 'limit' times
                dictionaryMap.put (array[1], array[2]);

                array = data.split (",", 5);// read by line till 'regex' then start to read next line. again read till 'regex' then next line. And like this 'limit' times
                dictionaryMap2.put (array[0], array[1]);
            }
        } catch (IOException e) {
            e.printStackTrace ( );
        }

        Iterator iter = dictionaryMap.entrySet ( ).iterator ( );
        while (iter.hasNext ( )) {
            Map.Entry i = (Map.Entry) iter.next ( );
            System.out.println (i.getKey ( ) + ":" + i.getValue ( ));
        }
        Iterator iter2 = dictionaryMap2.entrySet ( ).iterator ( );
        while (iter2.hasNext ( )) {
            Map.Entry i = (Map.Entry) iter2.next ( );
            System.out.println (i.getKey ( ) + ":" + i.getValue ( ));
        }
    }


    public static void main(String[] args) {
        ReadDictionary readObj = new ReadDictionary ( );
        //readObj.readFromFile1 ();
        readObj.readFromFile2 ( );


    }

}
