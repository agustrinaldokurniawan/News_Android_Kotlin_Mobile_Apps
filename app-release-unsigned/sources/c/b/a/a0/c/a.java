package c.b.a.a0.c;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

public abstract class a<K, A> {
    public final List<b> a = new ArrayList(1);
    public boolean b = false;

    /* renamed from: c  reason: collision with root package name */
    public final d<K> f487c;

    /* renamed from: d  reason: collision with root package name */
    public float f488d = 0.0f;
    public c.b.a.g0.c<A> e;

    /* renamed from: f  reason: collision with root package name */
    public A f489f = null;

    /* renamed from: g  reason: collision with root package name */
    public float f490g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f491h = -1.0f;

    public interface b {
        void b();
    }

    public static final class c<T> implements d<T> {
        public c(C0009a aVar) {
        }

        @Override // c.b.a.a0.c.a.d
        public float a() {
            return 1.0f;
        }

        @Override // c.b.a.a0.c.a.d
        public boolean b(float f2) {
            throw new IllegalStateException("not implemented");
        }

        @Override // c.b.a.a0.c.a.d
        public float c() {
            return 0.0f;
        }

        @Override // c.b.a.a0.c.a.d
        public c.b.a.g0.a<T> d() {
            throw new IllegalStateException("not implemented");
        }

        @Override // c.b.a.a0.c.a.d
        public boolean e(float f2) {
            return false;
        }

        @Override // c.b.a.a0.c.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    public interface d<T> {
        float a();

        boolean b(float f2);

        float c();

        c.b.a.g0.a<T> d();

        boolean e(float f2);

        boolean isEmpty();
    }

    public static final class e<T> implements d<T> {
        public final List<? extends c.b.a.g0.a<T>> a;
        public c.b.a.g0.a<T> b;

        /* renamed from: c  reason: collision with root package name */
        public c.b.a.g0.a<T> f492c = null;

        /* renamed from: d  reason: collision with root package name */
        public float f493d = -1.0f;

        public e(List<? extends c.b.a.g0.a<T>> list) {
            this.a = list;
            this.b = f(0.0f);
        }

        @Override // c.b.a.a0.c.a.d
        public float a() {
            List<? extends c.b.a.g0.a<T>> list = this.a;
            return ((c.b.a.g0.a) list.get(list.size() - 1)).b();
        }

        @Override // c.b.a.a0.c.a.d
        public boolean b(float f2) {
            c.b.a.g0.a<T> aVar = this.f492c;
            c.b.a.g0.a<T> aVar2 = this.b;
            if (aVar == aVar2 && this.f493d == f2) {
                return true;
            }
            this.f492c = aVar2;
            this.f493d = f2;
            return false;
        }

        @Override // c.b.a.a0.c.a.d
        public float c() {
            return ((c.b.a.g0.a) this.a.get(0)).c();
        }

        @Override // c.b.a.a0.c.a.d
        public c.b.a.g0.a<T> d() {
            return this.b;
        }

        @Override // c.b.a.a0.c.a.d
        public boolean e(float f2) {
            if (this.b.a(f2)) {
                return !this.b.d();
            }
            this.b = f(f2);
            return true;
        }

        public final c.b.a.g0.a<T> f(float f2) {
            List<? extends c.b.a.g0.a<T>> list = this.a;
            c.b.a.g0.a<T> aVar = (c.b.a.g0.a) list.get(list.size() - 1);
            if (f2 >= aVar.c()) {
                return aVar;
            }
            for (int size = this.a.size() - 2; size >= 1; size--) {
                c.b.a.g0.a<T> aVar2 = (c.b.a.g0.a) this.a.get(size);
                if (this.b != aVar2 && aVar2.a(f2)) {
                    return aVar2;
                }
            }
            return (c.b.a.g0.a) this.a.get(0);
        }

        @Override // c.b.a.a0.c.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public static final class f<T> implements d<T> {
        public final c.b.a.g0.a<T> a;
        public float b = -1.0f;

        public f(List<? extends c.b.a.g0.a<T>> list) {
            this.a = (c.b.a.g0.a) list.get(0);
        }

        @Override // c.b.a.a0.c.a.d
        public float a() {
            return this.a.b();
        }

        @Override // c.b.a.a0.c.a.d
        public boolean b(float f2) {
            if (this.b == f2) {
                return true;
            }
            this.b = f2;
            return false;
        }

        @Override // c.b.a.a0.c.a.d
        public float c() {
            return this.a.c();
        }

        @Override // c.b.a.a0.c.a.d
        public c.b.a.g0.a<T> d() {
            return this.a;
        }

        @Override // c.b.a.a0.c.a.d
        public boolean e(float f2) {
            return !this.a.d();
        }

        @Override // c.b.a.a0.c.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends c.b.a.g0.a<K>> list) {
        d<K> dVar;
        if (list.isEmpty()) {
            dVar = new c<>(null);
        } else {
            dVar = list.size() == 1 ? new f<>(list) : new e<>(list);
        }
        this.f487c = dVar;
    }

    public c.b.a.g0.a<K> a() {
        c.b.a.g0.a<K> d2 = this.f487c.d();
        c.b.a.d.a("BaseKeyframeAnimation#getCurrentKeyframe");
        return d2;
    }

    public float b() {
        if (this.f491h == -1.0f) {
            this.f491h = this.f487c.a();
        }
        return this.f491h;
    }

    public float c() {
        c.b.a.g0.a<K> a2 = a();
        if (a2.d()) {
            return 0.0f;
        }
        return a2.f676d.getInterpolation(d());
    }

    public float d() {
        if (this.b) {
            return 0.0f;
        }
        c.b.a.g0.a<K> a2 = a();
        if (a2.d()) {
            return 0.0f;
        }
        return (this.f488d - a2.c()) / (a2.b() - a2.c());
    }

    public A e() {
        float d2 = d();
        if (this.e == null && this.f487c.b(d2)) {
            return this.f489f;
        }
        c.b.a.g0.a<K> a2 = a();
        Interpolator interpolator = a2.e;
        A f2 = (interpolator == null || a2.f677f == null) ? f(a2, c()) : g(a2, d2, interpolator.getInterpolation(d2), a2.f677f.getInterpolation(d2));
        this.f489f = f2;
        return f2;
    }

    public abstract A f(c.b.a.g0.a<K> aVar, float f2);

    public A g(c.b.a.g0.a<K> aVar, float f2, float f3, float f4) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            this.a.get(i2).b();
        }
    }

    public void i(float f2) {
        if (!this.f487c.isEmpty()) {
            if (this.f490g == -1.0f) {
                this.f490g = this.f487c.c();
            }
            float f3 = this.f490g;
            if (f2 < f3) {
                if (f3 == -1.0f) {
                    this.f490g = this.f487c.c();
                }
                f2 = this.f490g;
            } else if (f2 > b()) {
                f2 = b();
            }
            if (f2 != this.f488d) {
                this.f488d = f2;
                if (this.f487c.e(f2)) {
                    h();
                }
            }
        }
    }

    public void j(c.b.a.g0.c<A> cVar) {
        c.b.a.g0.c<A> cVar2 = this.e;
        this.e = null;
    }
}
