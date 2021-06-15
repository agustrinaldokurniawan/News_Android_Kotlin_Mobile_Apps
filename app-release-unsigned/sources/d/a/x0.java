package d.a;

import i.q.f;

public final class x0 extends s {

    /* renamed from: f  reason: collision with root package name */
    public static final x0 f1837f = new x0();

    @Override // d.a.s
    public void d0(f fVar, Runnable runnable) {
        if (((y0) fVar.get(y0.e)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // d.a.s
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
