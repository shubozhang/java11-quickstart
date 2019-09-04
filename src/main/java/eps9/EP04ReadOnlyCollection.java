package eps9;

import org.junit.Test;

import java.util.*;

public class EP04ReadOnlyCollection {

    @Test
    public void testReadOnlyCollection01() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.add(6); // will throw exception
    }

    @Test
    public void testReadOnlyCollection02() {
        List<String> nameList = new ArrayList<>();
        nameList.add("Adam");
        nameList.add("Bob");
        nameList.add("Chris");
        nameList = Collections.unmodifiableList(nameList);

        nameList.add("David"); // will throw exception
        nameList.forEach(e -> System.out.println(e));
    }

    @Test
    public void testReadOnlyCollection03() {
        List<String> list = Collections.unmodifiableList(Arrays.asList("A", "B", "C"));
        Set<String> set = Collections.unmodifiableSet(new HashSet<>(Arrays.asList("A", "B", "C")));
        // only works in JDK 8 +
        Map<String, Integer> map = Collections.unmodifiableMap(new HashMap<>() {
            {
                put("a", 1);
                put("b", 1);
                put("c", 1);
            }
        });
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    // JDK 9+
    @Test
    public void testReadOnlyCollection04() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list);

        Set<Integer> integers = Set.of(1, 2, 3);
        System.out.println(integers);

        Map<String, Integer> map = Map.of("Tom", 20, "Jerry", 21);
        map.forEach((k, v) -> System.out.println(k + " : " + v));

        Map<String, Integer> map1 = Map.ofEntries(Map.entry("tom", 30), Map.entry("Jerry", 40));
        map1.forEach((k, v) -> System.out.println(k + " : " + v));

    }
}
