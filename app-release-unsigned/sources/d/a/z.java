package d.a;

import c.c.a.a.a;

public final class z implements h0 {
    public final boolean e;

    public z(boolean z) {
        this.e = z;
    }

    @Override // d.a.h0
    public boolean b() {
        return this.e;
    }

    @Override // d.a.h0
    public s0 f() {
        return null;
    }

    public String toString() {
        StringBuilder f2 = a.f("Empty{");
        f2.append(this.e ? "Active" : "New");
        f2.append('}');
        return f2.toString();
    }
}
