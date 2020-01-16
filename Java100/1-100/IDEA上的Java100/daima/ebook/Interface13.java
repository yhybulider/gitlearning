package music.daima.ebook;

// interfaces/DiamondInheritance13.java
// TIJ4 Chapter Interfaces, Exercise 13, page 328
/* Create an interface, and inherit two new interfaces from that
 * interface. Multiply inherit a third interface from the second
 * two.
 */

interface CanDo {
    /**
     * 定义一些抽象方法
     */
    void doIt();
}

interface CanDoMore extends CanDo {
    /**
     * 这些都是抽象方法，没有方法体的
     */
    void doMore();
}

interface CanDoFaster extends CanDo {
    void doFaster();
}

interface CanDoMost extends CanDoMore, CanDoFaster {
    void doMost();
}

class Doer implements CanDoMost {
    @Override
    public void doIt() {}
    @Override
    public void doMore() {}
    @Override
    public void doFaster() {}

    @Override
    public void doMost() {
    }
//  将其注释起来就会报错，要实现所有的接口中的抽象方法
//    @Override
//    public void doMost() {}
}


/**
 * @author yhy
 * thinking in java 接口#13的答案
 */
public class Interface13 {
    public static void main(String[] args) {
        Doer d = new Doer();
        ((CanDoMore)d).doMore();
        ((CanDoFaster)d).doFaster();
        ((CanDo)d).doIt();
    }
}
