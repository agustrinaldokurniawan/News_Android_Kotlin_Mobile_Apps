package d.a.a1;

import d.a.a.p;
import d.a.s;
import h.a.t.a;

public final class b extends c {

    /* renamed from: k  reason: collision with root package name */
    public static final s f1789k;

    /* renamed from: l  reason: collision with root package name */
    public static final b f1790l;

    static {
        b bVar = new b();
        f1790l = bVar;
        int i2 = p.a;
        f1789k = new e(bVar, a.X("kotlinx.coroutines.io.parallelism", 64 < i2 ? i2 : 64, 0, 0, 12, null), "Dispatchers.IO", 1);
    }

    public b() {
        super(0, 0, null, 7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // d.a.s
    public String toString() {
        return "Dispatchers.Default";
    }
}
