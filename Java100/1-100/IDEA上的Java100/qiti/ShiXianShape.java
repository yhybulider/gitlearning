package music.qiti;

/**
 * 引用了shape.java
 * @author yhy
 * @date 1/13
 */

public class ShiXianShape {
    public static void main(String[] args) {
        Circle test = new Circle(2.2);
        System.out.println("图形的名称："+test.getName());
        System.out.println("图形的面积："+test.getArea());
//        下面还可以添加recentangle的代码，这里就没有写了
    }
}
