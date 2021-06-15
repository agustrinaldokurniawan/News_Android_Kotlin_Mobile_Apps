package c.a.a.b.a;

import com.tsuga.news.core.data.source.local.room.NewsDatabase;
import i.m;
import i.s.b.l;
import i.s.c.h;
import i.s.c.i;
import i.s.c.p;
import l.a.c.f.b;
import l.a.c.f.c;

public final class a {
    public static final l.a.c.j.a a = h.a.t.a.K(false, false, C0003a.f332f, 3);
    public static final l.a.c.j.a b = h.a.t.a.K(false, false, C0003a.f333g, 3);

    /* renamed from: c  reason: collision with root package name */
    public static final l.a.c.j.a f331c = h.a.t.a.K(false, false, C0003a.f334h, 3);

    /* renamed from: c.a.a.b.a.a$a  reason: collision with other inner class name */
    public static final class C0003a extends i implements l<l.a.c.j.a, m> {

        /* renamed from: f  reason: collision with root package name */
        public static final C0003a f332f = new C0003a(0);

        /* renamed from: g  reason: collision with root package name */
        public static final C0003a f333g = new C0003a(1);

        /* renamed from: h  reason: collision with root package name */
        public static final C0003a f334h = new C0003a(2);

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ int f335i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0003a(int i2) {
            super(1);
            this.f335i = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // i.s.b.l
        public final m o(l.a.c.j.a aVar) {
            b bVar = b.Factory;
            b bVar2 = b.Single;
            int i2 = this.f335i;
            if (i2 == 0) {
                l.a.c.j.a aVar2 = aVar;
                h.e(aVar2, "$this$module");
                b bVar3 = b.f336f;
                c a = aVar2.a(false, false);
                l.a.c.l.a aVar3 = aVar2.f3801c;
                i.o.h hVar = i.o.h.e;
                h.a.t.a.c(aVar2.f3803f, new l.a.c.f.a(aVar3, p.a(c.a.a.b.b.o.a.c.a.class), null, bVar3, bVar, hVar, a, null, 128));
                h.a.t.a.c(aVar2.f3803f, new l.a.c.f.a(aVar2.f3801c, p.a(NewsDatabase.class), null, c.f337f, bVar2, hVar, aVar2.a(false, false), null, 128));
                return m.a;
            } else if (i2 == 1) {
                l.a.c.j.a aVar4 = aVar;
                h.e(aVar4, "$this$module");
                d dVar = d.f338f;
                c a2 = aVar4.a(false, false);
                h.a.t.a.c(aVar4.f3803f, new l.a.c.f.a(aVar4.f3801c, p.a(c.a.a.b.b.o.b.d.c.class), null, dVar, bVar2, i.o.h.e, a2, null, 128));
                return m.a;
            } else if (i2 == 2) {
                l.a.c.j.a aVar5 = aVar;
                h.e(aVar5, "$this$module");
                e eVar = e.f339f;
                c a3 = aVar5.a(false, false);
                l.a.c.l.a aVar6 = aVar5.f3801c;
                i.o.h hVar2 = i.o.h.e;
                h.a.t.a.c(aVar5.f3803f, new l.a.c.f.a(aVar6, p.a(c.a.a.b.b.o.a.a.class), null, eVar, bVar2, hVar2, a3, null, 128));
                h.a.t.a.c(aVar5.f3803f, new l.a.c.f.a(aVar5.f3801c, p.a(c.a.a.b.b.o.b.c.class), null, f.f340f, bVar2, hVar2, aVar5.a(false, false), null, 128));
                h.a.t.a.c(aVar5.f3803f, new l.a.c.f.a(aVar5.f3801c, p.a(c.a.a.b.f.a.class), null, g.f341f, bVar, hVar2, aVar5.a(false, false), null, 128));
                h.a.t.a.c(aVar5.f3803f, new l.a.c.f.a(aVar5.f3801c, p.a(c.a.a.b.d.b.a.class), null, h.f342f, bVar2, hVar2, aVar5.a(false, false), null, 128));
                return m.a;
            } else {
                throw null;
            }
        }
    }
}
