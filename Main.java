// import java.util.Arrays;
// import java.util.Collections;
// import java.util.Comparator;

import src.DataClass.*;

public class Main 
{
    // public static void main(String[] args) {
    //     Integer[] array = {5, 3, 8, 4, 2};
        
    //     // 对于Integer数组使用Collections.reverseOrder()进行降序排序
    //     Arrays.sort(array, Collections.reverseOrder());
    //     System.out.println(Arrays.toString(array));
        
    //     // 或者定义自己的Comparator来实现降序排序
    //     Arrays.sort(array, new Comparator<Integer>() {
    //         @Override
    //         public int compare(Integer o1, Integer o2) {
    //             return o2 - o1; // 降序
    //         }
    //     });
    //     System.out.println(Arrays.toString(array));
    // }

    public static void main(String[] args) 
    {
        node n1 = new node(1, (short)1, (short)1);
        node n2 = new node(2, (short)2, (short)1);
        node n3 = new node(3, (short)3, (short)1);
        node n4 = new node(3, (short)3, (short)2);
        node n5 = new node(5, (short)4, (short)1);

        BTS bts = new BTS();
        
        bts.add(n4);
        bts.add(n1);
        bts.add(n2);
        bts.add(n5);
        bts.add(n3);

        bts.sort();
    }
}

// public class BooleanArrayChecker {
//     public static boolean isAllTrue(boolean[] array) {
//         for (boolean value : array) {
//             if (!value) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static boolean isAllFalse(boolean[] array) {
//         for (boolean value : array) {
//             if (value) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         boolean[] allTrue = {true, true, true};
//         boolean[] allFalse = {false, false, false};
//         boolean[] mixed = {true, false, true};

//         System.out.println("allTrue is all true: " + isAllTrue(allTrue)); // true
//         System.out.println("allTrue is all false: " + isAllFalse(allTrue)); // false

//         System.out.println("allFalse is all true: " + isAllTrue(allFalse)); // false
//         System.out.println("allFalse is all false: " + isAllFalse(allFalse)); // true

//         System.out.println("mixed is all true: " + isAllTrue(mixed)); // false
//         System.out.println("mixed is all false: " + isAllFalse(mixed)); // false
//     }
// }
