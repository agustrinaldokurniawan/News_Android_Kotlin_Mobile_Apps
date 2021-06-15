package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import g.b.c.j;
import g.b.c.l;
import g.b.f.i.g;
import g.b.g.e0;
import java.util.Objects;

public class ContentFrameLayout extends FrameLayout {
    public TypedValue e;

    /* renamed from: f  reason: collision with root package name */
    public TypedValue f90f;

    /* renamed from: g  reason: collision with root package name */
    public TypedValue f91g;

    /* renamed from: h  reason: collision with root package name */
    public TypedValue f92h;

    /* renamed from: i  reason: collision with root package name */
    public TypedValue f93i;

    /* renamed from: j  reason: collision with root package name */
    public TypedValue f94j;

    /* renamed from: k  reason: collision with root package name */
    public final Rect f95k = new Rect();

    /* renamed from: l  reason: collision with root package name */
    public a f96l;

    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f93i == null) {
            this.f93i = new TypedValue();
        }
        return this.f93i;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f94j == null) {
            this.f94j = new TypedValue();
        }
        return this.f94j;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f91g == null) {
            this.f91g = new TypedValue();
        }
        return this.f91g;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f92h == null) {
            this.f92h = new TypedValue();
        }
        return this.f92h;
    }

    public TypedValue getMinWidthMajor() {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        return this.e;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f90f == null) {
            this.f90f = new TypedValue();
        }
        return this.f90f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f96l;
        if (aVar != null) {
            Objects.requireNonNull((l) aVar);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f96l;
        if (aVar != null) {
            j jVar = ((l) aVar).a;
            e0 e0Var = jVar.s;
            if (e0Var != null) {
                e0Var.l();
            }
            if (jVar.x != null) {
                jVar.f1874m.getDecorView().removeCallbacks(jVar.y);
                if (jVar.x.isShowing()) {
                    try {
                        jVar.x.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                jVar.x = null;
            }
            jVar.I();
            g gVar = jVar.N(0).f1885h;
            if (gVar != null) {
                gVar.c(true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f96l = aVar;
    }
}
