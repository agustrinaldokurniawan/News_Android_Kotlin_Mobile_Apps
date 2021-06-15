package c.d.a.s;

import java.util.concurrent.Executor;

public final class e {
    public static final Executor a = new a();
    public static final Executor b = new b();

    public class a implements Executor {
        public void execute(Runnable runnable) {
            j.f().post(runnable);
        }
    }

    public class b implements Executor {
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
