package video;

import smalldemo.Student;

/**
 * @author yhy
 * 练习测试object类中的一些方法
 */
public class Objecttest {

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("宋殿航");
        s.setAge("15");
        System.out.println(s);
///        @reason:这段代码用来介绍的
//        ****重写之前
//        output:SmallDemo.Student@58ceff1(包和类都打印出来了)
//        先是println方法中调用  String s = String.valueOf(x);
//        再到valueOf方法
//        public static String valueOf(Object obj) {
//            return (obj == null) ? "null" : obj.toString();
//        }
//        再到toString方法
//         public String toString() {
//                  return getClass().getName() + "@" + Integer.toHexString(hashCode());——也就是为什么上面output是那样的原因
//  这里直接打印s就是一种object类，object类打toString方法的输出格式就是上这样
//        要改变这个，要通过重写在student的toString方法
//        ***重写之后
//        便可以修改输出了
        System.out.println(s.getName());
    }
}
