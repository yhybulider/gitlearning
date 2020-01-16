package music.daima.ebook;

/**这是用来测试在外部类以外使用静态内部类
 * @author yhy
 */
public class innerOut {
    public static void main(String[] args) {
        Out1.In1 abc = new Out1.In1();
        abc.FangFa();
    }
}

/**
 * 定义一个外部类
 * @author yhy
 */
 class Out1{
    /**
     * 定义一个静态内部类,静态内部类是直接与外部类相关的
     */
    static class In1{
        void FangFa(){
            System.out.println("这是静态内部类");
        }
    }
}
