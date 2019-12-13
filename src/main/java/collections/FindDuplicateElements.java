package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElements
{

    String[] languages =
    { "Java", "C", "JavaScript", "Python", "Java", "Angular" };

    // 1. COmpare each element O (nxn) ---Worst solution

    public void findDuplicates()
    {

        for (int i = 0; i < languages.length; i++)
        {
            for (int j = i + 1; j < languages.length; j++)
            {
                if (languages[i].equals(languages[j]))
                {
                    System.out.println("Found duplicate value of: " + languages[i]);
                }
                else
                {
                    System.out.println("No duplicates found");
                }
            }
        }
    }

    // 2. Using HashSet: Java Collection : it stores unique values
    public void findDuplicatesHashSetSolution()
    {
        Set<String> store = new HashSet<String>();
        for (String name : languages)
        {
            if (store.add(name) == true)
            {
                System.out.println(" element is: " + name);
            }
            else {
                System.out.println("duplicate element is: " + name);
            }
        }

    }

    // 3. Using HashMap java Collection

    public void findDuplicatesHashMapSolution()
    {
        HashMap<String, Integer>  hashMap = new HashMap<String, Integer>();
        for(String language : languages) {
            Integer  count = hashMap.get(language);
            if ( count == null ) {
                hashMap.put(language,1);
            }else {
                hashMap.put(language, ++count);
            }
        }
        
        //Retrieve the values from hashMap
        
        Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
        for(Entry<String,Integer> entry : entrySet) {
            if(entry.getValue() >1 ) {
                System.out.println("Duplicte eelemtn found : " + entry.getKey() );
            }
            
        }
        
    }

}
