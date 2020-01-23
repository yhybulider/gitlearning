package video;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author yhy
 * 用来练习hashmap
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<String, String>();
        m.put("abc","cde");
        m.put("abc","cde");
        m.put("abca","dcde");
        m.put("abca","dcdew");
//        m.remove("abc");
        System.out.println(m.remove("abca"));
        System.out.println(m.containsKey("abc"));
        System.out.println(m.containsValue("abc"));
//        m.clear();
//        根据键获取值
        System.out.println(m.get("abcd"));
//        获取所有键的集合
        Set<String> s = m.keySet();
        System.out.println(s);
//        集合获取所有值的集合
        Collection<String> c = m.values();
        System.out.println(c);
//        hashmap的长度
        System.out.println(m.size());
//        直接输出
        System.out.println(m);
    }
}
