package c.b.a.a0.c;

import c.b.a.g0.a;
import c.b.a.g0.c;
import java.util.Collections;

public class p<K, A> extends a<K, A> {

    /* renamed from: i  reason: collision with root package name */
    public final A f519i;

    public p(c<A> cVar, A a) {
        super(Collections.emptyList());
        this.e = cVar;
        this.f519i = a;
    }

    @Override // c.b.a.a0.c.a
    public float b() {
        return 1.0f;
    }

    @Override // c.b.a.a0.c.a
    public A e() {
        c<A> cVar = this.e;
        A a = this.f519i;
        float f2 = this.f488d;
        return cVar.a(0.0f, 0.0f, a, a, f2, f2, f2);
    }

    @Override // c.b.a.a0.c.a
    public A f(a<K> aVar, float f2) {
        return e();
    }

    @Override // c.b.a.a0.c.a
    public void h() {
        if (this.e != null) {
            super.h();
        }
    }

    @Override // c.b.a.a0.c.a
    public void i(float f2) {
        this.f488d = f2;
    }
}
