package njustz.basiclib.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author njustz
 * @date 2020/3/28
 */
public class StreamAPITest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 6 ,5 , 4};
        IntStream stream = Arrays.stream(arr);
        stream.sorted().forEach(System.out::print);
        System.out.println();

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        Stream stream1 = list.stream();
        //System.out.println(stream1);
        stream1.limit(2).forEach(System.out::print);
        System.out.println();
        list.stream().skip(1).forEach(System.out::print);
        System.out.println();
        list.stream().distinct().forEach(System.out::print);
        System.out.println();
        System.out.println(list);
        System.out.println(list.stream().distinct().toArray());

        //并行流
        Stream stream2 = list.parallelStream();

    }
}
