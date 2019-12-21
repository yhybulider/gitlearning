/*实现数组的排序；排序达到长度*长度便可以完成排序*/

public class six{
	public static void main(String args[]){
		int data[] = new int[]{1,11,6,8,9};//格式
		System.out.println("paixuqiandeshuju:");
		print(data);
		for(int x=0;x<data.length;x++){//外层控制总体的次数
			for(int y=0;y<data.length-1;y++){//内层控制排序每次的排序控制
				if(data[y]>data[y+1]){
					int i = data[y];
					data[y] = data[y+1];
					data[y+1] = i;
				}
				
			}
		}
		System.out.println("paxuhoudeshuju:");
		print(data);
		
	}
public static void print(int temp[]){
		for(int x=0;x < temp.length;x++){
			System.out.print(temp[x]+"  ");//输出函数，将所有的数组元素输出
		}
		System.out.println();
	}
}