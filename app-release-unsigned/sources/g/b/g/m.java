package g.b.g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import g.b.b;
import g.b.d.a.a;
import g.h.j.o;

public class m {
    public final ImageView a;
    public x0 b;

    public m(ImageView imageView) {
        this.a = imageView;
    }

    public void a() {
        x0 x0Var;
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            int[] iArr = g0.a;
        }
        if (drawable != null && (x0Var = this.b) != null) {
            j.f(drawable, x0Var, this.a.getDrawableState());
        }
    }

    public void b(AttributeSet attributeSet, int i2) {
        int l2;
        Context context = this.a.getContext();
        int[] iArr = b.f1857f;
        z0 q = z0.q(context, attributeSet, iArr, i2, 0);
        ImageView imageView = this.a;
        o.n(imageView, imageView.getContext(), iArr, attributeSet, q.b, i2, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (!(drawable != null || (l2 = q.l(1, -1)) == -1 || (drawable = a.a(this.a.getContext(), l2)) == null)) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                int[] iArr2 = g0.a;
            }
            if (q.o(2)) {
                this.a.setImageTintList(q.c(2));
            }
            if (q.o(3)) {
                this.a.setImageTintMode(g0.b(q.j(3, -1), null));
            }
            q.b.recycle();
        } catch (Throwable th) {
            q.b.recycle();
            throw th;
        }
    }

    public void c(int i2) {
        if (i2 != 0) {
            Drawable a2 = a.a(this.a.getContext(), i2);
            if (a2 != null) {
                int[] iArr = g0.a;
            }
            this.a.setImageDrawable(a2);
        } else {
            this.a.setImageDrawable(null);
        }
        a();
    }

    public void d(ColorStateList colorStateList) {
        if (this.b == null) {
            this.b = new x0();
        }
        x0 x0Var = this.b;
        x0Var.a = colorStateList;
        x0Var.f2184d = true;
        a();
    }

    public void e(PorterDuff.Mode mode) {
        if (this.b == null) {
            this.b = new x0();
        }
        x0 x0Var = this.b;
        x0Var.b = mode;
        x0Var.f2183c = true;
        a();
    }
}
