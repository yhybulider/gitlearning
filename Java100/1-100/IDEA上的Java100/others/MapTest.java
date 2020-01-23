package video;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author yhy
 * 用来测试键盘输入字符串同时
 */
public class MapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
        char[] chs = line.toCharArray();

//   遍历集合，用来查找是否已经添加，添加就将i++并且将其转换为key
        for (char c : chs){
//            拿得到的字符作为键到集合里面去找值，看返回值
            Integer i = tm.get(c);
            if (i == null){
                tm.put(c,1);
            }else {
//                不是null，就是已经存在的字符
                i++;
                tm.put(c,i);
            }
        }

        StringBuilder sb = new StringBuilder();
//        遍历集合
        Set<Character> st = tm.keySet();
        for (Character key :st){
//            获得所需的键对应的值
            Integer value = (Integer)tm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

//        将字符串缓冲区转换为字符串输出
        String result = sb.toString();
        System.out.println("result:"+result);
    }
}
