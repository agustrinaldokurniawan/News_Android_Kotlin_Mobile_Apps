package d.a;

import d.a.a.l;
import h.a.t.a;

public abstract class r0 extends s {
    public abstract r0 f0();

    public final String g0() {
        r0 r0Var;
        s sVar = x.a;
        r0 r0Var2 = l.b;
        if (this == r0Var2) {
            return "Dispatchers.Main";
        }
        try {
            r0Var = r0Var2.f0();
        } catch (UnsupportedOperationException unused) {
            r0Var = null;
        }
        if (this == r0Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // d.a.s
    public String toString() {
        String g0 = g0();
        if (g0 != null) {
            return g0;
        }
        return getClass().getSimpleName() + '@' + a.u(this);
    }
}
