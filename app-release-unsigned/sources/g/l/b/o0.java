package g.l.b;

import android.graphics.Rect;
import android.view.View;
import g.e.a;

public class o0 implements Runnable {
    public final /* synthetic */ m e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m f2740f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f2741g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f2742h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ View f2743i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ s0 f2744j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Rect f2745k;

    public o0(m mVar, m mVar2, boolean z, a aVar, View view, s0 s0Var, Rect rect) {
        this.e = mVar;
        this.f2740f = mVar2;
        this.f2741g = z;
        this.f2742h = aVar;
        this.f2743i = view;
        this.f2744j = s0Var;
        this.f2745k = rect;
    }

    public void run() {
        q0.c(this.e, this.f2740f, this.f2741g, this.f2742h, false);
        View view = this.f2743i;
        if (view != null) {
            this.f2744j.j(view, this.f2745k);
        }
    }
}
