package java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class mergeArray {
    public static void main(String[] args) {
    int[] a= {2,7,5,9};
    int[] b={90,23,56,11,78,9};
    int[] result= IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        int[] disctinctMerge= IntStream.concat(Arrays.stream(a),Arrays.stream(b)).distinct().sorted().toArray();
        System.out.println(Arrays.toString(result));
    System.out.print(Arrays.toString(disctinctMerge));
}
}