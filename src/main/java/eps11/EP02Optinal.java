package eps11;


import org.junit.Test;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/*
 * 1. JDK 9: ifPresentOrElse(Consumer<? super T>action, Runnable emptyAction)
 * 2. JDK 9: Optional<T> or(Supplier<? extends Optional<?extends T>> supplier)
 * 3. JDK 9: Stream<T> stream()
 * 4. JDK 10: T orElseThrow()
 * 5. JDK 11: boolean isEmpty()
 * 8. JDK 8: boolean isPresent()
 * */
public class EP02Optinal {


    @Test
    public   void testOr() {
        var op1 = Optional.empty();
        var op2 = Optional.of("123");
        var op3 = Optional.of("abc");

        var op4 = op1.or(() -> op2);
        var op5 = op3.or(() -> op2);

        System.out.println("op4 is " + op4);
        System.out.println("op5 is " + op5);

    }

    @Test
    public   void testIfPresentOrElse() {
        var op1 = Optional.empty();
        var op2 = Optional.of("abc");

        AtomicInteger successCounter = new AtomicInteger(0);
        AtomicInteger onEmptyOptionalCounter = new AtomicInteger(0);

        op1.ifPresentOrElse(e -> successCounter.incrementAndGet(), onEmptyOptionalCounter::incrementAndGet);

        System.out.println(successCounter.get());
        System.out.println(onEmptyOptionalCounter.get());

        op2.ifPresentOrElse(e -> successCounter.incrementAndGet(), onEmptyOptionalCounter::incrementAndGet);

        System.out.println(successCounter.get());
        System.out.println(onEmptyOptionalCounter.get());

    }

    @Test
    public   void testIsEmpty() {
        Optional<Object> op = Optional.empty();
        System.out.println(op.isPresent());
        System.out.println(op.isEmpty());
    }

    @Test
    public   void testOrElseThrow() {
        var op = Optional.empty();

        try {
            var obj = op.orElseThrow();
        } catch (NoSuchElementException e) {
            System.out.println("obj is null");
        }

        op = Optional.of("abc");
        var obj2 = op.orElseThrow();
        System.out.println(obj2);
    }

    @Test
    public   void testStream() {
        // given
        var value1 = Optional.of("a");

        // when
        List<String> collect = value1.stream().map(String::toUpperCase).collect(Collectors.toList());

        // then
        System.out.println(collect.contains("A"));

        Optional<String> value2 = Optional.empty();
        if (value2.isEmpty()) {
            System.out.println("value2 is empty");
        } else {
            List<String> collect2 = value2.stream().map(String::toUpperCase).collect(Collectors.toList());
            System.out.println(collect2.contains("A"));
        }
    }
}
