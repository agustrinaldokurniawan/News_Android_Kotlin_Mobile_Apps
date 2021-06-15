package g.q.c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g.q.c.a;

public class w implements a.AbstractC0092a {
    public final /* synthetic */ RecyclerView a;

    public w(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(a.b bVar) {
        int i2 = bVar.a;
        if (i2 == 1) {
            RecyclerView recyclerView = this.a;
            recyclerView.s.o0(recyclerView, bVar.b, bVar.f2888d);
        } else if (i2 == 2) {
            RecyclerView recyclerView2 = this.a;
            recyclerView2.s.r0(recyclerView2, bVar.b, bVar.f2888d);
        } else if (i2 == 4) {
            RecyclerView recyclerView3 = this.a;
            recyclerView3.s.t0(recyclerView3, bVar.b, bVar.f2888d, bVar.f2887c);
        } else if (i2 == 8) {
            RecyclerView recyclerView4 = this.a;
            recyclerView4.s.q0(recyclerView4, bVar.b, bVar.f2888d, 1);
        }
    }

    public RecyclerView.z b(int i2) {
        RecyclerView recyclerView = this.a;
        int h2 = recyclerView.f238l.h();
        int i3 = 0;
        RecyclerView.z zVar = null;
        while (true) {
            if (i3 >= h2) {
                break;
            }
            RecyclerView.z K = RecyclerView.K(recyclerView.f238l.g(i3));
            if (K != null && !K.m() && K.f292d == i2) {
                if (!recyclerView.f238l.k(K.b)) {
                    zVar = K;
                    break;
                }
                zVar = K;
            }
            i3++;
        }
        if (zVar != null && !this.a.f238l.k(zVar.b)) {
            return zVar;
        }
        return null;
    }

    public void c(int i2, int i3, Object obj) {
        int i4;
        int i5;
        RecyclerView recyclerView = this.a;
        int h2 = recyclerView.f238l.h();
        int i6 = i3 + i2;
        for (int i7 = 0; i7 < h2; i7++) {
            View g2 = recyclerView.f238l.g(i7);
            RecyclerView.z K = RecyclerView.K(g2);
            if (K != null && !K.u() && (i5 = K.f292d) >= i2 && i5 < i6) {
                K.b(2);
                K.a(obj);
                ((RecyclerView.m) g2.getLayoutParams()).f256c = true;
            }
        }
        RecyclerView.r rVar = recyclerView.f235i;
        int size = rVar.f260c.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.z zVar = rVar.f260c.get(size);
                if (zVar != null && (i4 = zVar.f292d) >= i2 && i4 < i6) {
                    zVar.b(2);
                    rVar.f(size);
                }
            } else {
                this.a.q0 = true;
                return;
            }
        }
    }

    public void d(int i2, int i3) {
        RecyclerView recyclerView = this.a;
        int h2 = recyclerView.f238l.h();
        for (int i4 = 0; i4 < h2; i4++) {
            RecyclerView.z K = RecyclerView.K(recyclerView.f238l.g(i4));
            if (K != null && !K.u() && K.f292d >= i2) {
                K.q(i3, false);
                recyclerView.m0.f277f = true;
            }
        }
        RecyclerView.r rVar = recyclerView.f235i;
        int size = rVar.f260c.size();
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.z zVar = rVar.f260c.get(i5);
            if (zVar != null && zVar.f292d >= i2) {
                zVar.q(i3, false);
            }
        }
        recyclerView.requestLayout();
        this.a.p0 = true;
    }

    public void e(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.a;
        int h2 = recyclerView.f238l.h();
        int i11 = -1;
        if (i2 < i3) {
            i6 = i2;
            i5 = i3;
            i4 = -1;
        } else {
            i5 = i2;
            i6 = i3;
            i4 = 1;
        }
        for (int i12 = 0; i12 < h2; i12++) {
            RecyclerView.z K = RecyclerView.K(recyclerView.f238l.g(i12));
            if (K != null && (i10 = K.f292d) >= i6 && i10 <= i5) {
                if (i10 == i2) {
                    K.q(i3 - i2, false);
                } else {
                    K.q(i4, false);
                }
                recyclerView.m0.f277f = true;
            }
        }
        RecyclerView.r rVar = recyclerView.f235i;
        if (i2 < i3) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i8 = i3;
            i11 = 1;
        }
        int size = rVar.f260c.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.z zVar = rVar.f260c.get(i13);
            if (zVar != null && (i9 = zVar.f292d) >= i8 && i9 <= i7) {
                if (i9 == i2) {
                    zVar.q(i3 - i2, false);
                } else {
                    zVar.q(i11, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.a.p0 = true;
    }
}
