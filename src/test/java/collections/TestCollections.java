package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollections
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Naga", 37, "QA");
        Employee emp2 = new Employee("Raju", 37, "Data Engineer");
        Employee emp3 = new Employee("Pratap", 32, "Admin");
        MapConcepts mapConcepts = new MapConcepts();

        ArrayList<Employee> er4 = new ArrayList<Employee>();

        er4.add(emp1);
        er4.add(emp2);
        er4.add(emp3);

        Iterator<Employee> it = er4.iterator();

        while (it.hasNext())
        {
            Employee emp = it.next();
            System.out.print(emp.name.trim() + "  |");
            System.out.print(emp.age + "| ");
            System.out.println(emp.dept + "| ");
        }
        
        System.out.println(mapConcepts.getMapValues());
        mapConcepts.getEmployeeObject();
       
    }
    
   
}
