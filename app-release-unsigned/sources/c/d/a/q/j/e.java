package c.d.a.q.j;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import c.d.a.q.k.b;

public abstract class e<Z> extends i<ImageView, Z> {

    /* renamed from: g  reason: collision with root package name */
    public Animatable f1154g;

    public e(ImageView imageView) {
        super(imageView);
    }

    @Override // c.d.a.q.j.h
    public void b(Drawable drawable) {
        m(null);
        ((ImageView) this.e).setImageDrawable(drawable);
    }

    @Override // c.d.a.q.j.h
    public void c(Z z, b<? super Z> bVar) {
        m(z);
    }

    @Override // c.d.a.q.j.h
    public void d(Drawable drawable) {
        m(null);
        ((ImageView) this.e).setImageDrawable(drawable);
    }

    @Override // c.d.a.n.m
    public void e() {
        Animatable animatable = this.f1154g;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // c.d.a.q.j.h
    public void g(Drawable drawable) {
        this.f1155f.a();
        Animatable animatable = this.f1154g;
        if (animatable != null) {
            animatable.stop();
        }
        m(null);
        ((ImageView) this.e).setImageDrawable(drawable);
    }

    @Override // c.d.a.n.m
    public void i() {
        Animatable animatable = this.f1154g;
        if (animatable != null) {
            animatable.start();
        }
    }

    public abstract void l(Z z);

    public final void m(Z z) {
        l(z);
        if (z instanceof Animatable) {
            Z z2 = z;
            this.f1154g = z2;
            z2.start();
            return;
        }
        this.f1154g = null;
    }
}
