package Task1.MapInterface.Dictionary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DictionaryService {

//public  static Map<String,String> objects = new HashMap ();

    public Dictionary init() {

        Dictionary objects = new Dictionary ( );

        objects.map1Entry.put ("Save", "Сохранить");
        objects.map1Entry.put ("Remove", "Удалить");
        objects.map1Entry.put ("Cancel", "Отмена ");
        objects.map1Entry.put ("Create", "Создать");

        return objects;

    }


    public void display() {
        // generate the "iterator"
        Map<String, String> objects = new HashMap<>();
        Iterator iter = objects.entrySet ( ).iterator ( );
        //display elements
        while (iter.hasNext ( )) {
            Map.Entry i = (Map.Entry) iter.next ( );
            System.out.println (i.getKey ( ) + ":" + i.getValue ( ));
        }


    }

}
