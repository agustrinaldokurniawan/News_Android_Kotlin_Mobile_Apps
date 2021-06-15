package c.a.a.a;

import c.a.a.f.f;
import c.a.a.g.d;
import i.m;
import i.s.b.l;
import i.s.c.h;
import i.s.c.i;
import i.s.c.p;
import l.a.c.f.b;
import l.a.c.f.c;

public final class a {
    public static final l.a.c.j.a a = h.a.t.a.K(false, false, C0002a.f324f, 3);
    public static final l.a.c.j.a b = h.a.t.a.K(false, false, C0002a.f325g, 3);

    /* renamed from: c.a.a.a.a$a  reason: collision with other inner class name */
    public static final class C0002a extends i implements l<l.a.c.j.a, m> {

        /* renamed from: f  reason: collision with root package name */
        public static final C0002a f324f = new C0002a(0);

        /* renamed from: g  reason: collision with root package name */
        public static final C0002a f325g = new C0002a(1);

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ int f326h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0002a(int i2) {
            super(1);
            this.f326h = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // i.s.b.l
        public final m o(l.a.c.j.a aVar) {
            b bVar = b.Factory;
            int i2 = this.f326h;
            if (i2 == 0) {
                l.a.c.j.a aVar2 = aVar;
                h.e(aVar2, "$this$module");
                b bVar2 = b.f327f;
                c a = aVar2.a(false, false);
                h.a.t.a.c(aVar2.f3803f, new l.a.c.f.a(aVar2.f3801c, p.a(c.a.a.b.d.c.b.class), null, bVar2, bVar, i.o.h.e, a, null, 128));
                return m.a;
            } else if (i2 == 1) {
                l.a.c.j.a aVar3 = aVar;
                h.e(aVar3, "$this$module");
                c cVar = c.f328f;
                c a2 = aVar3.a(false, false);
                l.a.c.l.a aVar4 = aVar3.f3801c;
                i.o.h hVar = i.o.h.e;
                l.a.c.f.a aVar5 = new l.a.c.f.a(aVar4, p.a(c.a.a.e.c.class), null, cVar, bVar, hVar, a2, null, 128);
                h.a.t.a.c(aVar3.f3803f, aVar5);
                h.a.t.a.P(aVar5);
                l.a.c.f.a aVar6 = new l.a.c.f.a(aVar3.f3801c, p.a(f.class), null, d.f329f, bVar, hVar, aVar3.a(false, false), null, 128);
                h.a.t.a.c(aVar3.f3803f, aVar6);
                h.a.t.a.P(aVar6);
                l.a.c.f.a aVar7 = new l.a.c.f.a(aVar3.f3801c, p.a(d.class), null, e.f330f, bVar, hVar, aVar3.a(false, false), null, 128);
                h.a.t.a.c(aVar3.f3803f, aVar7);
                h.a.t.a.P(aVar7);
                return m.a;
            } else {
                throw null;
            }
        }
    }
}
