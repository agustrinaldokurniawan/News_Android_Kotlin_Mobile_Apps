package g.u;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import g.u.h;
import java.util.ArrayList;
import java.util.Iterator;

public class n extends h {
    public ArrayList<h> B = new ArrayList<>();
    public boolean C = true;
    public int D;
    public boolean E = false;
    public int F = 0;

    public class a extends k {
        public final /* synthetic */ h a;

        public a(n nVar, h hVar) {
            this.a = hVar;
        }

        @Override // g.u.h.d
        public void e(h hVar) {
            this.a.D();
            hVar.A(this);
        }
    }

    public static class b extends k {
        public n a;

        public b(n nVar) {
            this.a = nVar;
        }

        @Override // g.u.k, g.u.h.d
        public void c(h hVar) {
            n nVar = this.a;
            if (!nVar.E) {
                nVar.L();
                this.a.E = true;
            }
        }

        @Override // g.u.h.d
        public void e(h hVar) {
            n nVar = this.a;
            int i2 = nVar.D - 1;
            nVar.D = i2;
            if (i2 == 0) {
                nVar.E = false;
                nVar.q();
            }
            hVar.A(this);
        }
    }

    @Override // g.u.h
    public h A(h.d dVar) {
        super.A(dVar);
        return this;
    }

    @Override // g.u.h
    public h B(View view) {
        for (int i2 = 0; i2 < this.B.size(); i2++) {
            this.B.get(i2).B(view);
        }
        this.f3052m.remove(view);
        return this;
    }

    @Override // g.u.h
    public void C(View view) {
        super.C(view);
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.B.get(i2).C(view);
        }
    }

    @Override // g.u.h
    public void D() {
        if (this.B.isEmpty()) {
            L();
            q();
            return;
        }
        b bVar = new b(this);
        Iterator<h> it = this.B.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.D = this.B.size();
        if (!this.C) {
            for (int i2 = 1; i2 < this.B.size(); i2++) {
                this.B.get(i2 - 1).a(new a(this, this.B.get(i2)));
            }
            h hVar = this.B.get(0);
            if (hVar != null) {
                hVar.D();
                return;
            }
            return;
        }
        Iterator<h> it2 = this.B.iterator();
        while (it2.hasNext()) {
            it2.next().D();
        }
    }

    @Override // g.u.h
    public h E(long j2) {
        ArrayList<h> arrayList;
        this.f3049j = j2;
        if (j2 >= 0 && (arrayList = this.B) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.B.get(i2).E(j2);
            }
        }
        return this;
    }

    @Override // g.u.h
    public void F(h.c cVar) {
        this.z = cVar;
        this.F |= 8;
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.B.get(i2).F(cVar);
        }
    }

    @Override // g.u.h
    public h G(TimeInterpolator timeInterpolator) {
        this.F |= 1;
        ArrayList<h> arrayList = this.B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.B.get(i2).G(timeInterpolator);
            }
        }
        this.f3050k = timeInterpolator;
        return this;
    }

    @Override // g.u.h
    public void H(e eVar) {
        this.A = eVar == null ? h.f3045f : eVar;
        this.F |= 4;
        if (this.B != null) {
            for (int i2 = 0; i2 < this.B.size(); i2++) {
                this.B.get(i2).H(eVar);
            }
        }
    }

    @Override // g.u.h
    public void I(m mVar) {
        this.F |= 2;
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.B.get(i2).I(mVar);
        }
    }

    @Override // g.u.h
    public h J(long j2) {
        this.f3048i = j2;
        return this;
    }

    @Override // g.u.h
    public String M(String str) {
        String M = super.M(str);
        for (int i2 = 0; i2 < this.B.size(); i2++) {
            StringBuilder h2 = c.c.a.a.a.h(M, "\n");
            h2.append(this.B.get(i2).M(str + "  "));
            M = h2.toString();
        }
        return M;
    }

    public n N(h hVar) {
        this.B.add(hVar);
        hVar.p = this;
        long j2 = this.f3049j;
        if (j2 >= 0) {
            hVar.E(j2);
        }
        if ((this.F & 1) != 0) {
            hVar.G(this.f3050k);
        }
        if ((this.F & 2) != 0) {
            hVar.I(null);
        }
        if ((this.F & 4) != 0) {
            hVar.H(this.A);
        }
        if ((this.F & 8) != 0) {
            hVar.F(this.z);
        }
        return this;
    }

    public h O(int i2) {
        if (i2 < 0 || i2 >= this.B.size()) {
            return null;
        }
        return this.B.get(i2);
    }

    public n P(int i2) {
        if (i2 == 0) {
            this.C = true;
        } else if (i2 == 1) {
            this.C = false;
        } else {
            throw new AndroidRuntimeException(c.c.a.a.a.l("Invalid parameter for TransitionSet ordering: ", i2));
        }
        return this;
    }

    @Override // g.u.h
    public h a(h.d dVar) {
        super.a(dVar);
        return this;
    }

    @Override // g.u.h
    public void cancel() {
        super.cancel();
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.B.get(i2).cancel();
        }
    }

    @Override // g.u.h
    public h d(View view) {
        for (int i2 = 0; i2 < this.B.size(); i2++) {
            this.B.get(i2).d(view);
        }
        this.f3052m.add(view);
        return this;
    }

    @Override // g.u.h
    public void g(p pVar) {
        if (x(pVar.b)) {
            Iterator<h> it = this.B.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next.x(pVar.b)) {
                    next.g(pVar);
                    pVar.f3058c.add(next);
                }
            }
        }
    }

    @Override // g.u.h
    public void i(p pVar) {
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.B.get(i2).i(pVar);
        }
    }

    @Override // g.u.h
    public void j(p pVar) {
        if (x(pVar.b)) {
            Iterator<h> it = this.B.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next.x(pVar.b)) {
                    next.j(pVar);
                    pVar.f3058c.add(next);
                }
            }
        }
    }

    @Override // g.u.h
    /* renamed from: m */
    public h clone() {
        n nVar = (n) super.clone();
        nVar.B = new ArrayList<>();
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            h m2 = this.B.get(i2).clone();
            nVar.B.add(m2);
            m2.p = nVar;
        }
        return nVar;
    }

    @Override // g.u.h
    public void p(ViewGroup viewGroup, q qVar, q qVar2, ArrayList<p> arrayList, ArrayList<p> arrayList2) {
        long j2 = this.f3048i;
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.B.get(i2);
            if (j2 > 0 && (this.C || i2 == 0)) {
                long j3 = hVar.f3048i;
                if (j3 > 0) {
                    hVar.J(j3 + j2);
                } else {
                    hVar.J(j2);
                }
            }
            hVar.p(viewGroup, qVar, qVar2, arrayList, arrayList2);
        }
    }

    @Override // g.u.h
    public void z(View view) {
        super.z(view);
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.B.get(i2).z(view);
        }
    }
}
