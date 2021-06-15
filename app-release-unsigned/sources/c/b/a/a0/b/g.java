package c.b.a.a0.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import c.b.a.a0.c.a;
import c.b.a.a0.c.p;
import c.b.a.c0.e;
import c.b.a.c0.k.l;
import c.b.a.c0.l.b;
import c.b.a.d;
import c.b.a.f0.f;
import c.b.a.g0.c;
import c.b.a.m;
import c.b.a.r;
import java.util.ArrayList;
import java.util.List;

public class g implements e, a.b, k {
    public final Path a;
    public final Paint b = new c.b.a.a0.a(1);

    /* renamed from: c  reason: collision with root package name */
    public final b f438c;

    /* renamed from: d  reason: collision with root package name */
    public final String f439d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final List<m> f440f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final a<Integer, Integer> f441g;

    /* renamed from: h  reason: collision with root package name */
    public final a<Integer, Integer> f442h;

    /* renamed from: i  reason: collision with root package name */
    public a<ColorFilter, ColorFilter> f443i;

    /* renamed from: j  reason: collision with root package name */
    public final m f444j;

    public g(m mVar, b bVar, l lVar) {
        Path path = new Path();
        this.a = path;
        this.f438c = bVar;
        this.f439d = lVar.f583c;
        this.e = lVar.f585f;
        this.f444j = mVar;
        if (lVar.f584d == null || lVar.e == null) {
            this.f441g = null;
            this.f442h = null;
            return;
        }
        path.setFillType(lVar.b);
        a<Integer, Integer> a2 = lVar.f584d.a();
        this.f441g = a2;
        a2.a.add(this);
        bVar.d(a2);
        a<Integer, Integer> a3 = lVar.e.a();
        this.f442h = a3;
        a3.a.add(this);
        bVar.d(a3);
    }

    @Override // c.b.a.a0.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i2 = 0; i2 < this.f440f.size(); i2++) {
            this.a.addPath(this.f440f.get(i2).h(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // c.b.a.a0.c.a.b
    public void b() {
        this.f444j.invalidateSelf();
    }

    @Override // c.b.a.a0.b.c
    public void c(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            c cVar = list2.get(i2);
            if (cVar instanceof m) {
                this.f440f.add((m) cVar);
            }
        }
    }

    @Override // c.b.a.c0.f
    public void e(e eVar, int i2, List<e> list, e eVar2) {
        f.f(eVar, i2, list, eVar2, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: c.b.a.g0.c<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.b.a.c0.f
    public <T> void f(T t, c<T> cVar) {
        a<Integer, Integer> aVar;
        if (t == r.a) {
            aVar = this.f441g;
        } else if (t == r.f707d) {
            aVar = this.f442h;
        } else if (t == r.E) {
            a<ColorFilter, ColorFilter> aVar2 = this.f443i;
            if (aVar2 != null) {
                this.f438c.u.remove(aVar2);
            }
            if (cVar == 0) {
                this.f443i = null;
                return;
            }
            p pVar = new p(cVar, null);
            this.f443i = pVar;
            pVar.a.add(this);
            this.f438c.d(this.f443i);
            return;
        } else {
            return;
        }
        c<A> cVar2 = aVar.e;
        aVar.e = cVar;
    }

    @Override // c.b.a.a0.b.e
    public void g(Canvas canvas, Matrix matrix, int i2) {
        if (!this.e) {
            Paint paint = this.b;
            c.b.a.a0.c.b bVar = (c.b.a.a0.c.b) this.f441g;
            paint.setColor(bVar.k(bVar.a(), bVar.c()));
            this.b.setAlpha(f.c((int) ((((((float) i2) / 255.0f) * ((float) this.f442h.e().intValue())) / 100.0f) * 255.0f), 0, 255));
            a<ColorFilter, ColorFilter> aVar = this.f443i;
            if (aVar != null) {
                this.b.setColorFilter(aVar.e());
            }
            this.a.reset();
            for (int i3 = 0; i3 < this.f440f.size(); i3++) {
                this.a.addPath(this.f440f.get(i3).h(), matrix);
            }
            canvas.drawPath(this.a, this.b);
            d.a("FillContent#draw");
        }
    }

    @Override // c.b.a.a0.b.c
    public String i() {
        return this.f439d;
    }
}
