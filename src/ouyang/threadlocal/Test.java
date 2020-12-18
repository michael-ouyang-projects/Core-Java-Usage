package ouyang.threadlocal;

public class Test {

    private static ThreadLocal<String> threadLocalValue = new ThreadLocal<>();
    private static String value;

    public void setValue(String name) {
        threadLocalValue.set(name);
        value = name;
    }

    public String getThreadLocalValue() {
        return threadLocalValue.get();
    }

    public String getValue() {
        return value;
    }

}
