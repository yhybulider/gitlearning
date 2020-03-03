//package music.ShuaTi;

import java.util.HashMap;
// import java.util.Iterator;
import java.util.Map;

/**
 * @author yhy
 * leetcode十三题：罗马字转整数
 */
public class No13 {
    public int romanToInt(String s){
//        这里注意泛型定义在前面而不是后面
//        键值对的题就想到用hashmap
        Map<Character, Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int sum = 0;
        int i = 0;
        while (i < s.length()){
           int cur = hm.get(s.charAt(i));
        /*   特殊情况
            输入: "III"
            输出: 3
            输入: "IV"
            输出: 4*/
//        后者比前者大的时候就是减，这里要注意判断长度
           if (hm.get(s.charAt(i+1)) > cur && i+1 < s.length() ){
               sum -= cur;
           }
           else {
               sum += cur;
           }
           i++;
        }

        return sum;
    }

}
