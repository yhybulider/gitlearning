package music.daima.ebook;
 /**
 *  * 这一篇是用来观察局部内部类的定义使用等,thinking in java的练习九
 *  * @author yhy
 *  * @date 1/14
 *  */

 interface  Ex9Interface{
     /**
      * @param s string类型在下面给内部类调用
      * 定义一个接口，同时包含一个say方法，给下面使用
      */
     void say(String s);
 }
public class JuBuInner {
     /**
      * @return Inner（）返回该类对此接口的引用
      * //    这是一个方法，下面在里面定义一个内部类
      */

    Ex9Interface f() {
        class Inner implements Ex9Interface {
            @Override
            public void say(String s) {
                System.out.println(s);
            }
        }
        return new Inner();
    }
    public static void main(String[] args) {
       JuBuInner x = new JuBuInner();
//       调用局部内部类的say方法
        x.f().say("hi");
    }
}
