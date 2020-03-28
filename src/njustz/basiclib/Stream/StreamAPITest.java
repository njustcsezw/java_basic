package njustz.basiclib.Stream;

import sun.print.SunMinMaxPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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

        //归约reduce
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        Object reduce = list1.stream().reduce(0, (t1, t2) -> t1+t2);
        //list1.stream().reduce(0, Integer::sum);
        System.out.println((Integer)reduce);

        //收集collect
        List<Integer> list2 = Arrays.asList(1, 2, 3, 6 ,5 , 4);
        List<Integer> collect = list2.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        //list2.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(list2);
    }
}
