package c.d.a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import c.d.a.c;
import c.d.a.m.v.k;
import c.d.a.n.c;
import c.d.a.n.d;
import c.d.a.n.l;
import c.d.a.n.m;
import c.d.a.n.n;
import c.d.a.n.q;
import c.d.a.n.r;
import c.d.a.n.t;
import c.d.a.q.e;
import c.d.a.q.f;
import c.d.a.q.j.h;
import c.d.a.s.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public class i implements ComponentCallbacks2, m {
    public static final f e;

    /* renamed from: f  reason: collision with root package name */
    public final b f759f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f760g;

    /* renamed from: h  reason: collision with root package name */
    public final l f761h;

    /* renamed from: i  reason: collision with root package name */
    public final r f762i;

    /* renamed from: j  reason: collision with root package name */
    public final q f763j;

    /* renamed from: k  reason: collision with root package name */
    public final t f764k = new t();

    /* renamed from: l  reason: collision with root package name */
    public final Runnable f765l;

    /* renamed from: m  reason: collision with root package name */
    public final c f766m;
    public final CopyOnWriteArrayList<e<Object>> n;
    public f o;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            i iVar = i.this;
            iVar.f761h.a(iVar);
        }
    }

    public class b implements c.a {
        public final r a;

        public b(r rVar) {
            this.a = rVar;
        }
    }

    static {
        f fVar = (f) new f().f(Bitmap.class);
        fVar.x = true;
        e = fVar;
        ((f) new f().f(c.d.a.m.x.g.c.class)).x = true;
        f fVar2 = (f) ((f) ((f) new f().g(k.b)).l(f.LOW)).q(true);
    }

    public i(b bVar, l lVar, q qVar, Context context) {
        f fVar;
        r rVar = new r();
        d dVar = bVar.f729m;
        a aVar = new a();
        this.f765l = aVar;
        this.f759f = bVar;
        this.f761h = lVar;
        this.f763j = qVar;
        this.f762i = rVar;
        this.f760g = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(rVar);
        Objects.requireNonNull((c.d.a.n.f) dVar);
        boolean z = g.h.c.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        c eVar = z ? new c.d.a.n.e(applicationContext, bVar2) : new n();
        this.f766m = eVar;
        if (j.i()) {
            j.f().post(aVar);
        } else {
            lVar.a(this);
        }
        lVar.a(eVar);
        this.n = new CopyOnWriteArrayList<>(bVar.f725i.f742f);
        d dVar2 = bVar.f725i;
        synchronized (dVar2) {
            if (dVar2.f747k == null) {
                Objects.requireNonNull((c.a) dVar2.e);
                f fVar2 = new f();
                fVar2.x = true;
                dVar2.f747k = fVar2;
            }
            fVar = dVar2.f747k;
        }
        synchronized (this) {
            f fVar3 = (f) fVar.clone();
            if (fVar3.x) {
                if (!fVar3.z) {
                    throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
                }
            }
            fVar3.z = true;
            fVar3.x = true;
            this.o = fVar3;
        }
        synchronized (bVar.n) {
            if (!bVar.n.contains(this)) {
                bVar.n.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    @Override // c.d.a.n.m
    public synchronized void e() {
        n();
        this.f764k.e();
    }

    @Override // c.d.a.n.m
    public synchronized void i() {
        o();
        this.f764k.i();
    }

    @Override // c.d.a.n.m
    public synchronized void k() {
        this.f764k.k();
        for (h<?> hVar : j.e(this.f764k.e)) {
            l(hVar);
        }
        this.f764k.e.clear();
        r rVar = this.f762i;
        Iterator it = ((ArrayList) j.e(rVar.a)).iterator();
        while (it.hasNext()) {
            rVar.a((c.d.a.q.c) it.next());
        }
        rVar.b.clear();
        this.f761h.b(this);
        this.f761h.b(this.f766m);
        j.f().removeCallbacks(this.f765l);
        b bVar = this.f759f;
        synchronized (bVar.n) {
            if (bVar.n.contains(this)) {
                bVar.n.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public void l(h<?> hVar) {
        boolean z;
        if (hVar != null) {
            boolean p = p(hVar);
            c.d.a.q.c f2 = hVar.f();
            if (!p) {
                b bVar = this.f759f;
                synchronized (bVar.n) {
                    Iterator<i> it = bVar.n.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().p(hVar)) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z && f2 != null) {
                    hVar.j(null);
                    f2.clear();
                }
            }
        }
    }

    public h<Drawable> m(Object obj) {
        return new h(this.f759f, this, Drawable.class, this.f760g).E(obj);
    }

    public synchronized void n() {
        r rVar = this.f762i;
        rVar.f1124c = true;
        Iterator it = ((ArrayList) j.e(rVar.a)).iterator();
        while (it.hasNext()) {
            c.d.a.q.c cVar = (c.d.a.q.c) it.next();
            if (cVar.isRunning()) {
                cVar.e();
                rVar.b.add(cVar);
            }
        }
    }

    public synchronized void o() {
        r rVar = this.f762i;
        rVar.f1124c = false;
        Iterator it = ((ArrayList) j.e(rVar.a)).iterator();
        while (it.hasNext()) {
            c.d.a.q.c cVar = (c.d.a.q.c) it.next();
            if (!cVar.i() && !cVar.isRunning()) {
                cVar.f();
            }
        }
        rVar.b.clear();
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i2) {
    }

    public synchronized boolean p(h<?> hVar) {
        c.d.a.q.c f2 = hVar.f();
        if (f2 == null) {
            return true;
        }
        if (!this.f762i.a(f2)) {
            return false;
        }
        this.f764k.e.remove(hVar);
        hVar.j(null);
        return true;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f762i + ", treeNode=" + this.f763j + "}";
    }
}
