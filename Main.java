import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {5, 3, 8, 4, 2};
        
        // 对于Integer数组使用Collections.reverseOrder()进行降序排序
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
        
        // 或者定义自己的Comparator来实现降序排序
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; // 降序
            }
        });
        System.out.println(Arrays.toString(array));
    }
}