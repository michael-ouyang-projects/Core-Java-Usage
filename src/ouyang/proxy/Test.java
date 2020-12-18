package ouyang.proxy;

public class Test implements ITest {
    @Override
    public void sayHi() {
        System.out.println("HI");
    }

    @Override
    public void sayHello() {
        System.out.println("HELLO");
    }
}
