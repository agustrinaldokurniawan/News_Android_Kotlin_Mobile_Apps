package g.l.b;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.tsuga.news.R;
import g.h.f.a;
import g.h.j.o;
import g.l.b.b0;
import g.l.b.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class x0 {
    public final ViewGroup a;
    public final ArrayList<d> b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<d> f2782c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f2783d = false;
    public boolean e = false;

    public class a implements Runnable {
        public final /* synthetic */ c e;

        public a(c cVar) {
            this.e = cVar;
        }

        public void run() {
            if (x0.this.b.contains(this.e)) {
                c cVar = this.e;
                cVar.a.a(cVar.f2787c.J);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ c e;

        public b(c cVar) {
            this.e = cVar;
        }

        public void run() {
            x0.this.b.remove(this.e);
            x0.this.f2782c.remove(this.e);
        }
    }

    public static class c extends d {

        /* renamed from: h  reason: collision with root package name */
        public final h0 f2786h;

        public c(d.c cVar, d.b bVar, h0 h0Var, g.h.f.a aVar) {
            super(cVar, bVar, h0Var.f2691c, aVar);
            this.f2786h = h0Var;
        }

        @Override // g.l.b.x0.d
        public void b() {
            super.b();
            this.f2786h.k();
        }

        @Override // g.l.b.x0.d
        public void d() {
            if (this.b == d.b.ADDING) {
                m mVar = this.f2786h.f2691c;
                View findFocus = mVar.J.findFocus();
                if (findFocus != null) {
                    mVar.f().o = findFocus;
                    if (b0.O(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + mVar);
                    }
                }
                View p0 = this.f2787c.p0();
                if (p0.getParent() == null) {
                    this.f2786h.b();
                    p0.setAlpha(0.0f);
                }
                if (p0.getAlpha() == 0.0f && p0.getVisibility() == 0) {
                    p0.setVisibility(4);
                }
                m.b bVar = mVar.M;
                p0.setAlpha(bVar == null ? 1.0f : bVar.n);
            }
        }
    }

    public static class d {
        public c a;
        public b b;

        /* renamed from: c  reason: collision with root package name */
        public final m f2787c;

        /* renamed from: d  reason: collision with root package name */
        public final List<Runnable> f2788d = new ArrayList();
        public final HashSet<g.h.f.a> e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        public boolean f2789f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2790g = false;

        public class a implements a.AbstractC0074a {
            public a() {
            }

            @Override // g.h.f.a.AbstractC0074a
            public void a() {
                d.this.a();
            }
        }

        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c b(int i2) {
                if (i2 == 0) {
                    return VISIBLE;
                }
                if (i2 == 4) {
                    return INVISIBLE;
                }
                if (i2 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(c.c.a.a.a.l("Unknown visibility ", i2));
            }

            public static c c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            public void a(View view) {
                int i2;
                int ordinal = ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        if (b0.O(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                        }
                        i2 = 0;
                    } else if (ordinal == 2) {
                        if (b0.O(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        i2 = 8;
                    } else if (ordinal == 3) {
                        if (b0.O(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        i2 = 4;
                    } else {
                        return;
                    }
                    view.setVisibility(i2);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (b0.O(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        public d(c cVar, b bVar, m mVar, g.h.f.a aVar) {
            this.a = cVar;
            this.b = bVar;
            this.f2787c = mVar;
            aVar.b(new a());
        }

        public final void a() {
            if (!this.f2789f) {
                this.f2789f = true;
                if (this.e.isEmpty()) {
                    b();
                    return;
                }
                Iterator it = new ArrayList(this.e).iterator();
                while (it.hasNext()) {
                    ((g.h.f.a) it.next()).a();
                }
            }
        }

        public void b() {
            if (!this.f2790g) {
                if (b0.O(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f2790g = true;
                for (Runnable runnable : this.f2788d) {
                    runnable.run();
                }
            }
        }

        public final void c(c cVar, b bVar) {
            b bVar2;
            c cVar2 = c.REMOVED;
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (b0.O(2)) {
                            StringBuilder f2 = c.c.a.a.a.f("SpecialEffectsController: For fragment ");
                            f2.append(this.f2787c);
                            f2.append(" mFinalState = ");
                            f2.append(this.a);
                            f2.append(" -> REMOVED. mLifecycleImpact  = ");
                            f2.append(this.b);
                            f2.append(" to REMOVING.");
                            Log.v("FragmentManager", f2.toString());
                        }
                        this.a = cVar2;
                        bVar2 = b.REMOVING;
                    } else {
                        return;
                    }
                } else if (this.a == cVar2) {
                    if (b0.O(2)) {
                        StringBuilder f3 = c.c.a.a.a.f("SpecialEffectsController: For fragment ");
                        f3.append(this.f2787c);
                        f3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        f3.append(this.b);
                        f3.append(" to ADDING.");
                        Log.v("FragmentManager", f3.toString());
                    }
                    this.a = c.VISIBLE;
                    bVar2 = b.ADDING;
                } else {
                    return;
                }
                this.b = bVar2;
            } else if (this.a != cVar2) {
                if (b0.O(2)) {
                    StringBuilder f4 = c.c.a.a.a.f("SpecialEffectsController: For fragment ");
                    f4.append(this.f2787c);
                    f4.append(" mFinalState = ");
                    f4.append(this.a);
                    f4.append(" -> ");
                    f4.append(cVar);
                    f4.append(". ");
                    Log.v("FragmentManager", f4.toString());
                }
                this.a = cVar;
            }
        }

        public void d() {
        }

        public String toString() {
            StringBuilder h2 = c.c.a.a.a.h("Operation ", "{");
            h2.append(Integer.toHexString(System.identityHashCode(this)));
            h2.append("} ");
            h2.append("{");
            h2.append("mFinalState = ");
            h2.append(this.a);
            h2.append("} ");
            h2.append("{");
            h2.append("mLifecycleImpact = ");
            h2.append(this.b);
            h2.append("} ");
            h2.append("{");
            h2.append("mFragment = ");
            h2.append(this.f2787c);
            h2.append("}");
            return h2.toString();
        }
    }

    public x0(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static x0 f(ViewGroup viewGroup, b0 b0Var) {
        return g(viewGroup, b0Var.M());
    }

    public static x0 g(ViewGroup viewGroup, y0 y0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof x0) {
            return (x0) tag;
        }
        Objects.requireNonNull((b0.f) y0Var);
        c cVar = new c(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, cVar);
        return cVar;
    }

    public final void a(d.c cVar, d.b bVar, h0 h0Var) {
        synchronized (this.b) {
            g.h.f.a aVar = new g.h.f.a();
            d d2 = d(h0Var.f2691c);
            if (d2 != null) {
                d2.c(cVar, bVar);
                return;
            }
            c cVar2 = new c(cVar, bVar, h0Var, aVar);
            this.b.add(cVar2);
            cVar2.f2788d.add(new a(cVar2));
            cVar2.f2788d.add(new b(cVar2));
        }
    }

    public abstract void b(List<d> list, boolean z);

    public void c() {
        if (!this.e) {
            ViewGroup viewGroup = this.a;
            AtomicInteger atomicInteger = o.a;
            if (!viewGroup.isAttachedToWindow()) {
                e();
                this.f2783d = false;
                return;
            }
            synchronized (this.b) {
                if (!this.b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f2782c);
                    this.f2782c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        d dVar = (d) it.next();
                        if (b0.O(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar);
                        }
                        dVar.a();
                        if (!dVar.f2790g) {
                            this.f2782c.add(dVar);
                        }
                    }
                    i();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.f2782c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((d) it2.next()).d();
                    }
                    b(arrayList2, this.f2783d);
                    this.f2783d = false;
                }
            }
        }
    }

    public final d d(m mVar) {
        Iterator<d> it = this.b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.f2787c.equals(mVar) && !next.f2789f) {
                return next;
            }
        }
        return null;
    }

    public void e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.a;
        AtomicInteger atomicInteger = o.a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            i();
            Iterator<d> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.f2782c).iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                if (b0.O(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (isAttachedToWindow) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(dVar);
                    Log.v("FragmentManager", sb.toString());
                }
                dVar.a();
            }
            Iterator it3 = new ArrayList(this.b).iterator();
            while (it3.hasNext()) {
                d dVar2 = (d) it3.next();
                if (b0.O(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (isAttachedToWindow) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(dVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                dVar2.a();
            }
        }
    }

    public void h() {
        synchronized (this.b) {
            i();
            this.e = false;
            int size = this.b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                d dVar = this.b.get(size);
                d.c c2 = d.c.c(dVar.f2787c.J);
                d.c cVar = dVar.a;
                d.c cVar2 = d.c.VISIBLE;
                if (cVar == cVar2 && c2 != cVar2) {
                    this.e = dVar.f2787c.G();
                    break;
                }
                size--;
            }
        }
    }

    public final void i() {
        Iterator<d> it = this.b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.b == d.b.ADDING) {
                next.c(d.c.b(next.f2787c.p0().getVisibility()), d.b.NONE);
            }
        }
    }
}
