package music.daima.ebook;

import music.qiti.Music;

class test{
    test(int i){

        i = i + 1;

    }
    private String name;//将其变为public String name;的话下面就可以访问
    public int num=2;//公有的可以被访问
    double i = 2.2;//默认的定义，也可以被访问，在本包里面

}
public class FengZhuang {
    public static void  main(String args[]){
       test a = new test(6);
        System.out.println(a.num);
        //a.name就会报错，因为在上面的name是私有的
        Music ceshi = new Music();//导入了不同的包中的类

//        ceshi.BaoHu();报错，是在其它包里的protected方法

    }
}
