package i.s.c;

import c.c.a.a.a;
import i.v.e;

public abstract class m extends b implements e {
    public m() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) != 1 ? false : true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return f().equals(mVar.f()) && this.f3312h.equals(mVar.f3312h) && this.f3313i.equals(mVar.f3313i) && h.a(this.f3310f, mVar.f3310f);
        } else if (obj instanceof e) {
            return obj.equals(b());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.f3313i.hashCode() + a.b(this.f3312h, f().hashCode() * 31, 31);
    }

    public String toString() {
        i.v.a b = b();
        if (b != this) {
            return b.toString();
        }
        return a.e(a.f("property "), this.f3312h, " (Kotlin reflection is not available)");
    }
}
