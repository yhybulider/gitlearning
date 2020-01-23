public class Gctest{
	private String name;
	public Gctest(String name){
		this.name=name;
		System.out.println(name+"建立");
		
	}
	protected void finalize(){
		System.out.println(name+"被回收");
		
	}
	public static void main(String args[]){
		Gctest obj1 = new Gctest("对象一");
		Gctest obj2 = new Gctest("对象二");
		Gctest obj3 = new Gctest("对象三");
		obj1=null;
		obj2=null;
		obj3=null;
		System.gc();
		while(true);//不断执行，让垃圾收集在程序结束前可以有机会被执行
	}
}