package video;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author yhy
 * 用上泛型，用上增强for来完成set的遍历
 */
public class SetFanXing {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<String>();
        s.add("a");
        s.add("a");
        s.add("ab");
        s.add("abc");
        s.add("ad");
        s.add("abc");
        s.add("abcd");
        s.add("aad");
        System.out.println("------------------");
        Iterator i = s.iterator();
        while (i.hasNext()){
            String h  = (String) i.next();
            System.out.println(h);
        }
        System.out.println("------------------");
        for (String x : s){
            System.out.println(x);
        }



    }
}
