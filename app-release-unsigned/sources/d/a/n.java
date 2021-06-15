package d.a;

import c.c.a.a.a;
import i.m;
import i.s.b.l;
import i.s.c.h;

public final class n {
    public final Object a;
    public final l<Throwable, m> b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return h.a(this.a, nVar.a) && h.a(this.b, nVar.b);
    }

    public int hashCode() {
        Object obj = this.a;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        l<Throwable, m> lVar = this.b;
        if (lVar != null) {
            i2 = lVar.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder f2 = a.f("CompletedWithCancellation(result=");
        f2.append(this.a);
        f2.append(", onCancellation=");
        f2.append(this.b);
        f2.append(")");
        return f2.toString();
    }
}
