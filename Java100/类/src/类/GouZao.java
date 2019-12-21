package 类;

public class GouZao {
	
	public GouZao() {//定义无参构造方法
		this("this 调用有参构造方法");//使用this关键字调用有参构造方法
		System.out.println("无参构造方法");
	}
	public GouZao(String name) {//定义有参构造方法
		System.out.println("有参构造方法");
	}

}

