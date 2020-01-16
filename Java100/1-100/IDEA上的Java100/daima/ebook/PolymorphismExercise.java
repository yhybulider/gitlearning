package music.daima.ebook;

import java.awt.*;
import java.util.Random;

class RandomRodentGenerator {
	private Random rand = new Random();
	public Rodent next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Rodent.Mouse();
			case 1: return new Rodent.Gerbil();


	}
 }
}

abstract class Rodent{
    void run(){
        System.out.println("this is a Rodent!");
 }
 static class Mouse extends Rodent{
     @Override
     void  run(){
         System.out.println("this is a mouse!");
     }

}
static class Gerbil extends  Rodent{
        @Override
        void  run(){
            System.out.println("this is a Gerbil!");
        }
}

}


/**
 * @author yhy
 * @date 1/10
 * 这里是通过创建一个数组，填充了不同类型的Rodent类型
 */
public class PolymorphismExercise {

    private static RandomRodentGenerator gen = new RandomRodentGenerator();
    public static void main(String[] args) {
        Rodent[] shuZu = new Rodent[2];
        for(Rodent r : shuZu) {
            r = gen.next();
            r.run();
//            根据不同的随机数，输出了不同的结果

        }
    }

}
