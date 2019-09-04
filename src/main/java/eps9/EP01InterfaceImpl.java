package eps9;

public class EP01InterfaceImpl implements EP01Interface {
    @Override
    public void methodAbstract() {
        System.out.println("methodAbstract from impl");
    }

    @Override
    public void methodDefault() {
        System.out.println("methodDefault from impl");
    }

    public static void main(String[] args) {
        // interface static method can only be used by interface, not implementation.
        // interface private method can only be used inside of the interface.
        EP01Interface.methodStatic();
        //EP01Interface.privateMethod();
        //EP01InterfaceImpl.methodStatic();

        EP01Interface ep01Interface = new EP01InterfaceImpl();
        ep01Interface.methodAbstract();
        ep01Interface.methodDefault();

    }
}
