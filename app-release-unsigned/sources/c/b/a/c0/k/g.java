package c.b.a.c0.k;

import c.b.a.a0.b.c;
import c.b.a.a0.b.l;
import c.b.a.c0.l.b;
import c.b.a.m;

public class g implements b {
    public final String a;
    public final a b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f565c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS
    }

    public g(String str, a aVar, boolean z) {
        this.a = str;
        this.b = aVar;
        this.f565c = z;
    }

    @Override // c.b.a.c0.k.b
    public c a(m mVar, b bVar) {
        if (mVar.r) {
            return new l(this);
        }
        c.b.a.f0.c.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("MergePaths{mode=");
        f2.append(this.b);
        f2.append('}');
        return f2.toString();
    }
}
