package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapConcepts
{
    /*
     * HashMaps is class of Map interface. Extends AbstactMap. it contains only unique values . Store the values
     * key-value basis . it may one null key and multiple null values. it maintains no-order.
     */
    
    HashMap<Integer, String> hm = new HashMap<Integer, String>();
  
    public HashMap<Integer, String> getMapValues() {
        hm.put(1, "Selemium");
        hm.put(2, "QTP");
        hm.put(3, "Test");
        hm.put(4, "Automation");
        
        System.out.println(hm);
        for(Entry e : hm.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
        
        hm.remove(2);
        System.out.println(hm);
        return hm;
    }
}
