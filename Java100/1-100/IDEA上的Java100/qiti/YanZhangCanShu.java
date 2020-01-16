package music.qiti;
/**
 * //抽象类
 */

abstract class Person{
    /**
     * 定义一个抽象方法
     */
    public abstract void show();
}
class Student extends Person{
    @Override
    public void show() {
        System.out.println("重写了show方法");
    }
}
/**
 * @author yhy
 * 这一篇是用来验证方法体中的参数类型可以是抽象类，或者是接口的
 */
public class YanZhangCanShu {

    public static void main(String[] args) {
//通过多态的方式，创建一个Person类型的变量，而这个对象实际是Student.Upcasting
        Person p = new Student();
//调用method方法
        method(p);
    }
    /**
     * @param p
     * 定义一个方法method，用来接收一个Person类型对象，在方法中调用Person对象的show方法
     */
    //抽象类作为参数
    public static void method(Person p){

     //通过p变量调用show方法,这时实际调用的是Student对象中的show方法
        p.show();
    }

}
