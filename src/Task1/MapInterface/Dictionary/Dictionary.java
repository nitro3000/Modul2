package Task1.MapInterface.Dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    public Map<String, String> map1Entry;

    public Dictionary() {
        this.map1Entry = new HashMap<> ( );
    }



    @Override
    public String toString() {
        return "Dictionary{" +
                "map1Entry=" + map1Entry +
                '}';
    }
}


