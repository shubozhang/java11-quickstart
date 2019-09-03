package main.java.eps9;

public interface EP01Interface {

    // below three methods are public
    void methodAbstract();

    static void methodStatic(){
        System.out.println("static method");
    }

    default void methodDefault(){
        System.out.println("default method");
    }

    // After JDK9, private method is allowed in interface
    private void methodPrivate() {
        System.out.println("private method");
    }

}
