package c.d.a.s;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class g<T, Y> {
    public final Map<T, a<Y>> a = new LinkedHashMap(100, 0.75f, true);
    public long b;

    /* renamed from: c  reason: collision with root package name */
    public long f1164c;

    public static final class a<Y> {
        public final Y a;
        public final int b;

        public a(Y y, int i2) {
            this.a = y;
            this.b = i2;
        }
    }

    public g(long j2) {
        this.b = j2;
    }

    public synchronized Y a(T t) {
        a<Y> aVar;
        aVar = this.a.get(t);
        return aVar != null ? aVar.a : null;
    }

    public int b(Y y) {
        return 1;
    }

    public void c(T t, Y y) {
    }

    public synchronized Y d(T t, Y y) {
        int b2 = b(y);
        long j2 = (long) b2;
        Y y2 = null;
        if (j2 >= this.b) {
            c(t, y);
            return null;
        }
        if (y != null) {
            this.f1164c += j2;
        }
        a<Y> put = this.a.put(t, y == null ? null : new a<>(y, b2));
        if (put != null) {
            this.f1164c -= (long) put.b;
            if (!put.a.equals(y)) {
                c(t, put.a);
            }
        }
        e(this.b);
        if (put != null) {
            y2 = put.a;
        }
        return y2;
    }

    public synchronized void e(long j2) {
        while (this.f1164c > j2) {
            Iterator<Map.Entry<T, a<Y>>> it = this.a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f1164c -= (long) value.b;
            T key = next.getKey();
            it.remove();
            c(key, value.a);
        }
    }
}
