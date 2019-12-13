package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept
{
    LinkedList<String> ll = new LinkedList<String>();

    public LinkedList<String> getLinkedList()
    {

        ll.add("add");
        ll.add("QA");
        ll.add("Tester");
        ll.add("Selenium");
        System.out.println(ll);

        ll.addFirst("Cypress");
        ll.addLast("Automatiion");
        System.out.println(ll);

        ll.remove(2);
        ll.add(2, "SDET");

        ll.removeLast();

        System.out.println("This item will be removed : " + ll.removeFirst());

        // For-Loop
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("This is for loop");
        for (int i = 0; i < ll.size(); i++)
        {
            System.out.println(i + ". " + ll.get(i));
        }

        System.out.println("+++++++++++++++++++++++++++++");

        // Advanced For Loop
        System.out.println("This is advanced for loop");
        int x = 0;
        for (String s : ll)

        {
            System.out.println(x + ". " + s);
            x++;
        }

        System.out.println("+++++++++++++++++++++++++++++");

        // Iterator
        int i = 1;
        Iterator<String> s = ll.iterator();

        while (s.hasNext())
        {
            System.out.println(i + ". " + s.next());
            i++;
        }

        // Whileloop
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("This is while loop");
        int num = 0;
        while (ll.size() > num)
        {
            System.out.println(ll.get(num));
            num++;
        }
        return ll;

    }

}