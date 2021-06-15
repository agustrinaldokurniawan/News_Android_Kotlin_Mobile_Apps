package g.u;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import g.e.e;
import g.h.j.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class h implements Cloneable {
    public static final int[] e = {2, 1, 3, 4};

    /* renamed from: f  reason: collision with root package name */
    public static final e f3045f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static ThreadLocal<g.e.a<Animator, b>> f3046g = new ThreadLocal<>();
    public e A = f3045f;

    /* renamed from: h  reason: collision with root package name */
    public String f3047h = getClass().getName();

    /* renamed from: i  reason: collision with root package name */
    public long f3048i = -1;

    /* renamed from: j  reason: collision with root package name */
    public long f3049j = -1;

    /* renamed from: k  reason: collision with root package name */
    public TimeInterpolator f3050k = null;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<Integer> f3051l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<View> f3052m = new ArrayList<>();
    public q n = new q();
    public q o = new q();
    public n p = null;
    public int[] q = e;
    public ArrayList<p> r;
    public ArrayList<p> s;
    public ArrayList<Animator> t = new ArrayList<>();
    public int u = 0;
    public boolean v = false;
    public boolean w = false;
    public ArrayList<d> x = null;
    public ArrayList<Animator> y = new ArrayList<>();
    public c z;

    public static class a extends e {
        @Override // g.u.e
        public Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    public static class b {
        public View a;
        public String b;

        /* renamed from: c  reason: collision with root package name */
        public p f3053c;

        /* renamed from: d  reason: collision with root package name */
        public c0 f3054d;
        public h e;

        public b(View view, String str, h hVar, c0 c0Var, p pVar) {
            this.a = view;
            this.b = str;
            this.f3053c = pVar;
            this.f3054d = c0Var;
            this.e = hVar;
        }
    }

    public static abstract class c {
    }

    public interface d {
        void a(h hVar);

        void b(h hVar);

        void c(h hVar);

        void d(h hVar);

        void e(h hVar);
    }

    public static void f(q qVar, View view, p pVar) {
        qVar.a.put(view, pVar);
        int id = view.getId();
        if (id >= 0) {
            if (qVar.b.indexOfKey(id) >= 0) {
                qVar.b.put(id, null);
            } else {
                qVar.b.put(id, view);
            }
        }
        AtomicInteger atomicInteger = o.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (qVar.f3060d.e(transitionName) >= 0) {
                qVar.f3060d.put(transitionName, null);
            } else {
                qVar.f3060d.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                e<View> eVar = qVar.f3059c;
                if (eVar.f2230f) {
                    eVar.f();
                }
                if (g.e.d.b(eVar.f2231g, eVar.f2233i, itemIdAtPosition) >= 0) {
                    View g2 = qVar.f3059c.g(itemIdAtPosition);
                    if (g2 != null) {
                        g2.setHasTransientState(false);
                        qVar.f3059c.j(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                qVar.f3059c.j(itemIdAtPosition, view);
            }
        }
    }

    public static g.e.a<Animator, b> s() {
        g.e.a<Animator, b> aVar = f3046g.get();
        if (aVar != null) {
            return aVar;
        }
        g.e.a<Animator, b> aVar2 = new g.e.a<>();
        f3046g.set(aVar2);
        return aVar2;
    }

    public static boolean y(p pVar, p pVar2, String str) {
        Object obj = pVar.a.get(str);
        Object obj2 = pVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public h A(d dVar) {
        ArrayList<d> arrayList = this.x;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.x.size() == 0) {
            this.x = null;
        }
        return this;
    }

    public h B(View view) {
        this.f3052m.remove(view);
        return this;
    }

    public void C(View view) {
        if (this.v) {
            if (!this.w) {
                g.e.a<Animator, b> s2 = s();
                int i2 = s2.f2251k;
                y yVar = s.a;
                b0 b0Var = new b0(view);
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    b l2 = s2.l(i3);
                    if (l2.a != null && b0Var.equals(l2.f3054d)) {
                        s2.h(i3).resume();
                    }
                }
                ArrayList<d> arrayList = this.x;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.x.clone();
                    int size = arrayList2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((d) arrayList2.get(i4)).b(this);
                    }
                }
            }
            this.v = false;
        }
    }

    public void D() {
        L();
        g.e.a<Animator, b> s2 = s();
        Iterator<Animator> it = this.y.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (s2.containsKey(next)) {
                L();
                if (next != null) {
                    next.addListener(new i(this, s2));
                    long j2 = this.f3049j;
                    if (j2 >= 0) {
                        next.setDuration(j2);
                    }
                    long j3 = this.f3048i;
                    if (j3 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f3050k;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new j(this));
                    next.start();
                }
            }
        }
        this.y.clear();
        q();
    }

    public h E(long j2) {
        this.f3049j = j2;
        return this;
    }

    public void F(c cVar) {
        this.z = cVar;
    }

    public h G(TimeInterpolator timeInterpolator) {
        this.f3050k = timeInterpolator;
        return this;
    }

    public void H(e eVar) {
        if (eVar == null) {
            eVar = f3045f;
        }
        this.A = eVar;
    }

    public void I(m mVar) {
    }

    public h J(long j2) {
        this.f3048i = j2;
        return this;
    }

    public void L() {
        if (this.u == 0) {
            ArrayList<d> arrayList = this.x;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.x.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((d) arrayList2.get(i2)).c(this);
                }
            }
            this.w = false;
        }
        this.u++;
    }

    public String M(String str) {
        StringBuilder f2 = c.c.a.a.a.f(str);
        f2.append(getClass().getSimpleName());
        f2.append("@");
        f2.append(Integer.toHexString(hashCode()));
        f2.append(": ");
        String sb = f2.toString();
        if (this.f3049j != -1) {
            StringBuilder h2 = c.c.a.a.a.h(sb, "dur(");
            h2.append(this.f3049j);
            h2.append(") ");
            sb = h2.toString();
        }
        if (this.f3048i != -1) {
            StringBuilder h3 = c.c.a.a.a.h(sb, "dly(");
            h3.append(this.f3048i);
            h3.append(") ");
            sb = h3.toString();
        }
        if (this.f3050k != null) {
            StringBuilder h4 = c.c.a.a.a.h(sb, "interp(");
            h4.append(this.f3050k);
            h4.append(") ");
            sb = h4.toString();
        }
        if (this.f3051l.size() <= 0 && this.f3052m.size() <= 0) {
            return sb;
        }
        String q2 = c.c.a.a.a.q(sb, "tgts(");
        if (this.f3051l.size() > 0) {
            for (int i2 = 0; i2 < this.f3051l.size(); i2++) {
                if (i2 > 0) {
                    q2 = c.c.a.a.a.q(q2, ", ");
                }
                StringBuilder f3 = c.c.a.a.a.f(q2);
                f3.append(this.f3051l.get(i2));
                q2 = f3.toString();
            }
        }
        if (this.f3052m.size() > 0) {
            for (int i3 = 0; i3 < this.f3052m.size(); i3++) {
                if (i3 > 0) {
                    q2 = c.c.a.a.a.q(q2, ", ");
                }
                StringBuilder f4 = c.c.a.a.a.f(q2);
                f4.append(this.f3052m.get(i3));
                q2 = f4.toString();
            }
        }
        return c.c.a.a.a.q(q2, ")");
    }

    public h a(d dVar) {
        if (this.x == null) {
            this.x = new ArrayList<>();
        }
        this.x.add(dVar);
        return this;
    }

    public void cancel() {
        for (int size = this.t.size() - 1; size >= 0; size--) {
            this.t.get(size).cancel();
        }
        ArrayList<d> arrayList = this.x;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.x.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((d) arrayList2.get(i2)).d(this);
            }
        }
    }

    public h d(View view) {
        this.f3052m.add(view);
        return this;
    }

    public abstract void g(p pVar);

    public final void h(View view, boolean z2) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                p pVar = new p(view);
                if (z2) {
                    j(pVar);
                } else {
                    g(pVar);
                }
                pVar.f3058c.add(this);
                i(pVar);
                f(z2 ? this.n : this.o, view, pVar);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    h(viewGroup.getChildAt(i2), z2);
                }
            }
        }
    }

    public void i(p pVar) {
    }

    public abstract void j(p pVar);

    public void k(ViewGroup viewGroup, boolean z2) {
        l(z2);
        if (this.f3051l.size() > 0 || this.f3052m.size() > 0) {
            for (int i2 = 0; i2 < this.f3051l.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.f3051l.get(i2).intValue());
                if (findViewById != null) {
                    p pVar = new p(findViewById);
                    if (z2) {
                        j(pVar);
                    } else {
                        g(pVar);
                    }
                    pVar.f3058c.add(this);
                    i(pVar);
                    f(z2 ? this.n : this.o, findViewById, pVar);
                }
            }
            for (int i3 = 0; i3 < this.f3052m.size(); i3++) {
                View view = this.f3052m.get(i3);
                p pVar2 = new p(view);
                if (z2) {
                    j(pVar2);
                } else {
                    g(pVar2);
                }
                pVar2.f3058c.add(this);
                i(pVar2);
                f(z2 ? this.n : this.o, view, pVar2);
            }
            return;
        }
        h(viewGroup, z2);
    }

    public void l(boolean z2) {
        q qVar;
        if (z2) {
            this.n.a.clear();
            this.n.b.clear();
            qVar = this.n;
        } else {
            this.o.a.clear();
            this.o.b.clear();
            qVar = this.o;
        }
        qVar.f3059c.a();
    }

    /* renamed from: m */
    public h clone() {
        try {
            h hVar = (h) super.clone();
            hVar.y = new ArrayList<>();
            hVar.n = new q();
            hVar.o = new q();
            hVar.r = null;
            hVar.s = null;
            return hVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator o(ViewGroup viewGroup, p pVar, p pVar2) {
        return null;
    }

    public void p(ViewGroup viewGroup, q qVar, q qVar2, ArrayList<p> arrayList, ArrayList<p> arrayList2) {
        int i2;
        Animator o2;
        Animator animator;
        p pVar;
        View view;
        p pVar2;
        Animator animator2;
        g.e.a<Animator, b> s2 = s();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            p pVar3 = arrayList.get(i3);
            p pVar4 = arrayList2.get(i3);
            if (pVar3 != null && !pVar3.f3058c.contains(this)) {
                pVar3 = null;
            }
            if (pVar4 != null && !pVar4.f3058c.contains(this)) {
                pVar4 = null;
            }
            if (!(pVar3 == null && pVar4 == null)) {
                if ((pVar3 == null || pVar4 == null || w(pVar3, pVar4)) && (o2 = o(viewGroup, pVar3, pVar4)) != null) {
                    if (pVar4 != null) {
                        View view2 = pVar4.b;
                        String[] t2 = t();
                        if (t2 != null && t2.length > 0) {
                            pVar2 = new p(view2);
                            p pVar5 = qVar2.a.get(view2);
                            if (pVar5 != null) {
                                int i4 = 0;
                                while (i4 < t2.length) {
                                    pVar2.a.put(t2[i4], pVar5.a.get(t2[i4]));
                                    i4++;
                                    o2 = o2;
                                    size = size;
                                    pVar5 = pVar5;
                                }
                            }
                            i2 = size;
                            int i5 = s2.f2251k;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator2 = o2;
                                    break;
                                }
                                b bVar = s2.get(s2.h(i6));
                                if (bVar.f3053c != null && bVar.a == view2 && bVar.b.equals(this.f3047h) && bVar.f3053c.equals(pVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i2 = size;
                            animator2 = o2;
                            pVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        pVar = pVar2;
                    } else {
                        i2 = size;
                        view = pVar3.b;
                        animator = o2;
                        pVar = null;
                    }
                    if (animator != null) {
                        String str = this.f3047h;
                        y yVar = s.a;
                        s2.put(animator, new b(view, str, this, new b0(viewGroup), pVar));
                        this.y.add(animator);
                    }
                    i3++;
                    size = i2;
                }
            }
            i2 = size;
            i3++;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator3 = this.y.get(sparseIntArray.keyAt(i7));
                animator3.setStartDelay(animator3.getStartDelay() + (((long) sparseIntArray.valueAt(i7)) - Long.MAX_VALUE));
            }
        }
    }

    public void q() {
        int i2 = this.u - 1;
        this.u = i2;
        if (i2 == 0) {
            ArrayList<d> arrayList = this.x;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.x.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((d) arrayList2.get(i3)).e(this);
                }
            }
            for (int i4 = 0; i4 < this.n.f3059c.k(); i4++) {
                View l2 = this.n.f3059c.l(i4);
                if (l2 != null) {
                    AtomicInteger atomicInteger = o.a;
                    l2.setHasTransientState(false);
                }
            }
            for (int i5 = 0; i5 < this.o.f3059c.k(); i5++) {
                View l3 = this.o.f3059c.l(i5);
                if (l3 != null) {
                    AtomicInteger atomicInteger2 = o.a;
                    l3.setHasTransientState(false);
                }
            }
            this.w = true;
        }
    }

    public p r(View view, boolean z2) {
        n nVar = this.p;
        if (nVar != null) {
            return nVar.r(view, z2);
        }
        ArrayList<p> arrayList = z2 ? this.r : this.s;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            p pVar = arrayList.get(i3);
            if (pVar == null) {
                return null;
            }
            if (pVar.b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 < 0) {
            return null;
        }
        return (z2 ? this.s : this.r).get(i2);
    }

    public String[] t() {
        return null;
    }

    public String toString() {
        return M("");
    }

    public p v(View view, boolean z2) {
        n nVar = this.p;
        if (nVar != null) {
            return nVar.v(view, z2);
        }
        return (z2 ? this.n : this.o).a.getOrDefault(view, null);
    }

    public boolean w(p pVar, p pVar2) {
        if (pVar == null || pVar2 == null) {
            return false;
        }
        String[] t2 = t();
        if (t2 != null) {
            for (String str : t2) {
                if (!y(pVar, pVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : pVar.a.keySet()) {
            if (y(pVar, pVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean x(View view) {
        return (this.f3051l.size() == 0 && this.f3052m.size() == 0) || this.f3051l.contains(Integer.valueOf(view.getId())) || this.f3052m.contains(view);
    }

    public void z(View view) {
        if (!this.w) {
            g.e.a<Animator, b> s2 = s();
            int i2 = s2.f2251k;
            y yVar = s.a;
            b0 b0Var = new b0(view);
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                b l2 = s2.l(i3);
                if (l2.a != null && b0Var.equals(l2.f3054d)) {
                    s2.h(i3).pause();
                }
            }
            ArrayList<d> arrayList = this.x;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.x.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((d) arrayList2.get(i4)).a(this);
                }
            }
            this.v = true;
        }
    }
}
