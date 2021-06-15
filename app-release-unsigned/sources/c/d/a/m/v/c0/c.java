package c.d.a.m.v.c0;

import c.d.a.m.v.c0.l;
import c.d.a.s.j;
import java.util.ArrayDeque;
import java.util.Queue;

public abstract class c<T extends l> {
    public final Queue<T> a = new ArrayDeque(20);

    public c() {
        char[] cArr = j.a;
    }

    public abstract T a();

    public T b() {
        T poll = this.a.poll();
        return poll == null ? a() : poll;
    }

    public void c(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
