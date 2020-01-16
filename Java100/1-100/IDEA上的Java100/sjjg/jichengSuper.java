package music.sjjg;

import java.awt.desktop.SystemSleepEvent;

class Game{
    int h;
    Game(int i){
        //构造函数
        System.out.println(i);
        System.out.println("第一层");
    }
    public static void printg(int d){//普通函数
        System.out.println("1");
    }
}
class BallGame extends Game{
    BallGame(int i){
        super(i);
        //调用父类的构造器
        System.out.println("第二层");
        super.h = 2;
        //访问父类的属性
    }
}
/**
 *
 */
public class jichengSuper extends BallGame{
    jichengSuper(int b) {
       super(b);
       //调用的是上面父类的
        int a = super.h ;
        //将第二层里的3赋值给a
        System.out.println(a);
        //打印
    }
    public static void  main(String[] args){
        new jichengSuper(3);
        //这里的4将代进去上面的构造函数jichengSuper中
        System.out.print("最后一层");
    }

}
