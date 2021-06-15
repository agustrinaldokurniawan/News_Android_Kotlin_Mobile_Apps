package c.b.a.a0.b;

import c.b.a.a0.c.a;
import c.b.a.c0.k.p;
import c.b.a.c0.l.b;
import java.util.ArrayList;
import java.util.List;

public class s implements c, a.b {
    public final boolean a;
    public final List<a.b> b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final int f484c;

    /* renamed from: d  reason: collision with root package name */
    public final a<?, Float> f485d;
    public final a<?, Float> e;

    /* renamed from: f  reason: collision with root package name */
    public final a<?, Float> f486f;

    public s(b bVar, p pVar) {
        this.a = pVar.f598f;
        this.f484c = pVar.b;
        a<Float, Float> a2 = pVar.f596c.a();
        this.f485d = a2;
        a<Float, Float> a3 = pVar.f597d.a();
        this.e = a3;
        a<Float, Float> a4 = pVar.e.a();
        this.f486f = a4;
        bVar.d(a2);
        bVar.d(a3);
        bVar.d(a4);
        a2.a.add(this);
        a3.a.add(this);
        a4.a.add(this);
    }

    @Override // c.b.a.a0.c.a.b
    public void b() {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            this.b.get(i2).b();
        }
    }

    @Override // c.b.a.a0.b.c
    public void c(List<c> list, List<c> list2) {
    }
}
