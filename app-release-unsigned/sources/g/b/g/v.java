package g.b.g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import g.b.b;
import g.h.j.o;
import java.util.concurrent.atomic.AtomicInteger;

public class v extends q {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f2165d;
    public Drawable e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f2166f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f2167g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2168h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2169i = false;

    public v(SeekBar seekBar) {
        super(seekBar);
        this.f2165d = seekBar;
    }

    @Override // g.b.g.q
    public void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, i2);
        Context context = this.f2165d.getContext();
        int[] iArr = b.f1858g;
        z0 q = z0.q(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.f2165d;
        o.n(seekBar, seekBar.getContext(), iArr, attributeSet, q.b, i2, 0);
        Drawable h2 = q.h(0);
        if (h2 != null) {
            this.f2165d.setThumb(h2);
        }
        Drawable g2 = q.g(1);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = g2;
        if (g2 != null) {
            g2.setCallback(this.f2165d);
            SeekBar seekBar2 = this.f2165d;
            AtomicInteger atomicInteger = o.a;
            g2.setLayoutDirection(seekBar2.getLayoutDirection());
            if (g2.isStateful()) {
                g2.setState(this.f2165d.getDrawableState());
            }
            c();
        }
        this.f2165d.invalidate();
        if (q.o(3)) {
            this.f2167g = g0.b(q.j(3, -1), this.f2167g);
            this.f2169i = true;
        }
        if (q.o(2)) {
            this.f2166f = q.c(2);
            this.f2168h = true;
        }
        q.b.recycle();
        c();
    }

    public final void c() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return;
        }
        if (this.f2168h || this.f2169i) {
            Drawable mutate = drawable.mutate();
            this.e = mutate;
            if (this.f2168h) {
                mutate.setTintList(this.f2166f);
            }
            if (this.f2169i) {
                this.e.setTintMode(this.f2167g);
            }
            if (this.e.isStateful()) {
                this.e.setState(this.f2165d.getDrawableState());
            }
        }
    }

    public void d(Canvas canvas) {
        if (this.e != null) {
            int max = this.f2165d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.e.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((this.f2165d.getWidth() - this.f2165d.getPaddingLeft()) - this.f2165d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f2165d.getPaddingLeft(), (float) (this.f2165d.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
