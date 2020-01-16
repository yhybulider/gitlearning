package music.daima.ebook;

/**
 * 这一篇是用来测试静态内部类的使用的
 * @author yhy
 * @date 1/14
 */
public class StaticInner {
    private  int num = 7;

    /**
     *  定义静态常量，这个才可以被静态内部类调用
     */
    private  static  int num2 = 6;

    /**
     * 定义一个静态内部类
     */
    static class Innerclass{
        private static int num3;
        private int num4 = 4;
        public void innerfangfa(){
//          System.out.println("调用外部类的成员变量："+num);，这个会报错，因为不能调用非静态的
            System.out.println("调用外部类的成员变量："+num2);
        }
    }

    /**
     * 这是外部类的方法，用来验证访问内部类的方法
     */
    public static void inneracess(){
//        通过类名访问静态内部类的类成员
        System.out.println("访问静态内部类："+Innerclass.num3);
//        通过实例访问静态内部类的实例成员
        System.out.println("访问静态内部类："+new Innerclass().num4);

    }
}
