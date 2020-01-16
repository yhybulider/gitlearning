package music.daima.ebook;

import java.text.SimpleDateFormat;

/**
 * @author yhy
 * 这个是实现接口定义的代码，在其它地方去调用
 * 这里的接口不用public的话，其它的包就访问不了
 */
public interface JieKou {
//   定义了两个常量
    /**
     * 这里定义一个df变量来获取当前时间
     */
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

    String AUTHOR = "yhycoder";

    /**
     * 定义一个接口的方法
     * 这里的public是多余的，在接口里面是自动为public
     */
    /*public*/ void print();
}
