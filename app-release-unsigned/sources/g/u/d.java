package g.u;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.tsuga.news.R;
import g.h.f.a;
import g.h.j.o;
import g.l.b.m;
import g.l.b.s0;
import g.u.h;
import g.u.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"RestrictedApi"})
public class d extends s0 {

    public class a extends h.c {
        public a(d dVar, Rect rect) {
        }
    }

    public class b implements h.d {
        public final /* synthetic */ View a;
        public final /* synthetic */ ArrayList b;

        public b(d dVar, View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // g.u.h.d
        public void a(h hVar) {
        }

        @Override // g.u.h.d
        public void b(h hVar) {
        }

        @Override // g.u.h.d
        public void c(h hVar) {
            hVar.A(this);
            hVar.a(this);
        }

        @Override // g.u.h.d
        public void d(h hVar) {
        }

        @Override // g.u.h.d
        public void e(h hVar) {
            hVar.A(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.b.get(i2)).setVisibility(0);
            }
        }
    }

    public class c extends k {
        public final /* synthetic */ Object a;
        public final /* synthetic */ ArrayList b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f3041c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3042d;
        public final /* synthetic */ Object e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3043f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.f3041c = obj2;
            this.f3042d = arrayList2;
            this.e = obj3;
            this.f3043f = arrayList3;
        }

        @Override // g.u.k, g.u.h.d
        public void c(h hVar) {
            Object obj = this.a;
            if (obj != null) {
                d.this.p(obj, this.b, null);
            }
            Object obj2 = this.f3041c;
            if (obj2 != null) {
                d.this.p(obj2, this.f3042d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                d.this.p(obj3, this.f3043f, null);
            }
        }

        @Override // g.u.h.d
        public void e(h hVar) {
            hVar.A(this);
        }
    }

    /* renamed from: g.u.d$d  reason: collision with other inner class name */
    public class C0100d implements a.AbstractC0074a {
        public final /* synthetic */ h a;

        public C0100d(d dVar, h hVar) {
            this.a = hVar;
        }

        @Override // g.h.f.a.AbstractC0074a
        public void a() {
            this.a.cancel();
        }
    }

    public class e implements h.d {
        public final /* synthetic */ Runnable a;

        public e(d dVar, Runnable runnable) {
            this.a = runnable;
        }

        @Override // g.u.h.d
        public void a(h hVar) {
        }

        @Override // g.u.h.d
        public void b(h hVar) {
        }

        @Override // g.u.h.d
        public void c(h hVar) {
        }

        @Override // g.u.h.d
        public void d(h hVar) {
        }

        @Override // g.u.h.d
        public void e(h hVar) {
            this.a.run();
        }
    }

    public class f extends h.c {
        public f(d dVar, Rect rect) {
        }
    }

    public static boolean z(h hVar) {
        return !s0.k(hVar.f3051l) || !s0.k(null) || !s0.k(null);
    }

    @Override // g.l.b.s0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((h) obj).d(view);
        }
    }

    @Override // g.l.b.s0
    public void b(Object obj, ArrayList<View> arrayList) {
        h hVar = (h) obj;
        if (hVar != null) {
            int i2 = 0;
            if (hVar instanceof n) {
                n nVar = (n) hVar;
                int size = nVar.B.size();
                while (i2 < size) {
                    b(nVar.O(i2), arrayList);
                    i2++;
                }
            } else if (!z(hVar) && s0.k(hVar.f3052m)) {
                int size2 = arrayList.size();
                while (i2 < size2) {
                    hVar.d(arrayList.get(i2));
                    i2++;
                }
            }
        }
    }

    @Override // g.l.b.s0
    public void c(ViewGroup viewGroup, Object obj) {
        h hVar = (h) obj;
        if (!l.f3055c.contains(viewGroup)) {
            AtomicInteger atomicInteger = o.a;
            if (viewGroup.isLaidOut()) {
                l.f3055c.add(viewGroup);
                if (hVar == null) {
                    hVar = l.a;
                }
                h m2 = hVar.clone();
                ArrayList<h> orDefault = l.a().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator<h> it = orDefault.iterator();
                    while (it.hasNext()) {
                        it.next().z(viewGroup);
                    }
                }
                if (m2 != null) {
                    m2.k(viewGroup, true);
                }
                if (((g) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, null);
                    if (m2 != null) {
                        l.a aVar = new l.a(m2, viewGroup);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    @Override // g.l.b.s0
    public boolean e(Object obj) {
        return obj instanceof h;
    }

    @Override // g.l.b.s0
    public Object g(Object obj) {
        if (obj != null) {
            return ((h) obj).clone();
        }
        return null;
    }

    @Override // g.l.b.s0
    public Object l(Object obj, Object obj2, Object obj3) {
        h hVar = (h) obj;
        h hVar2 = (h) obj2;
        h hVar3 = (h) obj3;
        if (hVar != null && hVar2 != null) {
            n nVar = new n();
            nVar.N(hVar);
            nVar.N(hVar2);
            nVar.P(1);
            hVar = nVar;
        } else if (hVar == null) {
            hVar = hVar2 != null ? hVar2 : null;
        }
        if (hVar3 == null) {
            return hVar;
        }
        n nVar2 = new n();
        if (hVar != null) {
            nVar2.N(hVar);
        }
        nVar2.N(hVar3);
        return nVar2;
    }

    @Override // g.l.b.s0
    public Object m(Object obj, Object obj2, Object obj3) {
        n nVar = new n();
        if (obj != null) {
            nVar.N((h) obj);
        }
        if (obj2 != null) {
            nVar.N((h) obj2);
        }
        if (obj3 != null) {
            nVar.N((h) obj3);
        }
        return nVar;
    }

    @Override // g.l.b.s0
    public void o(Object obj, View view) {
        if (obj != null) {
            ((h) obj).B(view);
        }
    }

    @Override // g.l.b.s0
    public void p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        h hVar = (h) obj;
        int i2 = 0;
        if (hVar instanceof n) {
            n nVar = (n) hVar;
            int size = nVar.B.size();
            while (i2 < size) {
                p(nVar.O(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!z(hVar)) {
            ArrayList<View> arrayList3 = hVar.f3052m;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i2 < size2) {
                    hVar.d(arrayList2.get(i2));
                    i2++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        hVar.B(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // g.l.b.s0
    public void q(Object obj, View view, ArrayList<View> arrayList) {
        ((h) obj).a(new b(this, view, arrayList));
    }

    @Override // g.l.b.s0
    public void r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((h) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // g.l.b.s0
    public void s(Object obj, Rect rect) {
        if (obj != null) {
            ((h) obj).F(new f(this, rect));
        }
    }

    @Override // g.l.b.s0
    public void t(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            j(view, rect);
            ((h) obj).F(new a(this, rect));
        }
    }

    @Override // g.l.b.s0
    public void u(m mVar, Object obj, g.h.f.a aVar, Runnable runnable) {
        h hVar = (h) obj;
        aVar.b(new C0100d(this, hVar));
        hVar.a(new e(this, runnable));
    }

    @Override // g.l.b.s0
    public void w(Object obj, View view, ArrayList<View> arrayList) {
        n nVar = (n) obj;
        ArrayList<View> arrayList2 = nVar.f3052m;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            s0.d(arrayList2, arrayList.get(i2));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(nVar, arrayList);
    }

    @Override // g.l.b.s0
    public void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.f3052m.clear();
            nVar.f3052m.addAll(arrayList2);
            p(nVar, arrayList, arrayList2);
        }
    }

    @Override // g.l.b.s0
    public Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        n nVar = new n();
        nVar.N((h) obj);
        return nVar;
    }
}
