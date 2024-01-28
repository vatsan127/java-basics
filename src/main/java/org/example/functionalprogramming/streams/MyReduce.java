package org.example.functionalprogramming.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MyReduce {
    /*Used to reduce the contents of a Stream to a single value*/
    private static List<Integer> numberList = Arrays.asList(1, 2, 3, 4);

    /* params for reduce
     * identity (default initial value)
     * BinaryOperator<T> (takes two values of same type and gives a single value result of the same type)
     * */
    public static void reduce() {
        /*multiplication of all the elements in the List*/
        int result = numberList.stream()
                .reduce(1, (a, b) -> a * b);

        /*step 1:  a = 1 (initial value) b = 1 (value from List)
         *step 2:  a = 1 (result from previous evaluation) b = 2 (value from List)
         *step 3:  a = 2 (result from previous evaluation) b = 3 (value from List)
         *step 4:  a = 6 (result from previous evaluation) b = 4 (value from List)  */

        System.out.println("reduce : " + result);
    }

    /* params for reduceWithoutIdentity
     * BinaryOperator<T> (takes two values of same type and gives a single value result of the same type)
     *
     * returnType Optional<T>
     * */
    public static void reduceWithoutIdentity() {
        Optional<Integer> optional = numberList.stream()
                .reduce((a, b) -> a * b);
        if (optional.isPresent()) {
            int result = optional.get();
            System.out.println("reduceWithoutIdentity : " + result);
        }
    }

    public static void main(String[] args) {
        reduce();
        reduceWithoutIdentity();
    }
}
