package g.h.g;

import android.graphics.Typeface;
import g.h.c.b.e;
import g.h.d.c;

public class a implements Runnable {
    public final /* synthetic */ m e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Typeface f2490f;

    public a(c cVar, m mVar, Typeface typeface) {
        this.e = mVar;
        this.f2490f = typeface;
    }

    public void run() {
        m mVar = this.e;
        Typeface typeface = this.f2490f;
        e eVar = ((c.a) mVar).a;
        if (eVar != null) {
            eVar.e(typeface);
        }
    }
}
