package h.a.v;

import h.a.l;
import h.a.p.c;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T> extends b<T> {
    public static final C0116a[] e = new C0116a[0];

    /* renamed from: f  reason: collision with root package name */
    public static final C0116a[] f3282f = new C0116a[0];

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference<C0116a<T>[]> f3283g = new AtomicReference<>(f3282f);

    /* renamed from: h  reason: collision with root package name */
    public Throwable f3284h;

    /* renamed from: h.a.v.a$a  reason: collision with other inner class name */
    public static final class C0116a<T> extends AtomicBoolean implements c {
        public final l<? super T> e;

        /* renamed from: f  reason: collision with root package name */
        public final a<T> f3285f;

        public C0116a(l<? super T> lVar, a<T> aVar) {
            this.e = lVar;
            this.f3285f = aVar;
        }

        @Override // h.a.p.c
        public void e() {
            if (compareAndSet(false, true)) {
                this.f3285f.h(this);
            }
        }
    }

    @Override // h.a.l
    public void a() {
        C0116a<T>[] aVarArr = this.f3283g.get();
        C0116a<T>[] aVarArr2 = e;
        if (aVarArr != aVarArr2) {
            C0116a<T>[] andSet = this.f3283g.getAndSet(aVarArr2);
            for (C0116a<T> aVar : andSet) {
                if (!aVar.get()) {
                    aVar.e.a();
                }
            }
        }
    }

    @Override // h.a.l
    public void b(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C0116a<T>[] aVarArr = this.f3283g.get();
        C0116a<T>[] aVarArr2 = e;
        if (aVarArr == aVarArr2) {
            h.a.t.a.M(th);
            return;
        }
        this.f3284h = th;
        C0116a<T>[] andSet = this.f3283g.getAndSet(aVarArr2);
        for (C0116a<T> aVar : andSet) {
            if (aVar.get()) {
                h.a.t.a.M(th);
            } else {
                aVar.e.b(th);
            }
        }
    }

    @Override // h.a.l
    public void c(T t) {
        Objects.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        C0116a<T>[] aVarArr = this.f3283g.get();
        for (C0116a<T> aVar : aVarArr) {
            if (!aVar.get()) {
                aVar.e.c(t);
            }
        }
    }

    @Override // h.a.l
    public void d(c cVar) {
        if (this.f3283g.get() == e) {
            cVar.e();
        }
    }

    @Override // h.a.j
    public void f(l<? super T> lVar) {
        boolean z;
        C0116a<T> aVar = new C0116a<>(lVar, this);
        lVar.d(aVar);
        while (true) {
            C0116a<T>[] aVarArr = this.f3283g.get();
            z = false;
            if (aVarArr != e) {
                int length = aVarArr.length;
                C0116a<T>[] aVarArr2 = new C0116a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
                if (this.f3283g.compareAndSet(aVarArr, aVarArr2)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Throwable th = this.f3284h;
            if (th != null) {
                lVar.b(th);
            } else {
                lVar.a();
            }
        } else if (aVar.get()) {
            h(aVar);
        }
    }

    public void h(C0116a<T> aVar) {
        C0116a<T>[] aVarArr;
        C0116a<T>[] aVarArr2;
        do {
            aVarArr = this.f3283g.get();
            if (aVarArr != e && aVarArr != f3282f) {
                int length = aVarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    if (length == 1) {
                        aVarArr2 = f3282f;
                    } else {
                        C0116a<T>[] aVarArr3 = new C0116a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i2);
                        System.arraycopy(aVarArr, i2 + 1, aVarArr3, i2, (length - i2) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f3283g.compareAndSet(aVarArr, aVarArr2));
    }
}
