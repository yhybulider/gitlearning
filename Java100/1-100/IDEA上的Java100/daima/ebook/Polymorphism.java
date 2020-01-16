package music.daima.ebook;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

class Shape{
    public void draw(){}
    public void erase(){}
}
class Cicle extends Shape{
    public  void draw(){
        System.out.println("第一层");
    }
//    public void erase(){}
}
class Square extends Shape{
    public void draw(){
        System.out.println("第二层");
        System.out.println("加多一个");
    }
}

class RandomShape {
    private Random rand = new Random(5);


    public Random getRand() {
        return rand;
    }

    Shape next(){
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Cicle();
            case 1: return new Square();
        }
    }
}

public class Polymorphism {
    private static RandomShape rs = new RandomShape();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = rs.next();
            for (Shape shp : s)
                shp.draw();
        }
    }
}
