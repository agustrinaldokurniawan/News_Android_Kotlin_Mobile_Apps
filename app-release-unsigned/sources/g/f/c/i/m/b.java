package g.f.c.i.m;

import androidx.constraintlayout.widget.ConstraintLayout;
import g.f.c.i.d;
import g.f.c.i.e;
import java.util.ArrayList;

public class b {
    public final ArrayList<d> a = new ArrayList<>();
    public a b = new a();

    /* renamed from: c  reason: collision with root package name */
    public e f2347c;

    public static class a {
        public int a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f2348c;

        /* renamed from: d  reason: collision with root package name */
        public int f2349d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f2350f;

        /* renamed from: g  reason: collision with root package name */
        public int f2351g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2352h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2353i;

        /* renamed from: j  reason: collision with root package name */
        public int f2354j;
    }

    /* renamed from: g.f.c.i.m.b$b  reason: collision with other inner class name */
    public interface AbstractC0071b {
    }

    public b(e eVar) {
        this.f2347c = eVar;
    }

    public final boolean a(AbstractC0071b bVar, d dVar, int i2) {
        this.b.a = dVar.o();
        this.b.b = dVar.s();
        this.b.f2348c = dVar.t();
        this.b.f2349d = dVar.n();
        a aVar = this.b;
        aVar.f2353i = false;
        aVar.f2354j = i2;
        boolean z = aVar.a == 3;
        boolean z2 = aVar.b == 3;
        boolean z3 = z && dVar.S > 0.0f;
        boolean z4 = z2 && dVar.S > 0.0f;
        if (z3 && dVar.n[0] == 4) {
            aVar.a = 1;
        }
        if (z4 && dVar.n[1] == 4) {
            aVar.b = 1;
        }
        ((ConstraintLayout.b) bVar).b(dVar, aVar);
        dVar.P(this.b.e);
        dVar.K(this.b.f2350f);
        a aVar2 = this.b;
        dVar.y = aVar2.f2352h;
        dVar.H(aVar2.f2351g);
        a aVar3 = this.b;
        aVar3.f2354j = 0;
        return aVar3.f2353i;
    }

    public final void b(e eVar, int i2, int i3) {
        int i4 = eVar.X;
        int i5 = eVar.Y;
        eVar.N(0);
        eVar.M(0);
        eVar.Q = i2;
        int i6 = eVar.X;
        if (i2 < i6) {
            eVar.Q = i6;
        }
        eVar.R = i3;
        int i7 = eVar.Y;
        if (i3 < i7) {
            eVar.R = i7;
        }
        eVar.N(i4);
        eVar.M(i5);
        this.f2347c.S();
    }

    public void c(e eVar) {
        this.a.clear();
        int size = eVar.l0.size();
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = eVar.l0.get(i2);
            if (dVar.o() == 3 || dVar.s() == 3) {
                this.a.add(dVar);
            }
        }
        eVar.Z();
    }
}
