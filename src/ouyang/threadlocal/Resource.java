package ouyang.threadlocal;

public class Resource {

    private static ThreadLocal<Integer> threadLocalValue = new ThreadLocal<>();
    private static Integer value;

    public void setValue(Integer id) {
        threadLocalValue.set(id);
        value = id;
    }

    public Integer getThreadLocalValue() {
        return threadLocalValue.get();
    }

    public Integer getValue() {
        return value;
    }

}
