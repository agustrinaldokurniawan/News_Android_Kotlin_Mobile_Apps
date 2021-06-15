package g.e;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

public class f<K, V> {
    public final LinkedHashMap<K, V> a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f2234c;

    /* renamed from: d  reason: collision with root package name */
    public int f2235d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f2236f;

    /* renamed from: g  reason: collision with root package name */
    public int f2237g;

    public f(int i2) {
        if (i2 > 0) {
            this.f2234c = i2;
            this.a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final V a(K k2) {
        Objects.requireNonNull(k2, "key == null");
        synchronized (this) {
            V v = this.a.get(k2);
            if (v != null) {
                this.f2236f++;
                return v;
            }
            this.f2237g++;
            return null;
        }
    }

    public final V b(K k2, V v) {
        V put;
        if (k2 == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f2235d++;
            this.b++;
            put = this.a.put(k2, v);
            if (put != null) {
                this.b--;
            }
        }
        c(this.f2234c);
        return put;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(int r3) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.f.c(int):void");
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f2236f;
        i3 = this.f2237g + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f2234c), Integer.valueOf(this.f2236f), Integer.valueOf(this.f2237g), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }
}
