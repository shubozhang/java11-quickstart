package eps9;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

/*
 * 1. Added four new APIs: takeWhile, dropWhile, ofNullable, and iterate
 * */
public class EP06StreamAPI {

    // take the elements from start to the condition
    @Test
    public void testTakeWhile() {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6);
        list1.stream().takeWhile(x -> x < 4).forEach(System.out::println);
    }

    // drop the elements from start to the condition and keep the remaining ones
    @Test
    public void testDropWhile() {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6);
        list1.stream().dropWhile(x -> x < 4).forEach(System.out::println);
    }

    @Test
    public void testOfNullable() {
        // null can be one of the elements in the stream, but can't be the only one element.
        Stream<Integer> stream1 = Stream.of(1, 2, 3, null);


        stream1.forEach(System.out::println);

        // two nulls are also ok
        Stream<Integer> stream2 = Stream.of(null, null);
        stream2.forEach(System.out::println);

        // Only one null will throw exception
        //Stream<Integer> stream3 = Stream.of(null);

        Integer i = 10;
        Stream<Object> stream4 = Stream.ofNullable(i);
        stream4.forEach(System.out::println);

        Integer j = null;
        Stream<Object> stream5 = Stream.ofNullable(j);
        long count = stream5.count();
        System.out.println(count);
    }

    @Test
    public void testIterateJDK8() {
        // create an infinite data source
        Stream.iterate(0, x -> x + 1).limit(10).forEach(System.out::println);
    }

    @Test
    public void testIterateJDK9() {
        // create an infinite data source
        Stream.iterate(0, x -> x < 10, x -> x + 1).forEach(System.out::println);
    }
}
