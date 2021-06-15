package l.a.c.n;

import i.s.c.h;
import java.util.HashSet;
import l.a.c.l.a;

public final class b {
    public static final b a = null;
    public static final l.a.c.l.b b = new l.a.c.l.b("-Root-");

    /* renamed from: c  reason: collision with root package name */
    public final a f3811c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3812d;
    public final HashSet<l.a.c.f.a<?>> e;

    static {
        h.e("-Root-", "name");
    }

    public b(a aVar, boolean z) {
        h.e(aVar, "qualifier");
        this.f3811c = aVar;
        this.f3812d = z;
        this.e = new HashSet<>();
    }

    public b(a aVar, boolean z, int i2) {
        z = (i2 & 2) != 0 ? false : z;
        h.e(aVar, "qualifier");
        this.f3811c = aVar;
        this.f3812d = z;
        this.e = new HashSet<>();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.f3811c, bVar.f3811c) && this.f3812d == bVar.f3812d;
    }

    public int hashCode() {
        int hashCode = this.f3811c.hashCode() * 31;
        boolean z = this.f3812d;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("ScopeDefinition(qualifier=");
        f2.append(this.f3811c);
        f2.append(", isRoot=");
        f2.append(this.f3812d);
        f2.append(')');
        return f2.toString();
    }
}
