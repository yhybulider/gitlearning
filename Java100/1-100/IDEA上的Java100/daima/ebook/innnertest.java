package music.daima.ebook;

/**
 * 这一篇是做thinking in java 的练习7（内部类那一章）
 * @author yhy
 * @date 1/14
 */
public class innnertest {
    private int num;
    private void Out(){
        System.out.println("这是外部类的方法");
    }
    class InnerLei{
        void In(int i){
            num = i * 2;
            System.out.println(num);
            new innnertest().Out();
        }

    }

    /**
     * 定义外部类的方法实例化内部类，调用其方法
     */
    private void inAecss(){
       new innnertest.InnerLei();
       new innnertest.InnerLei().In(8);

    }

    public static void main(String[] args) {
//        实例化，打印出结果
        innnertest abc = new innnertest();
        abc.inAecss();
    }
}
/*
output
16
这是外部类的方法*/
