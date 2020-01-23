package video;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author yhy
 * 泛型的练习使用，用增强for来实现遍历
 */
public class 泛型 {
    public static void main(String[] args) {
        ArrayList<String> abc = new ArrayList<String>();
        abc.add("andan");
        abc.add("andan");
        abc.add("dandan");
        abc.add("andadan");
        abc.add("andafan");
//        增强for的使用
        for (String i:abc){
            System.out.println(i);
        }
        System.out.println("--------------------------");
//        迭代器的做法
        Iterator i = abc.iterator();
        while (i.hasNext()){
            String x = (String) i.next();
            System.out.println(x);
        }
        System.out.println("----------------------------");
//        for循环
        for (int i1 = 0; i1<abc.size();i1++){
            String h = abc.get(i1);
            System.out.println(h);

        }



    }
}
