package comp1110.homework.J09;

import java.util.ArrayList;
import java.util.function.IntPredicate;

public class TeenCount {
    private static boolean applyPredicate(int value, IntPredicate predicate) {
        return predicate.test(value);
    }

    public static int[] teenLess(int[] array){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<array.length;i++){
            if(applyPredicate(array[i],x -> x >= 13 && x <= 19)==false){
                arr.add(array[i]);
            }
        }
        int[] n = new int[arr.size()];
        for(int i =0;i< arr.size();i++){
            n[i] = arr.get(i);
        }
        return n;
    }

}
