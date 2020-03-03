// package music.ShuaTi;

/**
 * @author yhy
 * 第九题 回文数
 * 这里是只翻转了后半的数字进行比较。
 * 需要注意的是： 长度可以为奇数也可以为偶数
 */
public class No9 {
    public boolean isPalindrome(int x ){
//        三个特殊情况自己判断
        if (x == 0){
            return true;
        }
        if (x < 0){
            return false;
        }
        if (x % 10 ==0){
            return false;
        }
        int num =0;
        while (num < x){
            num = num *10 + x % 10;
            x /= 10;
        }
        // 是偶数就直接是x == num；
        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
//        偶数就直接两个相等
        return x==num || num /10 == 0;
    }
}
