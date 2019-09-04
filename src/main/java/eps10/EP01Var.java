package eps10;

import org.junit.Test;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

/*
* To use var (var is not a key word, it is a type symbol. It can be used as method or variable name, but not class name.):
* 1. local variable must be defined, like var x; // wrong
* 2. local variable can't be null, like var x = null; // wrong
* 3. Can't be used as method return type
* 4. Can't be used as method argument type
* 5. Can't be used as constructor argument type
* 6. Can't be used as field variable type
* 7. Can't be used in catch exception type
* 8. Can't be used in declaring functional interface
* */
public class EP01Var {

    @Test
    public void testVar1() {
        int num = 10;
        var num1 = 100;
        System.out.println(num1);

        ArrayList<Integer> list = new ArrayList<>();
        var list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);

        for (var i : list1) {
            System.out.println(i);
        }

        for (var i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    @Test
    public void testVar2() {
        Supplier<Double> supplier = () -> Math.random();

        // wrong
        // var supplier1 = () -> Math.random();

        Consumer<String> consumer = System.out::println;

        //wrong
        //var consumer1 = System.out::println;

        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        var arr3 = new int[]{1, 2, 3, 4};

        // wrong
        //var arr4 = {1, 2, 3, 4};
    }
}
