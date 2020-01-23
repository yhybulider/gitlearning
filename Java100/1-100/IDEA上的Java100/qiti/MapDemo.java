package video;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author yhy
 * 用来练习map的代码,遍历hashmap集合的代码
 * 用键来获取值的方式
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("abc","cde");
        m.put("abcd","cded");
        m.put("abce","cdee");
        m.put("abca","cdea");

        Set<String> s = m.keySet();
        for (String key:s){
            String values = m.get(key);
            System.out.println(key+"---------"+values);
        }

    }
}
