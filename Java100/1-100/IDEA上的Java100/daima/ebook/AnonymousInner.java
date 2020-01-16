package music.daima.ebook;
/**
 * thinking in java
 * @author yhy
 * 匿名内部类
 */
public class AnonymousInner {
    public static test1 getTest(int i){
//        匿名类的结构如下，这里的i会传给基类的构造器
        return new test1(i) {
            {
                System.out.println(22);
            }
//            重写f方法
            @Override
            public void f() {
                System.out.println("在匿名类内");
            }
        };//这里要注意有分号
    }
    public static void main(String[] args) {
        test1 abc = getTest(55);
        abc.f();
    }
}

/**
 *创建一个抽象类
 */
abstract class test1{
//    基类的构造器
    public test1(int i){
        System.out.println("i is :"+i);
    }
    public abstract void f();
}
