package c.d.a.m.x.g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import c.d.a.b;
import c.d.a.m.t;
import c.d.a.m.x.g.g;

public class c extends Drawable implements g.b, Animatable {
    public final a e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1082f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1083g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1084h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1085i = true;

    /* renamed from: j  reason: collision with root package name */
    public int f1086j;

    /* renamed from: k  reason: collision with root package name */
    public int f1087k = -1;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1088l;

    /* renamed from: m  reason: collision with root package name */
    public Paint f1089m;
    public Rect n;

    public static final class a extends Drawable.ConstantState {
        public final g a;

        public a(g gVar) {
            this.a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new c(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c(Context context, c.d.a.l.a aVar, t<Bitmap> tVar, int i2, int i3, Bitmap bitmap) {
        a aVar2 = new a(new g(b.b(context), aVar, i2, i3, tVar, bitmap));
        this.e = aVar2;
    }

    @Override // c.d.a.m.x.g.g.b
    public void a() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        g gVar = this.e.a;
        g.a aVar = gVar.f1095i;
        if ((aVar != null ? aVar.f1101i : -1) == gVar.a.e() - 1) {
            this.f1086j++;
        }
        int i2 = this.f1087k;
        if (i2 != -1 && this.f1086j >= i2) {
            stop();
        }
    }

    public Bitmap b() {
        return this.e.a.f1098l;
    }

    public final Paint c() {
        if (this.f1089m == null) {
            this.f1089m = new Paint(2);
        }
        return this.f1089m;
    }

    public final void d() {
        g.q.a.c(!this.f1084h, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.e.a.a.e() != 1) {
            if (!this.f1082f) {
                this.f1082f = true;
                g gVar = this.e.a;
                if (gVar.f1096j) {
                    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
                } else if (!gVar.f1090c.contains(this)) {
                    boolean isEmpty = gVar.f1090c.isEmpty();
                    gVar.f1090c.add(this);
                    if (isEmpty && !gVar.f1092f) {
                        gVar.f1092f = true;
                        gVar.f1096j = false;
                        gVar.a();
                    }
                } else {
                    throw new IllegalStateException("Cannot subscribe twice in a row");
                }
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f1084h) {
            if (this.f1088l) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.n == null) {
                    this.n = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.n);
                this.f1088l = false;
            }
            g gVar = this.e.a;
            g.a aVar = gVar.f1095i;
            if (aVar != null) {
                bitmap = aVar.f1103k;
            } else {
                bitmap = gVar.f1098l;
            }
            if (this.n == null) {
                this.n = new Rect();
            }
            canvas.drawBitmap(bitmap, (Rect) null, this.n, c());
        }
    }

    public final void e() {
        this.f1082f = false;
        g gVar = this.e.a;
        gVar.f1090c.remove(this);
        if (gVar.f1090c.isEmpty()) {
            gVar.f1092f = false;
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.e;
    }

    public int getIntrinsicHeight() {
        return this.e.a.q;
    }

    public int getIntrinsicWidth() {
        return this.e.a.p;
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f1082f;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1088l = true;
    }

    public void setAlpha(int i2) {
        c().setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        g.q.a.c(!this.f1084h, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f1085i = z;
        if (!z) {
            e();
        } else if (this.f1083g) {
            d();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f1083g = true;
        this.f1086j = 0;
        if (this.f1085i) {
            d();
        }
    }

    public void stop() {
        this.f1083g = false;
        e();
    }

    public c(a aVar) {
        this.e = aVar;
    }
}
