package ouyang.proxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        ITest test = (ITest) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[] {ITest.class }, new AopInvocationHandler());
        test.sayHello();
    }

}
