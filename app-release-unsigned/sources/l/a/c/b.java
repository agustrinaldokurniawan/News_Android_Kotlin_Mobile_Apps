package l.a.c;

import i.m;
import i.s.c.f;
import i.s.c.h;
import i.s.c.i;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import l.a.c.g.g;
import l.a.c.i.c;

public final class b {
    public final a a = new a();

    public static final class a extends i implements i.s.b.a<m> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ b f3783f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar) {
            super(0);
            this.f3783f = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // i.s.b.a
        public m c() {
            this.f3783f.a.a();
            return m.a;
        }
    }

    public b(f fVar) {
    }

    public static final b b() {
        String str;
        c cVar;
        List list = null;
        b bVar = new b(null);
        l.a.c.m.b bVar2 = bVar.a.a;
        if (bVar2.f3806d == null) {
            l.a.c.n.b bVar3 = l.a.c.n.b.a;
            l.a.c.l.b bVar4 = l.a.c.n.b.b;
            l.a.c.n.b bVar5 = new l.a.c.n.b(bVar4, true);
            bVar2.b.put(bVar4.a, bVar5);
            bVar2.f3806d = bVar5;
            l.a.c.m.b bVar6 = bVar.a.a;
            if (bVar6.e == null) {
                h.e("-Root-", "scopeId");
                h.e(bVar4, "qualifier");
                if (!bVar6.f3805c.containsKey("-Root-")) {
                    l.a.c.n.b bVar7 = bVar6.b.get(bVar4.getValue());
                    if (bVar7 != null) {
                        l.a.c.n.a aVar = new l.a.c.n.a("-Root-", bVar7, bVar6.a);
                        aVar.f3809f = null;
                        l.a.c.n.a aVar2 = bVar6.e;
                        if (aVar2 != null) {
                            list = h.a.t.a.G(aVar2);
                        }
                        if (list == null) {
                            list = i.o.h.e;
                        }
                        h.e(list, "links");
                        l.a.c.m.a aVar3 = aVar.e;
                        HashSet<l.a.c.f.a<?>> hashSet = aVar.b.e;
                        Objects.requireNonNull(aVar3);
                        h.e(hashSet, "definitions");
                        for (T t : hashSet) {
                            if (aVar3.a.b.c(l.a.c.i.b.DEBUG)) {
                                if (aVar3.b.b.f3812d) {
                                    cVar = aVar3.a.b;
                                    str = h.i("- ", t);
                                } else {
                                    cVar = aVar3.a.b;
                                    str = aVar3.b + " -> " + ((Object) t);
                                }
                                cVar.a(str);
                            }
                            aVar3.a(t, false);
                        }
                        aVar.f3808d.addAll(list);
                        bVar6.f3805c.put("-Root-", aVar);
                        bVar6.e = aVar;
                        return bVar;
                    }
                    StringBuilder f2 = c.c.a.a.a.f("No Scope Definition found for qualifer '");
                    f2.append(bVar4.getValue());
                    f2.append('\'');
                    throw new g(f2.toString());
                }
                throw new l.a.c.g.h("Scope with id '-Root-' is already created");
            }
            throw new IllegalStateException("Try to recreate Root scope".toString());
        }
        throw new IllegalStateException("Try to recreate Root scope definition".toString());
    }

    public final b a() {
        if (this.a.b.c(l.a.c.i.b.DEBUG)) {
            double I = h.a.t.a.I(new a(this));
            c cVar = this.a.b;
            cVar.a("instances started in " + I + " ms");
        } else {
            this.a.a();
        }
        return this;
    }
}
