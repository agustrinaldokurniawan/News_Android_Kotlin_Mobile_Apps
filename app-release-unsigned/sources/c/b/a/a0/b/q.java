package c.b.a.a0.b;

import android.graphics.Path;
import c.b.a.a0.c.a;
import c.b.a.c0.k.k;
import c.b.a.c0.k.n;
import c.b.a.c0.l.b;
import c.b.a.m;
import java.util.List;

public class q implements m, a.b {
    public final Path a = new Path();
    public final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final m f481c;

    /* renamed from: d  reason: collision with root package name */
    public final a<?, Path> f482d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public b f483f = new b();

    public q(m mVar, b bVar, n nVar) {
        this.b = nVar.f588d;
        this.f481c = mVar;
        a<k, Path> a2 = nVar.f587c.a();
        this.f482d = a2;
        bVar.d(a2);
        a2.a.add(this);
    }

    @Override // c.b.a.a0.c.a.b
    public void b() {
        this.e = false;
        this.f481c.invalidateSelf();
    }

    @Override // c.b.a.a0.b.c
    public void c(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            c cVar = list.get(i2);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.f484c == 1) {
                    this.f483f.a.add(sVar);
                    sVar.b.add(this);
                }
            }
        }
    }

    @Override // c.b.a.a0.b.m
    public Path h() {
        if (this.e) {
            return this.a;
        }
        this.a.reset();
        if (!this.b) {
            this.a.set(this.f482d.e());
            this.a.setFillType(Path.FillType.EVEN_ODD);
            this.f483f.a(this.a);
        }
        this.e = true;
        return this.a;
    }
}
