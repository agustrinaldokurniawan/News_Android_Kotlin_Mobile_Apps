package l.a.c.m;

import i.e;
import i.s.c.h;
import java.util.HashMap;
import l.a.c.h.c;
import l.a.c.h.d;

public final class a {
    public final l.a.c.a a;
    public final l.a.c.n.a b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, c<?>> f3804c = new HashMap<>();

    public a(l.a.c.a aVar, l.a.c.n.a aVar2) {
        h.e(aVar, "_koin");
        h.e(aVar2, "_scope");
        this.a = aVar;
        this.b = aVar2;
    }

    public final void a(l.a.c.f.a<?> aVar, boolean z) {
        c<?> cVar;
        h.e(aVar, "definition");
        boolean z2 = aVar.f3789g.b || z;
        l.a.c.a aVar2 = this.a;
        int ordinal = aVar.e.ordinal();
        if (ordinal == 0) {
            cVar = new d<>(aVar2, aVar);
        } else if (ordinal == 1) {
            cVar = new l.a.c.h.a<>(aVar2, aVar);
        } else {
            throw new e();
        }
        b(h.a.t.a.y(aVar.b, aVar.f3786c), cVar, z2);
        for (T t : aVar.f3788f) {
            if (z2) {
                b(h.a.t.a.y(t, aVar.f3786c), cVar, z2);
            } else {
                String y = h.a.t.a.y(t, aVar.f3786c);
                if (!this.f3804c.containsKey(y)) {
                    this.f3804c.put(y, cVar);
                }
            }
        }
    }

    public final void b(String str, c<?> cVar, boolean z) {
        if (!this.f3804c.containsKey(str) || z) {
            this.f3804c.put(str, cVar);
            return;
        }
        throw new IllegalStateException(("InstanceRegistry already contains index '" + str + '\'').toString());
    }
}
