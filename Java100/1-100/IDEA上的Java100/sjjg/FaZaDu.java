package music.sjjg;

public class FaZaDu {
    public static int count(int[] a){
        int N = a.length;
        int c = 0;
        int h=0;
        for(int i=0;i<N;i++)//三次嵌入了for循环
            for(int j=0;j<N;j++)
                for(int k=0;k<N;k++){
                    /*for(int j=i+1;j<N;j++)
                        for(int k=j+1;k<N;k++){
分析的时候都是直接将其视作n^3
                        */
                    System.out.println(h);
                    h = h+1;
                    c++;
                }
//这里的复杂度为7*7*7——343了。O（n^3）
        return c;//返回的运算的次数，即经历了几次的++操作
    }
    public static void main(String[] args)
    {
        int[] a = {4,5,5,5,3,9,4};//定义初始了一个长度为7的数组
        System.out.println(count(a));//输出调用count方法的
    }
}
