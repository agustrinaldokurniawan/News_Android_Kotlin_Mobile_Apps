package g.b.g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import g.b.b;
import g.h.j.o;
import java.util.concurrent.atomic.AtomicInteger;

public class e {
    public final View a;
    public final j b;

    /* renamed from: c  reason: collision with root package name */
    public int f2086c = -1;

    /* renamed from: d  reason: collision with root package name */
    public x0 f2087d;
    public x0 e;

    /* renamed from: f  reason: collision with root package name */
    public x0 f2088f;

    public e(View view) {
        this.a = view;
        this.b = j.a();
    }

    public void a() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            boolean z = true;
            if (this.f2087d != null) {
                if (this.f2088f == null) {
                    this.f2088f = new x0();
                }
                x0 x0Var = this.f2088f;
                x0Var.a = null;
                x0Var.f2184d = false;
                x0Var.b = null;
                x0Var.f2183c = false;
                View view = this.a;
                AtomicInteger atomicInteger = o.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    x0Var.f2184d = true;
                    x0Var.a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = this.a.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    x0Var.f2183c = true;
                    x0Var.b = backgroundTintMode;
                }
                if (x0Var.f2184d || x0Var.f2183c) {
                    j.f(background, x0Var, this.a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            x0 x0Var2 = this.e;
            if (x0Var2 != null) {
                j.f(background, x0Var2, this.a.getDrawableState());
                return;
            }
            x0 x0Var3 = this.f2087d;
            if (x0Var3 != null) {
                j.f(background, x0Var3, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        x0 x0Var = this.e;
        if (x0Var != null) {
            return x0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        x0 x0Var = this.e;
        if (x0Var != null) {
            return x0Var.b;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i2) {
        Context context = this.a.getContext();
        int[] iArr = b.y;
        z0 q = z0.q(context, attributeSet, iArr, i2, 0);
        View view = this.a;
        o.n(view, view.getContext(), iArr, attributeSet, q.b, i2, 0);
        try {
            if (q.o(0)) {
                this.f2086c = q.l(0, -1);
                ColorStateList d2 = this.b.d(this.a.getContext(), this.f2086c);
                if (d2 != null) {
                    g(d2);
                }
            }
            if (q.o(1)) {
                this.a.setBackgroundTintList(q.c(1));
            }
            if (q.o(2)) {
                this.a.setBackgroundTintMode(g0.b(q.j(2, -1), null));
            }
            q.b.recycle();
        } catch (Throwable th) {
            q.b.recycle();
            throw th;
        }
    }

    public void e() {
        this.f2086c = -1;
        g(null);
        a();
    }

    public void f(int i2) {
        this.f2086c = i2;
        j jVar = this.b;
        g(jVar != null ? jVar.d(this.a.getContext(), i2) : null);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2087d == null) {
                this.f2087d = new x0();
            }
            x0 x0Var = this.f2087d;
            x0Var.a = colorStateList;
            x0Var.f2184d = true;
        } else {
            this.f2087d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new x0();
        }
        x0 x0Var = this.e;
        x0Var.a = colorStateList;
        x0Var.f2184d = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new x0();
        }
        x0 x0Var = this.e;
        x0Var.b = mode;
        x0Var.f2183c = true;
        a();
    }
}
