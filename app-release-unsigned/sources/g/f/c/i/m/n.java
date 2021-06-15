package g.f.c.i.m;

import g.f.c.i.c;
import g.f.c.i.d;
import g.f.c.i.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class n {
    public static int a;
    public ArrayList<d> b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public int f2384c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f2385d = 0;
    public ArrayList<a> e = null;

    /* renamed from: f  reason: collision with root package name */
    public int f2386f = -1;

    public class a {
        public a(n nVar, d dVar, g.f.c.d dVar2, int i2) {
            new WeakReference(dVar);
            dVar2.o(dVar.D);
            dVar2.o(dVar.E);
            dVar2.o(dVar.F);
            dVar2.o(dVar.G);
            dVar2.o(dVar.H);
        }
    }

    public n(int i2) {
        int i3 = a;
        a = i3 + 1;
        this.f2384c = i3;
        this.f2385d = i2;
    }

    public boolean a(d dVar) {
        if (this.b.contains(dVar)) {
            return false;
        }
        this.b.add(dVar);
        return true;
    }

    public void b(ArrayList<n> arrayList) {
        int size = this.b.size();
        if (this.f2386f != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                n nVar = arrayList.get(i2);
                if (this.f2386f == nVar.f2384c) {
                    d(this.f2385d, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c(g.f.c.d dVar, int i2) {
        int i3;
        c cVar;
        if (this.b.size() == 0) {
            return 0;
        }
        ArrayList<d> arrayList = this.b;
        e eVar = (e) arrayList.get(0).P;
        dVar.u();
        eVar.d(dVar, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            arrayList.get(i4).d(dVar, false);
        }
        if (i2 == 0 && eVar.t0 > 0) {
            g.b.a.a(eVar, dVar, arrayList, 0);
        }
        if (i2 == 1 && eVar.u0 > 0) {
            g.b.a.a(eVar, dVar, arrayList, 1);
        }
        try {
            dVar.q();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.e = new ArrayList<>();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            this.e.add(new a(this, arrayList.get(i5), dVar, i2));
        }
        if (i2 == 0) {
            i3 = dVar.o(eVar.D);
            cVar = eVar.F;
        } else {
            i3 = dVar.o(eVar.E);
            cVar = eVar.G;
        }
        int o = dVar.o(cVar);
        dVar.u();
        return o - i3;
    }

    public void d(int i2, n nVar) {
        Iterator<d> it = this.b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            nVar.a(next);
            if (i2 == 0) {
                next.j0 = nVar.f2384c;
            } else {
                next.k0 = nVar.f2384c;
            }
        }
        this.f2386f = nVar.f2384c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.f2385d;
        sb.append(i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f2384c);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator<d> it = this.b.iterator();
        while (it.hasNext()) {
            StringBuilder h2 = c.c.a.a.a.h(sb2, " ");
            h2.append(it.next().d0);
            sb2 = h2.toString();
        }
        return c.c.a.a.a.q(sb2, " >");
    }
}
