package music.daima.ebook;


/**
 * 这一篇是用来讲内部类的一些定义的
 * @author yhy
 * @date 1/14
 */
public class InnerClass {
    private int outernum = 9;

    /**
     * 创建内部类，同时还定义一个常量，为private
     */
    class Inner{
        private  int innernum = 8;
//        定义内部类的方法，去调用外部类的成员常量
        public void outAcess(){
            System.out.println("外部类的值："+outernum);
        }

    }

    /**
     * 这个是外部类的成员方法
     * 这里直接调用内部类会报错，不可以直接innernum使用
     * 要通过显式创建内部类对象才可以实现
     */
    public void innerAcess(){
        System.out.println("内部类的值："+new Inner().innernum);

    }
    public static void main(String[] args) {
//        创建外部类对象，没创建内部类对象
     InnerClass i = new InnerClass();
        i.innerAcess();

    }

}
