package d.a;

public final class w0 {
    public static final ThreadLocal<a0> a = new ThreadLocal<>();
    public static final w0 b = null;

    public static final a0 a() {
        ThreadLocal<a0> threadLocal = a;
        a0 a0Var = threadLocal.get();
        if (a0Var != null) {
            return a0Var;
        }
        c cVar = new c(Thread.currentThread());
        threadLocal.set(cVar);
        return cVar;
    }
}
