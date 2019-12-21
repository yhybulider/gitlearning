package Test;

public class Test2 {
	public static void main(String[] args) {
		Gao gao = new Gao();
		Liu liu = new Liu(gao);//小刘问问题
		liu.askQuestion("学习java选哪家？");
	}

}
 interface CallBack{//定义一个接口callback
	public void answer(String result); 
		//借口里定义的是public的抽象，定义的变量都是常量
	
}
//小刘类，实现了回调接口callback
class Liu implements CallBack {/* 类实现接口需要使用关键字：implements ；一个类可以同时实现多个接口，
多个接口之间用逗号分隔。
*/
	//包含小高对象的引用
	private Gao gao;
	public Liu(Gao gao) {
		this.gao = gao;
	}
	//小刘通过这个方法去问小高
	public void askQuestion(String question) {
		gao.execute(Liu.this,question);
		//小刘问小高问题
	}
	public void answer(String result) {
		System.out.println("小高告诉小刘的答案是："+result);
	}//小高知道答案后调用此方法告诉小刘
}
class Gao{//小高类
	public void execute(CallBack callBack,String question) {
		System.out.println("小刘问的问题是："+question);
		try {
			Thread.sleep(10000);//模拟小高忙了其他事情想到答案再告诉了小刘
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//小高办完事情后想到了答案
		String result = "学习java当然去北京尚学堂";
		callBack.answer(result);//小高打电话把答案告诉小刘，相当于反过来调用小刘类
	}
}