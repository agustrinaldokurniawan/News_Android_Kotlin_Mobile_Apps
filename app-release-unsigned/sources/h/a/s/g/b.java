package h.a.s.g;

import h.a.p.c;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class b implements Future<Object> {
    public final c e;

    public b(c cVar) {
        this.e = cVar;
    }

    public boolean cancel(boolean z) {
        this.e.e();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) {
        return null;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return false;
    }
}
