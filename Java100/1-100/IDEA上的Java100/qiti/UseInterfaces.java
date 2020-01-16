package music.qiti;
//访问了其它包的接口，就是下面这个地址
import music.daima.ebook.JieKou;

import java.util.Date;

public class UseInterfaces {
    public static void main(String[] args) {
//        实例化using类，实现查看代码的运行情况
        Using Shuchu = new Using();
        Shuchu.print();

    }
}

/**
 * 这里是接口继承接口
 */
interface Jiekou2 extends JieKou{
    String num = "接口2";
}

/**
 * 这里是Using类实现了JieKou接口
 */
class Using implements JieKou,Jiekou2 {
    /**
     * 重写了方法，调用接口定义的常量
     */
    @Override
    public void print() {
        System.out.println(AUTHOR+"在新的包里面使用接口的时间："+df.format(new Date())+" 同时还有"+num);
    }
}
