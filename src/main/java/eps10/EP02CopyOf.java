package eps10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. JDK9 adds of method to create read-only collection
 * 2. JDK10 adds CopyOf method to create read-only collection
 * 3. CopyOf(read-only-collection) return the same input arg
 *    CopyOf(modifiable-collection) return read-only-collection
 *
 * */
public class EP02CopyOf {

    @Test
    public void testCopyOf1() {
        var list1 = List.of(1, 2, 3);
        var copy1 = List.copyOf(list1);

        System.out.println(list1 == copy1);
    }

    @Test
    public void testCopyOf2() {
        var list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        var copy1 = List.copyOf(list1);

        System.out.println(list1 == copy1);
    }
}
