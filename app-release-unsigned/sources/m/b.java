package m;

import java.io.IOException;
import m.i;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ i.b.a e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f3815f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a0 f3816g;

    public /* synthetic */ b(i.b.a aVar, f fVar, a0 a0Var) {
        this.e = aVar;
        this.f3815f = fVar;
        this.f3816g = a0Var;
    }

    public final void run() {
        i.b.a aVar = this.e;
        f fVar = this.f3815f;
        a0 a0Var = this.f3816g;
        boolean e2 = i.b.this.f3831f.e();
        i.b bVar = i.b.this;
        if (e2) {
            fVar.a(bVar, new IOException("Canceled"));
        } else {
            fVar.b(bVar, a0Var);
        }
    }
}
