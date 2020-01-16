package music.daima.ebook;

import java.util.*;

/**
 * 这是java编程思想的第十一章的练习四
 * @author yhy
 */
public class Collectiondemo1 {
    public static void main(String[] args) {
        Test2 s = new Test2();
        String[] a = new String[10];
        s.fillA(a);
        for(String b : a){
            System.out.println(b+",");
            System.out.println();
            System.out.println(s.fill(new ArrayList<String>(), 10));
            System.out.println(s.fill(new LinkedList<String>(), 10));
            System.out.println(s.fill(new HashSet<String>(), 10));
            System.out.println(s.fill(new LinkedHashSet<String>(), 10));
            System.out.println(s.fill(new TreeSet<String>(), 10));
        }


    }
}

class Test2 {
    int key = 0;

    public String next() {
        ///循环打印出下面的电影信息
        switch (key) {
            default:
            case 0:
                key++;
                return "Snow White";
            case 1:
                key++;
                return "Bashful";
            case 2:
                key++;
                return "Doc";
            case 3:
                key++;
                return "Dopey";
            case 4:
                key++;
                return "Grumpy";
            case 5:
                key++;
                return "Happy";
            case 6:
                key++;
                return "Sleepy";
            case 7:
                key = 0;
                return "Sneezy";
        }
    }

    /**
     * @param a 定义的string数组，上面定义的长度为10
     *          这个方法是将电影名全部循环遍历填进去，用上了一个for循环
     */
    public void fillA(String[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = next();
        }
    }

    /**
     * @param c 定义了一个集合类并且转为了string类的
     * @param n 是另一个整型参数
     * @return c 是一个已经完成add操作的集合容器
     */
    public Collection fill(Collection<String> c, int n) {
        for (int i = 0; i < n; i++) c.add(next());
        return c;

    }
}