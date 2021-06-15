package c.e.a.a.t;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import g.h.c.b.e;
import g.h.c.b.f;

public class b {
    public final ColorStateList a;
    public final ColorStateList b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1319c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1320d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final float f1321f;

    /* renamed from: g  reason: collision with root package name */
    public final float f1322g;

    /* renamed from: h  reason: collision with root package name */
    public final float f1323h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1324i;

    /* renamed from: j  reason: collision with root package name */
    public final float f1325j;

    /* renamed from: k  reason: collision with root package name */
    public float f1326k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1327l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1328m = false;
    public Typeface n;

    public class a extends e {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }

        @Override // g.h.c.b.e
        public void d(int i2) {
            b.this.f1328m = true;
            this.a.a(i2);
        }

        @Override // g.h.c.b.e
        public void e(Typeface typeface) {
            b bVar = b.this;
            bVar.n = Typeface.create(typeface, bVar.f1320d);
            b bVar2 = b.this;
            bVar2.f1328m = true;
            this.a.b(bVar2.n, false);
        }
    }

    public b(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, c.e.a.a.b.z);
        this.f1326k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.a = c.e.a.a.a.g(context, obtainStyledAttributes, 3);
        c.e.a.a.a.g(context, obtainStyledAttributes, 4);
        c.e.a.a.a.g(context, obtainStyledAttributes, 5);
        this.f1320d = obtainStyledAttributes.getInt(2, 0);
        this.e = obtainStyledAttributes.getInt(1, 1);
        int i3 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f1327l = obtainStyledAttributes.getResourceId(i3, 0);
        this.f1319c = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(14, false);
        this.b = c.e.a.a.a.g(context, obtainStyledAttributes, 6);
        this.f1321f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f1322g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f1323h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, c.e.a.a.b.s);
        this.f1324i = obtainStyledAttributes2.hasValue(0);
        this.f1325j = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        if (this.n == null && (str = this.f1319c) != null) {
            this.n = Typeface.create(str, this.f1320d);
        }
        if (this.n == null) {
            int i2 = this.e;
            this.n = i2 != 1 ? i2 != 2 ? i2 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.n = Typeface.create(this.n, this.f1320d);
        }
    }

    public void b(Context context, d dVar) {
        a();
        int i2 = this.f1327l;
        if (i2 == 0) {
            this.f1328m = true;
        }
        if (this.f1328m) {
            dVar.b(this.n, true);
            return;
        }
        try {
            a aVar = new a(dVar);
            if (context.isRestricted()) {
                aVar.a(-4, null);
            } else {
                f.a(context, i2, new TypedValue(), 0, aVar, null, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f1328m = true;
            dVar.a(1);
        } catch (Exception e2) {
            StringBuilder f2 = c.c.a.a.a.f("Error loading font ");
            f2.append(this.f1319c);
            Log.d("TextAppearance", f2.toString(), e2);
            this.f1328m = true;
            dVar.a(-3);
        }
    }

    public void c(Context context, TextPaint textPaint, d dVar) {
        a();
        d(textPaint, this.n);
        b(context, new c(this, textPaint, dVar));
        ColorStateList colorStateList = this.a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.f1323h;
        float f3 = this.f1321f;
        float f4 = this.f1322g;
        ColorStateList colorStateList2 = this.b;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void d(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.f1320d;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1326k);
        if (this.f1324i) {
            textPaint.setLetterSpacing(this.f1325j);
        }
    }
}
