package c.f.a.g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import com.tsuga.news.R;
import i.c;
import i.s.c.h;
import i.s.c.i;
import i.s.c.l;
import i.s.c.p;
import i.s.c.q;
import i.v.e;
import java.util.Objects;

public final class a extends Drawable {
    public static final /* synthetic */ e[] a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public Rect f1559c;

    /* renamed from: d  reason: collision with root package name */
    public final c f1560d = h.a.t.a.F(C0052a.f1562f);
    public final c e = h.a.t.a.F(new b(this));

    /* renamed from: f  reason: collision with root package name */
    public final Context f1561f;

    /* renamed from: c.f.a.g.a$a  reason: collision with other inner class name */
    public static final class C0052a extends i implements i.s.b.a<GradientDrawable> {

        /* renamed from: f  reason: collision with root package name */
        public static final C0052a f1562f = new C0052a();

        public C0052a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // i.s.b.a
        public GradientDrawable c() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            return gradientDrawable;
        }
    }

    public static final class b extends i implements i.s.b.a<TextPaint> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ a f1563f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f1563f = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // i.s.b.a
        public TextPaint c() {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setColor(-1);
            textPaint.setTextSize(this.f1563f.f1561f.getResources().getDimension(R.dimen.cnb_badge_text_size));
            textPaint.setFakeBoldText(true);
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            return textPaint;
        }
    }

    static {
        l lVar = new l(p.a(a.class), "shapeDrawable", "getShapeDrawable()Landroid/graphics/drawable/GradientDrawable;");
        q qVar = p.a;
        Objects.requireNonNull(qVar);
        l lVar2 = new l(p.a(a.class), "textPaint", "getTextPaint()Landroid/text/TextPaint;");
        Objects.requireNonNull(qVar);
        a = new e[]{lVar, lVar2};
    }

    public a(Context context) {
        h.f(context, "context");
        this.f1561f = context;
    }

    public final GradientDrawable a() {
        c cVar = this.f1560d;
        e eVar = a[0];
        return (GradientDrawable) cVar.getValue();
    }

    public final void b(Rect rect) {
        int i2;
        Resources resources;
        h.f(rect, "parentBounds");
        this.f1559c = rect;
        if (this.b > 0) {
            resources = this.f1561f.getResources();
            i2 = R.dimen.cnb_badge_size;
        } else {
            resources = this.f1561f.getResources();
            i2 = R.dimen.cnb_badge_size_numberless;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        double d2 = this.b > 99 ? 1.5d : 1.0d;
        a().setCornerRadius(((float) rect.height()) * 0.5f);
        GradientDrawable a2 = a();
        int i3 = rect.right;
        double d3 = ((double) dimensionPixelSize) * d2;
        if (!Double.isNaN(d3)) {
            int i4 = Integer.MAX_VALUE;
            if (d3 <= ((double) Integer.MAX_VALUE)) {
                i4 = d3 < ((double) Integer.MIN_VALUE) ? Integer.MIN_VALUE : (int) Math.round(d3);
            }
            a2.setBounds(i3 - i4, 0, rect.right, rect.top + dimensionPixelSize);
            return;
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public void draw(Canvas canvas) {
        h.f(canvas, "canvas");
        Rect bounds = a().getBounds();
        h.b(bounds, "shapeDrawable.bounds");
        if (!bounds.isEmpty()) {
            a().draw(canvas);
            if (this.b > 0) {
                Rect rect = new Rect();
                int i2 = this.b;
                String valueOf = i2 > 99 ? "99+" : String.valueOf(i2);
                c cVar = this.e;
                e[] eVarArr = a;
                e eVar = eVarArr[1];
                ((TextPaint) cVar.getValue()).getTextBounds(valueOf, 0, valueOf.length(), rect);
                float exactCenterX = a().getBounds().exactCenterX() - rect.exactCenterX();
                float exactCenterY = a().getBounds().exactCenterY() + ((float) (rect.height() / 2));
                c cVar2 = this.e;
                e eVar2 = eVarArr[1];
                canvas.drawText(valueOf, exactCenterX, exactCenterY, (TextPaint) cVar2.getValue());
            }
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
        a().setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
