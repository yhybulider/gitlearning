package music.daima.ebook;

import java.sql.PreparedStatement;

/**
 * @author admin
 * 这一篇是用来测试多态方法的覆盖
 */
public class PolymorphismFugai {
    private void p(){//if public...就可以覆盖
        System.out.println("1");
    }
    public static void main(String[] args) {
        PolymorphismFugai s = new JiCheng();
        s.p();
        //将输出的是上面的1而不是我们想要的jicheng类中的方法
    }
}

/**
 * 编写子类信息
 */
class JiCheng extends PolymorphismFugai{
    public void p(){
        System.out.println("2");
    }
}