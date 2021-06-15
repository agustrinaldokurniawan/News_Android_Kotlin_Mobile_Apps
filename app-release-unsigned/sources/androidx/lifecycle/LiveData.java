package androidx.lifecycle;

import g.l.b.v0;
import g.n.e;
import g.n.g;
import g.n.i;
import g.n.j;
import g.n.p;
import java.util.Map;

public abstract class LiveData<T> {
    public static final Object a = new Object();
    public final Object b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public g.c.a.b.b<p<? super T>, LiveData<T>.c> f188c = new g.c.a.b.b<>();

    /* renamed from: d  reason: collision with root package name */
    public int f189d = 0;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f190f;

    /* renamed from: g  reason: collision with root package name */
    public volatile Object f191g;

    /* renamed from: h  reason: collision with root package name */
    public int f192h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f193i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f194j;

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f195k;

    public class LifecycleBoundObserver extends LiveData<T>.c implements g {
        public final i e;

        public LifecycleBoundObserver(i iVar, p<? super T> pVar) {
            super(pVar);
            this.e = iVar;
        }

        @Override // g.n.g
        public void d(i iVar, e.a aVar) {
            e.b bVar = ((j) this.e.a()).b;
            if (bVar == e.b.DESTROYED) {
                LiveData.this.g(this.a);
                return;
            }
            e.b bVar2 = null;
            while (bVar2 != bVar) {
                h(k());
                bVar2 = bVar;
                bVar = ((j) this.e.a()).b;
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public void i() {
            j jVar = (j) this.e.a();
            jVar.d("removeObserver");
            jVar.a.e(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean j(i iVar) {
            return this.e == iVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return ((j) this.e.a()).b.compareTo(e.b.STARTED) >= 0;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: androidx.lifecycle.LiveData */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            Object obj;
            synchronized (LiveData.this.b) {
                obj = LiveData.this.f191g;
                LiveData.this.f191g = LiveData.a;
            }
            LiveData.this.h(obj);
        }
    }

    public class b extends LiveData<T>.c {
        public b(LiveData liveData, p<? super T> pVar) {
            super(pVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return true;
        }
    }

    public abstract class c {
        public final p<? super T> a;
        public boolean b;

        /* renamed from: c  reason: collision with root package name */
        public int f197c = -1;

        public c(p<? super T> pVar) {
            this.a = pVar;
        }

        public void h(boolean z) {
            if (z != this.b) {
                this.b = z;
                LiveData liveData = LiveData.this;
                int i2 = z ? 1 : -1;
                int i3 = liveData.f189d;
                liveData.f189d = i2 + i3;
                if (!liveData.e) {
                    liveData.e = true;
                    while (true) {
                        try {
                            int i4 = liveData.f189d;
                            if (i3 == i4) {
                                break;
                            }
                            boolean z2 = i3 == 0 && i4 > 0;
                            boolean z3 = i3 > 0 && i4 == 0;
                            if (z2) {
                                liveData.e();
                            } else if (z3) {
                                liveData.f();
                            }
                            i3 = i4;
                        } finally {
                            liveData.e = false;
                        }
                    }
                }
                if (this.b) {
                    LiveData.this.c(this);
                }
            }
        }

        public void i() {
        }

        public boolean j(i iVar) {
            return false;
        }

        public abstract boolean k();
    }

    public LiveData() {
        Object obj = a;
        this.f191g = obj;
        this.f195k = new a();
        this.f190f = obj;
        this.f192h = -1;
    }

    public static void a(String str) {
        if (!g.c.a.a.a.d().b()) {
            throw new IllegalStateException(c.c.a.a.a.c("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(LiveData<T>.c cVar) {
        if (cVar.b) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int i2 = cVar.f197c;
            int i3 = this.f192h;
            if (i2 < i3) {
                cVar.f197c = i3;
                cVar.a.a((Object) this.f190f);
            }
        }
    }

    public void c(LiveData<T>.c cVar) {
        if (this.f193i) {
            this.f194j = true;
            return;
        }
        this.f193i = true;
        do {
            this.f194j = false;
            if (cVar == null) {
                g.c.a.b.b<K, V>.d b2 = this.f188c.b();
                while (b2.hasNext()) {
                    b((c) ((Map.Entry) b2.next()).getValue());
                    if (this.f194j) {
                        break;
                    }
                }
            } else {
                b(cVar);
                cVar = null;
            }
        } while (this.f194j);
        this.f193i = false;
    }

    public void d(i iVar, p<? super T> pVar) {
        a("observe");
        v0 v0Var = (v0) iVar;
        v0Var.e();
        if (v0Var.f2779f.b != e.b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(iVar, pVar);
            LiveData<T>.c d2 = this.f188c.d(pVar, lifecycleBoundObserver);
            if (d2 != null && !d2.j(iVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (d2 == null) {
                v0 v0Var2 = (v0) iVar;
                v0Var2.e();
                v0Var2.f2779f.a(lifecycleBoundObserver);
            }
        }
    }

    public void e() {
    }

    public void f() {
    }

    public void g(p<? super T> pVar) {
        a("removeObserver");
        LiveData<T>.c e2 = this.f188c.e(pVar);
        if (e2 != null) {
            e2.i();
            e2.h(false);
        }
    }

    public void h(T t) {
        a("setValue");
        this.f192h++;
        this.f190f = t;
        c(null);
    }
}
