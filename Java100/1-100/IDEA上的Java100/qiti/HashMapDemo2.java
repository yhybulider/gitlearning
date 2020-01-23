package video;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author yhy
 * 练习hashmap中以对象为键或者值来做
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        Map<Student,String> m = new HashMap<>();

        Student s1 = new Student("abc",22);
        Student s0 = new Student("abc",22);
        Student s2 = new Student("abcd",21);
        Student s3 = new Student("abce",24);
        Student s4 = new Student("abcg",23);


        m.put(s0,"1");
        m.put(s0,"1");
        m.put(s1,"2");
        m.put(s2,"3");
        m.put(s3,"4");
        m.put(s4,"5");

        Set<Student> st = m.keySet();

        for (Student s :st){
            String value = m.get(s);
            System.out.println(s+"--"+value);
        }
    }
}
