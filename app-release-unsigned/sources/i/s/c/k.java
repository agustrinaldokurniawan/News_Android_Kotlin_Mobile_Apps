package i.s.c;

import i.v.a;
import i.v.d;
import i.v.e;
import java.util.Objects;

public abstract class k extends m implements d {
    public k(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }

    @Override // i.s.c.b
    public a e() {
        Objects.requireNonNull(p.a);
        return this;
    }

    @Override // i.v.d
    public d.a n() {
        a b = b();
        if (b != this) {
            return ((d) ((e) b)).n();
        }
        throw new i.s.a();
    }

    @Override // i.s.b.l
    public Object o(Object obj) {
        return ((l) this).n().a(obj);
    }
}
