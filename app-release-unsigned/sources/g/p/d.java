package g.p;

import c.c.a.a.a;

public final class d {
    public final p a;
    public final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2824c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2825d;

    public d(p<?> pVar, boolean z, Object obj, boolean z2) {
        if (!pVar.f2873l && z) {
            throw new IllegalArgumentException(pVar.b() + " does not allow nullable values");
        } else if (z || !z2 || obj != null) {
            this.a = pVar;
            this.b = z;
            this.f2825d = obj;
            this.f2824c = z2;
        } else {
            StringBuilder f2 = a.f("Argument with type ");
            f2.append(pVar.b());
            f2.append(" has null value but is not nullable.");
            throw new IllegalArgumentException(f2.toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.b != dVar.b || this.f2824c != dVar.f2824c || !this.a.equals(dVar.a)) {
            return false;
        }
        Object obj2 = this.f2825d;
        Object obj3 = dVar.f2825d;
        return obj2 != null ? obj2.equals(obj3) : obj3 == null;
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.f2824c ? 1 : 0)) * 31;
        Object obj = this.f2825d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
