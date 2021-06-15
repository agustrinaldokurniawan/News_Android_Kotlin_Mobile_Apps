package g.r;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import g.t.a.c;
import g.t.a.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class j {
    @Deprecated
    public volatile g.t.a.b a;
    public Executor b;

    /* renamed from: c  reason: collision with root package name */
    public Executor f2976c;

    /* renamed from: d  reason: collision with root package name */
    public c f2977d;
    public final i e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2978f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2979g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public List<a> f2980h;

    /* renamed from: i  reason: collision with root package name */
    public final ReentrantReadWriteLock f2981i = new ReentrantReadWriteLock();

    /* renamed from: j  reason: collision with root package name */
    public a f2982j;

    /* renamed from: k  reason: collision with root package name */
    public final ThreadLocal<Integer> f2983k = new ThreadLocal<>();

    /* renamed from: l  reason: collision with root package name */
    public final Map<Class<?>, Object> f2984l;

    public static abstract class a {
    }

    public static class b {
        public HashMap<Integer, TreeMap<Integer, g.r.r.a>> a = new HashMap<>();
    }

    public j() {
        Collections.synchronizedMap(new HashMap());
        this.e = c();
        this.f2984l = new HashMap();
    }

    public void a() {
        if (!this.f2978f) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
    }

    public void b() {
        if (!g() && this.f2983k.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public abstract i c();

    public abstract c d(c cVar);

    @Deprecated
    public void e() {
        a aVar = this.f2982j;
        if (aVar == null) {
            i();
        } else {
            Objects.requireNonNull(aVar);
            throw null;
        }
    }

    public Map<Class<?>, List<Class<?>>> f() {
        return Collections.emptyMap();
    }

    public boolean g() {
        return this.f2977d.P().Z();
    }

    public final void h() {
        a();
        g.t.a.b P = this.f2977d.P();
        this.e.g(P);
        if (P.s()) {
            P.F();
        } else {
            P.k();
        }
    }

    public final void i() {
        this.f2977d.P().j();
        if (!g()) {
            i iVar = this.e;
            if (!iVar.f2966g.compareAndSet(false, true)) {
                return;
            }
            if (iVar.e == null) {
                iVar.f2965f.b.execute(iVar.f2971l);
                return;
            }
            throw null;
        }
    }

    public boolean j() {
        a aVar = this.f2982j;
        if (aVar != null) {
            return !aVar.a;
        }
        g.t.a.b bVar = this.a;
        if (bVar == null || !bVar.isOpen()) {
            return false;
        }
        return true;
    }

    public Cursor k(e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        return cancellationSignal != null ? this.f2977d.P().X(eVar, cancellationSignal) : this.f2977d.P().G(eVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: g.t.a.c */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T l(Class<T> cls, c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (cVar instanceof d) {
            return (T) l(cls, ((d) cVar).b());
        }
        return null;
    }
}
