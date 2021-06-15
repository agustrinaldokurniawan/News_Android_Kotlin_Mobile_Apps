package c.e.a.a.w;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import c.e.a.a.w.k;
import c.e.a.a.w.m;
import java.util.BitSet;
import java.util.Objects;

public class g extends Drawable implements n {
    public static final String e = g.class.getSimpleName();

    /* renamed from: f  reason: collision with root package name */
    public static final Paint f1339f = new Paint(1);
    public final RectF A;
    public boolean B;

    /* renamed from: g  reason: collision with root package name */
    public b f1340g;

    /* renamed from: h  reason: collision with root package name */
    public final m.f[] f1341h;

    /* renamed from: i  reason: collision with root package name */
    public final m.f[] f1342i;

    /* renamed from: j  reason: collision with root package name */
    public final BitSet f1343j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1344k;

    /* renamed from: l  reason: collision with root package name */
    public final Matrix f1345l;

    /* renamed from: m  reason: collision with root package name */
    public final Path f1346m;
    public final Path n;
    public final RectF o;
    public final RectF p;
    public final Region q;
    public final Region r;
    public j s;
    public final Paint t;
    public final Paint u;
    public final c.e.a.a.v.a v;
    public final k.b w;
    public final k x;
    public PorterDuffColorFilter y;
    public PorterDuffColorFilter z;

    public class a implements k.b {
        public a() {
        }
    }

    public static final class b extends Drawable.ConstantState {
        public j a;
        public c.e.a.a.o.a b;

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f1347c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f1348d = null;
        public ColorStateList e = null;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f1349f = null;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f1350g = null;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f1351h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i  reason: collision with root package name */
        public Rect f1352i = null;

        /* renamed from: j  reason: collision with root package name */
        public float f1353j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f1354k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f1355l;

        /* renamed from: m  reason: collision with root package name */
        public int f1356m = 255;
        public float n = 0.0f;
        public float o = 0.0f;
        public float p = 0.0f;
        public int q = 0;
        public int r = 0;
        public int s = 0;
        public int t = 0;
        public boolean u = false;
        public Paint.Style v = Paint.Style.FILL_AND_STROKE;

        public b(b bVar) {
            this.a = bVar.a;
            this.b = bVar.b;
            this.f1355l = bVar.f1355l;
            this.f1347c = bVar.f1347c;
            this.f1348d = bVar.f1348d;
            this.e = bVar.e;
            this.f1351h = bVar.f1351h;
            this.f1350g = bVar.f1350g;
            this.f1356m = bVar.f1356m;
            this.f1353j = bVar.f1353j;
            this.s = bVar.s;
            this.q = bVar.q;
            this.u = bVar.u;
            this.f1354k = bVar.f1354k;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.r = bVar.r;
            this.t = bVar.t;
            this.f1349f = bVar.f1349f;
            this.v = bVar.v;
            if (bVar.f1352i != null) {
                this.f1352i = new Rect(bVar.f1352i);
            }
        }

        public b(j jVar, c.e.a.a.o.a aVar) {
            this.a = jVar;
            this.b = null;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f1344k = true;
            return gVar;
        }
    }

    public g() {
        this(new j());
    }

    public g(b bVar) {
        k kVar;
        this.f1341h = new m.f[4];
        this.f1342i = new m.f[4];
        this.f1343j = new BitSet(8);
        this.f1345l = new Matrix();
        this.f1346m = new Path();
        this.n = new Path();
        this.o = new RectF();
        this.p = new RectF();
        this.q = new Region();
        this.r = new Region();
        Paint paint = new Paint(1);
        this.t = paint;
        Paint paint2 = new Paint(1);
        this.u = paint2;
        this.v = new c.e.a.a.v.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            kVar = k.a.a;
        } else {
            kVar = new k();
        }
        this.x = kVar;
        this.A = new RectF();
        this.B = true;
        this.f1340g = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f1339f;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        v();
        u(getState());
        this.w = new a();
    }

    public g(j jVar) {
        this(new b(jVar, null));
    }

    public final void b(RectF rectF, Path path) {
        c(rectF, path);
        if (this.f1340g.f1353j != 1.0f) {
            this.f1345l.reset();
            Matrix matrix = this.f1345l;
            float f2 = this.f1340g.f1353j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f1345l);
        }
        path.computeBounds(this.A, true);
    }

    public final void c(RectF rectF, Path path) {
        k kVar = this.x;
        b bVar = this.f1340g;
        kVar.a(bVar.a, bVar.f1354k, rectF, this.w, path);
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z2) {
        int color;
        int e2;
        if (colorStateList == null || mode == null) {
            return (!z2 || (e2 = e((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(e2, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z2) {
            colorForState = e(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ef, code lost:
        if ((!r2.a.d(h()) && !r12.f1346m.isConvex() && android.os.Build.VERSION.SDK_INT < 29) != false) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r13) {
        /*
        // Method dump skipped, instructions count: 479
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.a.w.g.draw(android.graphics.Canvas):void");
    }

    public int e(int i2) {
        b bVar = this.f1340g;
        float f2 = bVar.o + bVar.p + bVar.n;
        c.e.a.a.o.a aVar = bVar.b;
        if (aVar == null || !aVar.a) {
            return i2;
        }
        if (!(g.h.d.a.c(i2, 255) == aVar.f1274c)) {
            return i2;
        }
        float f3 = aVar.f1275d;
        float f4 = 0.0f;
        if (f3 > 0.0f && f2 > 0.0f) {
            f4 = Math.min(((((float) Math.log1p((double) (f2 / f3))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return g.h.d.a.c(c.e.a.a.a.m(g.h.d.a.c(i2, 255), aVar.b, f4), Color.alpha(i2));
    }

    public final void f(Canvas canvas) {
        if (this.f1343j.cardinality() > 0) {
            Log.w(e, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f1340g.s != 0) {
            canvas.drawPath(this.f1346m, this.v.e);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m.f fVar = this.f1341h[i2];
            c.e.a.a.v.a aVar = this.v;
            int i3 = this.f1340g.r;
            Matrix matrix = m.f.a;
            fVar.a(matrix, aVar, i3, canvas);
            this.f1342i[i2].a(matrix, this.v, this.f1340g.r, canvas);
        }
        if (this.B) {
            int i4 = i();
            int j2 = j();
            canvas.translate((float) (-i4), (float) (-j2));
            canvas.drawPath(this.f1346m, f1339f);
            canvas.translate((float) i4, (float) j2);
        }
    }

    public final void g(Canvas canvas, Paint paint, Path path, j jVar, RectF rectF) {
        if (jVar.d(rectF)) {
            float a2 = jVar.f1359f.a(rectF) * this.f1340g.f1354k;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public Drawable.ConstantState getConstantState() {
        return this.f1340g;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        b bVar = this.f1340g;
        if (bVar.q != 2) {
            if (bVar.a.d(h())) {
                outline.setRoundRect(getBounds(), l() * this.f1340g.f1354k);
                return;
            }
            b(h(), this.f1346m);
            if (this.f1346m.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f1346m);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f1340g.f1352i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.q.set(getBounds());
        b(h(), this.f1346m);
        this.r.setPath(this.f1346m, this.q);
        this.q.op(this.r, Region.Op.DIFFERENCE);
        return this.q;
    }

    public RectF h() {
        this.o.set(getBounds());
        return this.o;
    }

    public int i() {
        b bVar = this.f1340g;
        return (int) (Math.sin(Math.toRadians((double) bVar.t)) * ((double) bVar.s));
    }

    public void invalidateSelf() {
        this.f1344k = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f1340g.f1350g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f1340g.f1349f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f1340g.e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f1340g.f1348d) != null && colorStateList4.isStateful())));
    }

    public int j() {
        b bVar = this.f1340g;
        return (int) (Math.cos(Math.toRadians((double) bVar.t)) * ((double) bVar.s));
    }

    public final float k() {
        if (m()) {
            return this.u.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float l() {
        return this.f1340g.a.e.a(h());
    }

    public final boolean m() {
        Paint.Style style = this.f1340g.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.u.getStrokeWidth() > 0.0f;
    }

    public Drawable mutate() {
        this.f1340g = new b(this.f1340g);
        return this;
    }

    public void n(Context context) {
        this.f1340g.b = new c.e.a.a.o.a(context);
        w();
    }

    public void o(float f2) {
        b bVar = this.f1340g;
        if (bVar.o != f2) {
            bVar.o = f2;
            w();
        }
    }

    public void onBoundsChange(Rect rect) {
        this.f1344k = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z2 = u(iArr) || v();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public void p(ColorStateList colorStateList) {
        b bVar = this.f1340g;
        if (bVar.f1348d != colorStateList) {
            bVar.f1348d = colorStateList;
            onStateChange(getState());
        }
    }

    public void q(float f2) {
        b bVar = this.f1340g;
        if (bVar.f1354k != f2) {
            bVar.f1354k = f2;
            this.f1344k = true;
            invalidateSelf();
        }
    }

    public void r(float f2, int i2) {
        this.f1340g.f1355l = f2;
        invalidateSelf();
        t(ColorStateList.valueOf(i2));
    }

    public void s(float f2, ColorStateList colorStateList) {
        this.f1340g.f1355l = f2;
        invalidateSelf();
        t(colorStateList);
    }

    public void setAlpha(int i2) {
        b bVar = this.f1340g;
        if (bVar.f1356m != i2) {
            bVar.f1356m = i2;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1340g.f1347c = colorFilter;
        super.invalidateSelf();
    }

    @Override // c.e.a.a.w.n
    public void setShapeAppearanceModel(j jVar) {
        this.f1340g.a = jVar;
        invalidateSelf();
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1340g.f1350g = colorStateList;
        v();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f1340g;
        if (bVar.f1351h != mode) {
            bVar.f1351h = mode;
            v();
            super.invalidateSelf();
        }
    }

    public void t(ColorStateList colorStateList) {
        b bVar = this.f1340g;
        if (bVar.e != colorStateList) {
            bVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean u(int[] iArr) {
        boolean z2;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f1340g.f1348d == null || color2 == (colorForState2 = this.f1340g.f1348d.getColorForState(iArr, (color2 = this.t.getColor())))) {
            z2 = false;
        } else {
            this.t.setColor(colorForState2);
            z2 = true;
        }
        if (this.f1340g.e == null || color == (colorForState = this.f1340g.e.getColorForState(iArr, (color = this.u.getColor())))) {
            return z2;
        }
        this.u.setColor(colorForState);
        return true;
    }

    public final boolean v() {
        PorterDuffColorFilter porterDuffColorFilter = this.y;
        PorterDuffColorFilter porterDuffColorFilter2 = this.z;
        b bVar = this.f1340g;
        this.y = d(bVar.f1350g, bVar.f1351h, this.t, true);
        b bVar2 = this.f1340g;
        this.z = d(bVar2.f1349f, bVar2.f1351h, this.u, false);
        b bVar3 = this.f1340g;
        if (bVar3.u) {
            this.v.a(bVar3.f1350g.getColorForState(getState(), 0));
        }
        return !Objects.equals(porterDuffColorFilter, this.y) || !Objects.equals(porterDuffColorFilter2, this.z);
    }

    public final void w() {
        b bVar = this.f1340g;
        float f2 = bVar.o + bVar.p;
        bVar.r = (int) Math.ceil((double) (0.75f * f2));
        this.f1340g.s = (int) Math.ceil((double) (f2 * 0.25f));
        v();
        super.invalidateSelf();
    }
}
