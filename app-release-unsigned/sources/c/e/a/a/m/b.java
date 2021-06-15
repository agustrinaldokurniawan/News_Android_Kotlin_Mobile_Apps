package c.e.a.a.m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import c.e.a.a.a;
import c.e.a.a.w.g;
import c.e.a.a.w.j;
import g.h.b.d;
import g.h.j.o;
import java.util.concurrent.atomic.AtomicInteger;

public final class b {
    public final Rect a;
    public final ColorStateList b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f1235c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f1236d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final j f1237f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, j jVar, Rect rect) {
        d.d(rect.left);
        d.d(rect.top);
        d.d(rect.right);
        d.d(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.f1235c = colorStateList;
        this.f1236d = colorStateList3;
        this.e = i2;
        this.f1237f = jVar;
    }

    public static b a(Context context, int i2) {
        if (i2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, c.e.a.a.b.o);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            ColorStateList g2 = a.g(context, obtainStyledAttributes, 4);
            ColorStateList g3 = a.g(context, obtainStyledAttributes, 9);
            ColorStateList g4 = a.g(context, obtainStyledAttributes, 7);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            j a2 = j.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new c.e.a.a.w.a((float) 0)).a();
            obtainStyledAttributes.recycle();
            return new b(g2, g3, g4, dimensionPixelSize, a2, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    public void b(TextView textView) {
        g gVar = new g();
        g gVar2 = new g();
        gVar.setShapeAppearanceModel(this.f1237f);
        gVar2.setShapeAppearanceModel(this.f1237f);
        gVar.p(this.f1235c);
        gVar.s((float) this.e, this.f1236d);
        textView.setTextColor(this.b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), gVar, gVar2);
        Rect rect = this.a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        AtomicInteger atomicInteger = o.a;
        textView.setBackground(insetDrawable);
    }
}
