package shuzu;

public class ErWeishuzu {
public static void main(String[] args) {
	int a[][] = new int[3][4];
	System.out.println("输出3行4列的数组：");
	for(int i = 0;i<a.length;i++) {
		for(int j = 0;j<a[i].length;j++) {//循环遍历数组中的每一个元素
			System.out.print(a[i][j]+" ");//将数组中的元素输出
		}
		System.out.println("");//输出空格
	}
}

}

