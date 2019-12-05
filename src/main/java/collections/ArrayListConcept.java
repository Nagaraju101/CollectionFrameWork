package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept
{

    public static void main(String args[])
    {

        Employee emp1 = new Employee("Naga", 37, "QA");
        Employee emp2 = new Employee("Raju", 37, "Data Engineer");
        Employee emp3 = new Employee("Pratap", 32, "Admin");

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
    }

    public void arrayListMethod()
    {

        ArrayList<Object> ar = new ArrayList<Object>();

        ar.add(100);
        ar.add(200);
        System.out.println(ar.size());

        ar.add(300);
        ar.add(400);
        System.out.println(ar.size());
        // System.out.println(ar.get(4));

        ar.remove(2);
        ar.add(300.00);
        ar.add('n');
        ar.add("naga");

        for (int i = 0; i < ar.size(); i++)
        {
            System.out.println(ar.get(i));
        }

        // If want restrict to only integer Array

        ArrayList<Integer> arInt = new ArrayList<Integer>();
        arInt.add(222);
        arInt.add(333);
        arInt.add(111);
        arInt.add(444);
        System.out.println(arInt.size());
        System.out.println(arInt.get(1));

        // If want restrict to only String Array

        ArrayList<String> arStr = new ArrayList<String>();
        arStr.add("Naga");
        arStr.add("Sanju");
        arStr.add("Lucky");
        arStr.add("Avi");
        arStr.add("Ankamreddi");

        System.out.println(arStr.get(4));

        ArrayList<Object> arrE = new ArrayList<Object>();

        arrE.add("123");
        arrE.add(123);

    }

}
