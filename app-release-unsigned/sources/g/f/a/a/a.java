package g.f.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import g.f.c.i.d;
import g.f.c.i.f;
import g.f.c.i.k;
import g.f.d.i;
import g.f.d.j;

public class a extends j {
    public f n;

    public a(Context context) {
        super(context);
    }

    @Override // g.f.d.j, g.f.d.b
    public void f(AttributeSet attributeSet) {
        super.f(attributeSet);
        this.n = new f();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.n.Q0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    f fVar = this.n;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fVar.n0 = dimensionPixelSize;
                    fVar.o0 = dimensionPixelSize;
                    fVar.p0 = dimensionPixelSize;
                    fVar.q0 = dimensionPixelSize;
                } else if (index == 11) {
                    f fVar2 = this.n;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fVar2.p0 = dimensionPixelSize2;
                    fVar2.r0 = dimensionPixelSize2;
                    fVar2.s0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.n.q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.n.r0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.n.n0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.n.s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.n.o0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 38) {
                    this.n.O0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 28) {
                    this.n.y0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 37) {
                    this.n.z0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 22) {
                    this.n.A0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 30) {
                    this.n.C0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 24) {
                    this.n.B0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 32) {
                    this.n.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 26) {
                    this.n.E0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 21) {
                    this.n.G0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 29) {
                    this.n.I0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 23) {
                    this.n.H0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 31) {
                    this.n.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 35) {
                    this.n.F0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 25) {
                    this.n.M0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 34) {
                    this.n.N0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 27) {
                    this.n.K0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 36) {
                    this.n.L0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 33) {
                    this.n.P0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2400h = this.n;
        k();
    }

    @Override // g.f.d.b
    public void g(d dVar, boolean z) {
        f fVar = this.n;
        int i2 = fVar.p0;
        if (i2 <= 0 && fVar.q0 <= 0) {
            return;
        }
        if (z) {
            fVar.r0 = fVar.q0;
            fVar.s0 = i2;
            return;
        }
        fVar.r0 = i2;
        fVar.s0 = fVar.q0;
    }

    @Override // g.f.d.j
    public void l(k kVar, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (kVar != null) {
            kVar.T(mode, size, mode2, size2);
            setMeasuredDimension(kVar.u0, kVar.v0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // g.f.d.b
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i2, int i3) {
        l(this.n, i2, i3);
    }

    public void setFirstHorizontalBias(float f2) {
        this.n.G0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i2) {
        this.n.A0 = i2;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.n.H0 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i2) {
        this.n.B0 = i2;
        requestLayout();
    }

    public void setHorizontalAlign(int i2) {
        this.n.M0 = i2;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.n.E0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i2) {
        this.n.K0 = i2;
        requestLayout();
    }

    public void setHorizontalStyle(int i2) {
        this.n.y0 = i2;
        requestLayout();
    }

    public void setMaxElementsWrap(int i2) {
        this.n.P0 = i2;
        requestLayout();
    }

    public void setOrientation(int i2) {
        this.n.Q0 = i2;
        requestLayout();
    }

    public void setPadding(int i2) {
        f fVar = this.n;
        fVar.n0 = i2;
        fVar.o0 = i2;
        fVar.p0 = i2;
        fVar.q0 = i2;
        requestLayout();
    }

    public void setPaddingBottom(int i2) {
        this.n.o0 = i2;
        requestLayout();
    }

    public void setPaddingLeft(int i2) {
        this.n.r0 = i2;
        requestLayout();
    }

    public void setPaddingRight(int i2) {
        this.n.s0 = i2;
        requestLayout();
    }

    public void setPaddingTop(int i2) {
        this.n.n0 = i2;
        requestLayout();
    }

    public void setVerticalAlign(int i2) {
        this.n.N0 = i2;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.n.F0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i2) {
        this.n.L0 = i2;
        requestLayout();
    }

    public void setVerticalStyle(int i2) {
        this.n.z0 = i2;
        requestLayout();
    }

    public void setWrapMode(int i2) {
        this.n.O0 = i2;
        requestLayout();
    }
}
