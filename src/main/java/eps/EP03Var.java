package main.java.eps;

import java.util.function.Consumer;

/*
* The benefit of using var is add annotation to lambda expression
* */
public class EP03Var {

    public static void main(String[] args) {
        Consumer<String> con1 = (t) -> System.out.println(t.toUpperCase());
        Consumer<String> con2 = (@Deprecated String t) -> System.out.println(t.toUpperCase());

        con1.accept("abc");
        con2.accept("bryan");
    }
}
