package l.a.c.f;

import i.o.e;
import i.s.b.l;
import i.s.b.p;
import i.s.c.h;
import i.s.c.i;
import i.v.b;
import java.util.List;
import java.util.Objects;

public final class a<T> {
    public final l.a.c.l.a a;
    public final b<?> b;

    /* renamed from: c  reason: collision with root package name */
    public final l.a.c.l.a f3786c;

    /* renamed from: d  reason: collision with root package name */
    public final p<l.a.c.n.a, l.a.c.k.a, T> f3787d;
    public final b e;

    /* renamed from: f  reason: collision with root package name */
    public List<? extends b<?>> f3788f;

    /* renamed from: g  reason: collision with root package name */
    public final c f3789g;

    /* renamed from: h  reason: collision with root package name */
    public final d f3790h;

    /* renamed from: l.a.c.f.a$a  reason: collision with other inner class name */
    public static final class C0129a extends i implements l<b<?>, CharSequence> {

        /* renamed from: f  reason: collision with root package name */
        public static final C0129a f3791f = new C0129a();

        public C0129a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // i.s.b.l
        public CharSequence o(b<?> bVar) {
            b<?> bVar2 = bVar;
            h.e(bVar2, "it");
            return l.a.d.a.a(bVar2);
        }
    }

    public a(l.a.c.l.a aVar, b bVar, l.a.c.l.a aVar2, p pVar, b bVar2, List list, c cVar, d dVar, int i2) {
        int i3 = i2 & 4;
        list = (i2 & 32) != 0 ? i.o.h.e : list;
        cVar = (i2 & 64) != 0 ? new c(false, false, false, 7) : cVar;
        d dVar2 = (i2 & 128) != 0 ? new d(null, 1) : null;
        h.e(aVar, "scopeQualifier");
        h.e(bVar, "primaryType");
        h.e(pVar, "definition");
        h.e(bVar2, "kind");
        h.e(list, "secondaryTypes");
        h.e(cVar, "options");
        h.e(dVar2, "properties");
        this.a = aVar;
        this.b = bVar;
        this.f3786c = null;
        this.f3787d = pVar;
        this.e = bVar2;
        this.f3788f = list;
        this.f3789g = cVar;
        this.f3790h = dVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        a aVar = (a) obj;
        return h.a(this.b, aVar.b) && h.a(this.f3786c, aVar.f3786c) && h.a(this.a, aVar.a);
    }

    public int hashCode() {
        l.a.c.l.a aVar = this.f3786c;
        int hashCode = aVar == null ? 0 : aVar.hashCode();
        return this.a.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public String toString() {
        String str;
        String str2;
        String str3 = this.e.toString();
        String str4 = '\'' + l.a.d.a.a(this.b) + '\'';
        l.a.c.l.a aVar = this.f3786c;
        String str5 = "";
        if (aVar == null || (str = h.i(",qualifier:", aVar)) == null) {
            str = str5;
        }
        l.a.c.l.a aVar2 = this.a;
        l.a.c.n.b bVar = l.a.c.n.b.a;
        if (h.a(aVar2, l.a.c.n.b.b)) {
            str2 = str5;
        } else {
            str2 = h.i(",scope:", this.a);
        }
        if (!this.f3788f.isEmpty()) {
            str5 = h.i(",binds:", e.h(this.f3788f, ",", null, null, 0, null, C0129a.f3791f, 30));
        }
        return '[' + str3 + ':' + str4 + str + str2 + str5 + ']';
    }
}
