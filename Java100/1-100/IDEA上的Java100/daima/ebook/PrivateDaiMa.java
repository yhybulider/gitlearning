package music.daima.ebook;
/**
 *  测试private的使用
 *
 * @author yhy
 * @date 2020/01/09
 */
class TestClass{
    private TestClass(){}//private定义的构造器，不能直接通过new来使用
    static TestClass make(){
        return new TestClass();
    }
}

/**@author yhy
 * 211
 * 这是一个练习的demo
 */
public class PrivateDaiMa {
    public static void main(String[] args){
//        TestClass x = new TestClass();
        TestClass x = TestClass.make();
//        不能通过构造器来创建TestClass,要通过调用make方法才可以
    }
}
