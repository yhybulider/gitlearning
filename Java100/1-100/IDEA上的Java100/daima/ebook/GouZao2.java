package music.daima.ebook;
//创建一个类，它包含一个在定义时就被初始化了的String域，以及另一个通过构造器初始化的String域，这两种方式有何差异？
//这里也是回顾了构造器的内容
public class GouZao2 {
    String s0 = "hello world";//题要求

    /**   String s2; 这里就死未初始化的
     * @param s
     */

    GouZao2(String s){
        String s1 = s;//改了之后的代码
        System.out.println(s1);
      //  s2 = s1;

    }
    public static void main(String args[]){
       GouZao2 lizi = new GouZao2("ABC");
       System.out.println(lizi.s0);
       //System.out.println(lizi.s2);
      new GouZao2("abc");
    }
}
/*
output:
ABC
hello world
abc*/
