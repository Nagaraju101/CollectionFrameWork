package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapConcepts
{
    /*
     * HashMaps is class of Map interface. Extends AbstactMap. it contains only unique values . Store the values
     * key-value basis . it may one null key and multiple null values. it maintains no-order. HashMap is non
     * synchronized -- not thread safe.  Concurrent modification exception --Fail --Fast condition
     */

    HashMap<Integer, String> hm = new HashMap<Integer, String>();
    HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

    public HashMap<Integer, String> getMapValues()
    {
        
        hm.put(1, "Selemium");
        hm.put(2, "QTP");
        hm.put(3, "Test");
        hm.put(4, "Automation");

        System.out.println(hm);
        for (Entry e : hm.entrySet())
        {
            System.out.println(e.getKey() + ":" + e.getValue());
        }

        hm.remove(2);
        System.out.println(hm);
        return hm;
    }

    public void getEmployeeObject()
    {
        Employee emp1 = new Employee("Naga", 37, "QA");
        Employee emp2 = new Employee("Raju", 37, "Data Engineer");
        Employee emp3 = new Employee("sanju", 31, "Admin");

        emp.put(1, emp1);
        emp.put(2, emp2);
        emp.put(3, emp3);

        for (Entry<Integer, Employee> m : emp.entrySet())
        {
            int key = m.getKey();
            Employee e = m.getValue();
            System.out.println("Employee:" + key + "--Info--");

            System.out.println(e.name + " " + e.age + " " + e.dept);

        }
    }
}
