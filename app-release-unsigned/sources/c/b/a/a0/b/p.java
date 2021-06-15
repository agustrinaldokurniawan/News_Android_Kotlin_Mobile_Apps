package c.b.a.a0.b;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import c.b.a.a0.c.a;
import c.b.a.a0.c.o;
import c.b.a.c0.e;
import c.b.a.c0.j.l;
import c.b.a.c0.k.j;
import c.b.a.c0.l.b;
import c.b.a.f0.f;
import c.b.a.g0.c;
import c.b.a.m;
import c.b.a.r;
import java.util.List;
import java.util.Objects;

public class p implements e, m, j, a.b, k {
    public final Matrix a = new Matrix();
    public final Path b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final m f474c;

    /* renamed from: d  reason: collision with root package name */
    public final b f475d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f476f;

    /* renamed from: g  reason: collision with root package name */
    public final a<Float, Float> f477g;

    /* renamed from: h  reason: collision with root package name */
    public final a<Float, Float> f478h;

    /* renamed from: i  reason: collision with root package name */
    public final o f479i;

    /* renamed from: j  reason: collision with root package name */
    public d f480j;

    public p(m mVar, b bVar, j jVar) {
        this.f474c = mVar;
        this.f475d = bVar;
        this.e = jVar.a;
        this.f476f = jVar.e;
        a<Float, Float> a2 = jVar.b.a();
        this.f477g = a2;
        bVar.d(a2);
        a2.a.add(this);
        a<Float, Float> a3 = jVar.f580c.a();
        this.f478h = a3;
        bVar.d(a3);
        a3.a.add(this);
        l lVar = jVar.f581d;
        Objects.requireNonNull(lVar);
        o oVar = new o(lVar);
        this.f479i = oVar;
        oVar.a(bVar);
        oVar.b(this);
    }

    @Override // c.b.a.a0.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.f480j.a(rectF, matrix, z);
    }

    @Override // c.b.a.a0.c.a.b
    public void b() {
        this.f474c.invalidateSelf();
    }

    @Override // c.b.a.a0.b.c
    public void c(List<c> list, List<c> list2) {
        this.f480j.c(list, list2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    @Override // c.b.a.a0.b.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(java.util.ListIterator<c.b.a.a0.b.c> r9) {
        /*
            r8 = this;
            c.b.a.a0.b.d r0 = r8.f480j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r9.previous()
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x0028:
            java.util.Collections.reverse(r6)
            c.b.a.a0.b.d r9 = new c.b.a.a0.b.d
            c.b.a.m r2 = r8.f474c
            c.b.a.c0.l.b r3 = r8.f475d
            boolean r5 = r8.f476f
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f480j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.a.a0.b.p.d(java.util.ListIterator):void");
    }

    @Override // c.b.a.c0.f
    public void e(e eVar, int i2, List<e> list, e eVar2) {
        f.f(eVar, i2, list, eVar2, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: c.b.a.g0.c<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.b.a.c0.f
    public <T> void f(T t, c<T> cVar) {
        a<Float, Float> aVar;
        if (!this.f479i.c(t, cVar)) {
            if (t == r.s) {
                aVar = this.f477g;
            } else if (t == r.t) {
                aVar = this.f478h;
            } else {
                return;
            }
            c<A> cVar2 = aVar.e;
            aVar.e = cVar;
        }
    }

    @Override // c.b.a.a0.b.e
    public void g(Canvas canvas, Matrix matrix, int i2) {
        float floatValue = this.f477g.e().floatValue();
        float floatValue2 = this.f478h.e().floatValue();
        float floatValue3 = this.f479i.f518m.e().floatValue() / 100.0f;
        float floatValue4 = this.f479i.n.e().floatValue() / 100.0f;
        for (int i3 = ((int) floatValue) - 1; i3 >= 0; i3--) {
            this.a.set(matrix);
            float f2 = (float) i3;
            this.a.preConcat(this.f479i.f(f2 + floatValue2));
            this.f480j.g(canvas, this.a, (int) (f.e(floatValue3, floatValue4, f2 / floatValue) * ((float) i2)));
        }
    }

    @Override // c.b.a.a0.b.m
    public Path h() {
        Path h2 = this.f480j.h();
        this.b.reset();
        float floatValue = this.f477g.e().floatValue();
        float floatValue2 = this.f478h.e().floatValue();
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.a.set(this.f479i.f(((float) i2) + floatValue2));
            this.b.addPath(h2, this.a);
        }
        return this.b;
    }

    @Override // c.b.a.a0.b.c
    public String i() {
        return this.e;
    }
}
