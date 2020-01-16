package music.daima.ebook;

/**
 * 使用教程——外部类以外使用非静态内部类
 * @author yhy
 */
public class InnerTest {
    public static void main(String[] args) {
//        格式，先外部再内部 = new 外部.new 内部
        Out.In test = new Out().new In();
        test.inner();

    }
}
/**
 * 定义一个外部类
 */
class Out{
    /**
     * 定义一个非静态内部类
     */
    class In{
        void inner(){
            System.out.println("打印出内部类的信息");
        }
    }
}
