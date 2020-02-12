package Task1.MapInterface.Dictionary;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DictionaryMap {

    public Map<String, String> map = new HashMap ( );

    public Map<String, String> init() {

        map.put ("Save", "Сохранить");
        map.put ("Remove", "Удалить");
        map.put ("Cancel", "Отмена ");
        map.put ("Create", "Создать");
        return map;
    }

    public void display() {
        // generate the "iterator"
        Iterator iter = map.entrySet ( ).iterator ( );
        //display elements
        while (iter.hasNext ( )) {
            Map.Entry entry = (Map.Entry) iter.next ( );
            System.out.println (entry.getKey ( ) + ":" + entry.getValue ( ));
        }
    }

    public static void main(String[] args) {
        DictionaryMap service2 = new DictionaryMap ( );
        service2.init ( );
        service2.display ( );
        System.out.println ( );
    }
    //Scanner input=new Scanner ()
}