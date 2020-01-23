package video;

import java.util.HashSet;
import java.util.Random;

/**
 * @author yhy
 * 用hashset产生随机数并且遍历集合
 */
public class HashSetRondom {
    public static void main(String[] args) {
//        创建集合
        HashSet<Integer> hs = new HashSet<>();
//        创建随机数
        Random r = new Random();
//        保证了唯一性
        while (hs.size()<10){
            int s = r.nextInt(20)+1;
            hs.add(s);
        }

//        遍历
        for (int i : hs){
            System.out.println(i);
        }
    }
}
