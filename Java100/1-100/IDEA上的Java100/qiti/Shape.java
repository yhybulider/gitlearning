package music.qiti;


/**
 * 这是一个测试的代码
 * 测试使用抽象类
 */
public abstract class Shape {
    public String getName(){
        return this.getClass().getSimpleName();
        //getsimplename是返回底层类的简单名称
//        getclass是当前类的名称
    }
//抽象方法无方法体
    public abstract double getArea();
}

/**
 * 这里的子类不是抽象类，所以要实现父类的所有抽象方法。
 */
class Circle extends  Shape{
    private double radius;
//    这个是自定义加上去的方法，后期加上去的，子类具有扩展性
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
class Recentangle extends Shape{
    private double length;
    private double width;
    public  Recentangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return width * length;
    }
}