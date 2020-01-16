package music.daima.ebook;
//创建一个类，包含一个未初始化的string引用，用来验证该引用被Java初始化成了null
public class GouZao {
    static String s;
    public static void  main(String args[]){
        System.out.println("s="+s);
    }
}
/*
输出为s=null*/
