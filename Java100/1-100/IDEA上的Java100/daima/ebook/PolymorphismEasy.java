package music.daima.ebook;


/**
 * PolymorphismEasy class
 * @author yhy
 * @date 2020/01/09
 *
 * 这一篇是测试发生多态的条件，以及简单运用
 */
public class PolymorphismEasy {
    public static void main(String[] args) {
        // f1变量是父类类型，指向父类实例
        Figure f1 = new Figure();
        f1.onDraw();
        //f2变量是父类类型，指向子类实例，发生多态
        Figure f2 = new Triangle();
        f2.onDraw();
        //f3变量是父类类型，指向子类实例，发生多态
        Figure f3 = new Ellipse();
        f3.onDraw();
        //f4变量是子类类型，指向子类实例
        Triangle f4 = new Triangle();
        f4.onDraw();
    }
}
class Figure{
    /**绘制几何图形方法**/
    public void onDraw() {
        System.out.println("绘制Figure...");
    }
}

/**
 *
 * Ellipse类继承Figure
 */
class Ellipse extends Figure{
    @Override
    public void onDraw() {
        System.out.println("绘制椭圆形");
    }
}
class Triangle extends Figure {
    /**
     绘制几何图形方法
     **/

    @Override
    public void onDraw() {
        System.out.println("绘制三角形...");
    } }
