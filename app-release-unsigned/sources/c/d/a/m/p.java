package c.d.a.m;

import c.d.a.m.o;
import c.d.a.s.b;
import g.e.a;
import java.security.MessageDigest;

public final class p implements m {
    public final a<o<?>, Object> b = new b();

    @Override // c.d.a.m.m
    public void a(MessageDigest messageDigest) {
        int i2 = 0;
        while (true) {
            a<o<?>, Object> aVar = this.b;
            if (i2 < aVar.f2251k) {
                o<?> h2 = aVar.h(i2);
                Object l2 = this.b.l(i2);
                o.b<T> bVar = h2.f824c;
                if (h2.e == null) {
                    h2.e = h2.f825d.getBytes(m.a);
                }
                bVar.a(h2.e, l2, messageDigest);
                i2++;
            } else {
                return;
            }
        }
    }

    public <T> T c(o<T> oVar) {
        return this.b.e(oVar) >= 0 ? (T) this.b.getOrDefault(oVar, null) : oVar.b;
    }

    public void d(p pVar) {
        this.b.i(pVar.b);
    }

    @Override // c.d.a.m.m
    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.b.equals(((p) obj).b);
        }
        return false;
    }

    @Override // c.d.a.m.m
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("Options{values=");
        f2.append(this.b);
        f2.append('}');
        return f2.toString();
    }
}
