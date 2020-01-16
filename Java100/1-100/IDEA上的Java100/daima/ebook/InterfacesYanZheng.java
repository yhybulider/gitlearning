package music.daima.ebook;

import java.awt.*;

/**
 * @author yhy
 * 用来完成9.2的练习
 * 验证抽象类与抽象方法的使用
 */
public class InterfacesYanZheng {
    public static void main(String[] args) {
//      不能被实例化，抽象类，会报错
//        ChouXiang chouxi = new ChouXiang() ;
//        可以实例child类
//        即通过继承其子类来实现不能继承抽象类
        Child test = new Child();
    }
}

abstract class AbstractChouXiang{
    /**
     * 构造函数
     */
    AbstractChouXiang() {

    }

    /**
     * 定义一个抽象类的抽象方法
     */
    abstract void chouxiang();
}

class Child extends AbstractChouXiang{
   Child(){
       System.out.println("实例时候就打印出来");
   }

    /**
     * 注意这里不是abstract就不要讲方法定义为abstract
     */
    @Override

    void  chouxiang(){
        System.out.println("继承抽象类");

    }
}