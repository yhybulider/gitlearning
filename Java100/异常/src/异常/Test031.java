package 异常;
/*throw的使用
 * 接上03的throws的区别
 * 7-28
*
*/
class test00 {
	/*
	 * public static void main(String args[]){ try{ throw new Exception("自己抛着玩的。") ;
	 * // 抛出异常的实例化对象 }catch(Exception e){ System.out.println(e) ;//等同于自己输出某些东西 } }
	 */
	public int div (int i,int j) throws Exception{//异常交给被调用处处理
		System.out.println("*****计算开始****");
		int temp = 0;
		try {
			temp = i/j;
			
		}catch (Exception e) {
			throw e;//抛出异常 
		}finally {
			System.out.println("****计算结束****");//无论怎么样，都会执行打印出这句话
		}
		return temp;
	}
}
public class Test031{
	public static void main(String[] args) {
		test00 m = new test00();
		try {
			System.out.println("除法操作："+m.div(10, 0));//调用上面div，有0做分母肯定有异常，抛出然后打印出来
		}catch(Exception e) {
			System.out.println("异常产生："+e);
		}
	}
}

