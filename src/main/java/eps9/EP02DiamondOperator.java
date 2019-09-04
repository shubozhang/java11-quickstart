package eps9;

import java.util.ArrayList;
import java.util.Comparator;

public class EP02DiamondOperator {

    // JDK 7 new feature
    ArrayList<String> arrayList = new ArrayList<>();

    // JDK 8
    Comparator<Object> comparator1 = new Comparator<Object>() {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    };

    // JDK 9
    Comparator<Object> comparator2 = new Comparator<>() {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    };
}
