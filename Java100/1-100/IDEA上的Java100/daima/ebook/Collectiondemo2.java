package music.daima.ebook;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author yhy
 * 第十一章练习题8
 *
 */
public class Collectiondemo2 {
    public static void main(String[] args) {
//        定义一个Gerbil类的ArrayList，说明等下可以使用Gerbil类的东西
        ArrayList<Gerbil> list = new ArrayList<Gerbil>();

        for(int x = 0; x < 10; x++){
            list.add(new Gerbil(x));

        }
//        定义一个迭代器，主要这是用了Gerbil类的
        Iterator<Gerbil> c = list.iterator();
        while (c.hasNext()){
//            对于每一个Gerbil都进行了调用
          c.next().hop();
        }

    }

}
class Gerbil{
    private int getbilNumber;
//  构造器，用来自定义上面这个变量
    public Gerbil(int i) {
        this.getbilNumber = i;
    }
//  定义一个方法
    public void hop(){
        System.out.println("打印："+getbilNumber+"hops");
    }
}