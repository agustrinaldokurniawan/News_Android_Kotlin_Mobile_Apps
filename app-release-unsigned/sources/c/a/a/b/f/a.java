package c.a.a.b.f;

import i.s.c.h;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class a {
    public final Executor a;

    public a() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        h.d(newSingleThreadExecutor, "newSingleThreadExecutor()");
        h.e(newSingleThreadExecutor, "diskIO");
        this.a = newSingleThreadExecutor;
    }
}
