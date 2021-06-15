package g.l.b;

import android.graphics.Rect;
import android.view.View;
import g.e.a;
import g.l.b.q0;
import java.util.ArrayList;

public class p0 implements Runnable {
    public final /* synthetic */ s0 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f2749f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f2750g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ q0.b f2751h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2752i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ View f2753j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ m f2754k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ m f2755l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ boolean f2756m;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Rect p;

    public p0(s0 s0Var, a aVar, Object obj, q0.b bVar, ArrayList arrayList, View view, m mVar, m mVar2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.e = s0Var;
        this.f2749f = aVar;
        this.f2750g = obj;
        this.f2751h = bVar;
        this.f2752i = arrayList;
        this.f2753j = view;
        this.f2754k = mVar;
        this.f2755l = mVar2;
        this.f2756m = z;
        this.n = arrayList2;
        this.o = obj2;
        this.p = rect;
    }

    public void run() {
        a<String, View> e2 = q0.e(this.e, this.f2749f, this.f2750g, this.f2751h);
        if (e2 != null) {
            this.f2752i.addAll(e2.values());
            this.f2752i.add(this.f2753j);
        }
        q0.c(this.f2754k, this.f2755l, this.f2756m, e2, false);
        Object obj = this.f2750g;
        if (obj != null) {
            this.e.x(obj, this.n, this.f2752i);
            View k2 = q0.k(e2, this.f2751h, this.o, this.f2756m);
            if (k2 != null) {
                this.e.j(k2, this.p);
            }
        }
    }
}
