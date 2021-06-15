package g.b.c;

import android.view.View;
import g.h.j.o;
import g.h.j.u;
import g.h.j.w;

public class m implements Runnable {
    public final /* synthetic */ j e;

    public class a extends w {
        public a() {
        }

        @Override // g.h.j.v
        public void a(View view) {
            m.this.e.w.setAlpha(1.0f);
            m.this.e.z.d(null);
            m.this.e.z = null;
        }

        @Override // g.h.j.v, g.h.j.w
        public void b(View view) {
            m.this.e.w.setVisibility(0);
        }
    }

    public m(j jVar) {
        this.e = jVar;
    }

    public void run() {
        j jVar = this.e;
        jVar.x.showAtLocation(jVar.w, 55, 0, 0);
        this.e.I();
        if (this.e.V()) {
            this.e.w.setAlpha(0.0f);
            j jVar2 = this.e;
            u b = o.b(jVar2.w);
            b.a(1.0f);
            jVar2.z = b;
            u uVar = this.e.z;
            a aVar = new a();
            View view = uVar.a.get();
            if (view != null) {
                uVar.e(view, aVar);
                return;
            }
            return;
        }
        this.e.w.setAlpha(1.0f);
        this.e.w.setVisibility(0);
    }
}
