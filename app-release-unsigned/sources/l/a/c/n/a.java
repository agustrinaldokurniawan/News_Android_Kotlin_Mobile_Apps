package l.a.c.n;

import i.s.c.h;
import i.v.b;
import i.y.d;
import i.y.e;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import l.a.c.i.c;

public final class a {
    public final String a;
    public final b b;

    /* renamed from: c  reason: collision with root package name */
    public final l.a.c.a f3807c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<a> f3808d = new ArrayList<>();
    public final l.a.c.m.a e;

    /* renamed from: f  reason: collision with root package name */
    public Object f3809f;

    /* renamed from: g  reason: collision with root package name */
    public l.a.c.k.a f3810g;

    public a(String str, b bVar, l.a.c.a aVar) {
        h.e(str, "id");
        h.e(bVar, "_scopeDefinition");
        h.e(aVar, "_koin");
        this.a = str;
        this.b = bVar;
        this.f3807c = aVar;
        this.e = new l.a.c.m.a(aVar, this);
        new ArrayList();
    }

    public final <T> T a(b<T> bVar, l.a.c.l.a aVar, i.s.b.a<? extends l.a.c.k.a> aVar2) {
        h.e(bVar, "clazz");
        if (!this.f3807c.b.c(l.a.c.i.b.DEBUG)) {
            return (T) b(aVar, bVar, aVar2);
        }
        String str = "";
        if (aVar != null) {
            String str2 = " with qualifier '" + aVar + '\'';
            if (str2 != null) {
                str = str2;
            }
        }
        c cVar = this.f3807c.b;
        StringBuilder f2 = c.c.a.a.a.f("+- '");
        f2.append(l.a.d.a.a(bVar));
        f2.append('\'');
        f2.append(str);
        cVar.a(f2.toString());
        d a2 = e.a.a();
        T t = (T) b(aVar, bVar, aVar2);
        double doubleValue = Double.valueOf(i.y.b.e(a2.a(), TimeUnit.MILLISECONDS)).doubleValue();
        c cVar2 = this.f3807c.b;
        StringBuilder f3 = c.c.a.a.a.f("|- '");
        f3.append(l.a.d.a.a(bVar));
        f3.append("' in ");
        f3.append(doubleValue);
        f3.append(" ms");
        cVar2.a(f3.toString());
        return t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0148, code lost:
        if (r9 == null) goto L_0x014a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010a A[EDGE_INSN: B:39:0x010a->B:28:0x010a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T b(l.a.c.l.a r9, i.v.b<T> r10, i.s.b.a<? extends l.a.c.k.a> r11) {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.c.n.a.b(l.a.c.l.a, i.v.b, i.s.b.a):java.lang.Object");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.f3807c, aVar.f3807c);
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        return this.f3807c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public String toString() {
        return c.c.a.a.a.e(c.c.a.a.a.f("['"), this.a, "']");
    }
}
