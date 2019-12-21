package 异常;
/*throws与throw的区别
 * 主方法不处理任何异常，而交给JAVA中最大头JVM，所以如果在主方法使用了throws关键字，则表示一切异常
交给JVM进行处理。默认处理方式也是JVM完成。
 */
 class Math {
    public int div(int i,int j) throws Exception{    // 定义除法操作，如果有异常，则交给被调用处处理
        int temp = i / j ;    // 计算，但是此处有可能出现异常
        return temp ;
    }
};
public class Test03{
    public static void main(String args[]){
    	Math m = new Math() ;        // 实例化Math类对象
        try{
            System.out.println("除法操作：" + m.div(10,0)) ;//这里分母如果不对，就会报错，所以要注意这里
        }catch(Exception e){
            e.printStackTrace() ;    // 打印异常
        }
    }
};


