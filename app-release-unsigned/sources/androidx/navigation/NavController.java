package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import g.n.e;
import g.n.h;
import g.n.i;
import g.n.v;
import g.p.e;
import g.p.g;
import g.p.j;
import g.p.k;
import g.p.l;
import g.p.n;
import g.p.q;
import g.p.r;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public class NavController {
    public final Context a;
    public Activity b;

    /* renamed from: c  reason: collision with root package name */
    public n f202c;

    /* renamed from: d  reason: collision with root package name */
    public k f203d;
    public Bundle e;

    /* renamed from: f  reason: collision with root package name */
    public Parcelable[] f204f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f205g;

    /* renamed from: h  reason: collision with root package name */
    public final Deque<e> f206h = new ArrayDeque();

    /* renamed from: i  reason: collision with root package name */
    public i f207i;

    /* renamed from: j  reason: collision with root package name */
    public g f208j;

    /* renamed from: k  reason: collision with root package name */
    public r f209k = new r();

    /* renamed from: l  reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f210l = new CopyOnWriteArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public final h f211m = new g.n.g() {
        /* class androidx.navigation.NavController.AnonymousClass1 */

        @Override // g.n.g
        public void d(i iVar, e.a aVar) {
            e.b bVar;
            NavController navController = NavController.this;
            if (navController.f203d != null) {
                for (g.p.e eVar : navController.f206h) {
                    Objects.requireNonNull(eVar);
                    int ordinal = aVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                bVar = e.b.RESUMED;
                            } else if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal == 5) {
                                        bVar = e.b.DESTROYED;
                                    } else {
                                        throw new IllegalArgumentException("Unexpected event value " + aVar);
                                    }
                                }
                            }
                            eVar.f2830j = bVar;
                            eVar.d();
                        }
                        bVar = e.b.STARTED;
                        eVar.f2830j = bVar;
                        eVar.d();
                    }
                    bVar = e.b.CREATED;
                    eVar.f2830j = bVar;
                    eVar.d();
                }
            }
        }
    };
    public final g.a.b n = new a(false);
    public boolean o = true;

    public class a extends g.a.b {
        public a(boolean z) {
            super(z);
        }

        @Override // g.a.b
        public void a() {
            NavController.this.f();
        }
    }

    public interface b {
        void a(NavController navController, j jVar, Bundle bundle);
    }

    public NavController(Context context) {
        this.a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.b = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        r rVar = this.f209k;
        rVar.a(new l(rVar));
        this.f209k.a(new g.p.a(this.a));
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.a():boolean");
    }

    public j b(int i2) {
        j jVar;
        k kVar;
        k kVar2 = this.f203d;
        if (kVar2 == null) {
            return null;
        }
        if (kVar2.f2847g == i2) {
            return kVar2;
        }
        if (this.f206h.isEmpty()) {
            jVar = this.f203d;
        } else {
            jVar = this.f206h.getLast().e;
        }
        if (jVar instanceof k) {
            kVar = (k) jVar;
        } else {
            kVar = jVar.f2846f;
        }
        return kVar.h(i2, true);
    }

    public j c() {
        g.p.e last = this.f206h.isEmpty() ? null : this.f206h.getLast();
        if (last != null) {
            return last.e;
        }
        return null;
    }

    public final int d() {
        int i2 = 0;
        for (g.p.e eVar : this.f206h) {
            if (!(eVar.e instanceof k)) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028 A[LOOP:0: B:10:0x0028->B:15:0x004e, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(g.p.j r12, android.os.Bundle r13, g.p.o r14, g.p.q.a r15) {
        /*
        // Method dump skipped, instructions count: 371
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.e(g.p.j, android.os.Bundle, g.p.o, g.p.q$a):void");
    }

    public boolean f() {
        return !this.f206h.isEmpty() && g(c().f2847g, true) && a();
    }

    public boolean g(int i2, boolean z) {
        boolean z2;
        v remove;
        if (this.f206h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<g.p.e> descendingIterator = this.f206h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z2 = false;
                break;
            }
            j jVar = descendingIterator.next().e;
            q c2 = this.f209k.c(jVar.e);
            if (z || jVar.f2847g != i2) {
                arrayList.add(c2);
            }
            if (jVar.f2847g == i2) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            Log.i("NavController", "Ignoring popBackStack to destination " + j.c(this.a, i2) + " as it was not found on the current back stack");
            return false;
        }
        Iterator it = arrayList.iterator();
        boolean z3 = false;
        while (it.hasNext() && ((q) it.next()).e()) {
            g.p.e removeLast = this.f206h.removeLast();
            if (removeLast.f2827g.b.compareTo(e.b.CREATED) >= 0) {
                removeLast.f2831k = e.b.DESTROYED;
                removeLast.d();
            }
            g gVar = this.f208j;
            if (!(gVar == null || (remove = gVar.f2837d.remove(removeLast.f2829i)) == null)) {
                remove.a();
            }
            z3 = true;
        }
        i();
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0280, code lost:
        if (r1 == false) goto L_0x0283;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(int r20, android.os.Bundle r21) {
        /*
        // Method dump skipped, instructions count: 658
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.h(int, android.os.Bundle):void");
    }

    public final void i() {
        g.a.b bVar = this.n;
        boolean z = true;
        if (!this.o || d() <= 1) {
            z = false;
        }
        bVar.a = z;
    }
}
