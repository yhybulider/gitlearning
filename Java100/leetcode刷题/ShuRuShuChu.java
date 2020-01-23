package music.ShuaTi;

import java.util.Scanner;

public class ShuRuShuChu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // 输入
        while (input.hasNext()) {
            int length = input.nextInt();  // 输入数组长度，将输入的转化为int类型的数据
            int arr[] = new int[length];//通过输入的数组长度建立一个数组
            int num = 0;  // 任何数num与0异或值依然是num
            for (int i = 0; i < length; i++) {
                arr[i] = input.nextInt();  // 输入数组元素值
                num = num ^ arr[i];  // 将数组每一个元素都与num异或 这里注意异或运算满足交换律和结合律
            }
            System.out.println(num);  // 输出num，即是数组中出现次数为奇数次的数
        }
    }
}
