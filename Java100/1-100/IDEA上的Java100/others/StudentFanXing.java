package video;

import java.util.*;

/**
 * @author yhy
 * 用来使用student类，而且使用泛型，用for来遍历
 */
public class StudentFanXing {
    public static void main(String[] args) {
//        如果更换集合类型就在这里修改即可
//        LinkedList<Student> a = new LinkedList<>();
        HashSet<Student> a = new HashSet<>();

        Student s = new Student("ANDY",25);
        Student s1 = new Student("ANDY",251);
        Student s2 = new Student("MARK",16);
        Student s3 = new Student("MARRY",18);
                a.add(s);
                a.add(s);
                a.add(s1);
                a.add(s2);
                a.add(s3);
                a.add(s3);
        Iterator i = a.iterator();
        while (i.hasNext()){
            Student x = (Student) i.next();
            System.out.println(x);
        }
        System.out.println("---------");
        for (Student h :a){
            System.out.println(h);

        }
    }
}
