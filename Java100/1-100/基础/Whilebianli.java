package lianxi;

public class Whilebianli {
	public static void main(String args[]) {
		String[] aves = new String[] {"baihe","fhai","fhui"};//创建鸟类数组aves鸟类
		int index = 0;//创建索引变量
		System.out.println("我家花园有很多鸟：");
		while(index < aves.length) {//遍历数组
			System.out.print(aves[index++]+" ");//自增索引值
		}
		
		
	}

}
