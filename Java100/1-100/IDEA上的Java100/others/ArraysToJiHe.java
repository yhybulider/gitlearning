package video;

import java.util.Arrays;
import java.util.List;

/**
 * @author yhy
 * arrays中的aslist方法将数组变为集合
 */
public class ArraysToJiHe {
    public static void main(String[] args) {
        String[] a = {"abc","hdah","dahuh"};
        List<String> list= Arrays.asList(a);
        System.out.println(list);
    }
}
