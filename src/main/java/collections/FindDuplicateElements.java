package collections;

import java.util.HashSet;
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
    public void findDuplicatesSecondSolution()
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

}
