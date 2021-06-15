package c.b.a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import c.b.a.c0.l.e;
import c.b.a.e0.h0.c;
import c.b.a.e0.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class m extends Drawable implements Drawable.Callback, Animatable {
    public final Matrix e = new Matrix();

    /* renamed from: f  reason: collision with root package name */
    public g f693f;

    /* renamed from: g  reason: collision with root package name */
    public final c.b.a.f0.d f694g;

    /* renamed from: h  reason: collision with root package name */
    public float f695h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f696i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f697j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f698k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<o> f699l;

    /* renamed from: m  reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f700m;
    public c.b.a.b0.b n;
    public String o;
    public b p;
    public c.b.a.b0.a q;
    public boolean r;
    public c.b.a.c0.l.c s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    public class a implements o {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // c.b.a.m.o
        public void a(g gVar) {
            m.this.r(this.a);
        }
    }

    public class b implements o {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public b(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }

        @Override // c.b.a.m.o
        public void a(g gVar) {
            m.this.q(this.a, this.b);
        }
    }

    public class c implements o {
        public final /* synthetic */ int a;

        public c(int i2) {
            this.a = i2;
        }

        @Override // c.b.a.m.o
        public void a(g gVar) {
            m.this.m(this.a);
        }
    }

    public class d implements o {
        public final /* synthetic */ float a;

        public d(float f2) {
            this.a = f2;
        }

        @Override // c.b.a.m.o
        public void a(g gVar) {
            m.this.v(this.a);
        }
    }

    public class e implements o {
        public final /* synthetic */ c.b.a.c0.e a;
        public final /* synthetic */ Object b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c.b.a.g0.c f702c;

        public e(c.b.a.c0.e eVar, Object obj, c.b.a.g0.c cVar) {
            this.a = eVar;
            this.b = obj;
            this.f702c = cVar;
        }

        @Override // c.b.a.m.o
        public void a(g gVar) {
            m.this.a(this.a, this.b, this.f702c);
        }
    }

    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            m mVar = m.this;
            c.b.a.c0.l.c cVar = mVar.s;
            if (cVar != null) {
                cVar.r(mVar.f694g.g());
            }
        }
    }

    public class g implements o {
        public g() {
        }

        @Override // c.b.a.m.o
        public void a(g gVar) {
            m.this.k();
        }
    }

    public class h implements o {
        public h() {
        }

        @Override // c.b.a.m.o
        public void a(g gVar) {
            m.this.l();
        }
    }

    public class i implements o {
        public final /* synthetic */ int a;

        public i(int i2) {
            this.a = i2;
        }

        @Override // c.b.a.m.o
        public void a(g gVar) {
            m.this.s(this.a);
        }
    }

    public class j implements o {
        public final /* synthetic */ float a;

        public j(float f2) {
            this.a = f2;
        }

        @Override // c.b.a.m.o
        public void a(g gVar) {
            m.this.u(this.a);
        }
    }

    public class k implements o {
        public final /* synthetic */ int a;

        public k(int i2) {
            this.a = i2;
        }

        @Override // c.b.a.m.o
        public void a(g gVar) {
            m.this.n(this.a);
        }
    }

    public class l implements o {
        public final /* synthetic */ float a;

        public l(float f2) {
            this.a = f2;
        }

        @Override // c.b.a.m.o
        public void a(g gVar) {
            m.this.p(this.a);
        }
    }

    /* renamed from: c.b.a.m$m  reason: collision with other inner class name */
    public class C0010m implements o {
        public final /* synthetic */ String a;

        public C0010m(String str) {
            this.a = str;
        }

        @Override // c.b.a.m.o
        public void a(g gVar) {
            m.this.t(this.a);
        }
    }

    public class n implements o {
        public final /* synthetic */ String a;

        public n(String str) {
            this.a = str;
        }

        @Override // c.b.a.m.o
        public void a(g gVar) {
            m.this.o(this.a);
        }
    }

    public interface o {
        void a(g gVar);
    }

    public m() {
        c.b.a.f0.d dVar = new c.b.a.f0.d();
        this.f694g = dVar;
        this.f695h = 1.0f;
        this.f696i = true;
        this.f697j = false;
        this.f698k = false;
        this.f699l = new ArrayList<>();
        f fVar = new f();
        this.f700m = fVar;
        this.t = 255;
        this.x = true;
        this.y = false;
        dVar.e.add(fVar);
    }

    public <T> void a(c.b.a.c0.e eVar, T t2, c.b.a.g0.c<T> cVar) {
        List list;
        c.b.a.c0.l.c cVar2 = this.s;
        if (cVar2 == null) {
            this.f699l.add(new e(eVar, t2, cVar));
            return;
        }
        boolean z = true;
        if (eVar == c.b.a.c0.e.a) {
            cVar2.f(t2, cVar);
        } else {
            c.b.a.c0.f fVar = eVar.f536c;
            if (fVar != null) {
                fVar.f(t2, cVar);
            } else {
                if (cVar2 == null) {
                    c.b.a.f0.c.b("Cannot resolve KeyPath. Composition is not set yet.");
                    list = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList();
                    this.s.e(eVar, 0, arrayList, new c.b.a.c0.e(new String[0]));
                    list = arrayList;
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    ((c.b.a.c0.e) list.get(i2)).f536c.f(t2, cVar);
                }
                z = true ^ list.isEmpty();
            }
        }
        if (z) {
            invalidateSelf();
            if (t2 == r.C) {
                v(h());
            }
        }
    }

    public final boolean b() {
        return this.f696i || this.f697j;
    }

    public final void c() {
        g gVar = this.f693f;
        c.a aVar = r.a;
        Rect rect = gVar.f671j;
        c.b.a.c0.l.e eVar = new c.b.a.c0.l.e(Collections.emptyList(), gVar, "__container", -1, e.a.PRE_COMP, -1, null, Collections.emptyList(), new c.b.a.c0.j.l(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false);
        g gVar2 = this.f693f;
        c.b.a.c0.l.c cVar = new c.b.a.c0.l.c(this, eVar, gVar2.f670i, gVar2);
        this.s = cVar;
        if (this.v) {
            cVar.q(true);
        }
    }

    public void d() {
        c.b.a.f0.d dVar = this.f694g;
        if (dVar.o) {
            dVar.cancel();
        }
        this.f693f = null;
        this.s = null;
        this.n = null;
        c.b.a.f0.d dVar2 = this.f694g;
        dVar2.n = null;
        dVar2.f660l = -2.14748365E9f;
        dVar2.f661m = 2.14748365E9f;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.y = false;
        if (this.f698k) {
            try {
                e(canvas);
            } catch (Throwable unused) {
                Objects.requireNonNull((c.b.a.f0.b) c.b.a.f0.c.a);
            }
        } else {
            e(canvas);
        }
        d.a("Drawable#draw");
    }

    public final void e(Canvas canvas) {
        float f2;
        float f3;
        g gVar = this.f693f;
        boolean z = true;
        if (gVar != null && !getBounds().isEmpty()) {
            Rect bounds = getBounds();
            Rect rect = gVar.f671j;
            if (((float) bounds.width()) / ((float) bounds.height()) != ((float) rect.width()) / ((float) rect.height())) {
                z = false;
            }
        }
        int i2 = -1;
        if (!z) {
            if (this.s != null) {
                Rect bounds2 = getBounds();
                float width = ((float) bounds2.width()) / ((float) this.f693f.f671j.width());
                float height = ((float) bounds2.height()) / ((float) this.f693f.f671j.height());
                if (this.x) {
                    float min = Math.min(width, height);
                    if (min < 1.0f) {
                        f3 = 1.0f / min;
                        width /= f3;
                        height /= f3;
                    } else {
                        f3 = 1.0f;
                    }
                    if (f3 > 1.0f) {
                        i2 = canvas.save();
                        float width2 = ((float) bounds2.width()) / 2.0f;
                        float height2 = ((float) bounds2.height()) / 2.0f;
                        float f4 = width2 * min;
                        float f5 = min * height2;
                        canvas.translate(width2 - f4, height2 - f5);
                        canvas.scale(f3, f3, f4, f5);
                    }
                }
                this.e.reset();
                this.e.preScale(width, height);
                this.s.g(canvas, this.e, this.t);
                if (i2 > 0) {
                    canvas.restoreToCount(i2);
                }
            }
        } else if (this.s != null) {
            float f6 = this.f695h;
            float min2 = Math.min(((float) canvas.getWidth()) / ((float) this.f693f.f671j.width()), ((float) canvas.getHeight()) / ((float) this.f693f.f671j.height()));
            if (f6 > min2) {
                f2 = this.f695h / min2;
            } else {
                min2 = f6;
                f2 = 1.0f;
            }
            if (f2 > 1.0f) {
                i2 = canvas.save();
                float width3 = ((float) this.f693f.f671j.width()) / 2.0f;
                float height3 = ((float) this.f693f.f671j.height()) / 2.0f;
                float f7 = width3 * min2;
                float f8 = height3 * min2;
                float f9 = this.f695h;
                canvas.translate((width3 * f9) - f7, (f9 * height3) - f8);
                canvas.scale(f2, f2, f7, f8);
            }
            this.e.reset();
            this.e.preScale(min2, min2);
            this.s.g(canvas, this.e, this.t);
            if (i2 > 0) {
                canvas.restoreToCount(i2);
            }
        }
    }

    public float f() {
        return this.f694g.h();
    }

    public float g() {
        return this.f694g.i();
    }

    public int getAlpha() {
        return this.t;
    }

    public int getIntrinsicHeight() {
        g gVar = this.f693f;
        if (gVar == null) {
            return -1;
        }
        return (int) (((float) gVar.f671j.height()) * this.f695h);
    }

    public int getIntrinsicWidth() {
        g gVar = this.f693f;
        if (gVar == null) {
            return -1;
        }
        return (int) (((float) gVar.f671j.width()) * this.f695h);
    }

    public int getOpacity() {
        return -3;
    }

    public float h() {
        return this.f694g.g();
    }

    public int i() {
        return this.f694g.getRepeatCount();
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        if (!this.y) {
            this.y = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        return j();
    }

    public boolean j() {
        c.b.a.f0.d dVar = this.f694g;
        if (dVar == null) {
            return false;
        }
        return dVar.o;
    }

    public void k() {
        if (this.s == null) {
            this.f699l.add(new g());
            return;
        }
        if (b() || i() == 0) {
            c.b.a.f0.d dVar = this.f694g;
            dVar.o = true;
            boolean j2 = dVar.j();
            for (Animator.AnimatorListener animatorListener : dVar.f654f) {
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(dVar, j2);
                } else {
                    animatorListener.onAnimationStart(dVar);
                }
            }
            dVar.m((float) ((int) (dVar.j() ? dVar.h() : dVar.i())));
            dVar.f657i = 0;
            dVar.f659k = 0;
            dVar.k();
        }
        if (!b()) {
            m((int) (this.f694g.f655g < 0.0f ? g() : f()));
            this.f694g.f();
        }
    }

    public void l() {
        float f2;
        if (this.s == null) {
            this.f699l.add(new h());
            return;
        }
        if (b() || i() == 0) {
            c.b.a.f0.d dVar = this.f694g;
            dVar.o = true;
            dVar.k();
            dVar.f657i = 0;
            if (dVar.j() && dVar.f658j == dVar.i()) {
                f2 = dVar.h();
            } else if (!dVar.j() && dVar.f658j == dVar.h()) {
                f2 = dVar.i();
            }
            dVar.f658j = f2;
        }
        if (!b()) {
            m((int) (this.f694g.f655g < 0.0f ? g() : f()));
            this.f694g.f();
        }
    }

    public void m(int i2) {
        if (this.f693f == null) {
            this.f699l.add(new c(i2));
        } else {
            this.f694g.m((float) i2);
        }
    }

    public void n(int i2) {
        if (this.f693f == null) {
            this.f699l.add(new k(i2));
            return;
        }
        c.b.a.f0.d dVar = this.f694g;
        dVar.o(dVar.f660l, ((float) i2) + 0.99f);
    }

    public void o(String str) {
        g gVar = this.f693f;
        if (gVar == null) {
            this.f699l.add(new n(str));
            return;
        }
        c.b.a.c0.h d2 = gVar.d(str);
        if (d2 != null) {
            n((int) (d2.b + d2.f537c));
            return;
        }
        throw new IllegalArgumentException(c.c.a.a.a.c("Cannot find marker with name ", str, "."));
    }

    public void p(float f2) {
        g gVar = this.f693f;
        if (gVar == null) {
            this.f699l.add(new l(f2));
        } else {
            n((int) c.b.a.f0.f.e(gVar.f672k, gVar.f673l, f2));
        }
    }

    public void q(int i2, int i3) {
        if (this.f693f == null) {
            this.f699l.add(new b(i2, i3));
        } else {
            this.f694g.o((float) i2, ((float) i3) + 0.99f);
        }
    }

    public void r(String str) {
        g gVar = this.f693f;
        if (gVar == null) {
            this.f699l.add(new a(str));
            return;
        }
        c.b.a.c0.h d2 = gVar.d(str);
        if (d2 != null) {
            int i2 = (int) d2.b;
            q(i2, ((int) d2.f537c) + i2);
            return;
        }
        throw new IllegalArgumentException(c.c.a.a.a.c("Cannot find marker with name ", str, "."));
    }

    public void s(int i2) {
        if (this.f693f == null) {
            this.f699l.add(new i(i2));
            return;
        }
        c.b.a.f0.d dVar = this.f694g;
        dVar.o((float) i2, (float) ((int) dVar.f661m));
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        this.t = i2;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c.b.a.f0.c.b("Use addColorFilter instead.");
    }

    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            k();
        }
    }

    public void stop() {
        this.f699l.clear();
        this.f694g.f();
    }

    public void t(String str) {
        g gVar = this.f693f;
        if (gVar == null) {
            this.f699l.add(new C0010m(str));
            return;
        }
        c.b.a.c0.h d2 = gVar.d(str);
        if (d2 != null) {
            s((int) d2.b);
            return;
        }
        throw new IllegalArgumentException(c.c.a.a.a.c("Cannot find marker with name ", str, "."));
    }

    public void u(float f2) {
        g gVar = this.f693f;
        if (gVar == null) {
            this.f699l.add(new j(f2));
        } else {
            s((int) c.b.a.f0.f.e(gVar.f672k, gVar.f673l, f2));
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v(float f2) {
        g gVar = this.f693f;
        if (gVar == null) {
            this.f699l.add(new d(f2));
            return;
        }
        this.f694g.m(c.b.a.f0.f.e(gVar.f672k, gVar.f673l, f2));
        d.a("Drawable#setProgress");
    }
}
