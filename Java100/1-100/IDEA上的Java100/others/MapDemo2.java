package video;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
 /*    解决方法1*/
        Map<Student,String > m = new TreeMap<>(new Comparator<Student>() {
            @Override
//            比较器排序,一开始直接排序会报错
            public int compare(Student s1, Student s2) {
                int age = s1.getAge1()-s2.getAge1();
//                return age;
                int num = age ==0? s1.getName().compareTo(s2.getName()):age;
                return num;
            }
        });
//   解决方法2，重写comparable方法
//        Map<Student,String> m = new TreeMap<>();
        Student s1 = new Student("abc",22);
        Student s0 = new Student("bbc",22);
        Student s2 = new Student("cbcd",21);
        Student s3 = new Student("abce",24);
        Student s4 = new Student("abce",23);


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
