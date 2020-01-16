package music.daima.ebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author yhy
 * 这个是用来观察java中的可选操作方法的一些特点以及定义使用方法
 */
public class Unsupport {
    static void test(String msg, List<String> list) {
        System.out.println("--- " + msg + " ---");
        Collection<String> c = list;
        Collection<String> subList = list.subList(1,8);
        Collection<String> c2 = new ArrayList<String>(subList);
        try {
            c.retainAll(c2);
        }
        catch(Exception e) {
            System.out.println("retainAll(): " + e);
        }
        try { c.removeAll(c2); } catch(Exception e) {
            System.out.println("removeAll(): " + e);
        }
        try { c.clear(); } catch(Exception e) {
            System.out.println("clear(): " + e);
        }
        try { c.add("X"); } catch(Exception e) {
            System.out.println("add(): " + e);
        }
        try { c.addAll(c2); } catch(Exception e) {
            System.out.println("addAll(): " + e);
        }
        try { c.remove("C"); } catch(Exception e) {
            System.out.println("remove(): " + e);
        }
        // The List.set() 虽然改变了值但没有改变它的数据结构尺寸
        try {
            list.set(0, "X");
        } catch(Exception e) {
            System.out.println("List.set(): " + e);
        }
    }
    public static void main(String[] args) {
        //返回由指定数组支持的固定大小的列表。 （将返回的列表更改为“写入数组”。）该方法作为基于数组和基于集合的API之间的桥梁
        // ，与Collection.toArray()相结合 。 返回的列表是可序列化的，并实现RandomAccess 。 此方法还提供了一种方便的方式来创建一个初始化为包含几个元素的固定大小的列表：
        List<String> list =
                Arrays.asList("A B C D E F G H I J K L".split(" "));
        System.out.println(list.getClass());
        test("Arrays.asList()", list);
        // System.out.println(list1.getClass());
        test("Modifiable Copy", new ArrayList<String>(list));
        //test("unmodifiableList()",Collections.unmodifiableList(new ArrayList<String>(list)));
    }

}
