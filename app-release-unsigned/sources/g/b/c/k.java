package g.b.c;

import android.os.Build;
import android.view.View;
import g.h.d.b;
import g.h.j.o;
import g.h.j.y;

public class k implements g.h.j.k {
    public final /* synthetic */ j a;

    public k(j jVar) {
        this.a = jVar;
    }

    @Override // g.h.j.k
    public y a(View view, y yVar) {
        int d2 = yVar.d();
        int X = this.a.X(yVar, null);
        if (d2 != X) {
            int b = yVar.b();
            int c2 = yVar.c();
            int a2 = yVar.a();
            int i2 = Build.VERSION.SDK_INT;
            y.d cVar = i2 >= 30 ? new y.c(yVar) : i2 >= 29 ? new y.b(yVar) : new y.a(yVar);
            cVar.d(b.a(b, X, c2, a2));
            yVar = cVar.b();
        }
        return o.j(view, yVar);
    }
}
