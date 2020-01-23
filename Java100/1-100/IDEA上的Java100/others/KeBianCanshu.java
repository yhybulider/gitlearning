package video;

/**
 * @author yhy
 * 使用可变参数的写法，更加简便
 * 写法
 *       （int...x）
 */
public class KeBianCanshu {
    public static void main(String[] args) {
        int a = add(1,2);
        int b = add(1,2,5,8);
        int c = add(1,5,8);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    /**  //    定义一个add方法
     * @param x 其实是个数组
     * @return 返回的是一个add方法的增加结果，
     * 多个可变参数的时候，要将其他的可变放在第一位
     */

    public static int add(int...x){
        int s= 0;
        for (int i :x){
             s += i;
        }
        return s;
    }
}
