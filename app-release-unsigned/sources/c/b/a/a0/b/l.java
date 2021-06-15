package c.b.a.a0.b;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import c.b.a.a0.c.o;
import c.b.a.c0.k.g;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
public class l implements m, j {
    public final Path a = new Path();
    public final Path b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f455c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final List<m> f456d = new ArrayList();
    public final g e;

    public l(g gVar) {
        this.e = gVar;
    }

    @TargetApi(19)
    public final void b(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        this.b.reset();
        this.a.reset();
        for (int size = this.f456d.size() - 1; size >= 1; size--) {
            m mVar = this.f456d.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List<m> d2 = dVar.d();
                for (int size2 = d2.size() - 1; size2 >= 0; size2--) {
                    Path h2 = d2.get(size2).h();
                    o oVar = dVar.f432k;
                    if (oVar != null) {
                        matrix2 = oVar.e();
                    } else {
                        dVar.f425c.reset();
                        matrix2 = dVar.f425c;
                    }
                    h2.transform(matrix2);
                    this.b.addPath(h2);
                }
            } else {
                this.b.addPath(mVar.h());
            }
        }
        m mVar2 = this.f456d.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> d3 = dVar2.d();
            for (int i2 = 0; i2 < d3.size(); i2++) {
                Path h3 = d3.get(i2).h();
                o oVar2 = dVar2.f432k;
                if (oVar2 != null) {
                    matrix = oVar2.e();
                } else {
                    dVar2.f425c.reset();
                    matrix = dVar2.f425c;
                }
                h3.transform(matrix);
                this.a.addPath(h3);
            }
        } else {
            this.a.set(mVar2.h());
        }
        this.f455c.op(this.a, this.b, op);
    }

    @Override // c.b.a.a0.b.c
    public void c(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < this.f456d.size(); i2++) {
            this.f456d.get(i2).c(list, list2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    @Override // c.b.a.a0.b.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(java.util.ListIterator<c.b.a.a0.b.c> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            c.b.a.a0.b.c r0 = (c.b.a.a0.b.c) r0
            boolean r1 = r0 instanceof c.b.a.a0.b.m
            if (r1 == 0) goto L_0x000d
            java.util.List<c.b.a.a0.b.m> r1 = r2.f456d
            c.b.a.a0.b.m r0 = (c.b.a.a0.b.m) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.a.a0.b.l.d(java.util.ListIterator):void");
    }

    @Override // c.b.a.a0.b.m
    public Path h() {
        Path.Op op;
        this.f455c.reset();
        g gVar = this.e;
        if (gVar.f565c) {
            return this.f455c;
        }
        int ordinal = gVar.b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                op = Path.Op.UNION;
            } else if (ordinal == 2) {
                op = Path.Op.REVERSE_DIFFERENCE;
            } else if (ordinal == 3) {
                op = Path.Op.INTERSECT;
            } else if (ordinal == 4) {
                op = Path.Op.XOR;
            }
            b(op);
        } else {
            for (int i2 = 0; i2 < this.f456d.size(); i2++) {
                this.f455c.addPath(this.f456d.get(i2).h());
            }
        }
        return this.f455c;
    }
}
