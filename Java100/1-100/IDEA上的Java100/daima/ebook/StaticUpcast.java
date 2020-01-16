package music.daima.ebook;

/**
 * 定义一个A类，定义get方法
 */
class A {
    public static String get(){//定义一个方法
        return "A is base";
    }
}

/**
 * 这里为了快速解释使用，就没用驼峰去命名了，
 * B是继承A类的
 */
class B extends A {
    public static String get(){//同样的方法
        return "B is not base";
    }
}


/**
 * 这是一个关于向上转型的静态方法
 */
public class StaticUpcast {
    public static void main(String[] args) {
        A a = new B();
        //upcast 向上转型
//        System.out.println(A.get()); 阿里规范会报错，避免用一个类的对象引用去访问，无谓增加编译器的解析成本
        System.out.println(a.get());

    }

}
//output:
//A is base
//从这里发现静态方法是与类相关联的，不是与单个对象关联的