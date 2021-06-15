package g.b.f;

import android.view.View;
import android.view.animation.Interpolator;
import g.h.j.u;
import g.h.j.v;
import g.h.j.w;
import java.util.ArrayList;
import java.util.Iterator;

public class g {
    public final ArrayList<u> a = new ArrayList<>();
    public long b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f1942c;

    /* renamed from: d  reason: collision with root package name */
    public v f1943d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final w f1944f = new a();

    public class a extends w {
        public boolean a = false;
        public int b = 0;

        public a() {
        }

        @Override // g.h.j.v
        public void a(View view) {
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == g.this.a.size()) {
                v vVar = g.this.f1943d;
                if (vVar != null) {
                    vVar.a(null);
                }
                this.b = 0;
                this.a = false;
                g.this.e = false;
            }
        }

        @Override // g.h.j.v, g.h.j.w
        public void b(View view) {
            if (!this.a) {
                this.a = true;
                v vVar = g.this.f1943d;
                if (vVar != null) {
                    vVar.b(null);
                }
            }
        }
    }

    public void a() {
        if (this.e) {
            Iterator<u> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.e = false;
        }
    }

    public void b() {
        View view;
        if (!this.e) {
            Iterator<u> it = this.a.iterator();
            while (it.hasNext()) {
                u next = it.next();
                long j2 = this.b;
                if (j2 >= 0) {
                    next.c(j2);
                }
                Interpolator interpolator = this.f1942c;
                if (!(interpolator == null || (view = next.a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f1943d != null) {
                    next.d(this.f1944f);
                }
                View view2 = next.a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.e = true;
        }
    }
}
