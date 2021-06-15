package c.e.a.a.t;

import android.graphics.Typeface;
import c.e.a.a.r.b;
import c.e.a.a.r.c;

public final class a extends d {
    public final Typeface a;
    public final AbstractC0041a b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1318c;

    /* renamed from: c.e.a.a.t.a$a  reason: collision with other inner class name */
    public interface AbstractC0041a {
    }

    public a(AbstractC0041a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    @Override // c.e.a.a.t.d
    public void a(int i2) {
        c(this.a);
    }

    @Override // c.e.a.a.t.d
    public void b(Typeface typeface, boolean z) {
        c(typeface);
    }

    public final void c(Typeface typeface) {
        if (!this.f1318c) {
            c cVar = ((b) this.b).a;
            a aVar = cVar.v;
            boolean z = true;
            if (aVar != null) {
                aVar.f1318c = true;
            }
            if (cVar.s != typeface) {
                cVar.s = typeface;
            } else {
                z = false;
            }
            if (z) {
                cVar.k();
            }
        }
    }
}
