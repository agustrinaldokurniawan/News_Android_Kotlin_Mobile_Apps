package c.d.a.s.k;

import android.util.Log;
import c.d.a.s.k.d;

public final class a {
    public static final e<Object> a = new C0036a();

    /* renamed from: c.d.a.s.k.a$a  reason: collision with other inner class name */
    public class C0036a implements e<Object> {
        @Override // c.d.a.s.k.a.e
        public void a(Object obj) {
        }
    }

    public interface b<T> {
        T a();
    }

    public static final class c<T> implements g.h.i.c<T> {
        public final b<T> a;
        public final e<T> b;

        /* renamed from: c  reason: collision with root package name */
        public final g.h.i.c<T> f1167c;

        public c(g.h.i.c<T> cVar, b<T> bVar, e<T> eVar) {
            this.f1167c = cVar;
            this.a = bVar;
            this.b = eVar;
        }

        @Override // g.h.i.c
        public boolean a(T t) {
            if (t instanceof d) {
                ((d.b) t.a()).a = true;
            }
            this.b.a(t);
            return this.f1167c.a(t);
        }

        @Override // g.h.i.c
        public T b() {
            T b2 = this.f1167c.b();
            if (b2 == null) {
                b2 = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder f2 = c.c.a.a.a.f("Created new ");
                    f2.append(b2.getClass());
                    Log.v("FactoryPools", f2.toString());
                }
            }
            if (b2 instanceof d) {
                ((d.b) b2.a()).a = false;
            }
            return b2;
        }
    }

    public interface d {
        d a();
    }

    public interface e<T> {
        void a(T t);
    }

    public static <T extends d> g.h.i.c<T> a(int i2, b<T> bVar) {
        return new c(new g.h.i.e(i2), bVar, a);
    }
}
