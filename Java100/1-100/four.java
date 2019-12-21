//date：12/5
public class four{
	public static void main(String args[]){
		for(int i = 1;i <= 9;i++){//两个for循环，先是i
			for(int j=1;j <= i; j++){//再到j，循环
				System.out.print(j+"*"+i+"="+i*j+"\t");//输出9*9的乘法表
			}
			System.out.println();
		}
	}
}