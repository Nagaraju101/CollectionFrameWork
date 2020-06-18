package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionTuts
{

    public static void main(String[] args)
    {
        List<Student> student = new ArrayList<Student>();
        student.add(new Student(1, 45));
        student.add(new Student(2, 55));
        student.add(new Student(3, 35));
        student.add(new Student(4, 85));
        student.add(new Student(5, 75));
        student.add(new Student(6, 65));

        Collections.sort(student, (s1, s2) -> {
            return s1.marks > s2.marks ? -1 : s1.marks < s2.marks ? 1 : 0;
        });

        for (Student i : student)
        {
            System.out.println(i);
        }

        List<Map<String, String>> listMap = new ArrayList<Map<String, String>>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "naga");
        map.put("city", "Thornton");
        listMap.add(map);
        System.out.println(listMap);

        Set<String> keys = map.keySet();

        for (String key : keys)
        {
            System.out.println(key + " " + map.get(key));
        }

        for (Entry m : map.entrySet())
        {
            System.out.println(m.getKey() + "  " + m.getValue());
        }

    }

}

class Student
{
    @Override
    public String toString()
    {
        return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
    }

    int rollNo;
    int marks;

    public Student(int rollNo, int marks)
    {
        this.rollNo = rollNo;
        this.marks = marks;
    }
}