package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import g.f.c.i.a;
import g.f.d.b;
import g.f.d.i;

public class Barrier extends b {

    /* renamed from: l  reason: collision with root package name */
    public int f122l;

    /* renamed from: m  reason: collision with root package name */
    public int f123m;
    public a n;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // g.f.d.b
    public void f(AttributeSet attributeSet) {
        super.f(attributeSet);
        this.n = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 15) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 14) {
                    this.n.o0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.n.p0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2400h = this.n;
        k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 == 6) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // g.f.d.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(g.f.c.i.d r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.f122l
            r3.f123m = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto L_0x000e
            if (r0 != r2) goto L_0x000b
            goto L_0x0016
        L_0x000b:
            if (r0 != r1) goto L_0x0018
            goto L_0x0010
        L_0x000e:
            if (r0 != r2) goto L_0x0014
        L_0x0010:
            r5 = 0
        L_0x0011:
            r3.f123m = r5
            goto L_0x0018
        L_0x0014:
            if (r0 != r1) goto L_0x0018
        L_0x0016:
            r5 = 1
            goto L_0x0011
        L_0x0018:
            boolean r5 = r4 instanceof g.f.c.i.a
            if (r5 == 0) goto L_0x0022
            g.f.c.i.a r4 = (g.f.c.i.a) r4
            int r5 = r3.f123m
            r4.n0 = r5
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.g(g.f.c.i.d, boolean):void");
    }

    public int getMargin() {
        return this.n.p0;
    }

    public int getType() {
        return this.f122l;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.n.o0 = z;
    }

    public void setDpMargin(int i2) {
        this.n.p0 = (int) ((((float) i2) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.n.p0 = i2;
    }

    public void setType(int i2) {
        this.f122l = i2;
    }
}
