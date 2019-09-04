package eps9;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*
* Optional has a new method stream()
* */
public class EP07OptionalStream {

    @Test
    public void testOptionalStream(){
        List<String> list = List.of("Tom", "Jerry", "Zoe");

        Optional<List<String>>  op = Optional.ofNullable(list);
        Stream<List<String>> stream = op.stream();
        stream.flatMap(x -> x.stream()).forEach(System.out::println);
    }
}
