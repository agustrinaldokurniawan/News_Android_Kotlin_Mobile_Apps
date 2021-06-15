package c.d.a.m.v.c0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;

public final class i implements b {
    public final g<a, Object> a = new g<>();
    public final b b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f861c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, a<?>> f862d = new HashMap();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public int f863f;

    public static final class a implements l {
        public final b a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f864c;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // c.d.a.m.v.c0.l
        public void a() {
            this.a.c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.f864c == aVar.f864c;
        }

        public int hashCode() {
            int i2 = this.b * 31;
            Class<?> cls = this.f864c;
            return i2 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("Key{size=");
            f2.append(this.b);
            f2.append("array=");
            f2.append(this.f864c);
            f2.append('}');
            return f2.toString();
        }
    }

    public static final class b extends c<a> {
        /* Return type fixed from 'c.d.a.m.v.c0.l' to match base method */
        @Override // c.d.a.m.v.c0.c
        public a a() {
            return new a(this);
        }

        public a d(int i2, Class<?> cls) {
            a aVar = (a) b();
            aVar.b = i2;
            aVar.f864c = cls;
            return aVar;
        }
    }

    public i(int i2) {
        this.e = i2;
    }

    @Override // c.d.a.m.v.c0.b
    public synchronized void a(int i2) {
        if (i2 >= 40) {
            synchronized (this) {
                g(0);
            }
        } else if (i2 >= 20 || i2 == 15) {
            g(this.e / 2);
        }
    }

    @Override // c.d.a.m.v.c0.b
    public synchronized void b() {
        g(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Class<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.d.a.m.v.c0.b
    public synchronized <T> T c(int i2, Class<T> cls) {
        a aVar;
        aVar = (a) this.b.b();
        aVar.b = i2;
        aVar.f864c = cls;
        return (T) i(aVar, cls);
    }

    @Override // c.d.a.m.v.c0.b
    public synchronized <T> void d(T t) {
        Class<?> cls = t.getClass();
        a<T> h2 = h(cls);
        int b2 = h2.b(t);
        int c2 = h2.c() * b2;
        int i2 = 1;
        if (c2 <= this.e / 2) {
            a d2 = this.b.d(b2, cls);
            this.a.b(d2, t);
            NavigableMap<Integer, Integer> j2 = j(cls);
            Integer num = (Integer) j2.get(Integer.valueOf(d2.b));
            Integer valueOf = Integer.valueOf(d2.b);
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            j2.put(valueOf, Integer.valueOf(i2));
            this.f863f += c2;
            g(this.e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.lang.Class<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    @Override // c.d.a.m.v.c0.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> T e(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.j(r7)     // Catch:{ all -> 0x004d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch:{ all -> 0x004d }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x004d }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            int r3 = r5.f863f     // Catch:{ all -> 0x004d }
            if (r3 == 0) goto L_0x0020
            int r4 = r5.e     // Catch:{ all -> 0x004d }
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r3 = r2
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            if (r3 != 0) goto L_0x002d
            int r3 = r0.intValue()     // Catch:{ all -> 0x004d }
            int r4 = r6 * 8
            if (r3 > r4) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x003a
            c.d.a.m.v.c0.i$b r6 = r5.b     // Catch:{ all -> 0x004d }
            int r0 = r0.intValue()     // Catch:{ all -> 0x004d }
            c.d.a.m.v.c0.i$a r6 = r6.d(r0, r7)     // Catch:{ all -> 0x004d }
            goto L_0x0047
        L_0x003a:
            c.d.a.m.v.c0.i$b r0 = r5.b     // Catch:{ all -> 0x004d }
            c.d.a.m.v.c0.l r0 = r0.b()     // Catch:{ all -> 0x004d }
            c.d.a.m.v.c0.i$a r0 = (c.d.a.m.v.c0.i.a) r0     // Catch:{ all -> 0x004d }
            r0.b = r6     // Catch:{ all -> 0x004d }
            r0.f864c = r7     // Catch:{ all -> 0x004d }
            r6 = r0
        L_0x0047:
            java.lang.Object r6 = r5.i(r6, r7)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return r6
        L_0x004d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.m.v.c0.i.e(int, java.lang.Class):java.lang.Object");
    }

    public final void f(int i2, Class<?> cls) {
        NavigableMap<Integer, Integer> j2 = j(cls);
        Integer num = (Integer) j2.get(Integer.valueOf(i2));
        if (num != null) {
            int intValue = num.intValue();
            Integer valueOf = Integer.valueOf(i2);
            if (intValue == 1) {
                j2.remove(valueOf);
            } else {
                j2.put(valueOf, Integer.valueOf(num.intValue() - 1));
            }
        } else {
            throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + this);
        }
    }

    public final void g(int i2) {
        while (this.f863f > i2) {
            Object c2 = this.a.c();
            Objects.requireNonNull(c2, "Argument must not be null");
            a h2 = h(c2.getClass());
            this.f863f -= h2.c() * h2.b(c2);
            f(h2.b(c2), c2.getClass());
            if (Log.isLoggable(h2.a(), 2)) {
                String a2 = h2.a();
                StringBuilder f2 = c.c.a.a.a.f("evicted: ");
                f2.append(h2.b(c2));
                Log.v(a2, f2.toString());
            }
        }
    }

    public final <T> a<T> h(Class<T> cls) {
        f fVar = (a<T>) this.f862d.get(cls);
        if (fVar == null) {
            if (cls.equals(int[].class)) {
                fVar = new h();
            } else if (cls.equals(byte[].class)) {
                fVar = new f();
            } else {
                StringBuilder f2 = c.c.a.a.a.f("No array pool found for: ");
                f2.append(cls.getSimpleName());
                throw new IllegalArgumentException(f2.toString());
            }
            this.f862d.put(cls, fVar);
        }
        return fVar;
    }

    public final <T> T i(a aVar, Class<T> cls) {
        a<T> h2 = h(cls);
        T t = (T) this.a.a(aVar);
        if (t != null) {
            this.f863f -= h2.c() * h2.b(t);
            f(h2.b(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(h2.a(), 2)) {
            String a2 = h2.a();
            StringBuilder f2 = c.c.a.a.a.f("Allocated ");
            f2.append(aVar.b);
            f2.append(" bytes");
            Log.v(a2, f2.toString());
        }
        return h2.newArray(aVar.b);
    }

    public final NavigableMap<Integer, Integer> j(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f861c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f861c.put(cls, treeMap);
        return treeMap;
    }
}
