package c.b.a.a0.b;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import c.b.a.a0.c.a;
import c.b.a.a0.c.o;
import c.b.a.c0.e;
import c.b.a.c0.f;
import c.b.a.c0.j.l;
import c.b.a.c0.l.b;
import c.b.a.f0.g;
import c.b.a.g0.c;
import c.b.a.m;
import java.util.ArrayList;
import java.util.List;

public class d implements e, m, a.b, f {
    public Paint a;
    public RectF b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f425c;

    /* renamed from: d  reason: collision with root package name */
    public final Path f426d;
    public final RectF e;

    /* renamed from: f  reason: collision with root package name */
    public final String f427f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f428g;

    /* renamed from: h  reason: collision with root package name */
    public final List<c> f429h;

    /* renamed from: i  reason: collision with root package name */
    public final m f430i;

    /* renamed from: j  reason: collision with root package name */
    public List<m> f431j;

    /* renamed from: k  reason: collision with root package name */
    public o f432k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(c.b.a.m r8, c.b.a.c0.l.b r9, c.b.a.c0.k.m r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.a
            boolean r4 = r10.f586c
            java.util.List<c.b.a.c0.k.b> r0 = r10.b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = r1
        L_0x0011:
            int r6 = r0.size()
            if (r2 >= r6) goto L_0x0029
            java.lang.Object r6 = r0.get(r2)
            c.b.a.c0.k.b r6 = (c.b.a.c0.k.b) r6
            c.b.a.a0.b.c r6 = r6.a(r8, r9)
            if (r6 == 0) goto L_0x0026
            r5.add(r6)
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0029:
            java.util.List<c.b.a.c0.k.b> r10 = r10.b
        L_0x002b:
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x0042
            java.lang.Object r0 = r10.get(r1)
            c.b.a.c0.k.b r0 = (c.b.a.c0.k.b) r0
            boolean r2 = r0 instanceof c.b.a.c0.j.l
            if (r2 == 0) goto L_0x003f
            c.b.a.c0.j.l r0 = (c.b.a.c0.j.l) r0
            r6 = r0
            goto L_0x0044
        L_0x003f:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0042:
            r10 = 0
            r6 = r10
        L_0x0044:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.a.a0.b.d.<init>(c.b.a.m, c.b.a.c0.l.b, c.b.a.c0.k.m):void");
    }

    @Override // c.b.a.a0.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.f425c.set(matrix);
        o oVar = this.f432k;
        if (oVar != null) {
            this.f425c.preConcat(oVar.e());
        }
        this.e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f429h.size() - 1; size >= 0; size--) {
            c cVar = this.f429h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).a(this.e, this.f425c, z);
                rectF.union(this.e);
            }
        }
    }

    @Override // c.b.a.a0.c.a.b
    public void b() {
        this.f430i.invalidateSelf();
    }

    @Override // c.b.a.a0.b.c
    public void c(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(this.f429h.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.f429h.size() - 1; size >= 0; size--) {
            c cVar = this.f429h.get(size);
            cVar.c(arrayList, this.f429h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    public List<m> d() {
        if (this.f431j == null) {
            this.f431j = new ArrayList();
            for (int i2 = 0; i2 < this.f429h.size(); i2++) {
                c cVar = this.f429h.get(i2);
                if (cVar instanceof m) {
                    this.f431j.add((m) cVar);
                }
            }
        }
        return this.f431j;
    }

    @Override // c.b.a.c0.f
    public void e(e eVar, int i2, List<e> list, e eVar2) {
        if (eVar.e(this.f427f, i2) || "__container".equals(this.f427f)) {
            if (!"__container".equals(this.f427f)) {
                eVar2 = eVar2.a(this.f427f);
                if (eVar.c(this.f427f, i2)) {
                    list.add(eVar2.g(this));
                }
            }
            if (eVar.f(this.f427f, i2)) {
                int d2 = eVar.d(this.f427f, i2) + i2;
                for (int i3 = 0; i3 < this.f429h.size(); i3++) {
                    c cVar = this.f429h.get(i3);
                    if (cVar instanceof f) {
                        ((f) cVar).e(eVar, d2, list, eVar2);
                    }
                }
            }
        }
    }

    @Override // c.b.a.c0.f
    public <T> void f(T t, c<T> cVar) {
        o oVar = this.f432k;
        if (oVar != null) {
            oVar.c(t, cVar);
        }
    }

    @Override // c.b.a.a0.b.e
    public void g(Canvas canvas, Matrix matrix, int i2) {
        boolean z;
        int i3;
        if (!this.f428g) {
            this.f425c.set(matrix);
            o oVar = this.f432k;
            if (oVar != null) {
                this.f425c.preConcat(oVar.e());
                a<Integer, Integer> aVar = this.f432k.f515j;
                if (aVar == null) {
                    i3 = 100;
                } else {
                    i3 = aVar.e().intValue();
                }
                i2 = (int) ((((((float) i3) / 100.0f) * ((float) i2)) / 255.0f) * 255.0f);
            }
            boolean z2 = false;
            if (this.f430i.w) {
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 >= this.f429h.size()) {
                        z = false;
                        break;
                    }
                    if ((this.f429h.get(i4) instanceof e) && (i5 = i5 + 1) >= 2) {
                        z = true;
                        break;
                    }
                    i4++;
                }
                if (z && i2 != 255) {
                    z2 = true;
                }
            }
            if (z2) {
                this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
                a(this.b, this.f425c, true);
                this.a.setAlpha(i2);
                RectF rectF = this.b;
                Paint paint = this.a;
                ThreadLocal<PathMeasure> threadLocal = g.a;
                canvas.saveLayer(rectF, paint);
                c.b.a.d.a("Utils#saveLayer");
            }
            if (z2) {
                i2 = 255;
            }
            for (int size = this.f429h.size() - 1; size >= 0; size--) {
                c cVar = this.f429h.get(size);
                if (cVar instanceof e) {
                    ((e) cVar).g(canvas, this.f425c, i2);
                }
            }
            if (z2) {
                canvas.restore();
            }
        }
    }

    @Override // c.b.a.a0.b.m
    public Path h() {
        this.f425c.reset();
        o oVar = this.f432k;
        if (oVar != null) {
            this.f425c.set(oVar.e());
        }
        this.f426d.reset();
        if (this.f428g) {
            return this.f426d;
        }
        for (int size = this.f429h.size() - 1; size >= 0; size--) {
            c cVar = this.f429h.get(size);
            if (cVar instanceof m) {
                this.f426d.addPath(((m) cVar).h(), this.f425c);
            }
        }
        return this.f426d;
    }

    @Override // c.b.a.a0.b.c
    public String i() {
        return this.f427f;
    }

    public d(m mVar, b bVar, String str, boolean z, List<c> list, l lVar) {
        this.a = new c.b.a.a0.a();
        this.b = new RectF();
        this.f425c = new Matrix();
        this.f426d = new Path();
        this.e = new RectF();
        this.f427f = str;
        this.f430i = mVar;
        this.f428g = z;
        this.f429h = list;
        if (lVar != null) {
            o oVar = new o(lVar);
            this.f432k = oVar;
            oVar.a(bVar);
            this.f432k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((j) arrayList.get(size2)).d(list.listIterator(list.size()));
            } else {
                return;
            }
        }
    }
}
